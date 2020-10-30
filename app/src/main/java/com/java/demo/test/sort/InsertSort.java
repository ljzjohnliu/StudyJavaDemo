package com.java.demo.test.sort;

import java.util.Arrays;

/**
 * 直接插入排序的基本思想是：
 * 将数组中的所有元素依次跟前面已经排好的元素相比较，如果选择的元素比已排序的元素小，则交换，直到全部元素都比较过为止。
 */
public class InsertSort {

    /**
     * 算法描述
     * 一般来说，插入排序都采用in-place在数组上实现。具体算法描述如下：
     * ①. 从第一个元素开始，该元素可以认为已经被排序
     * ②. 取出下一个元素，在已经排序的元素序列中从后向前扫描
     * ③. 如果该元素（已排序）大于新元素，将该元素移到下一位置
     * ④. 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
     * ⑤. 将新元素插入到该位置后
     * ⑥. 重复步骤②~⑤
     */

    /**
     * ①. 移位法：
     *
     * @param array
     */
    public static void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int temp = array[i]; // 先取出待插入数据保存，因为向后移位过程中会把覆盖掉待插入数
            while (j >= 0 && array[j] > temp) { // 如果待是比待插入数据大，就后移
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp; // 找到比待插入数据小的位置，将待插入数据插入
        }
    }

    /**
     * 而交换法不需求额外的保存待插入数据，通过不停的向前交换待插入数据，类似冒泡法，直到找到比它小的值，也就是待插入数据找到了自己的位置。
     * ②. 交换法：
     */
    public static void sort2(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }


        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            while (j >= 0 && array[j] > array[j + 1]) { //只要大就交换操作
                array[j + 1] = array[j] + array[j + 1];
                array[j] = array[j + 1] - array[j];
                array[j + 1] = array[j + 1] - array[j];
                j--;
                System.out.println("Sorting: j =  " + j + ", array : " + Arrays.toString(array));
            }
        }

    }

}
