package com;

/**
 * Author:Fanleilei
 * Created:2019/4/11 0011
 *
 *
 * 复制链表
 * 1.遍历原链表的每一个结点，复制新结点，插到原链表的后面
 * 2.原链表的每一个结点，进行新结点random的设置
 * cur.next.random=cur.random.next
 * 3.把一条链表拆分为原链表和新链表
 *
 */
public class CopyLinkedList {

    public  static LinkedList CopyRandomList(LinkedList head){

            LinkedList newLinkedList=copyValue(head);

            LinkedList newnewLinkedList=copyRandom(newLinkedList);

             return Split(newnewLinkedList);

    }

    //复制新结点,插到原链表的后面
    public  static LinkedList copyValue(LinkedList head){


        LinkedList cur=head;

        while(cur!=null){

            LinkedList NewNode=new LinkedList(cur.vaule,cur.next);
            NewNode.next=cur.next;
            cur.next=NewNode;

            cur=NewNode.next;

        }
        return  head;

    }
    //进行新链表的random的设置
    public  static LinkedList copyRandom(LinkedList head){
        LinkedList  cur=head;
        while (cur!=null) {

            if(cur.random==null){
                cur.next.random =null;
            }else{
                cur.next.random = cur.random.next;
            }

            cur=cur.next.next;
        }
        return head;

    }

    //将链表进行拆分
    public static LinkedList Split(LinkedList head){

        LinkedList  cur=head;
        LinkedList  result=head.next;

        while (cur!=null) {
            LinkedList Next=cur.next;
            cur.next=Next.next;

            if(Next.next!=null) {
                Next.next = Next.next.next;

            }
            cur=cur.next;


        }


        return  result;
    }

    public static void main(String[] args) {

        LinkedList node6=new LinkedList(6,null);
        LinkedList node5=new LinkedList(5,node6);
        LinkedList node4=new LinkedList(4,node5);
        LinkedList node3=new LinkedList(3,node4);
        LinkedList node2=new LinkedList(2,node3);
        LinkedList node1=new LinkedList(1,node2);

        node1.random=node3;
        node2.random=node2;
        node3.random=node5;
        node4.random=node6;
        node5.random=null;
        node6.random=node1;


        LinkedList result=CopyRandomList(node1);
        DisplayLinkedList.disply(result);



    }



}
