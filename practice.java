/*��дforѭ���ҳ�1-100�е���������
  �������ֱ���Ϊ�������ܹ���1���������������ܱ������������������ֳ�Ϊ������
*/
public class practice
{
	public static void main(String[] args){
		
			
			for(int i =2;i<=100;i++){
				boolean isSuShu=true;
				for(int j =2;j<i;j++){
					if(i%j==0){
						isSuShu = false;
						break;
					}
				}
				if(isSuShu){
					System.out.println(i);
				}
			}
		}
	}


