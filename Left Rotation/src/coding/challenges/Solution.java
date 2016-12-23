package coding.challenges;

import java.util.Scanner;

public class Solution {

    public static int[] arrayLeftRotation(int[] num, int n, int rotations) {
    	for (int i = 0; i < rotations; i++) {
			
    		int first = num[0];
    		
			for (int j = 0; j <  num.length-1; j++)
			{
				num[j] = num[j+1];
			}
			
			num[num.length-1] = first;
		}
		
		return num;

    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int rotations = in.nextInt();
        int num[] = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            num[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(num, n, rotations);
        
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
        
        in.close();
    }
}