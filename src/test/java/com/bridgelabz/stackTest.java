package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class stackTest {
    private Assertions Assert;

    @Test
    public void givenThreeNumbers_WhenAddedToStack_ShouldHaveLastAddedNode() {
        MyStack stack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        stack.push(myFirstNode);
        stack.push(mySecondNode);
        stack.push(myThirdNode);
        stack.printStack();
        INode peak=stack.peak();
        Assert.assertEquals(peak,myThirdNode);

    }

}
