public class FirstjavaCode

{
	public static void main(String[] args)
	{
		//���ռ������룬���������֡�
		java.util.Scanner s =new java.util.Scanner(System.in);
		System.out.print("�������������");
		int age =s.nextInt();
		//System.out.println("age = "+age);
		String str ="����";
		if(age < 0||age > 150){
			str="���ṩ�����䲻�Ϸ���������Ҫ��[1-150]֮��";
		}else if(age <= 5){
		    str="�׶�";
		}else if(age <= 10){
			str="����";
		}else if(age <=18){
			str="������";
		}else if(age <= 35){
			str="����";
		}else if(age <= 55){
			str="����";
		}
		System.out.println("�������������ڵ�"+str+"�׶�");



		


	}
}