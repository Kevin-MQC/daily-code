public class RecursionTest2
{
	public static void main(String[] args){
		int n = 5;
		int x = haha(n);
		System.out.println(x);
	}
	public static int haha(int n){
		if(n==1)
			return 1;
		else
			return n*haha(n-1);
	}
}