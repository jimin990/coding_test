package algorithm.sort;

public class Sort {

    public static Object[] init(String arrType, int arrLenght){

        return new Object[1];
    }

    /**
     * 주어진 배열에서 두 인덱스의 값을 서로 교환합니다.
     *
     * @param array 값을 교환할 대상 배열
     * @param index1 첫 번째 요소의 인덱스
     * @param index2 두 번째 요소의 인덱스
     */
    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    /**
     * 주어진 배열을 출력합니다.
     *
     * @param arr 출력할 대상 배열
     */
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
