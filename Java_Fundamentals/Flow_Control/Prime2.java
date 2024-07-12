package Flow_Control;
//program to print prime nos between 10 and 99
public class Prime2 {
	public static void main(String[] args) 
	{
		int i, number, count; 
		
		System.out.println(" Prime Numbers from 10 to 99 are : ");	
		for(number = 10; number <= 99; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }  
		}
	}
}