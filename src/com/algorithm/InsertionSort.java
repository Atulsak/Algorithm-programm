package com.algorithm;

public class InsertionSort {

	 public static void insertionSort(int array[]) {
	        int n = array.length;
	        for (int j = 1; j < n; j++) {
	            int key = array[j];
	            int i = j-1;
	            while ( (i > -1) && ( array [i] > key ) ) {
	                array [i+1] = array [i];
	                i--;
	            }
	            array[i+1] = key;
	        }
	    }
	    public static void main(String[] args) {

	        int[] arr1 = {1,22,25,18,19,27,26,14,15};
	        System.out.println(" After");
	        for(int i:arr1){
	            System.out.print(i+" ");
	        }
	        System.out.println();

	        insertionSort(arr1);//sorting array using insertion sort

	        System.out.println(" before");
	        for(int a = 0; a<arr1.length; a++){
	            System.out.print(arr1[a] + " ");
	        }
	    }
}
