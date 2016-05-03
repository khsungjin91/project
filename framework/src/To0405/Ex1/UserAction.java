package To0405.Ex1;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class UserAction implements Action{
	
	private String name,addr,tel;

	
	
	Log log = LogFactory.getLog(UserAction.class);
	
	public String execute() throws Exception {
		
		Userinput userInput = new Userinput();	
		
		userInput.setName(name);
		userInput.setAddr(addr);
		userInput.setTel(tel);
		
	UserDao userdao = new UserDao();

	
	if(userdao.save(userInput)){
		return SUCCESS;
	}else{
		return ERROR;
	}
		
		
	}

	/*
	public void prepare() throws Exception {
		
		userInput = new Userinput();
		
	}


	public Object getModel() {
		System.out.println("1");
		return userInput;
	}
	*/

}
