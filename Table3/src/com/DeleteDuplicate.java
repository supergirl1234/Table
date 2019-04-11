package com;

/**
 * Author:Fanleilei
 * Created:2019/4/9 0009
 *
 * 删除链表中所有重复的值
 * 1 2 4 5 5 5 6 7 7变成 1 2 4 6
 *
 */
public class DeleteDuplicate {

    public static LinkedNode deleteDuplicte(LinkedNode head){

        LinkedNode p1=head;
        LinkedNode p2=head.next;
        LinkedNode first=new LinkedNode(0,p1);//前驱结点
        LinkedNode pre=first;

        while(p2!=null) {
            if(p1.vaule!=p2.vaule){
                pre=pre.next;
                p1=p1.next;
                p2=p2.next;
            }else{
                while (p2 != null && p1.vaule == p2.vaule) {
                    p2 = p2.next;
                }

                pre.next=p2;

                p1 = p2;

                if(p2!=null){
                    p2 = p2.next;
                }
            }

        }
        return  first.next;

    }


    public static void main(String[] args) {
        LinkedNode node8 = new LinkedNode(7, null);
        LinkedNode node7 = new LinkedNode(7, node8);
        LinkedNode node6 = new LinkedNode(6, node7);
        LinkedNode node5 = new LinkedNode(5, node6);
        LinkedNode node4 = new LinkedNode(5, node5);
        LinkedNode node3 = new LinkedNode(5, node4);
        LinkedNode node2 = new LinkedNode(2, node3);
        LinkedNode node1 = new LinkedNode(1, node2);

        LinkedNode result=deleteDuplicte(node1);
        DisplayLinkedList.diaplay(result);

    }
}
