package test;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class FormAction implements Action,Preparable,ModelDriven
{

	private DTO dto=null;//view ���� �Ķ���ͷ� �ٷΰ���.
	
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
	//controller ���� DTO��ü ����
	public Object getModel()//2
	{
		System.out.println("4");
		return dto;//���ϰ� �ȹٷξȾ��� view�� �ȶ��!!!!!!!!
	}
	//�Ķ���͸� ������ DTO ��ü ����
	public void prepare() throws Exception//1
	{
		System.out.println("3");
		dto=new DTO();
	}

}
