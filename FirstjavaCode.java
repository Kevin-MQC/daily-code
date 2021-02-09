public class FirstjavaCode

{
	public static void main(String[] args)
	{
		//接收键盘输入，必须是数字。
		java.util.Scanner s =new java.util.Scanner(System.in);
		System.out.print("请输入你的年龄");
		int age =s.nextInt();
		//System.out.println("age = "+age);
		String str ="老年";
		if(age < 0||age > 150){
			str="您提供的年龄不合法，年龄需要在[1-150]之间";
		}else if(age <= 5){
		    str="幼儿";
		}else if(age <= 10){
			str="少年";
		}else if(age <=18){
			str="青少年";
		}else if(age <= 35){
			str="青年";
		}else if(age <= 55){
			str="中年";
		}
		System.out.println("您处于生命周期的"+str+"阶段");



		


	}
}