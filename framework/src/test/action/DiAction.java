package test.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.Action;

public class DiAction implements Action, ServletRequestAware, DAOAware{

	private HttpServletRequest requst;
	private DAO dao = null;
	// 원래대로 라면 new 생성을 해주어야 하지만 action에서의 new 사용을 최대한 줄이기 위해 사용하지 않는다.
	
	public String execute() throws Exception {
		String id = requst.getParameter("id");
		
		System.out.println(id);
		
		requst.setAttribute("id", id);
		

		
		return SUCCESS;
	}

	public void setServletRequest(HttpServletRequest arg0) {
	
		this.requst = arg0;
		
	}

	
	public void setDAO(DAO dao) {
	
		this.dao = dao;
		
	}
	

}
