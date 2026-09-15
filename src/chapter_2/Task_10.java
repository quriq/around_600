package chapter_2;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("значение х равно "+x + ", значение y равно "+y);
        int proz = x*y;
        System.out.println("значение произведения равно "+proz);
        int sum = x+y;
        System.out.println("значение суммы равно "+sum);
    }
}
