package com;

/**
 * Author:Fanleilei
 * Created:2019/5/4 0004
 *逆转单链表
 *
 */
public class ReverseLinkedList {

    //逆转单链表  将原链表的节点都头插到结果链表中
    private static Node reverse(Node head){
        Node result=null;//存放结果的链表

        Node cur=head;
        while(cur!=null){
            Node Next=cur.next;//保存原链表中的下一个结点

            //头插
            cur.next=result;
            result=cur;


            cur=Next;
        }


        return result;
    }

    public static void main(String[] args) {

        Node head1=new Node(1);
        Node node2=new Node(3);
        Node node3=new Node(6);
        Node node4=new Node(9);
        Node node5=new Node(11);
        head1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;

        Node result=reverse(head1);
        DisplyLinkedList.disply(result);
    }
}
