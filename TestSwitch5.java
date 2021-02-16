public class TestSwitch5
{
	public static void main(String[] args){
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("欢迎使用简单计算器程序");

		System.out.println("请输入第一个数字：");

		int num1=s.nextInt();
		System.out.println("请输入运算符");
		String operator=s.next();
		System.out.println("请输入第二个数字");
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
				System.out.println("对不起，该程序不支持此运算");
			
		}
		System.out.println("运算结果为"+num1+operator+num2+"="+result);
	}
}