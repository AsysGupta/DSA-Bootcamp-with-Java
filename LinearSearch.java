package com.albatross.Interfaces;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int[] list = {12,42,54,89,32,32};

        System.out.print("Enter the search item: ");
        int item = sc.nextInt();
        linSearch(list,item);
    }
    public static void linSearch(int[] arr, int item) {
        int size = arr.length;
        int flag = 0; // To create a switch if item not found
        for(int i = 0; i < size; i++) {
            if(arr[i]==item) {
                int pos = i+1;
                System.out.println("Item found at  "+pos);
                flag++;
            }
        }
        if(flag==0) {
            System.out.println("Item is not present in the list");
        }
    }
}
