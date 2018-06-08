import java.util.Scanner;

/**
 * @author liquanshuzero
 * a PAT subject
 * input a number
 * if it's an odd, multiply by 3  , add 1 and divided by 2
 * if it's an even number, divided by 2
 * until it equals to 1
 * 2018Äê6ÔÂ8ÈÕ
 */
public class Main {
	
	private static int count = 0;
	
	public static void main(String[] args) {
		
		// get input content, naming "num"
		Scanner input = new Scanner( System.in );
		int num = input.nextInt();
		
		counter(num);
		System.out.println(count);
		
		input.close();
	}
	
	private static void counter( int number ) 
	{
		for( ; number != 1; )
		{
			count++;
			if( number % 2 == 0 )
				number /= 2;
			else
				number = (number*3 + 1) / 2;
		}
	}
}
