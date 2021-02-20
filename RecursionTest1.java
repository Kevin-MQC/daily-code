public class RecursionTest1
{
	public static void main(String[] args){
		/*int n =4;
		int sum = 0;
		for(int i = 1;i<=4;i++){
			sum +=i;

		}
		System.out.println("sum="+sum );*/



        int n =4;
		int sum=add(n);
		System.out.println(sum);
	}
	public static int add(int n){
		int sum=0;
		if(n==1)
			return 1;
		else
		
		return n+add(n-1);
		
	}
}