/**
 * Author:Fanleilei
 * Created:2019/4/6 0006
 *
 *
 *
 * 判断链表是否是回文结构
 * A B C B A
 */

public class PalindromeLinkedList {


    //将链表从中间分开，将后半部分链表头插到result中去，然后将这两个链表进行比较



    //链表的长度
    public  static int Length(ListNode head){

        ListNode cur=head;
        int length=0;
        while(cur!=null){

            cur=cur.next;
            length++;

        }
        return  length;


    }
    public static boolean IsHuiwen(ListNode head){

        int length=Length(head);//链表的长度
        int medium=length/2;
        ListNode result=null;//存放head链表中后半部分的值

        ListNode cur=head;
        //通过循环，是使cur指向medium后面的值
        for(int i=0;i<medium;i++){

            cur=cur.next;
        }

        //将cur后面的值头插到result中

        //头插   还可以用逆转的方式
        while(cur!=null) {
            ListNode Next=cur.next;

             cur.next=result;
             result=cur;

            cur=Next;
        }

        return compareLinkedList(head,result);

    }

    //比较两个链表
    public static boolean compareLinkedList(ListNode l1,ListNode l2){
        ListNode p1=l1;
        ListNode p2=l2;

        while(p1!=null&&p2!=null){
            if(p1.val!=p2.val){

                return  false;

            }else{
                p1=p1.next;
                p2=p2.next;


            }

        }

        return true;
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
       ListNode node4=new ListNode(2);
       ListNode node5=new ListNode(1);
       node1.next=node2;
       node2.next=node3;
       node3.next=node4;
       //node2.next=node4;
       node4.next=node5;
       node5.next=null;


       System.out.println(IsHuiwen(node1));
    }


}
