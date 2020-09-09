package com.dkj.learn;

public class MyLinkedList {

    private class Node {
        int data;
        Node next;
    }

     Node head;

     public void insert(int value){
         Node node= new Node();
         node.data=value;
         node.next=null;
         if(null==head)
             head=node;
         else{
             Node n = head;
             while(n.next!=null)
                 n=n.next;
             n.next=node;
         }
     }

    public void insertAtFirst(int value){
        Node node= new Node();
        node.data=value;
        node.next=head;
        head=node;
    }

    public void insertAt(int value,int index){
         if(index==0)
             insertAtFirst(value);
         else {
             Node node = new Node();
             node.data = value;
             int counter = 0;
             Node n = head;
             while (counter != index - 1) {
                 n = n.next;
                 counter++;
             }
             node.next = n.next;
             n.next = node;
         }
    }

    public int indexOf(int value) {
        int counter = 0;
        Node node = head;
        while (node.next != null) {
            if (node.data == value)
                return counter;
            else {
                counter++;
                node = node.next;
            }
        }
        if (node.data == value)
            return counter;
        return -1;
    }



    public void print(){
         Node n=head;
        System.out.println("Values in LinkedList: ");
         while (n.next!=null){
            System.out.println(n.data);
            n=n.next;
         }
         System.out.println(n.data);
    }

}
