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

		
      /*System.out.println("学号 = " + stuNo);
		System.out.println("姓名 = " + stuName);
		System.out.println("年龄 = " + stuAge);
		System.out.println("性别 = " + stuSex);
		System.out.println("住址 = " + stuAddr);*/

		System.out.println("学号 = " + s.no);
		System.out.println("姓名 = " + s.name);
		System.out.println("年龄 = " + s.age);
		System.out.println("性别 = " + s.sex);
		System.out.println("住址 = " + s.addr);

	}
}