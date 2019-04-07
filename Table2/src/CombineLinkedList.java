/**
 * Author:Fanleilei
 * Created:2019/4/6 0006
 *
 * 有序链表1->2->3->4
 * 有序链表1->3->5->6->8
 * 将其合并为一个有序链表
 *
 * */


public class CombineLinkedList {

    public static ListNode mergeTwoList(ListNode l1,ListNode l2){

        ListNode cur1=l1;
        ListNode cur2=l2;
        ListNode result=null;//结果链表
        ListNode last=null;//last指向result链表中最后一个结点，用于保存最后一个结点
        while(cur1!=null&&cur2!=null){
            if(cur1.val<=cur2.val){
                ListNode next=cur1.next;//cur1的下一个结点，先保存下来

                //把cur1插入到result中
                cur1.next=null;//

                if(result!=null){
                  result = cur1;

                }else{

                    last.next=cur1;
                }
                last=cur1;//更新最后一个结点



                cur1=next;

            }else{

                ListNode next=cur2.next;//cur2的下一个结点

                //把cur2插入到result中
                cur2.next=null;

                if(result==null) {
                    result = cur2;
                }else{

                    last.next=cur2;
                }
                last=cur2;//更新最后一个结点



                cur2=next;
            }

        }

        //如果某一个链表空了，但另一个链表还没空
        while(cur1!=null){
            ListNode next=cur1.next;

            cur1.next=null;
            if(result==null){

                result=cur1;
            }else {
                last.next = cur1;
            }
            last=cur1;

            cur1=next;

        }
        while(cur2!=null){
            ListNode next=cur2.next;

            cur2.next=null;
            if(result==null){

                result=cur2;
            }else {
                last.next = cur2;
            }
            last=cur2;

            cur2=next;

        }

        return result;

    }

    public static void display(ListNode pHead){

        ListNode cur=pHead;
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

       /* ListNode n1=new ListNode(1);
        n1.next=null;
       *//* ListNode n2=new ListNode(3);
        ListNode n3=new ListNode(5);
        ListNode n4=new ListNode(7);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;*//*

*/
        ListNode n1=null;



        ListNode p1=new ListNode(1);
        ListNode p2=new ListNode(2);
        ListNode p3=new ListNode(4);
        ListNode p4=new ListNode(8);
        ListNode p5=new ListNode(9);
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p5;
        p5.next=null;

        ListNode result=mergeTwoList(n1,p1);
        display(result);

    }


}
