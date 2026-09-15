package chapter_2;

import java.util.Scanner;

public class Task_24 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double sq = a*b;
        double per = (a+b)*2;
        System.out.println(sq);
        System.out.println(per);
    }
}
