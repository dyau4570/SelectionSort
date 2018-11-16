package DarrenYau;

public class Main {
    public static void main(String[] args) {
    }
    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void selectionSort(double[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int min = i;
            for(int j = 0; j < arr.length-1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                swap(i, min);
            }
        }
    }
}
