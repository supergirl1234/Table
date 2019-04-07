/**
 * Author:Fanleilei
 * Created:2019/4/6 0006
 */
public class MyLinkedList {

    private Node head;

    public MyLinkedList() {
        this.head = null;
    }

    void pushFront(Node node){

       node.next=this.head;
       this.head=node;

   }

   void pushBack(Node node){

       if(head==null){

           this.head=node;

       }else{

           Node cur=head;
           while(cur.next!=null){

               cur=cur.next;
           }
           cur.next=node;
       }
   }

   //如何通过循环，遍历链表的每一个结点
   void disply(){
       Node cur=this.head;
       while(cur!=null){
           if(cur.next==null){
               System.out.print(cur.value);

           }else {
               System.out.print(cur.value + "->");
           }

           cur=cur.next;
       }




   }

    public static void main(String[] args) {

     MyLinkedList list=new MyLinkedList();
       list.pushFront(new Node(1));
       list.pushFront(new Node(2));
       list.pushFront(new Node(3));

       list.disply();
    }


}

class Node{

   public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}


