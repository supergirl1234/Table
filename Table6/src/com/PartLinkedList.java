package com;

/**
 * Author:Fanleilei
 * Created:2019/5/4 0004
 *
 *
 * 拆分链表，将小于某个数的结点放在链表的左边，将大于某个数的节点放在链表的右边
 */
public class PartLinkedList {

    private static Node Part(Node head,int item){

        Node small=null;//存放小于x的结点
        Node smallLast=null;
        Node big=null;//存放大于x的结点
        Node bigLast=null;

        Node cur=head;
        while(cur!=null){


            if(cur.value<=item){
                //尾插到small中
                if(small==null){
                    small=cur;

                }else{
                    smallLast.next=cur;
                }
                smallLast=cur;
            }else{
                //尾插到big中
                if(big==null){
                    big=cur;

                }else{
                    bigLast.next=cur;
                }
                bigLast=cur;

            }

            cur=cur.next;
        }

        //再将small链表和big链表结合起来
        if(small==null){
            return big;
        }else {
            smallLast.next = big;
            return  small;
        }


    }
    public static void main(String[] args) {
        Node head1=new Node(11);
        Node v2=new Node(5);
        Node v3=new Node(2);
        Node v4=new Node(10);
        Node v5=new Node(15);
        Node v6=new Node(17);
        head1.next=v2;
        v2.next=v3;
        v3.next=v4;
        v4.next=v5;
        v5.next=v6;
        Node result=Part(head1,7);
        DisplyLinkedList.disply(result);
    }
}
