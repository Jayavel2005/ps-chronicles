package Patterns;

import java.util.Scanner;

public class Patterns {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      int n = in.nextInt();
//      pattern1(n)
//      pattern2(n);

//        pattern3(in.nextInt(), in.nextInt());
//        pattern4(in.nextInt(), in.nextInt());
//          pattern5(in.nextInt());
//        pattern6(in.nextInt());
//            pattern7(in.nextInt());
//        pattern8(in.nextInt());
//        pattern9(in.nextInt());
//        pattern10(in.nextInt());

//        pattern11(in.nextInt());
//        pattern12(in.nextInt());
//        pattern13(in.nextInt());
//        pattern14(in.nextInt());
//        pattern15(in.nextInt());
//        pattern16(in.nextInt());
//        pattern17(in.nextInt());

//        pattern18(in.nextInt());

//        pattern19(in.nextInt());
//        pattern20(in.nextInt());
//        pattern21(in.nextInt());
//        pattern22(in.nextInt());
        pattern23(in.nextInt());

    }


//    Pattern 2
//    ****
//     ****
//      ****
//       ****

    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {

            for (int s = 0; s < i - 1; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // pattern 1
//    ****
//    ****
//    ****
//    ****
    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //            ******
//            ******
//            ******
//            ******
//    pattern 3
    public static void pattern3(int rows, int colums) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= colums; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

//    ******
//     ******
//      ******
//       ******
//    Parallelogram Star Pattern

    public static void pattern4(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int s = 0; s <= i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//           ****
//          ****
//         ****
//        ****
//Mirrored Rhombus Star Pattern

    public static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    //    *
//    **
//    ***
//    ****
//Triangle Star Pattern
    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //              *
//             ***
//            *****
//           *******
//Pyramid Star Pattern
    public static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //    *******
//     *****
//      ***
//       *
//Inverted Pyramid Star Pattern
    public static void pattern8(int n) {
        for (int i = n; i >= 1; i--) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

//           *
//           **
//           ***
//           ****
//           ***
//           **
//           *
//Half Diamond Star Pattern

    public static void pattern9(int n) {
        int totalRows = 2 * n - 1;

        for (int i = 1; i <= totalRows; i++) {

            int stars = (i <= n) ? i : (2 * n - i);

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//             *
//            ***
//           *****
//          *******
//           *****
//            ***
//             *
//Diamond Star Pattern

    public static void pattern10(int n) {
        for (int i = 1; i <= n * 2 - 1; i++) {
            int spaces = (i <= n) ? n - i : i - n;
            int stars = (i <= n) ? 2 * i - 1 : 2 * (2 * n - i) - 1;

            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            for (int st = 1; st <= stars; st++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern13(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }

    public static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) System.out.print("1 ");
                else System.out.print("0 ");
            }

            System.out.println();
        }
    }

    public static void pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int s = 1; s <= (n - i) * 2; s++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void pattern16(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }

            System.out.println();
        }
    }

    public static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }

    public static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }

    public static void pattern19(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print((char) ('A' + i));
            }
            System.out.println();
        }
    }

    public static void pattern20(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j));
            }

            for (int j = 0; j <= i - 1; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }

    public static void pattern21(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i - 1; j++) {
                System.out.print((char) ('A' + (n - i) + j));
            }
            System.out.println();
        }
    }

    public static void pattern22(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            for (int s = 1; s <= 2 * (i - 1); s++) {
                System.out.print(" ");
            }

            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern23(int n) {
        for (int i = 1; i <= n * 2 - 1; i++) {
            int stars = (i <= n) ? i : (2 * n - i);
            int spaces = (i <= n) ? 2 * (n - i) : 2 * (i - n);

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }


}
