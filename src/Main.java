import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.println("Задача №1");
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Задача №2");
        int sumMin = arr[0];
        int sumMax = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (sumMin >= arr[i]) {
                sumMin = arr[i];
            }
            if (sumMax <= arr[i]) {
                sumMax = arr[i];
            }
        }
        System.out.println("Минимальна сумма трат " + sumMin + " рублей");
        System.out.println("Максимальна сумма трат " + sumMax + " рублей");
        System.out.println("Задача №3");
        int sumAverage = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц " + sumAverage + " рублей");
        System.out.println("Задача №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (i==0){
                System.out.println(reverseFullName[i]);
                break;
            }
            System.out.print(reverseFullName[i]);
        }



    }




}