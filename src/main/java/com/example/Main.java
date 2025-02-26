package com.example;

import java.util.ArrayList;

import com.example.project.Insertion_Sort.InsertionSort;
import com.example.project.Selection_Sort.SelectionSort;

public class Main {
    public static void main(String[] args) {
        // int[] arr = {5, 2, 9, 1, 5};
        // arr = InsertionSort.insertionSort(arr);
        // for (int num : arr) {
        //     System.out.print(num + ", ");
        // }

        ArrayList<String> words = InsertionSort.loadWordsInto(new ArrayList<String>());
        words = InsertionSort.insertionSortWordList(words);
        System.out.println(words);
        // for(int i=1; i < words.size();i++){
        //     if(words.get(i).compareTo(words.get(i-1))<0){ //not in alphabetical order
        //         System.out.println(i);
        //     }
        // }
    }
}
