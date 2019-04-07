/**
 * Author:Fanleilei
 * Created:2019/4/6 0006
 *
 *  //合并两个有序链表
 */
public class Test1 {


    public static ListNode Merge(ListNode listA,ListNode listB){

        ListNode cur1=listA;
        ListNode cur2=listB;
        ListNode result=null;//存放合并之后的链表

        ListNode last=null;//代表result链表的最后一个结点

        while(cur1!=null&&cur2!=null){

            if(cur1.val<cur2.val){
                ListNode next=cur1.next;//保存cur1的下一个结点

                //尾插到result中
                cur1.next=null;
                if(result==null){

                    result=cur1;
                }else{

                    //把cur1放在result的最后一个结点的后面
                    last.next=cur1;
                }

                //result的最后一个结点就变为了cur1
                last=cur1;


                cur1=next;


            }else{
                ListNode next=cur2.next;//保存cur2的下一个结点
                //尾插到result中
                cur2.next=null;
                if(result==null){

                    result=cur2;
                }else{

                    //把cur2放在result的最后一个结点的后面
                    last.next=cur2;
                }

                //result的最后一个结点就变为了cur2
                last=cur2;

                cur2=next;

            }
        }

        //把剩余的结点尾插到result链表上
        while(cur1!=null){
            ListNode next=cur1.next;
            cur1.next=null;
            if(result==null){

                result=cur1;
            }else {


                last.next = cur1;
            }
            last=cur1;//此时最后一个结点又变了

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

        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(3);
        ListNode n3=new ListNode(5);
        ListNode n4=new ListNode(7);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;




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

        ListNode result=Merge(n1,p1);
        display(result);

    }
}
