public class ForTest
{
	public static void main(String[] args){
		
		for (int i=1;i<=9 ;i++ )//���ѭ���Ŵθ㶨�ˣ�i������
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