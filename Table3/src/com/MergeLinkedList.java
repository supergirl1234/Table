package com;

/**
 * Author:Fanleilei
 * Created:2019/4/10 0010
 *
 * 合并两个有序策链表，并按大小排序
 */
public class MergeLinkedList {

    public static LinkedNode mergetwoNode(LinkedNode head1,LinkedNode head2){

        if(head1==null){
            return null;

        }
        if(head2==null){
            return null;

        }

        LinkedNode result=null;
        //让两个链表中的结点比较，小的尾插到result中
        LinkedNode last=null;//标记result链表中最后一个结点

        LinkedNode p1=head1;
        LinkedNode p2=head2;

        while(p1!=null&&p2!=null){

            if(p1.vaule<p2.vaule){
                if(result==null){

                      result=p1;
                }else{

                    last.next=p1;
                }

                last=p1;

                p1=p1.next;
            }else{

                if(result==null){

                    result=p2;
                }else{

                    last.next=p2;
                }

                last=p2;

                p2=p2.next;
            }
        }

        //如果某一个链表还剩的有结点，则直接加到result上
        if(p1!=null){
            last.next = p1;

        }
        if(p2!=null){
            last.next = p2;

        }


        return result;

    }

    public static void main(String[] args) {

        LinkedNode node4 = new LinkedNode(4, null);
        LinkedNode node3 = new LinkedNode(3, node4);
        LinkedNode node2 = new LinkedNode(2, node3);
        LinkedNode node1 = new LinkedNode(1, node2);



        LinkedNode p3 = new LinkedNode(9, null);
        LinkedNode p2 = new LinkedNode(7, p3);
        LinkedNode p1 = new LinkedNode(3, p2);


        LinkedNode result=mergetwoNode(node1,p1);
        DisplayLinkedList.diaplay(result);


    }
}
