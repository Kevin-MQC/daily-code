public class OOTest01
{
	public static void main(String[] args){
		int i = 10;
		Student s =	new Student();
		
		int stuNo=s.no;
		String stuName=s.name;
		int stuAge=s.age;
        boolean stuSex=s.sex;
		String stuAddr=s.addr;

		
      /*System.out.println("ѧ�� = " + stuNo);
		System.out.println("���� = " + stuName);
		System.out.println("���� = " + stuAge);
		System.out.println("�Ա� = " + stuSex);
		System.out.println("סַ = " + stuAddr);*/

		System.out.println("ѧ�� = " + s.no);
		System.out.println("���� = " + s.name);
		System.out.println("���� = " + s.age);
		System.out.println("�Ա� = " + s.sex);
		System.out.println("סַ = " + s.addr);

	}
}