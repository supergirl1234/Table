package com;

/**
 * Author:Fanleilei
 * Created:2019/5/4 0004
 *
 * 链表的头插、尾插、头删、尾删
 */
public class LinkedList {


    private Node head;

    public LinkedList() {
        this.head = null;
    }

    //头插
    private  void addFront(Node head){
        Node node=head;
        node.next=this.head;
        this.head=node;

    }
    //尾插
    private  void addBack(Node head){
        Node node=head;
        if(this.head==null){
            this.head=node;

        }else {
            //通过while语句找到最后一个结点
            Node cur = this.head;
            while (cur.next != null) {

                cur = cur.next;
            }

            cur.next = node;
        }

    }
    //头删
    private void deleteFront(){
        if(this.head==null){
            System.out.println("该链表中没有结点可删");

        }else {

            this.head = this.head.next;
        }


    }

    //尾删
    private  void deleteBack(){
        if(this.head==null){
            System.out.println("该链表中没有结点可删");

        }else if(this.head.next==null){
            //如果链表中只有一个元素
            this.head=null;
        }else {

            Node cur = this.head;
            while (cur.next.next != null) {

                cur = cur.next;
            }
            cur.next = null;
        }


    }
    private  void disply(){

        Node cur=head;
        while(cur!=null){
            if(cur.next!=null) {
                System.out.print(cur.value + "->");
            }else{

                System.out.print(cur.value);
            }


            cur=cur.next;
        }


    }
    public static void main(String[] args) {

        LinkedList myList=new LinkedList();

        Node head=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node5=new Node(5);

        myList.addFront(head);
        myList.addFront(node2);
        myList.disply();
        System.out.println();
        myList.addBack(node3);
        myList.disply();
        System.out.println();

        myList.deleteBack();
        myList.deleteBack();
        myList.deleteBack();

      /* myList.deleteFront();
       myList.deleteFront();
       myList.deleteFront();*/
       myList.disply();
       System.out.println();
       myList.deleteBack();


       myList.deleteFront();
    }

}
