package postandpre;

public class Increments {
    public static void main(String[] args) {

        // Sum 1
        int x = 7;
        int result1 = ++x + 5;
        System.out.println("Sum 1 Output = " + result1); // 13

        // Sum 2
        int y = 4;
        int result2 = y++ + 8;
        System.out.println("Sum 2 Output = " + result2); // 12

        // Sum 3
        int a = 3;
        int b = 2;
        int sum3 = ++a + b++ + 5;
        System.out.println("Sum 3 Output = " + sum3); // 11

        // Sum 4
        int p = 5;
        int q = ++p + p++;
        System.out.println("Sum 4 Output = " + q); // 12

        // Sum 5
        int m = 2;
        int n = m++ + ++m + 3;
        System.out.println("Sum 5 Output = " + n); // 9

        // Sum 6
        int x1 = 1;
        int y1 = 2;
        int z1 = ++x1 + ++y1 + x1++ + y1++;
        System.out.println("Sum 6 Output = " + z1); // 10

        // Sum 7
        int a1 = 4;
        int b1 = a1++ + ++a1;
        System.out.println("Sum 7 Output = " + b1); // 10

        // Sum 8
        int x2 = 3;
        int y2 = 1;
        int result8 = x2++ + ++y2 + x2++;
        System.out.println("Sum 8 Output = " + result8); // 9

        // Sum 9 (Tricky)
        int a2 = 2;
        int b2 = 3;
        int c2 = a2++ + ++a2 + b2++ + ++b2;
        System.out.println("Sum 9 Output = " + c2); // 14

        // Sum 10
        int x3 = 1;
        int y3 = 2;
        int z3 = x3++ + ++x3 + y3++;
        System.out.println("Sum 10 Output = " + z3); // 6

        // Sum 11
        int a3 = 5;
        int b3 = 2;
        int c3 = ++a3 + b3++ + a3++;
        System.out.println("Sum 11 Output = " + c3); // 14
    }
}
