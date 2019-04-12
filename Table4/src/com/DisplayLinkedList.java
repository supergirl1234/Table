package com;

/**
 * Author:Fanleilei
 * Created:2019/4/12 0012
 */
public class DisplayLinkedList {


    public static void disply(LinkedNode head){

        LinkedNode cur=head;

        while(cur!=null){
            if(cur.next==null){

                System.out.print(cur.vaule);
            }else {

                System.out.print(cur.vaule+"->");
            }
            cur=cur.next;

        }



    }

    public static void disply(LinkedList head) {

        LinkedList cur = head;

        while (cur != null) {
            if (cur.next == null) {

                System.out.print(cur.vaule);
            } else {

                System.out.print(cur.vaule + "->");
            }
            cur = cur.next;

        }

        System.out.println();
        cur = head;
        while (cur != null) {

            if(cur.random==null){
                System.out.println(cur.vaule + "的random是" + "null");
            }else {
                System.out.println(cur.vaule + "的random是" + cur.random.vaule);
            }

            cur = cur.next;

        }


    }
}
