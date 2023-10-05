package laba3;

public class Main {
    public static void main(String[] args) {
        // 1. Перевірка, чи рядок закінчується на "ed":
        String input1 = "tested";
        boolean endsWithEd = endsWithEd(input1);
        System.out.println("1. Рядок закінчується на 'ed': " + endsWithEd);

        // 2. Підрахунок суми цифр у рядку:
        String input2 = "abc123def45";
        int sum = sumOfDigits(input2);
        System.out.println("2. Сума цифр у рядку: " + sum);

        // 3. Знаходження довжини найбільшого "блоку" символів:
        String input3 = "aaBBBccccDDDD";
        int longestBlock = longestBlockLength(input3);
        System.out.println("3. Довжина найдовшого блоку символів: " + longestBlock);

        // 4. Виведення слів із рядка:
        String input4 = "Иван Иванович Иванов";
        System.out.println("4. Слова в рядку:");
        printWords(input4);

        // 5. Створення рядка, який складається чергово з символів двох рядків:
        String str1 = "Вася";
        String str2 = "12345678";
        String mergedString = mergeStrings(str1, str2);
        System.out.println("5. Результат об'єднання рядків: " + mergedString);
    }

    public static boolean endsWithEd(String input) {
        return input.endsWith("ed");
    }

    public static int sumOfDigits(String input) {
        int sum = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }

    public static int longestBlockLength(String input) {
        int maxBlockLength = 0;
        int currentBlockLength = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                currentBlockLength++;
            } else {
                if (currentBlockLength > maxBlockLength) {
                    maxBlockLength = currentBlockLength;
                }
                currentBlockLength = 1;
            }
        }

        return Math.max(maxBlockLength, currentBlockLength);
    }

    public static void printWords(String input) {
        String[] words = input.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static String mergeStrings(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            result.append(str1.charAt(i));
            result.append(str2.charAt(i));
        }

        if (str1.length() > minLength) {
            result.append(str1.substring(minLength));
        }

        if (str2.length() > minLength) {
            result.append(str2.substring(minLength));
        }

        return result.toString();
    }
}

