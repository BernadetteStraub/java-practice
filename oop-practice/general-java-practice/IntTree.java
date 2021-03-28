package com.company;


public class IntTree {



    class IntTreeNode {
       public int value;
       public IntTreeNode leftChild = null;
       public IntTreeNode rightChild = null;

       public IntTreeNode(int value) {
          this.value = value;
       }

       public void add(int value) {
          if (value < this.value) {
             if (leftChild == null) {
                leftChild = new IntTreeNode(value);
             } else {
                leftChild.add(value);
             }
          } else {
             if (rightChild == null) {
                rightChild = new IntTreeNode(value);
             }
             else{
                rightChild.add(value);
             }
          }
       }




       public boolean element(int value){
          if(value==this.value){
             return true;
          }
          else if (value<this.value){
             return leftChild.element(value);
             }
             else{
             return rightChild.element(value);
          }
       }
       public void inOrder(){
          if(this.leftChild!=null){
             this.leftChild.inOrder();
          }
          System.out.println(this.value);
          if(this.rightChild!=null){
             this.rightChild.inOrder();
          }
       }

       public void inOrderDesc(){
          if(this.rightChild!=null){
             this.rightChild.inOrder();}

          System.out.println(this.value);

             if(this.leftChild!=null){
                this.leftChild.inOrder();
             }

          }
       }


    IntTreeNode root;

    public void add(int value){
       if(empty()){
          root=new IntTreeNode(value);
       }
       else {
          root.add(value);
       }
    }

    public boolean element(int value){
       return ((!empty())&&root.element(value));
    }


   public void inOrder() {
      if (this.root != null) {
         this.root.inOrder();
      }
   }

   public void inOrderDesc() {
      if (this.root != null) {
         this.root.inOrderDesc();
      }
   }




   public boolean empty(){
      return root==null;
   }

}
