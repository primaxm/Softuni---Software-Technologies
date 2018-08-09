import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
/*        if (input.length == 1) {
            System.out.println(0);
        } else if (input.length == 2) {
            if(input[0] == 0) {
                System.out.println(1);
            } else if (input[1] == 0) {
                System.out.println(0);
            } else {
                System.out.println("no");
            }
        } else {
            int leftSum = input[0];
            int rightSum = 0;
            for (int i = 2; i < input.length; i++) {
                rightSum += input[i];
            }

            boolean ok = false;
            for (int i = 0; i < input.length-1; i++) {
                if (leftSum == rightSum) {
                    System.out.println(i);
                    ok = true;
                }
                leftSum += input[i];
                rightSum -= input[i+1];
            }

            if (!ok) {
                System.out.println("no");
            }
        }*/


        if (input.length == 1) {
            System.out.println(0);
        } else if (input.length == 2) {
            System.out.println("no");
        } else {
            boolean ok = false;
            for (int i = 0; i < input.length; i++) {
                int leftSum = 0;
                int rightSum = 0;
                for (int j = 0; j < i; j++) {
                    leftSum += input[j];
                }
                for (int j = i+1; j < input.length; j++) {
                    rightSum += input[j];
                }
                if (leftSum == rightSum) {
                    System.out.println(i);
                    ok = true;
                }


            }
            if (!ok) {
                System.out.println("no");
            }
        }
    }
}
