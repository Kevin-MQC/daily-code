public class TestSwitch2
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		int num = s.nextInt();
		switch(num){
			case 1 :
				System.out.println("����һ");
			break;
			case 2 :
				System.out.println("���ڶ�"); 
			break;
			case 3 :
				System.out.println("������");
			break;
			case 4 :
				System.out.println("������");
			break;
			case 5 :
				System.out.println("������");
			break;
			case 6 :
				System.out.println("������");
			break;
			case 7 :
				System.out.println("������");
			break;
			default :
				System.out.println("�������");
			break;
		}
	}
}