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
	
	public void setSave(File save[]){  // 파일의 원본  
		this.save = save;
		}  
	//다중 업로드시 save을 배열로 바꿔준다 . save[] 
	
	
	public void setSaveFileName(String saveFileName[]){ //업로드 할 파일 이름
		this.saveFileName = saveFileName;
		}
	
	public void setSaveContentType(String saveContentType){ // 업로드할 파일 타입
		this.saveContentType = saveContentType;
		}
	
	
	public String execute() throws Exception {
		
	
		String path = "E:\\save\\";
		
		for(int i = 0; i < save.length ; i++){
		
		// 복사할 파일을 만든다.
		File up = new File(path+saveFileName[i]);
		
		FileUtils.copyFile(save[i],up); // save 를  up에 복사 한다.
	
		}
		
		return SUCCESS;
	}
	
	
	
	public String getName(){return name;}
	public String[] getSaveFileName(){return saveFileName;}
	
	

}
