package login.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import test.inter.LoginDAOAware;

public class LoginProAction implements Action,Preparable,ModelDriven,LoginDAOAware{
	
	LoginDto dto;
	LoginDao dao;
	
	public String execute()throws Exception{
		
		//LoginDao dao = new LoginDao();
		
	
		if(dao.getUser(dto)){
			
			return SUCCESS;
		}else {
			
			return ERROR;
		}
	}
	

	public void prepare() throws Exception {
		dto = new LoginDto();
		
	}

	public Object getModel() {
	
		return dto;
	}


	
	public void setLoginDao(LoginDao logindao) {
			
			System.out.println("setLoginDao 접속 완료...");
			this.dao = logindao;
		
	}

	
	
	

}
