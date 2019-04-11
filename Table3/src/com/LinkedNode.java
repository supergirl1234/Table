package com;

/**
 * Author:Fanleilei
 * Created:2019/4/8 0008
 */
public class LinkedNode {

    public   int vaule;
    public LinkedNode next;

    public LinkedNode(int vaule, LinkedNode next) {
        this.vaule = vaule;
        this.next = next;
    }


    public int getVaule() {
        return vaule;
    }

    public LinkedNode getNext() {
        return next;
    }
}
