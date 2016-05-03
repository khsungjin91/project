package To0406.EX;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class TimeAction implements Action,Preparable,ModelDriven{

	TimeDto num;
	
	private int sum = 0;
	private int num1 = 0;
	private int num2 = 0;

	public void setNum1(int num1) {		this.num1 = num1;	}
	public void setNum2(int num2) {		this.num2 = num2;	}


	public String execute() throws Exception {

		TimeDao dao = new TimeDao();
		
		if(num.getNum1() == 0 && num.getNum2() == 0){		
			num.setNum1(num1);
			num.setNum2(num2);		
		}
		
	
		sum = dao.add(num);
			
		
		return SUCCESS;
	}
	
	
	public int getSum(){return sum;}


	
	public Object getModel() {
		
		return num;
	}

	public void prepare() throws Exception {
	
			num = new TimeDto();
		
	}

	public int getNum1() {		return num1;	}
	public int getNum2() {		return num2;	}

}
