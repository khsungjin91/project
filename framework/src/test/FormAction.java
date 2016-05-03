package test;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class FormAction implements Action,Preparable,ModelDriven
{

	private DTO dto=null;//view 에서 파라미터로 바로간다.
	
	public String form() throws Exception
	{
		return SUCCESS;
	}
	public String execute() throws Exception
	{
		System.out.println("5");
		return SUCCESS;
	}
	
	//struts.xml->prepare->getModel->execute
	//controller 에게 DTO객체 리턴
	public Object getModel()//2
	{
		System.out.println("4");
		return dto;//리턴값 똑바로안쓰면 view에 안뜬다!!!!!!!!
	}
	//파라미터를 저장할 DTO 객체 생성
	public void prepare() throws Exception//1
	{
		System.out.println("3");
		dto=new DTO();
	}

}
