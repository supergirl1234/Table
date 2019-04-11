package com;

/**
 * Author:Fanleilei
 * Created:2019/4/9 0009
 *
 *
 *
 */
public class Searchvalue {

    //查找链表中倒数第几个结点
    //用双引用
    public static void searchToTail(LinkedNode head,int x){


        LinkedNode p1=head;
        LinkedNode p2=head;
        int i;
        for( i=0;p2!=null&&i<x;i++){

                p2 = p2.next;

        }
        if(p2==null&&i<x){
            System.out.println("x大于结点个数");

        }else if(p2==null){

            System.out.println("x不符合");
        }else {

            while (p2 != null) {
                p1 = p1.next;
                p2 = p2.next;

            }

            System.out.println(p1.vaule);

        }

    }


   public static void main(String[] args) {
      LinkedNode node7 = new LinkedNode(9, null);
       LinkedNode node6 = new LinkedNode(7, node7);
       LinkedNode node5 = new LinkedNode(3, node6);
       LinkedNode node4 = new LinkedNode(4, node5);
       LinkedNode node3 = new LinkedNode(3, node4);
       LinkedNode node2 = new LinkedNode(2, node3);
       LinkedNode node1 = new LinkedNode(1, node2);

       System.out.print("倒数第三个结点为：");
      searchToTail(node1,3);



    }
}
