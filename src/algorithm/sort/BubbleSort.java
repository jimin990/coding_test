package algorithm.sort;

public class BubbleSort {
    public static void main(String[] args){

        int[] arr = {10,6,15,8,3};

        System.out.print("Before Bubble sort: ");
        Sort.printArray(arr);

        for (int i = arr.length-1; 0 < i; i--) {
            for (int j = 0; j < i; j++) {
                int num1 = arr[j];
                int num2 = arr[j+1];

                if(num1 > num2){
                    Sort.swap(arr, j, j+1);
                }
            }
        }

        System.out.print("After Bubble sort: ");
        Sort.printArray(arr);

    }
}
