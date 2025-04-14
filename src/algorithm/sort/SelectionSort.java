package algorithm.sort;

public class SelectionSort {


    public static void main(String[] args) {



        int[] arr = {10,6,15,8,3};

        System.out.print("Before Selection sort: ");
        Sort.printArray(arr);

        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];
            int tmp = i;

            for (int j = i; j < arr.length; j++) {

                if (min > arr[j]) {
                    min = arr[j];
                    tmp = j;
                }

            }

            Sort.swap(arr,i,tmp);
        }

        System.out.print("After Selection sort: ");
        Sort.printArray(arr);

    }
}
