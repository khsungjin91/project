package To0406.EX;

public class TimeDao {
	
	public int add(TimeDto num){
		
	int sum = 0;
		sum = num.getNum1() + num.getNum2();
		
		return sum;
	}

}
