/**
 * Author:Fanleilei
 * Created:2019/4/6 0006
 */
public class PartLinkedList {


    public static ListNode Partation(ListNode pHead,int x){

        ListNode small=null;//存放小于x的
        ListNode smalllast=null;//存放小于x的链表的最后一个结点
        ListNode big=null;//存放大于x的
        ListNode biglast=null;//存放大于x的链表的最后一个结点


        ListNode  cur=pHead;
        while(cur!=null){
            ListNode next=cur.next;//该节点的下一个节点
            if(cur.val<x){
                //尾插
                cur.next=null;//这句很重要，要不然可能形成环
                //目的是将其后面的指向消除，否则最后一个结点的next不为null，反而还指向以前的结点，容易形成环
                if(small==null){

                    small=cur;

                }else{
                    smalllast.next=cur;
                }
                smalllast=cur;
            }else{
                //尾插
                cur.next=null;
                if(big==null){

                    big=cur;

                }else{
                    biglast.next=cur;
                }
                biglast=cur;

            }
              cur=next;

        }

        //将small和big合并
        if(small==null){//需要考虑链表为空的情况
            return big;

        }else{

            smalllast.next=big;
            return small;
        }


    }



    public static void main(String[] args) {

        ListNode n1=new ListNode(4);
        ListNode n2=new ListNode(3);
        ListNode n3=new ListNode(8);
        ListNode n4=new ListNode(5);
        ListNode n5=new ListNode(1);
        ListNode n6=new ListNode(0);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=null;


        Partation(n1,3);

    }
}
