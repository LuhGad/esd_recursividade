public class Fatorial {
public static int fatorial (int n) {
if (n == 0) 
return (1);
return (n * fatorial(n-1));
}
public static void main (String [] args){
int num = Integer.parseInt(args[0]);
System.out.println("Fatorial: " + fatorial(num));
}
}