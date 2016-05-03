package test.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.Action;

public class DiAction implements Action, ServletRequestAware, DAOAware{

	private HttpServletRequest requst;
	private DAO dao = null;
	// ������� ��� new ������ ���־�� ������ action������ new ����� �ִ��� ���̱� ���� ������� �ʴ´�.
	
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
