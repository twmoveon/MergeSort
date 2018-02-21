package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {

    private static int N = 1024;
    private static String path = "/Users/wuxiaodong/Downloads/dataset-problem2-hw2/data0.1024";

    public static void main(String[] args) throws IOException {
        // write your code here
        implementMergeSort1();
        implementMergeSort2();
    }

    public static void implementMergeSort1() throws IOException {
        MergeSort1 mergeSort1 = new MergeSort1();
        int[] array = loadArray();
        mergeSort1.sort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void implementMergeSort2() throws IOException {
        MergeSort2 mergeSort2 = new MergeSort2();
        int[] array = loadArray();
        mergeSort2.sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] loadArray() throws IOException {
        int[] array = new int[N];
        File filename = new File(path);
        InputStreamReader reader = new InputStreamReader(
                new FileInputStream(filename)); // Create a reader object
        BufferedReader br = new BufferedReader(reader);
        String line = "";
        int i = 0;
        while (line != null && i < array.length) {
            line = br.readLine(); // Read each line
            if(line != null)
                array[i] = Integer.parseInt(line);
            i++;
        }
        return array;
    }
}
