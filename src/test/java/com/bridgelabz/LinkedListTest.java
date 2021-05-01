package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
    private Assertions Assert;

    @Test
    public void given3NumbersWhenLinkedShouldPassedLinkedListTest() {
        MyNode<Integer> MyFirstNode=new MyNode<>(56);
        MyNode<Integer> MySecondNode=new MyNode<>(30);
        MyNode<Integer> MyThirdNode=new MyNode<>(70);
        MyFirstNode.setNext(MySecondNode);
        MySecondNode.setNext(MyThirdNode);
        boolean result=MyFirstNode.getNext().equals(MySecondNode)&&
                MySecondNode.getNext().equals(MyThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddAtTop() {
        MyNode<Integer> MyFirstNode=new MyNode<>(70);
        MyNode<Integer> MySecondNode=new MyNode<>(30);
        MyNode<Integer> MyThirdNode=new MyNode<>(56);
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.add(MyFirstNode);
        linkedList.add(MySecondNode);
        linkedList.add(MyThirdNode);
        boolean result=MyLinkedList.head.equals(MyThirdNode)&&
                MyLinkedList.head.getNext().equals(MySecondNode)&&
                MyLinkedList.tail.equals(MyFirstNode);
        Assert.assertTrue(result);
        linkedList.PrintMyNodes();
    }

}
