package by.zimin;

import java.util.Arrays;

public class ArrayTasks {

    /**
     * 0. Вывести сумму первого и последнего значений массива
     */
    public int sumOfFirstAndLastNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i == arr.length - 1) {
                sum += arr[i];
            }
        }
        System.out.println("The sum of first number and last = " + sum);
        return sum;
    }

    /**
     * 1. Вывести все отрицательные значения массива
     */

    public void showAllNegativeElementsArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    /**
     * 2. Удалить все положительные элементы массива (замена на 0)
     */

    public int[] replaceAllPositiveElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    /**
     * 3. Вывести сумму предмаксимального и предминимального
     */

    public int showSumOfPre_MaxAndPre_min(int[] arr) {
        int pre_max, pre_min, temp;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {

                } else {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        sum = arr[1] + arr[arr.length - 2];
        System.out.println(Arrays.toString(arr));
        System.out.println("The sum of pre-max element end pre-min =  " + sum);
        return sum;
    }


    /**
     * 4. Увеличить массив на 3 (каждый элем)
     */
    public int[] increaseEachElementIntoThree(int[] arr) {
        for (int i = 0, j = 3; i < arr.length; i++) {
            arr[i] += j;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    /**
     * Уменьшить массив в 7 раз (каждый элем)
     */
    public double[] decreaseEachElementInSevenTimes(double[] arr) {
        for (int i = 0, j = 7; i < arr.length; i++) {
            arr[i] /= j;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    /**
     * 6. find MIN from incoming Array
     */
    public int findMinElem(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min element from array: " + min);
        return min;
    }

    /**
     * 7. get Reverse Array
     */
    public int[] getReversArray(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0, j = arr1.length - 1; i < arr.length; i++, j--) {
            arr1[j] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        return arr1;
    }

    /**
     * 8. get Array only with negative values from original array
     */
    public void getNegativeElementFromArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print("The negative elements from array: " + arr[i]);
            }
        }
    }

    /**
     * 9. find MAX from tree incoming arrays
     */
    public int findMaxElemFromThreeArrays(int[] arr, int[] arr2, int[] arr3) {
        int max = arr[0];
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (max < arr2[i]) {
                max = arr2[i];
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            if (max < arr3[i]) {
                max = arr3[i];
            }
        }
        System.out.println("Max element from three arrays: " + max);
        return max;
    }

    /**
     * 10. find middle value from array.
     */

    public int findMiddleValue(int[] arr) {
        int middle;
        int temp;
        for (int i = 0; i < arr.length; i++) {//sort array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int temp1 = (arr[0] - arr[arr.length - 1]) / 2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == temp1) {
                middle = arr[i];
                return middle;
            }
        }
        System.out.println(Arrays.toString(arr));
        middle = arr[arr.length / 2];
        System.out.println(middle);
        return middle;
    }
}
