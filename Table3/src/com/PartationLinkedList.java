package com;

/**
 * Author:Fanleilei
 * Created:2019/4/9 0009
 *
 * 一个链表，将其分成两部分，小于x的在左边，大于x的在右边，不改变原来链表的顺序
 *现在还有问题
 *
 * */
public class PartationLinkedList {

    public static LinkedNode part(LinkedNode head,int x){
         LinkedNode small=null;//<x的结点的链表
         LinkedNode big=null;//>x的结点的链表

         LinkedNode smallLast=null;
         LinkedNode bigLast=null;

         LinkedNode cur=head;

     //将小的数尾插到smallList链表中
     //将大的数尾插到bigList链表中
        while(cur!=null){
            LinkedNode Next=cur.next;
            if(cur.vaule<x){
                if(small==null){
                    small=cur;
                }else{
                    smallLast.next=cur;
                }
                smallLast=cur;
            }else{
                if(big==null){
                    big=cur;
                }else{
                    bigLast.next=cur;
                }
                bigLast=cur;
            }

           cur=Next;

        }

       /*//将两个链表合并
       if(small==null){//如果small链表是空的
            return  big;
        }else {//如果两个链表都存在，则拼接
           smallLast.next = big;
           return small;
       }*/
       //return small;//是对的
        return  big;

     }

    public static void main(String[] args) {
        LinkedNode node8 = new LinkedNode(1, null);
        LinkedNode node7 = new LinkedNode(7, node8);
        LinkedNode node6 = new LinkedNode(4, node7);
        LinkedNode node5 = new LinkedNode(5, node6);
        LinkedNode node4 = new LinkedNode(0, node5);
        LinkedNode node3 = new LinkedNode(3, node4);
        LinkedNode node2 = new LinkedNode(2, node3);
        LinkedNode node1 = new LinkedNode(10, node2);

        LinkedNode result=part(node1,5);
        DisplayLinkedList.diaplay(result);
    }
}
