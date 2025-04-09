import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        System.out.println("Задача №1,2");
        int[] arr = {1, 2, 3};
        float[] weight = {1.57f, 7.654f, 9.986f};
        int[] number = {1, 12, 17, 19};

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        for (int i = 0; i < weight.length; i++) {
            if (i == weight.length - 1) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                System.out.println(number[i]);
                break;
            }
            System.out.print(number[i] + ", ");
        }
        System.out.println();
        System.out.println("Задача №3");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача №4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}