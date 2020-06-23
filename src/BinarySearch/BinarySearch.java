/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

import static Frames.Panels.Panel3.jTable1;
import java.util.Arrays;



class ArrayUtil{


	public static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
    }
   

public class BinarySearch {
    // Returns index of x if it is present in arr[l.. 
    // r], else return -1 

    


    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) {
                return mid;
            }

            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }

            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present 
        // in array 
        return -1;
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = minimumPosition(a, i);
            ArrayUtil.swap(a, minPos, i);
        }
    }

    private static int minimumPosition(int[] a, int from) {
        int minPos = from;
        for (int i = from + 1; i < a.length; i++) {
            if (a[i] < a[minPos]) {
                minPos = i;
            }
        }
        return minPos;
    }


    
    public int input(String[] sarr){
        System.out.println(Arrays.toString(sarr));

        int[] intarray = new int[sarr.length];
        for (int i = 0; i < sarr.length; i++) {
            if(sarr[i] != null) {
            int iarr = Integer.parseInt(sarr[i]);
            intarray[i] = iarr; }
            else {break;}
        }
        
        sort(intarray);
        int sr = bsearch(intarray, 10);

        return sr;
    }
    
    
    int bsearch(int[] iarr, int x){
        BinarySearch ob = new BinarySearch();
        int n = iarr.length;
        int result = ob.binarySearch(iarr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            for (int i = 0; i < jTable1.getColumnCount(); i++){
            }
            System.out.println("Element found at index " + result);
        }  
        return result;
    }
    // Driver method to test above 
    public static void main(String args[]) {

    }

    public static void stringv() {
        // TODO add your handling code here:
        //        Code for Selection sort
        String s = "12,25,48,989,86,46";
        int[] intarray = new int[s.length()];

        String[] stringArray = s.split(",");
        String sorted = "";

        for (int i = 0; i < stringArray.length; i++) {
            int arr = Integer.parseInt(stringArray[i]);
            intarray[i] = arr;

        }
        for (int i = 0; i < stringArray.length; i++) {
            int arr = Integer.parseInt(stringArray[i]);
            intarray[i] = arr;
        }
        sort(intarray);
        System.out.println(Arrays.toString(intarray));
        for (int i = intarray.length - 1; i >= 0; i--) {
            sorted = intarray[i] + "" + sorted;
        }
//        jTextField1.setText(sorted);

    }

}
    










