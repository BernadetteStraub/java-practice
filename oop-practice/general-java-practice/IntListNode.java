package com.company;

public class IntListNode {
    public int value;
    public IntListNode next;


    public void set(int newValue,IntListNode newNext){
        value = newValue;
        next = newNext;
    }

    public IntListNode(int newValue,IntListNode newNext){
        set(newValue,newNext);
    }

    public int value(){
        return value;
    }
    public IntListNode next(){
        return next;
    }

}
