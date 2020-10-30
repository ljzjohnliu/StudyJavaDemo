package com.java.demo.test.sort;

import java.util.Arrays;

public class SortTest {

    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 2, 3};
//        int[] array = new int[]{3, 7, 2, 5, 9, 8};
//        int[] array = new int[]{4, 3, 7, 5, 10, 9, 1, 6, 8, 2};
        /**
         * 数组的输出的三种方式
         *         一维数组：
         *         定义一个数组   int[] array = {1,2,3,4,5};
         * （1）传统的for循环方式
         *         for(int i=0;i<array.length;i++)
         *         {
         *             System.out.println(array[i]);
         *         }
         * （2）for each循环
         *         for(int a:array)
         *             System.out.println(a);
         * （3）利用Array类中的toString方法
         *         调用Array.toString(a)，返回一个包含数组元素的字符串，这些元素被放置在括号内，并用逗号分开
         *         int[] array = {1,2,3,4,5};
         *         System.out.println(Arrays.toString(array));
         *         输出：[1, 2, 3, 4, 5]
         *         说明：System.out.println(array);这样是不行的，这样打印是的是数组的首地址。
         */

        System.out.println(Arrays.toString(array));
//        BubbleSort.sort(array);
//        Quicksort.sort2(array, 0, array.length - 1);
//        InsertSort.sort2(array);
        ShellSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
