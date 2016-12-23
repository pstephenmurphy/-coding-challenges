package coding.challenges;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
    	
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            int len = scanner.nextInt();

            BigInteger[] a = new BigInteger[len];
            
            for (int j = 0; j < len; j++) {
                a[j] = new BigInteger(scanner.next());
            }
            
            BigInteger[] result = new NextNumber().nextNumber(a);
            System.out.println(result.length);
            
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[j] + " ");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}