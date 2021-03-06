public class qq {
	
	private int number;
	
	public void setNumber(int n){
		if(n<100){
			System.out.println("对不起，您输入的有错误");
			return;
		}
		number=n;
	}
	public int getNumber(){
		return number;
	}
}
