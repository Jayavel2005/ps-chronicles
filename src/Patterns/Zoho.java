package Patterns;

import java.util.Scanner;


public class Zoho {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        StringBuilder str = new StringBuilder(in.nextLine());
//        pattern1(str);
        pattern2(in.nextInt());
    }

    public static void pattern1(StringBuilder str) {
        if (str.length() % 2 == 0) {
            str.insert(str.length() / 2, "*");
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i == j || i + j == str.length() - 1) {
                    System.out.print(str.charAt(i) + " ");
                } else if (i == str.length() / 2) {
                    System.out.print(str.charAt(j) + " ");
                } else if (j == str.length() / 2) {
                    System.out.print(str.charAt(i) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        int top = (n + 1) / 2;
        int bottom = n - top;
        if (n % 2 == 0) {
            for (int i = 1; i <= top; i++) {
                for (int s = 1; s <= top - i; s++) {
                    System.out.print("   ");
                }

                for (int j = i; j >= 1; j--) {
                    if ((i + j) % 2 == 0) {
                        System.out.print(" 1 ");
                    } else {
                        System.out.print(" * ");
                    }
                }


                for (int j = 1; j <= i; j++) {
                    if ((i + j) % 2 == 0) {
                        System.out.print(" 1 ");
                    } else System.out.print(" * ");
                }

                System.out.println();
            }

            for (int i = 1; i <= bottom; i++) {
                for (int s = 1; s <= i - 1; s++) {
                    System.out.print("   ");
                }
                for (int j = bottom - i + 1; j >= 1; j--) {
                    if ((i + j) % 2 == 0) System.out.print(" 1 ");
                    else System.out.print(" * ");
                }

                for (int j = 1; j <= bottom - i + 1; j++) {
                    if ((i + j) % 2 == 0) System.out.print(" 1 ");
                    else System.out.print(" * ");
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= top; i++) {
                for (int s = 1; s <= top - i; s++) {
                    System.out.print("   ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    if (j == 1 || j == (2 * i - 1) || (i + j) % 2 == 0) System.out.print(" 1 ");
//                    else if ((i+j) %2 == 0) System.out.print(" * ");
                    else System.out.print(" 1 ");
                }
                System.out.println();

            }
        }
    }

}
