package by.zimin;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 45, 343, -34, 5, 667, -21, 1, 5};
        int[] arr3 = new int[]{1, 45, 3, -34, 34, 67, -21, 1, 5};
        int[] arr5 = new int[]{5, 45, 2, -34, 34, 63, -21, 4, 9};


        int[] arr4 = new int[]{1, 45, 3, -34, 34, 656, -21, 1, 5};

        double[] arr2 = new double[]{1, 45, 3, -34, 5, 67, -21, 1, 5};

        ArrayTasks at = new ArrayTasks();
        at.sumOfFirstAndLastNumbers(arr1);
        at.showAllNegativeElementsArray(arr1);

        at.replaceAllPositiveElements(arr1);
        at.showSumOfPre_MaxAndPre_min(arr1);
        at.increaseEachElementIntoThree(arr1);
        at.decreaseEachElementInSevenTimes(arr2);
        at.findMinElem(arr1);
        at.getReversArray(arr1);
        at.findMaxElemFromThreeArrays(arr5, arr3, arr4);
        at.findMiddleValue(arr3);


    }
}
