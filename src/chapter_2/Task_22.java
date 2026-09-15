package chapter_2;

import java.util.Scanner;

public class Task_22 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double sum = x+y;
        double proz = x*y;
        double razn1 = x-y;
        double razn2 = y-x;
        System.out.println(sum);
        System.out.println(proz);
        System.out.println(razn1);
        System.out.println(razn2);

    }
}
