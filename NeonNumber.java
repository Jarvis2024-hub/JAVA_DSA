package Day3.LOOPS;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int sum = 0;
        int sq=(int)Math.pow(num, 2);
        System.out.println("The square root of "+num+" is: "+sq);
        while (sq>0) {
                int r = sq % 10;
                sum += r;
                sq /= 10;
            }
        System.out.println((num==sum)?"it is a Neon number":"it is not a neon number");
    }
}
