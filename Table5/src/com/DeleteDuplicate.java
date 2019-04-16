package com;

/**
 * Author:Fanleilei
 * Created:2019/4/13 0013
 *
 *
 */
public class DeleteDuplicate {


    public static LinkedNode deleteDulipate(LinkedNode head){

        if(head==null){

            return null;
        }
       LinkedNode Node= new LinkedNode(0);
        LinkedNode pre= Node;
        LinkedNode p1=head;
        LinkedNode p2=head.next;
        pre.next=p1;
        while(p2!=null){
            if(p1.vaule!=p2.vaule){
                pre=pre.next;
                p1=p1.next;
                p2=p2.next;
            }else{
                while(p2!=null &&  p1.vaule==p2.vaule) {
                    p2 = p2.next;
                }
                pre.next=p2;
                p1=p2;
                if(p2!=null) {
                    p2 = p2.next;
                }
            }
        }
        return  Node.next;
    }
    public static void main(String[] args) {
        LinkedNode node1=new LinkedNode(1);
        LinkedNode node2=new LinkedNode(5);
        LinkedNode node3=new LinkedNode(6);
        LinkedNode node4=new LinkedNode(6);
        LinkedNode node5=new LinkedNode(6);
        LinkedNode node6=new LinkedNode(7);
        LinkedNode node7=new LinkedNode(10);
        LinkedNode node8=new LinkedNode(10);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        node7.next=node8;
        node8.next=null;


        LinkedNode result=deleteDulipate(node1);

        Display.display(result);

    }
}
