//计算机类
class Computer
{
	String brand;
	String style;
	String color;

}

//学生类
class Student
{
   int no;
   String name;
   Computer notepad;
}

//测试类
public class computerTest
{
	public static void main(String[] args){
		Student zhangsan = new Student();
		

		Computer bijiben = new Computer();
		
		zhangsan.notepad= bijiben;
		bijiben.brand = "HUAWEI";


//一个创建的类的名字（引用）是可以被赋值给另一个类中的变量的。


//想知道张三的 笔记本的 品牌
//这里的notepad不能用笔记本来代替。
System.out.println(zhangsan.notepad.brand);



//张三把原先的笔记本扔了，整了一个新的。
zhangsan.notepad = new Computer();
System.out.println(zhangsan.notepad.brand);
	}
}