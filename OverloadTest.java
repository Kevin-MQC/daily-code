public class OverloadTest
{
	public static void main(String[] args){
		/*
		System.out.println("Hello World");
		System.out.println(10);
		System.out.println(true);
		*/
		//����̫�鷳�ˣ��÷�������
     U.p(10);
     U.p(false);
	 U.p("aba");
	 U.p("haha");

	}
	
}
//�Զ�����
class U
{

	public static void p(byte b){
		System.out.println(b);
	}
	public static void p(short b){
		System.out.println(b);
	}
	public static void p(int b){
		System.out.println(b);
	}
	public static void p(double b){
		System.out.println(b);
	}
	public static void p(long b){
		System.out.println(b);
	}
	public static void p(boolean b){
		System.out.println(b);
	}
	public static void p(float b){
		System.out.println(b);
	}
	public static void p(char b){
		System.out.println(b);
	}
	public static void p(String b){
		System.out.println(b);
	}
}