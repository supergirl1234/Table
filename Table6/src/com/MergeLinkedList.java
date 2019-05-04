package com;

/**
 * Author:Fanleilei
 * Created:2019/5/4 0004
 *
 * 合并两个有序单链表
 *
 * */
public class MergeLinkedList {

    private static Node merge(Node v1,Node v2){
        Node cur1=v1;
        Node cur2=v2;
        Node result=null;//存放合并之后的结点
        Node last=null;//用于保存最后一个结点
        while(cur1!=null&&cur2!=null){
            if(cur1.value<=cur2.value){
                if(result==null){
                    result=cur1;
                    last=cur1;

                }else{

                    last.next=cur1;
                    last=cur1;
                }

                cur1=cur1.next;
            }else{

                if(result==null){
                    result=cur2;
                    last=cur2;

                }else{

                    last.next=cur2;
                    last=cur2;
                }

                cur2=cur2.next;

            }

        }


        //当一个链表没有结点比较了，另一个链表还有结点没比较时
        while(cur1!=null){
            if(result==null){
                result=cur1;
                last=cur1;

            }else{

                last.next=cur1;
                last=cur1;
            }
           /* last.next=cur1;
            last=cur1;
            */
            cur1=cur1.next;
        }
        while(cur2!=null){
            if(result==null){
                result=cur2;
                last=cur2;

            }else{

                last.next=cur2;
                last=cur2;
            }
            /*last.next=cur2;
            last=cur2;*/
            cur2=cur2.next;
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

        Node head2=new Node(4);
        Node v2=new Node(5);
        Node v3=new Node(10);
        Node v4=new Node(12);
        Node v5=new Node(15);
        Node v6=new Node(17);
        head2.next=v2;
        v2.next=v3;
        v3.next=v4;
        v4.next=v5;
        v5.next=v6;

        Node result=merge(head1,head2);

        DisplyLinkedList.disply(result);
    }
}
