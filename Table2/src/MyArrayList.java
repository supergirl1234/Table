/**
 * Author:Fanleilei
 * Created:2019/4/6 0006
 */
public class MyArrayList {

    private int[] array;//存储数据的实际空间
    private int size;//实际存储的个数

    public MyArrayList(int capacity){

         this.array=new int[capacity];
         this.size=0;
    }


    public void pushFront(int v){
        isEnlarge();

        /*for(int i=size-1;i>=0;i--){

            array[i+1]=array[i];

        }*/
        //或者另一种写法
        for(int i=0;i<size;i++){
            array[size-i]=array[size-1-i];

        }
        array[0]=v;
        size++;
    }

    public void pushEnd(int v){
        isEnlarge();
        array[size]=v;
        size++;
    }

    public void popFront(){
        for(int i=1;i<size;i++){
            array[i-1]=array[i];

        }
        size--;
    }

    public void popEnd(){

        size--;
    }

    //在某一个位置插入某一个数（非头非尾）
    public  void push(int index,int v){

       if(index==0||index==size-1){
           throw  new IllegalArgumentException("输入数据不合法，请输入（0，size-2）之间的数");
       }
       for(int i=size-1;i>=index;i--){

           array[i+1]=array[i];
       }
       array[index]=v;
       size++;

    }

    //是否需要扩容
     public void isEnlarge(){

        if(this.size==this.array.length){
            int[] newAray=new int[array.length*2];
            for(int i=0;i<size;i++){
               newAray[i]=array[i];

            }
            this.array=newAray;

        }



     }

}
