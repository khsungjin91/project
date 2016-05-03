package test.result;

import com.opensymphony.xwork2.Action;

public class FirstAction implements Action{

	
	public String execute() throws Exception {
		
		System.out.println("firstAction");
		
		return SUCCESS;
	}

	public String getId(){return "hello";}
	
}
