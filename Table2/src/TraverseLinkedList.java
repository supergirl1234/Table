/**
 * Author:Fanleilei
 * Created:2019/4/6 0006
 *
 * 1->2->3->4->5变成5->4->3->2->1
 *
 */


public class TraverseLinkedList {

    //利用头插的方式  反转链表
    public static void reserveListNode1(ListNode head){

        ListNode result=null;//存放结果的链表
        ListNode cur=head;
        while(cur!=null){
            //cur的下一个节点
            ListNode next=cur.next;

            //将其头插到result中
            cur.next=result;
            result=cur;

            //下一次要头插的节点
            cur=next;


        }
       disply(result);

    }


    //pre cur next  利用双引用遍历的方法反转

    public static ListNode  reserveListNode2(ListNode head){
        ListNode pre=null;
        ListNode cur=head;
        ListNode next=head.next;

        while(cur!=null){

            //让前驱变成当前结点的next
            cur.next=pre;


            //让pre cur next都往后移一位
            pre=cur;
            cur = next;
            if(next!=null) {
                next = next.next;

            }




        }
        return pre;


    }

    //打印链表
    public static void disply(ListNode head){

           ListNode cur=head;
           while(cur!=null){
               if(cur.next==null){

                   System.out.print(cur.val);
               }else {
                   System.out.print(cur.val + "->");
               }
               cur=cur.next;

           }
    }
    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=null;
        disply(node1);
       /* System.out.println();
        System.out.println("反转之后：");
        reserveListNode1(node1);*/
        System.out.println();
        System.out.println("-----------------------------");
        ListNode result=reserveListNode2(node1);
        disply(result);


    }
}
class ListNode{

    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}