/*编写for循环找出1-100中的所有素数
  素数：又被称为质数，能够被1和自身整除，不能被其他数字整除的数字称为素数。
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


