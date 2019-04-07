/**
 * Author:Fanleilei
 * Created:2019/4/6 0006
 *
 * 有序链表1->2->3->3->4->4->5->6->6变成1->2->5
 */

public class DeleteDuplicate {

    //前提是链表是有序的
    public static ListNode deleteDuplicate(ListNode head){

        if(head==null){

            return head;
        }

        ListNode dumy=new ListNode(0);
        ListNode pre=dumy;

        //用来比较的两个结点
        ListNode p1=head;
        ListNode p2=head.next;

        dumy.next=p1;
        //只要p2不等于null，p1不可能等于null
          while(p2!=null) {

            if (p1.val!= p2.val) {
                //两个结点都往后移一位


               /* pre=p1;

                p1 = p2;
                p2 = p1.next;*/

                pre = pre.next;
                p1 = p1.next;
                p2 = p2.next;


            }else{
                //只移动第二个结点
                while(p2!=null&&p2.val==p1.val){
                    p2=p2.next;

                }
                    pre.next=p2;
                    p1 = p2;
                    if(p2!=null) {
                        p2 = p2.next;
                    }

            }



        }

        return dumy.next;


    }
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
        ListNode node4=new ListNode(3);
        ListNode node5=new ListNode(3);
        ListNode node6=new ListNode(4);
        ListNode node7=new ListNode(5);
        ListNode node8=new ListNode(5);
        ListNode node9=new ListNode(6);
        ListNode node10=new ListNode(7);
        ListNode node11=new ListNode(7);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        node7.next=node8;
        node8.next=node9;
        node9.next=node10;
        node10.next=node11;
        node11.next=null;
        ListNode result=deleteDuplicate(node1);
        disply(result);


    }
}
