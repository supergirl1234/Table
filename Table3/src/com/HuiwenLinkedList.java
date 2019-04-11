package com;

/**
 * Author:Fanleilei
 * Created:2019/4/10 0010
 *
 * 判断链表是否是回文结构
 */
public class HuiwenLinkedList {

    public static boolean IsHuiewen(LinkedNode head){

        LinkedNode result=null;//存放后半部分结点的链表
        // 把链表中后半部分节点头插到result结点中，然后比较原链表和result链表
        //先求出链表的总长度
        int length=Length(head);//原链表长度

        LinkedNode cur=head;

        for(int i=0;i<length/2;i++){
            cur=cur.next;
        }
        //头插到result链表中
        while(cur!=null){
            LinkedNode Next=cur.next;

            cur.next=result;
            result = cur;

            cur=Next;
        }

        //比较链表是否相等
        LinkedNode p1=head;
        while(result!=null&&p1!=null){

            if(result.vaule!=p1.vaule){
                return  false;

            }
            result=result.next;
            p1=p1.next;
        }


       return true;
    }




    public static int Length(LinkedNode head){

        LinkedNode cur=head;
        int length=0;
        while(cur!=null){

            length++;

            cur=cur.next;
        }

        return length;
    }
    public static void main(String[] args) {
        //LinkedNode node5 = new LinkedNode(7, null);
        LinkedNode node5 = new LinkedNode(1, null);
        LinkedNode node4 = new LinkedNode(2, node5);
        LinkedNode node3 = new LinkedNode(5, node4);
        LinkedNode node2 = new LinkedNode(2, node3);
        LinkedNode node1 = new LinkedNode(1, node2);


        System.out.println(IsHuiewen(node1));
    }
}
