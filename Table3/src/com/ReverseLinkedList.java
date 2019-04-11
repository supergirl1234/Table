package com;

/**
 * Author:Fanleilei
 * Created:2019/4/8 0008
 *
 * 反转链表
 */
public class ReverseLinkedList {

    public static LinkedNode reverseNode(LinkedNode head){
        LinkedNode result=null;


        LinkedNode cur=head;
        while(cur!=null){
            //将链表中的结点头插到result链表中
               LinkedNode next=cur.next;

               cur.next=result;
               result=cur;


               cur=next;
        }

        return result;


    }

    public static void main(String[] args) {

        LinkedNode node7 = new LinkedNode(9, null);
        LinkedNode node6 = new LinkedNode(7, node7);
        LinkedNode node5 = new LinkedNode(3, node6);
        LinkedNode node4 = new LinkedNode(4, node5);
        LinkedNode node3 = new LinkedNode(3, node4);
        LinkedNode node2 = new LinkedNode(2, node3);
        LinkedNode node1 = new LinkedNode(1, node2);

        LinkedNode result=reverseNode(node1);
        DisplayLinkedList.diaplay(result);

    }
}
