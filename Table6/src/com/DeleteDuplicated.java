package com;

/**
 * Author:Fanleilei
 * Created:2019/5/4 0004
 *
 * 删除有序链表中重复的值
 *
 * 1,2,3,4,4,5,6,6,6,7  变成1,2,3,5,7
 * */
public class DeleteDuplicated {

    //删除有序链表中重复的值，里面包含特殊情况，就是如果重复的值在链表的最后，要特别注意
    private static Node deleteDuplicated(Node head){

        Node preNode=new Node(0);
        preNode.next=head;
        Node pre=preNode;

        //用两个引用来比较前后两个结点的值相不相同
        Node p1=head;
        Node p2=head.next;
        while(p2!=null){

          if(p1.value==p2.value){
              while(p2!=null&&p1.value==p2.value){

                  p2=p2.next;

              }

              pre.next=p2;
              p1=p2;
              if(p2!=null) {

                  p2 = p2.next;
              }
          }else{

              pre=pre.next;
              p1=p1.next;
              p2=p2.next;
          }

        }

        return preNode.next;

    }

    public static void main(String[] args) {
        Node head1=new Node(1);
        Node node2=new Node(3);
        Node node3=new Node(3);
        Node node4=new Node(9);
        Node node5=new Node(10);
        Node node6=new Node(11);
        Node node7=new Node(11);
        head1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;

        Node result=deleteDuplicated(head1);

        DisplyLinkedList.disply(result);

    }


}
