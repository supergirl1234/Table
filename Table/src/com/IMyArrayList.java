package com;

/**
 * Author:Fanleilei
 * Created:2019/3/30 0030
 */
public interface IMyArrayList {

    //头插
    void PushFront(int item);
    //尾插
    void PushBack(int item);
    //头删
    void DeleteFront();
    //尾删
    void DeleteBack();
    //删除某一个中间数据
    void DeleteData(int idex);
    //插入某一个中间数据
    void PushData(int idex,int item);
}
