package m1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Встановлюємо діапазон чисел
        int low = 0;
        int high = 1000;
        int mid;
        String input;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Загадайте число від " + low + " до " + high);

        // Цикл продовжується, поки не буде знайдено вгадане число
        while (low <= high) {
            mid = (low + high) / 2;

            System.out.println("Чи це ваше число: " + mid + "? (так/менше/більше)");
            input = scanner.nextLine();

            // Перевіряємо відповідь користувача
            if (input.equals("так")) {
                System.out.println("Гра завершена. Ваше число: " + mid);
                break;
            } else if (input.equals("менше")) {
                high = mid - 1;
            } else if (input.equals("більше")) {
                low = mid + 1;
            } else {
                System.out.println("Неправильний ввід. Спробуйте ще раз.");
            }
        }
    }
}

