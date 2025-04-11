public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        System.out.println("Задача №1");
        int[] total = {100, 200, 300, 400, 500};
        int sum = 0;
        for (int i = 0; i < total.length; i++) {
            sum = sum + total[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
        System.out.println("Задача №2");
        int max = total[0];
        int min = total[0];
        for (int i = 0; i < total.length; i++) {
            if (total[i] < min) {
                min = total[i];
            }
            if (max < total[i]) {
                max = total[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");
        System.out.println();
        System.out.println("Задача №3");
        int mid = 0;
        for (int i = 0; i < total.length; i++) {
            mid = sum / 5;
        }
        System.out.println("Седняя сумма трат за месяц составила " + mid + " рублей");
        System.out.println();
        System.out.println("Задача №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}