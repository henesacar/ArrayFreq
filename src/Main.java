import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 2, 85, 12, 24, 12, 2, 8, 6, 6, 8, 8, 8};
        Arrays.sort(arr);
        int counter = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] == arr[i + 1])) {
                counter++;
                if (i == arr.length - 2) {
                    System.out.println(arr[i] + " sayısı " + counter + " kere tekrar edildi.");
                }
            } else {
                System.out.println(arr[i] + " sayısı " + counter + " kere tekrar edildi.");
                counter = 1;
                if (i == arr.length - 2) {
                    System.out.println(arr[i + 1] + " sayısı 1 kere tekrar edildi.");
                }
        }

    }}}

