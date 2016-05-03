package test.inter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import login.action.LoginDao;

public class LoginDaoInterceptor implements Interceptor{
	LoginDao logindao;
	
	public void destroy() {
		
		
	}

	
	public void init() {
		System.out.println("init 접속완료 ....");
		logindao = new LoginDao();
	}

	
	public String intercept(ActionInvocation arg0) throws Exception {
	
		Object action = arg0.getAction();
		
		System.out.println("실행전");
		if(action instanceof LoginDAOAware){
			
			LoginDAOAware logindaoaware = (LoginDAOAware)action;
			
			logindaoaware.setLoginDao(logindao);
		}
		
		System.out.println("전 interceptor 접속완료 ...");
		return arg0.invoke();
	}
	

}
