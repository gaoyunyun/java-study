package com.example.demo.study.algorithm;

public class ArrayTest {

    //新建的数组
    private int myArray[];
    //当前数组移动个数
    private int size;

    public ArrayTest(int capacity) {
        this.myArray = new int[capacity];
        this.size = 0;
    }

    /**
     * 数组的插入
     * @param element 元素
     * @param index 插入的下标
     */
    private void insert(int element,int index ){
        //先判断插入位置是否超出范围
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("数组超长");
        }
        //如果达到数组上限则扩容
        if(size>=myArray.length){
            resize();
        }
        //从右向左循环，从插入的元素从右往左移动1位
        for (int i = size-1; i >= index; i--) {
            myArray[i+1]=myArray[i];
        }
        //赋值腾出的元素位置
        myArray[index]=element;
        size++;
    }

    private int del(int index){
        if(index<0&&index>=size){
            throw new IndexOutOfBoundsException("超出范围");
        }
        int element=myArray[index];
        for (int i = index; i < size-1; i++) {
            myArray[i]=myArray[i+1];
        }
        myArray[myArray.length-1]=0;
        size--;
        return element;
    }

    private void resize() {
        int[] newArray =new int[myArray.length*2];
        System.arraycopy(myArray,0,newArray,0,myArray.length);
        myArray=newArray;
    }

    private void output(){
        for (int i : myArray) {
            System.out.println(i);
        }
        System.out.println("-------------------");
    }

    public static void main(String[] args){
//        //读取，通过数组下标来读取叫做随机读取
//        int all[]={1,2,4,3};
//        System.out.println(all[2]);
//        //更新,时间复杂度 O(1)
//        all[0]=9;
//        System.out.println(all[0]);
        ArrayTest a=new ArrayTest(2);
        a.insert(2,0);
        a.insert(1,1);
        a.insert(8,2);
        a.insert(3,1);
        a.output();
        a.del(1);
        a.output();

    }
}
