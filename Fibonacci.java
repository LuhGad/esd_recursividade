public class Fibonacci{
public static int fibonacci(int num){
 	if (num < 2) 
	return num;
	return (fibonacci(num-1)+fibonacci(num-2));
	


}

	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		System.out.println(fibonacci(num));
	}	
}



    
