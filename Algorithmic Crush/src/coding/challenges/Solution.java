package coding.challenges;

import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int numberOfZeroes = in.nextInt();
        int numberOfQueries = in.nextInt();

        long[] zeroes = new long[numberOfZeroes];

        long maxValue = 0L;

        for (int i = 0; i < numberOfQueries; ++i) {
            in.nextLine();

            int min = in.nextInt();
            int max = in.nextInt();
            int value = in.nextInt();

            --min;
            --max;

            for (int j = min; j <= max; ++j) {
                long temp  = zeroes[j] + value;
                zeroes[j] = temp;

                if (temp > maxValue) {
                    maxValue = temp;
                }
            }
        }

        in.close();

        System.out.println(maxValue);
    }
}
