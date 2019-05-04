package com;

/**
 * Author:Fanleilei
 * Created:2019/5/4 0004
 *
 *
 * 删除链表中某个value
 */
public class DeleteVaule {

    private static Node delete(Node head,int vaule){


        Node PreNode=new Node(0);
        Node pre=PreNode;
        Node cur=head;
        pre.next=head;
        while(cur!=null){
            if(cur.value==vaule){
                pre.next=cur.next;
                cur=cur.next;
            }else {
                pre =pre.next;
                cur = cur.next;
            }

        }

        return PreNode.next;

    }

    public static void main(String[] args) {

        Node head1=new Node(1);
        Node node2=new Node(3);
        Node node3=new Node(6);
        Node node4=new Node(9);
        Node node5=new Node(11);
        Node node6=new Node(3);
        head1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;

        Node result=delete(head1,3);

        DisplyLinkedList.disply(result);


    }
}
