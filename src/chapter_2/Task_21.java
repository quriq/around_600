package chapter_2;

import java.util.Scanner;

public class Task_21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int nx1 = x1 + 1;
        int nx2 = x2 + 1;
        int nx3 = x3 + 1;
        System.out.println(x1 + ", " + x2 + ", " + x3);
        System.out.println(nx1 + ", " + nx2 + ", " + nx3);
    }
}
