package test.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class DAOInterceptor implements Interceptor{

	private DAO dao = null;
	
	public void destroy(){}

	public void init() {
	
		dao = DAO.getinstance();
	}

	
	public String intercept(ActionInvocation arg0) throws Exception {
		
		Object obj = arg0.getAction();
		
		System.out.println(obj);
		
		if(obj instanceof  DAOAware){
			
			DAOAware da = (DAOAware)obj;
			da.setDAO(dao);
		}
		
		return arg0.invoke();
	}
	

}
