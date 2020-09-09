package com.dkj.learn;

public class Array {

    Integer[] arr;
    int pos=0;

    public Array(int size) {
        arr=new Integer[size];
    }

    public void insert(int num){
        if(pos==arr.length)
            createNewArrayAndCopy();
        arr[pos++] = num;
    }

    public void removeAt(int index){
        if(index<0 || index>pos)
            System.out.println("Illegal Arg");
       else
        {
            for(int i=index;i<arr.length;i++){
                arr[index]=arr[index+1];
            }
            pos--;
        }

    }

    private void createNewArrayAndCopy() {
        Integer [] newArr = new Integer[pos*2];
        for(int i=0; i<arr.length;i++)
            newArr[i]=arr[i];
        arr=newArr;
    }

    public void print() {
        System.out.println("Values in ArrayList: ");
        for(int i=0; i<pos;i++)
        {
        System.out.println(arr[i]);
        };
    }
}
