package com;

/**
 * Author:Fanleilei
 * Created:2019/4/11 0011
 */
public class ReverseLinkedList {


    public static LinkedNode Reverse(LinkedNode head){


        LinkedNode result=null;

        LinkedNode cur=head;
        while(cur!=null){
            //头插
           LinkedNode Next=cur.next;
           cur.next=result;
           result=cur;

           cur=Next;

        }
        return  result;


    }

    public static LinkedNode Merge(LinkedNode listA,LinkedNode listB){


        LinkedNode result=null;
        LinkedNode last=null;

        LinkedNode p1=listA;
        LinkedNode p2=listB;

        if(listA==null){
            return null;

        }
        if(listB==null){
            return null;

        }

        while(p1!=null&&p2!=null){
            if(p1.vaule<p2.vaule){
                //尾插
                if (result==null){

                    result=p1;

                }else{
                   last.next=p1;

                }
                last=p1;

                p1=p1.next;


            }else{
                //尾插
                if (result==null){

                    result=p2;

                }else{
                    last.next=p2;

                }
                last=p2;
                p2=p2.next;

            }

        }
        if (p1!=null){
            last.next=p1;

        }
        if (p2!=null){
            last.next=p2;

        }


        return  result;
    }

    public static void main(String[] args) {

        LinkedNode node6=new LinkedNode(6,null);
        LinkedNode node5=new LinkedNode(5,node6);
        LinkedNode node4=new LinkedNode(4,node5);
        LinkedNode node3=new LinkedNode(3,node4);
        LinkedNode node2=new LinkedNode(2,node3);
        LinkedNode node1=new LinkedNode(1,node2);



        LinkedNode p6=new LinkedNode(12,null);
        LinkedNode p5=new LinkedNode(11,p6);
        LinkedNode p4=new LinkedNode(9,p5);
        LinkedNode p3=new LinkedNode(7,p4);
        LinkedNode p2=new LinkedNode(6,p3);
        LinkedNode p1=new LinkedNode(4,p2);


    }
}
