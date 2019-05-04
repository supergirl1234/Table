package com;

/**
 * Author:Fanleilei
 * Created:2019/5/4 0004
 */
public class DisplyLinkedList {



    public static void disply(Node head){

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
}
