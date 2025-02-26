package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int temp = 0;
        for (int i = 1; i < elements.length; i++) {
            boolean inserted = false;
            int idx = i;
            while (!inserted && idx >= 1) {
                if (elements[idx] < elements[idx - 1]) {
                    temp = elements[idx];
                    elements[idx] = elements[idx - 1];
                    elements[idx - 1] = temp;
                    idx--;
                } else {
                    inserted = true;
                }
            }
        }
        return elements;
    }

   
    public static int[] selectionSort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int min = i;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j] < elements[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = elements[i];
                elements[i] = elements[min];
                elements[min] = temp;
            }
        }
        return elements;
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        for (int i = 1; i < words.size(); i++) {
            int idx = i;
            boolean inserted = false;
            while (!inserted && idx >= 1) {
                if (words.get(idx - 1).compareTo(words.get(idx)) > 0) {
                    words.set(idx, words.set(idx - 1, words.get(idx)));
                    idx--;
                } else {
                    inserted = true;
                }
            }
        }
        return words;
    }

    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).compareTo(words.get(j)) > 0) {
                    words.set(j, words.set(i, words.get(j)));
                }
            }
        }
        return words;
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }

   
}