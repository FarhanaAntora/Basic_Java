//Find the max and min number from a given array

package com.Assignment03_Array;

public class MaxMin {
    public static void main(String[] args) {
        int[] a ={10,500,80,45,20};
        int max=a[0];
        int min=a[0];
        int i;
        int j;

        for(i=0; i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }

        for(j=0; j<a.length;j++){
            if(min>a[j]){
                min=a[j];
            }
        }
        System.out.println("Maximum number "+max);
        System.out.println("Minimum number "+min);
    }

}
