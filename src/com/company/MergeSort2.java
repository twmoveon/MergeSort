package com.company;

public class MergeSort2 {
    private int[] array;
    private int[] extraArray;
    private int count = 0;

    public void sort(int input[]) {
        this.array = input;
        this.extraArray = new int[input.length];
        for(int sz=1; sz<array.length; sz = sz+sz) {     // double sz during loop
            for(int lo=0; lo<array.length-sz; lo+=sz+sz)
                doMergeSort(array, extraArray, lo, lo+sz-1, Math.min(lo+sz+sz-1, array.length-1));  // merge
        }
        System.out.println("The number of comparision in MergeSort2 is: " + count);
    }
    public void doMergeSort(int a[], int aux[], int lo, int mid, int hi) {
        for(int k=lo; k<=hi; k++) {
            aux[k] = a[k];
        }

        int i = lo;
        int j = mid+1;
        for(int k = lo; k<=hi; k++) {
            if(i>mid) {a[k] = aux[j++];}
            else if(j>hi) {a[k] = aux[i++];}
            else if(aux[j] < aux[i]) {a[k] = aux[j++];count++;}
            else {a[k]  = aux[i++];count++;}
        }
    }
}
