import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SILab1 {
<<<<<<< HEAD
    /*ova e master */
=======
>>>>>>> d0bdf57830e1f5a60d737f8a48f7fc63bcc4659b
    public static List<Integer> filterOddNumbers(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer el : list) {
            if (el % 2 == 0) {
                result.delete(el);
            }
        }
        return result;
    }

    private static int sumEvenNumbers(List<Integer> list) {
        int sum = 0;
        for (Integer el : list) {
            if (el % 2 == 0) {
                sum += el;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(filterOddNumbers(list));

        System.out.println(sumEvenNumbers(list));
    }
}