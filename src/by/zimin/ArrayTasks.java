package by.zimin;

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
        System.out.println("The sum of first number and last = "+sum);
        return sum;
    }

}
