package com;

/**
 * Author:Fanleilei
 * Created:2019/4/13 0013
 */
public class Display {

    public static void display(LinkedNode head){
        LinkedNode cur=head;
        while(cur!=null){
            if(cur.next==null){

                System.out.print(cur.vaule);
            }else{

                System.out.print(cur.vaule+"->");
            }


            cur=cur.next;
        }

    }
}
