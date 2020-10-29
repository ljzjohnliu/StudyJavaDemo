package com.java.demo.test.sort;

import java.util.Arrays;

/**
 * 我们从冒泡排序的代码中看到了交换两个数字的方法 swap(int[] array, int i, int j)，这里使用了临时变量，而交换数字主要有三种方法，临时变量法、算术法、位运算法.
 */
public class SwapDemo {

    public static void main(String[] args) {
        // 临时变量法
        int[] array = new int[]{10, 20};
        System.out.println(Arrays.toString(array));
        swapByTemp(array, 0, 1);
        System.out.println(Arrays.toString(array));

        // 算术法
        array = new int[]{10, 20};
        swapByArithmetic(array, 0, 1);
        System.out.println(Arrays.toString(array));

        // 位运算法
        array = new int[]{10, 20};
        swapByBitOperation(array, 0, 1);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 通过临时变量交换数组array的i和j位置的数据
     *
     * @param array 数组
     * @param i     下标i
     * @param j     下标j
     */
    public static void swapByTemp(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * 通过算术法交换数组array的i和j位置的数据（有可能溢出）
     *
     * @param array 数组
     * @param i     下标i
     * @param j     下标j
     */
    public static void swapByArithmetic(int[] array, int i, int j) {
        array[i] = array[i] + array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }


    /**
     * 通过位运算法交换数组array的i和j位置的数据
     *
     * @param array 数组
     * @param i     下标i
     * @param j     下标j
     */
    public static void swapByBitOperation(int[] array, int i, int j) {
        array[i] = array[i] ^ array[j];
        array[j] = array[i] ^ array[j]; //array[i]^array[j]^array[j]=array[i]
        array[i] = array[i] ^ array[j]; //array[i]^array[j]^array[i]=array[j]
    }
}