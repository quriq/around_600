package chapter_1;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a*10 + b;
        System.out.println(c);

        scanner.close();
    }
}
