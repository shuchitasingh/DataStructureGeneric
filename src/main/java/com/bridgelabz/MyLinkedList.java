package com.bridgelabz;

public class MyLinkedList {
    public static INode head;
    public static INode tail;

    public MyLinkedList() {
        this.head=null;
        this.tail=null;
    }

    public void add(INode newNode) {
        if(this.tail==null) {
            tail = newNode;
        }
        if(this.head==null){
            this.head=newNode;
        }else {
            INode tempNode=this.head;
            this.head=newNode;
            this.head.setNext(tempNode);
        }
 
        if(this.head==null){
            this.head=myNode;
        }
        if(this.tail==null){
            this.tail=myNode;
        }else{
            this.tail.setNext(myNode);
            this.tail=myNode;
        }
    }
