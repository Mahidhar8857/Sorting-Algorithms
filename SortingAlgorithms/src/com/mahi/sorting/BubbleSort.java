package com.mahi.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {2,1,4,3,2,3,4,5,3,22,1};
		
		
		for(int lastSortedIndex = arr.length-1;lastSortedIndex>0;lastSortedIndex--) {
			
			for(int startingIndex=0;startingIndex<lastSortedIndex;startingIndex++) {
				
				if(arr[startingIndex]> arr[startingIndex+1]) {
					swap(arr,startingIndex,startingIndex+1);
				}
			}
			
			
			
		}
		for(int l : arr) {
			System.out.print(l+" ");
		}
		

	}
	
	public static void swap(int[] arr,int i,int j) {
		
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

}
