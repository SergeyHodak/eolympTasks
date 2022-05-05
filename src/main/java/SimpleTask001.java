import java.util.Scanner;

public class SimpleTask001 {
    public static String splitNumbersWithASpace(int i) {
        return  i/10 + " " + i%10;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.print(number/10 + " " + number%10);
    }
}
/**
 * #Простая задача
 * Программа считывает двузначное число и выводит через пробел каждую цифру отдельно.
 *
 * #Входные данные
 * Натуральное число из промежутка от 10 до 99 включительно.
 *
 * #Выходные данные
 * Два одно цифровых числа, разделенных пробелом.
 */