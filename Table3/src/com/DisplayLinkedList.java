package com;

/**
 * Author:Fanleilei
 * Created:2019/4/8 0008
 */
public class DisplayLinkedList {

    //打印链表

    public static void diaplay(LinkedNode head){

        LinkedNode cur=head;
        while(cur!=null){

            if(cur.next==null){
                System.out.print(cur.vaule);
            }else {

                System.out.print(cur.vaule + "->");

            }
            cur=cur.next;
        }


    }

}
