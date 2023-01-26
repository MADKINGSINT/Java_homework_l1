package Lection_1;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        int a = Scanner.nextInt();
        Scanner.close();
        System.out.println (Triangle(a) + "\n");
    }

    public static int Triangle(int count) {
        if (count == 1) {
            return 1;
        }
        return Triangle(count - 1) + count;
    }
}

