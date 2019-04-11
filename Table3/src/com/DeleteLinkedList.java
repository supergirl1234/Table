package com;

import com.LinkedNode;

/**
 * Author:Fanleilei
 * Created:2019/4/8 0008
 *
 * 在链表中删除指定的value值
 */
public class DeleteLinkedList {


    public static LinkedNode deleteVaule(LinkedNode head, int vaule){

        LinkedNode result=null;//存放结果的链表
        LinkedNode lastNode=null;
        LinkedNode cur=head;

        while(cur!=null){

            if(cur.vaule!=vaule){
                //将其尾插到result中
                //lastNode.next = cur;
                if(result==null){
                    result=cur;

                }else {
                    lastNode.next = cur;
                }
                lastNode=cur;

            }

            cur=cur.next;

        }

        return  result;

    }


    public static void main(String[] args) {



        LinkedNode node7 = new LinkedNode(9, null);
        LinkedNode node6 = new LinkedNode(7, node7);
        LinkedNode node5 = new LinkedNode(3, node6);
        LinkedNode node4 = new LinkedNode(4, node5);
        LinkedNode node3 = new LinkedNode(3, node4);
        LinkedNode node2 = new LinkedNode(2, node3);
        LinkedNode node1 = new LinkedNode(1, node2);

        LinkedNode result=deleteVaule(node1,3);
        DisplayLinkedList.diaplay(result);






    }

}
