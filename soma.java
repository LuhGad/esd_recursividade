public class soma {
public static int soma (int num){

if (num <= 0)
return 0;

return (num + soma(num-1));
}




public static void main(String[] args){

	int soma = 0;
	for (String num: args){
	soma+=Integer.parseInt(num);
	
	}

	System.out.println("Soma dos n�meros: " + soma);

     }


}
