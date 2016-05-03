package test.upload;

import java.io.File;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.Action;

public class UploadAction implements Action{

	
	private String name;
	
	public void setName(String name){this.name = name;}
	
	private File save[];
	private String saveFileName[];
	private String saveContentType;
	
	public void setSave(File save[]){  // ������ ����  
		this.save = save;
		}  
	//���� ���ε�� save�� �迭�� �ٲ��ش� . save[] 
	
	
	public void setSaveFileName(String saveFileName[]){ //���ε� �� ���� �̸�
		this.saveFileName = saveFileName;
		}
	
	public void setSaveContentType(String saveContentType){ // ���ε��� ���� Ÿ��
		this.saveContentType = saveContentType;
		}
	
	
	public String execute() throws Exception {
		
	
		String path = "E:\\save\\";
		
		for(int i = 0; i < save.length ; i++){
		
		// ������ ������ �����.
		File up = new File(path+saveFileName[i]);
		
		FileUtils.copyFile(save[i],up); // save ��  up�� ���� �Ѵ�.
	
		}
		
		return SUCCESS;
	}
	
	
	
	public String getName(){return name;}
	public String[] getSaveFileName(){return saveFileName;}
	
	

}
