public class qq {
	
	private int number;
	
	public void setNumber(int n){
		if(n<100){
			System.out.println("�Բ�����������д���");
			return;
		}
		number=n;
	}
	public int getNumber(){
		return number;
	}
}
