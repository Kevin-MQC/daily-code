//�������
class Computer
{
	String brand;
	String style;
	String color;

}

//ѧ����
class Student
{
   int no;
   String name;
   Computer notepad;
}

//������
public class computerTest
{
	public static void main(String[] args){
		Student zhangsan = new Student();
		

		Computer bijiben = new Computer();
		
		zhangsan.notepad= bijiben;
		bijiben.brand = "HUAWEI";


//һ��������������֣����ã��ǿ��Ա���ֵ����һ�����еı����ġ�


//��֪�������� �ʼǱ��� Ʒ��
//�����notepad�����ñʼǱ������档
System.out.println(zhangsan.notepad.brand);



//������ԭ�ȵıʼǱ����ˣ�����һ���µġ�
zhangsan.notepad = new Computer();
System.out.println(zhangsan.notepad.brand);
	}
}