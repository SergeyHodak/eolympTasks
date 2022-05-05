import java.util.Scanner;

public class NumbersTask002 {

    public static int numberOfDigitsInNumber(int i) {
        int result = 0;
        if (i==0) {
            result++;
        } else {
            while (i != 0) {
                i/=10;
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int result = 0;
        if (number==0) {
            result++;
        } else {
            while (number != 0) {
                number/=10;
                result++;
            }
        }
        System.out.print(result);
    }
}
/**
 * #Цифры
 * Вычислить количество цифр целого неотрицательного числа n.
 *
 * #Входные данные
 * Одно целое неотрицательное число n(0<=n<=2*10^9).
 *
 * #Выходные данные
 * Выведите, количество цифр в числе n.
 */