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
		//这是先将对象中的实例变量赋值给了同类型的变量，这样访问同类型的变量就行了，但是也是直接可以访问实例变量的，直接s.。。。。;

		
      /*System.out.println("学号 = " + stuNo);
		System.out.println("姓名 = " + stuName);
		System.out.println("年龄 = " + stuAge);
		System.out.println("性别 = " + stuSex);
		System.out.println("住址 = " + stuAddr);*/


		stuNo=10;//看来修改同类型的变量是没有办法直接修改对象中的实例变量的。
		s.name="jack";
		s.age=20;
		s.sex=true;
		s.addr="北京";

		System.out.println("学号 = " + s.no);
		System.out.println("姓名 = " + s.name);
		System.out.println("年龄 = " + s.age);
		System.out.println("性别 = " + s.sex);
		System.out.println("住址 = " + s.addr);

	}
}