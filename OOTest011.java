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
		//�����Ƚ������е�ʵ��������ֵ����ͬ���͵ı�������������ͬ���͵ı��������ˣ�����Ҳ��ֱ�ӿ��Է���ʵ�������ģ�ֱ��s.��������;

		
      /*System.out.println("ѧ�� = " + stuNo);
		System.out.println("���� = " + stuName);
		System.out.println("���� = " + stuAge);
		System.out.println("�Ա� = " + stuSex);
		System.out.println("סַ = " + stuAddr);*/


		stuNo=10;//�����޸�ͬ���͵ı�����û�а취ֱ���޸Ķ����е�ʵ�������ġ�
		s.name="jack";
		s.age=20;
		s.sex=true;
		s.addr="����";

		System.out.println("ѧ�� = " + s.no);
		System.out.println("���� = " + s.name);
		System.out.println("���� = " + s.age);
		System.out.println("�Ա� = " + s.sex);
		System.out.println("סַ = " + s.addr);

	}
}