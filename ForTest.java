public class ForTest
{
	public static void main(String[] args){
		
		for (int i=1;i<=9 ;i++ )//外层循环九次搞定了，i是行数
		{
			//System.out.println(i);
			for (int j=1;j<=i;j++){
				System.out.print(i + "*" + j + "=" + i * j + " ");

			}
			System.out.println();
			System.out.print("\n");
		}
	}
}