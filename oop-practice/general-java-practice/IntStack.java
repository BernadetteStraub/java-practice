package com.company;

public class IntStack {
   public IntListNode top;


   public void push(int value){
       IntListNode node = new IntListNode(value,top);
       top = node;
   }

   public int pop(int value){
       int result = top.value();
       top=top.next();
       return result;
   }


    public boolean empty() {
        return top == null;

    }
}
