package com;

/**
 * Author:Fanleilei
 * Created:2019/3/30 0030
 */
public class Bubble {


    //冒泡排序
    public static void BubbleSort(int[] array){

        for(int i=0;i<array.length-1;i++){
            int temp;
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }

        }

    }

    //二分查找
    //二分查找，数据一定要是有序的
    public static int BinarySearch(int[] array,int value){

        //左闭右开
        int left=0;
        int right=array.length;
        while(left<right) {
            int medium = (left + right) / 2;
            if (value < array[medium]) {
                right = medium;

            } else if(value>array[medium]){

                left=medium+1;
            }else if(value==array[medium]){

                return  medium;
            }
        }

        return -1;


    }

    public static void main(String[] args) {
        int[] Array=new int[]{6,7,2,8,1,0,20,12};
        BubbleSort(Array);
        for(int i=0;i<Array.length;i++){
            System.out.print(Array[i]+"  ");

        }

        System.out.println("--------------");
        int data=BinarySearch(Array,8);
        System.out.println("数所在的位置："+data);


    }
}
