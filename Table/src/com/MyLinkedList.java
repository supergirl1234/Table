package com;

/**
 * Author:Fanleilei
 * Created:2019/3/30 0030
 */
public class MyLinkedList implements ILinkedList {
    class Node{
        public int value;
        public   Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;//链表中第一个节点

    public MyLinkedList() {
        this.head=null;//链表中第一个节点为null
    }

    @Override
    public void PushFrontNode(int item) {
         Node node=new Node(item);
         node.next=this.head;
         this.head=node;




    }

    @Override
    public void PushBackNode(int item) {
        if(head==null){
            throw new Error();

        }
        Node node=new Node(item);
        Node cur=this.head;
        while(cur.next!=null){

            cur=cur.next;
        }
        cur.next=node;

    }

    @Override
    public void DeleteFrontNode() {
        if(head==null){
            throw new Error();

        }

        this.head=this.head.next;

    }

    @Override
    public void DeleteBackNode() {
        Node cur=this.head;
        if(head==null){
            throw new Error();

        }
        if(head.next==null){
            throw new Error();

        }

        while(cur.next.next!=null){
            cur=cur.next;

        }
        cur.next=null;

    }

    public static void main(String[] args) {


    }
}


