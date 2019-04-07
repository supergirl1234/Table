/**
 * Author:Fanleilei
 * Created:2019/4/6 0006
 *
 *  找中间结点,如果中间有两个结点，则是第二个结点
 *
 *  找倒数第k个结点
 *
 *  */
public class SearchLinkedList {

    //找中间结点,如果中间有两个结点，则是第二个结点

    public static ListNode SearchMedium(ListNode head){
        //第一种方法，先求出链表的长度，然后除以2就是中间结点
        //第二种方法，用快慢引用，一个走两步，一个走一步
        if(head==null){
            return head;

        }
        ListNode p1=head;
        ListNode p2=head;
        while (p2!=null){


            if(p2.next!=null) {
                p2 = p2.next.next;
                p1=p1.next;
            }else{
                p2=null;
            }
        }
        return p1;

    }

    //找倒数第k个结点

    public static ListNode SearchtoTail(ListNode head,int x){

        ListNode p1=head;
        ListNode p2 =head;

        int i=0;
        for( i=0;(p2!=null)&&i<x;i++){
           p2=p2.next;
        }
        //x大于结点个数
        if(p2==null&&i<x){
            return null;

        }else if(p2==null){

            return head;
        }

        while(p2!=null){
            
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }


    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);
        ListNode node6=new ListNode(6);
        ListNode node7=new ListNode(7);
        ListNode node8=new ListNode(8);
        //ListNode node9=new ListNode(9);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        node7.next=node8;
        //node8.next=node9;
        node8.next=null;
       // node9.next=null;

        System.out.println("找中间结点：");
        System.out.println(SearchMedium(node1).val);
        System.out.println("找倒数第三个结点：");
        System.out.println(SearchtoTail(node1,3).val);

    }


}
