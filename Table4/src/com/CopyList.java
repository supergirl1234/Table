package com;

/**
 * Author:Fanleilei
 * Created:2019/4/12 0012
 */
public class CopyList {

    public static LinkedList copy(LinkedList head){
        //先复制原链表，将新链表与原链表组合在一起
        LinkedList cur=head;

         while(cur!=null){

             LinkedList newNode=new LinkedList(cur.vaule,cur.next);
             //将其插在cur的后面
             newNode.next=cur.next;
             cur.next=newNode;

             //下一个cur
             cur=newNode.next;
         }

         //复制random'
           cur=head;
         while(cur!=null){

             if(cur.random==null){
                 cur.next.random=null;
             }else {
                  cur.next.random=cur.random.next;
             }

             cur=cur.next.next;

         }

         //将链表进行拆分
          cur=head;
         LinkedList result=head.next;
         while(cur!=null){

              LinkedList newNo=cur.next;
              cur.next=newNo.next;

              if(cur.next!=null) {
                  newNo.next = cur.next.next;
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


       LinkedList result=copy(node1);
       DisplayLinkedList.disply(result);


    }
}
