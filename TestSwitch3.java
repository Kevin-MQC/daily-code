public class TestSwitch3
{
	public static void main(String[] args){
		
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("���������ڼ���");
		String  dayOfWeek=s.next();
		
		switch(dayOfWeek){
			
			case"����һ":
				System.out.println(1);
			    break;
			case"���ڶ�":
				System.out.println(2);
			    break;
			case"������":
				System.out.println(3);
			    break;
			case"������":
				System.out.println(4);
			    break;
			case"������":
				System.out.println(5);
			    break;
			case"������":
				System.out.println(6);
			case"������":
				System.out.println(7);
			default :
				System.out.println("��������д���");

		}
		
	}
}