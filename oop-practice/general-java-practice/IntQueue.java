package com.company;


public class IntQueue {

    public IntListNode head;
    public IntListNode last;


    public void add(int value) {
        IntListNode node = new IntListNode(value, null);
        if (empty()) {
            last = head = node;

        } else {
            last.set(last.value(), node);
            last = node;
        }


    }


    public boolean element(int value) {
    IntListNode current = head;
        while(current!=null){
            if(current.value==value){
                return true;
            }
            current = current.next;
        }
     return false;
    }


    public int remove(){
        int result = head.value();
        head=head.next();
        if(empty()){
            last=null;
        }
        return result;
    }


    public boolean empty() {
        return head == null;

    }

    public int length(){
       int count = 0;
       IntListNode node = head;
        while(node!=null){
            count++;
            node=node.next;
        }
        return count;

    }


    public int[] toArray(){
        int [] array = new int[this.length()];
        IntListNode node = head;

        for(int i=0;i<array.length;i++){
            array[i]= node.value;
            node=node.next;
        }
        return array;
    }

}