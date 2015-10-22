package encapsule;
/**
 * @file_name  : Sum.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 23.
 * @story      : 입력받은 두 수 사이의 값을 모두 더해서 반환해라.
 */
public class Sum {
	
	private int num1;
	private int num2;
	private String result;


	public void calc() {
		// TODO Auto-generated method stub
		int max = 0, min = 0, sum = 0;
		if(num1 > num2){
			max = num1;
			min = num2;
		}else { 
			max = num2; 
			min = num1;				
		}
		for (int i = min; i <= max; i++) {
			sum += i; 
		}
		result = sum + "";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return result;
	}
	

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
}

