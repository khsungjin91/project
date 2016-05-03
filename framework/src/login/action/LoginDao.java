package login.action;

public class LoginDao {
	
	public boolean getUser(LoginDto dto)throws Exception{
		
		if("test".equals(dto.getId())){
			
			dto.setName("ȫ�浿");
			
			return true;
			
		}else{
			
			return false;
		}
		
		
	}

}
