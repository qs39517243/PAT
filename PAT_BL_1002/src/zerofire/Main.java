package zerofire;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author liquanshuzero
 * requirement:����һ����Ȼ��n���������λ����֮�ͣ��ú���ƴ��д���͵�ÿһλ���֡�
 * 2018��6��14��
 */
public class Main {
	private static final String DECISION[] = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu",};
	
	public static void main(String[] args) {
		
		// get input content, nameing "strNnum"
		Scanner input = new Scanner( System.in );
		String strNum = input.next();
	
		counter( strNum );
		
		input.close();
		
	}
	
	private static void counter( String strNumber )
	{
		int result = 0;
		ArrayList<Integer> resultAL = new ArrayList<Integer>() ;
		
		// convert to an array
		char Mychar[] = strNumber.toCharArray();
		
		// figure out the plus
		for( int i=0; i<Mychar.length; i++)
		{
			char c = Mychar[i];
			result += c-48;
		}
		
		// System.out.println(result);
		
		for( ; result != 0; result /= 10 )
		{
			resultAL.add( result%10 );
		}
		
		// System.out.println(resultAL.size());
		
		// reverse output
		for( int i=0; i<resultAL.size(); i++)
		{
			// ensure the last number without a space:(" ")
			if( (resultAL.size()-1-i) != 0 )
				System.out.print( DECISION[resultAL.get (resultAL.size()-1-i )] + " " );
			else
				System.out.print( DECISION[resultAL.get (resultAL.size()-1-i )] );
		}
		
	}
}
