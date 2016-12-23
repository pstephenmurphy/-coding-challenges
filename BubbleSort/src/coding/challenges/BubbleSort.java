package coding.challenges;

public class BubbleSort {
	public static void main(String[] args) {

		int num[] = { 3, 10, 2, 5, 1, 4, 6, 7, };

		BubbleSort bSort = new BubbleSort();

		bSort.bubbleSort(num);

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			if ( i < num.length-1) {
				System.out.print(",");
			}
		}

		System.out.println();

	}

	public int [] bubbleSort( int [ ] num )
	{
	     int temp;   		//holding variable
	     boolean flag;	    //set flag to false awaiting a possible swap

	     do
	     {
	    	 flag = false;
	    	 for( int j=0; j < num.length -1;  j++ )
	    	 {
	    		 if ( num[ j ] > num[j+1] )   // change to > for ascending sort
	    		 {
	    			 temp = num[ j ];		//swap elements
	    			 num[ j ] = num[ j+1 ];
	    			 num[ j+1 ] = temp;
	    			 flag = true;			//shows a swap occurred
	    		 } 
	    	 } 
	     } while ( flag );
	     
	     return num;
	}
}
