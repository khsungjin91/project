package test.result;

import com.opensymphony.xwork2.Action;


public class SecondAction implements Action{

	

	public String execute() throws Exception {
	
		System.out.println("secondAction");
		
		return SUCCESS;
	}
	

	public String getPw(){return "password";}

	
}
