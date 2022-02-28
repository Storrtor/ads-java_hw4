package lesson2;

import lesson2.search.BinarySearch;
import lesson2.search.ExponentialSearch;
import lesson2.search.InterpolationSearch;
import lesson2.sort.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArray.isRepeat = false;
        MyArray.isShuffle = false;
        final int SIZE = 50000;
        Integer[] arr = MyArray.getArray(SIZE, 3);

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, arr);

//        System.out.println(Arrays.toString(arr));

        SpeedTest.startTime();

//        BubbleSort.sort(arr); //при 50000 - 11704 / 3
//        CocktailSort.sort(arr); //12185
//        CombSort.sort(arr); // 42
//        SelectionSort.sort(arr); //3135 / 983
//        InsertionSort.sort(arr); // 2310 / 6
//        CountingSort.sort(arr); // 12
//        Arrays.sort(arr); // 33
//        Collections.sort(list); // 33


        SpeedTest.endTime();

//        System.out.println(Arrays.toString(arr));
        int NUM = 40000;
        System.out.println(BinarySearch.search(arr, NUM));
        System.out.println(ExponentialSearch.search(arr, NUM));
        System.out.println(InterpolationSearch.search(arr, NUM));


    }
}
