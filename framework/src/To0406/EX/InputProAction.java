package To0406.EX;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.Preparable;

public class InputProAction implements Action,Preparable{
	
	private String name; 
	private int age;
	
	public void setName(String name){ 
		System.out.println("set");
		this.name= name;}
	public void setAge(int age){ this.age= age;}
	
	
	
	public String execute()throws Exception{
		
		
		System.out.println("execute");
		
		
		
		return SUCCESS;
		
	}
	


	//  DTO ��ü���� �κ�  ���ͼ���
	public void prepare() throws Exception {
		
		System.out.println("prepare");
		
	}
	
	
	

}
