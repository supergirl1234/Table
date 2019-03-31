package com;

/**
 * Author:Fanleilei
 * Created:2019/3/30 0030
 */
public class MyArrayList implements IMyArrayList {

    public int[] array;//存放数据的数组
    public int size;//存放的数据的长度
    public MyArrayList(int capacity){
         this.array=new int[capacity];//数组的长度，即数组最多能存放多少个数据
        this.size=0;  //初始时，数组中没有存放数据，size=0

    }
    @Override
    public void PushFront(int item) {
        Isenough();

        for(int i=this.size-1;i>=0;i--){
            //把每一个数据往后挪一位
            array[i+1]=array[i];
        }
        this.array[0]=item;

        this.size++;
        Print();

    }

    @Override
    public void PushBack(int item) {
        Isenough();

        array[size]=item;
        this.size++;
        Print();

    }

    @Override
    public void DeleteFront() {
        for(int i=1;i<size;i++){
            array[i-1]=array[i];

        }
        this.size--;
        Print();

    }

    @Override
    public void DeleteBack() {
        this.size--;
        Print();

    }

    @Override
    public void DeleteData(int idex) {
        //如果idex==0就相当于头删了，idex==size-1，就相当于尾删了
        if (idex<=0 || idex>=size-1) {

        throw  new Error();

        }
        for(int i=idex+1;i<size;i++){
            array[i-1]=array[i];


        }
        this.size--;
        Print();

    }

    @Override
    public void PushData(int idex, int item) {
        Isenough();
        //如果idex==0就相当于头插了，idex等于size-1就相当于尾删了
        if (idex<=0 || idex>=size-1) {

            throw  new Error();

        }
        //将idex后面的数据后移一位
        for(int i=size-1;i>=idex;i--){
            array[i+1]=array[i];


        }
        array[idex]=item;
        this.size++;
        Print();

    }

    //将数据输出
    public void Print(){

        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");

        }
    }

    //如果size>array.length将,则数组扩容,一般是扩容两倍
    public  void  Isenough(){
        //如果size>=lengthj就要扩容了
        if (this.size==array.length) {
            int[] newArray=new int[2*array.length];//扩大两倍
            for(int i=0;i<size;i++){

                newArray[i]=array[i];
                this.array=newArray;
            }


        }




    }

    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList(10);
        myArrayList.PushFront(10);
        System.out.println();
        myArrayList.PushFront(1);
        System.out.println();
        myArrayList.PushFront(2);
        System.out.println();
        myArrayList.PushBack(3);
        System.out.println();
        myArrayList.PushBack(2);
        System.out.println();
        myArrayList.PushBack(1);
        System.out.println();
        myArrayList.DeleteFront();
        System.out.println();
        myArrayList.DeleteBack();
        System.out.println();
        myArrayList.DeleteData(1);
        System.out.println();
        myArrayList.PushData(1,4);





    }
}
