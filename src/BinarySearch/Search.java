/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

import static Frames.Panels.Panel3.jTable1;

/**
 *
 * @author LEGION
 */
public class Search {

    static int binarySearch(String[] arr, String x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            int res = x.compareTo(arr[m]);

            // Check if x is present at mid 
            if (res == 0) {
                return m;
            }

            // If x greater, ignore left half 
            if (res > 0) {
                l = m + 1;
            } // If x is smaller, ignore right half 
            else {
                r = m - 1;
            }
        }

        return -1;
    }
public static int[] binarySearch(String[][] a, String value) {
    int i = 0, j = a[0].length - 1; // start from top right corner

    while (i < a.length && j >= 0) {
        if (a[i][j] == value) {
            return new int[]{i, j};
        } else if (a[i][j] != value) {
            j--; // move left
        } else {
            i++; // move down
        }
    }
    // element not found
    return new int[]{-1, -1};
    

}
    public int Data(String x) {
        int rowsc = jTable1.getRowCount();
        int colc = jTable1.getRowCount();

        String[][] rows = new String[rowsc][colc];

        for (int i = 0; i < rowsc; i++) {
            for (int j = 0; j < colc; j++) {
                rows[i][j] = (String) jTable1.getValueAt(i, j);

            }
//                for (int j = 0; j < jTable1.getColumnCount(); j++) {//columns
//                    bw.write(jTable1.getValueAt(i, j) + ",");
//                }
//                bw.newLine();
        }
        int[] result = binarySearch(rows, "987");
        if (rows[0][0]==null) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at "
                    + "index " + result);
        }
        return 0;

    }

}
