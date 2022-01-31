package com.company;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    String[] str = scanner.nextLine().split(" ");
    int N = Integer.valueOf(str[0]);
    int K = Integer.valueOf(str[1]);
    ArrayList<Integer> list1 = new ArrayList<>(N);
    String[] a = scanner.nextLine().split(" ");
        for (int i=0; i<a.length; i++){
            list1.add(Integer.valueOf(a[i]));
        }
        ArrayList<Integer> list2 = new ArrayList<>(K);
        String[] b = scanner.nextLine().split(" ");
        for (int i=0; i<b.length; i++){
            list2.add(Integer.valueOf(b[i]));
        }
        for (int i=0; i<list2.size();i++){
            int index = Collections.binarySearch(list1, list2.get(i));
            if (index<0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
