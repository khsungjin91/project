package test.result;

import java.io.FileInputStream;
import java.io.InputStream;
import com.opensymphony.xwork2.Action;

public class DownAction implements Action{
	
	private InputStream inputStream;
	private String fileName;
	
	
	public String execute()throws Exception{
		
		System.out.println(fileName);
		
		//다운로드 할 파일 읽기
		inputStream = new FileInputStream("C:\\Users\\user1\\Desktop\\" + fileName);
			
		
		return SUCCESS;
	}
	
	public void setFileName(String fileName){ this.fileName = fileName;}
	
	public InputStream getInputStream(){return inputStream;}
	
	public String getFileName(){return fileName;}

}
