import java.util.Scanner;

public class FascinatingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String str = "" + (n * 1) + (n * 2) + (n * 3);
        boolean allDigitsPresent = true;
        for (int i = 1; i <= 9; i++) {
            if (!str.contains(String.valueOf(i))) {//str.charAt(i) vs str.ValueOf(i)
                allDigitsPresent = false;
                break;
            }
        }

        if (allDigitsPresent && str.length() == 9)
            System.out.println(n + " is a Fascinating Number");
        else
            System.out.println(n + " is NOT a Fascinating Number");
    }
}
