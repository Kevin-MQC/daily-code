public class TestSwitch5
{
	public static void main(String[] args){
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("��ӭʹ�ü򵥼���������");

		System.out.println("�������һ�����֣�");

		int num1=s.nextInt();
		System.out.println("�����������");
		String operator=s.next();
		System.out.println("������ڶ�������");
		int num2=s.nextInt();

		int result =0;
		switch(operator){
			case "+" :
				result=num1+num2;
			    break;
			case "-" :
				result=num1-num2;
			    break;
			case "/" :
				result=num1/num2;
			    break;
			case "*" :
				result=num1*num2;
			    break;
			case "%" :
				result=num1%num2;
			    break;
			default :
				System.out.println("�Բ��𣬸ó���֧�ִ�����");
			
		}
		System.out.println("������Ϊ"+num1+operator+num2+"="+result);
	}
}