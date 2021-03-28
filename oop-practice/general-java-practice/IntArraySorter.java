package com.company;

/**
 * Created by Bernadette
 */
public class IntArraySorter {
    public int[] array;



    public IntArraySorter(int[] array){
        this.array = new int[array.length];

        for(int i=0;i<array.length;i++){
            this.array[i]=array[i];
        }
    }


    public void quickSort(){
    this.quickSort(0,this.array.length-1);

    }


    public void quickSort(int low, int high){
        int i = low;
        int j = high;
        int pivot = this.array[(low+high)/2];
        while(i<=j){
            while(this.array[i]<pivot){
                i++;
            }
            while(pivot<this.array[j]){
                j--;
            }

            if(i<=j){
                int h = this.array[i];
                this.array[i]= this.array[j];
                this.array[j]= h;

                i++;
                j--;
            }
        }
        if(low<i-1){
            quickSort(low,i-1);
        }
        if(i<high){
            quickSort(i,high);
        }
    }


    public boolean binarySearch(int[] a,int b){
        int from = 0;
        int to = a.length-1;
        while(from<=to){
            int i = (from+to)/2;
            if (a[i]<b){
                from=i+1;
            }
            else if(a[i]==b){
                return true;
            }
            else{
                to=i-1;
            }
        }
        return false;
    }

}
