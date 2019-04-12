package com;

/**
 * Author:Fanleilei
 * Created:2019/4/11 0011
 *
 *
 *
 * 判断链表是否相交 :结点引用相同,则就是交叉，如果交叉，则找出交叉的结点处
 * */
public class IsCrossLinkedList {


    public static LinkedNode isCross(LinkedNode listA,LinkedNode listB){

        LinkedNode result=null;

        LinkedNode p1=listA;
        LinkedNode p2=listB;


        //先让长的链表先走，走到和短的链表一样长处
        int lengrhA=Length(p1);
        int lengrhB=Length(p2);
        int sub=0;
        if(lengrhA<lengrhB){
             sub=lengrhB-lengrhA;
            //让短链表先走
            for(int i=0;p2!=null&&i<sub;i++){
                 p2=p2.next;
            }


        }else {

            sub=lengrhA-lengrhB;
            for(int i=0;p1!=null&&i<sub;i++){
                p1=p1.next;
            }

        }

        //然后再判断链表是否交叉
        while(p1!=null&&p2!=null){
            if(p1==p2){

                result=p1;

                return result;

            }else {

                p1 = p1.next;
                p2 = p2.next;
            }

        }


        return  null;


    }

    public static int Length(LinkedNode head){

        int length=0;
        for(LinkedNode cur=head;cur!=null;cur=cur.next){
                length++;

        }
        return length;
    }

    public static void main(String[] args) {
        LinkedNode node6=new LinkedNode(6,null);
        LinkedNode node5=new LinkedNode(5,node6);
        LinkedNode node4=new LinkedNode(4,node5);
        LinkedNode node3=new LinkedNode(3,node4);
        LinkedNode node2=new LinkedNode(2,node3);
        LinkedNode node1=new LinkedNode(1,node2);




        LinkedNode p5=new LinkedNode(3,node4);
        LinkedNode p4=new LinkedNode(0,p5);
        LinkedNode p3=new LinkedNode(1,p4);
        LinkedNode p2=new LinkedNode(8,p3);
        LinkedNode p1=new LinkedNode(7,p2);

        LinkedNode result=isCross(node1,p1);
        System.out.println("交叉的结点为:"+result.vaule+"||"+result.next.vaule);
    }
}
