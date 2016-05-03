package test.ibatis;

import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import test.inter.IbatisAware;

public class InsertAction implements Action,Preparable,ModelDriven,IbatisAware{
	private TestDTO dto;
	private SqlMapClient sqlMap;
	
	public String execute() throws Exception {
	
		sqlMap.insert("insert",dto);
		
		return SUCCESS;
	}

	
	public Object getModel() {	return dto;	}
	
	
	public void prepare() throws Exception {	dto = new TestDTO();	}


	
	public void setIbatis(SqlMapClient sqlMap) {
		
		this.sqlMap = sqlMap; 
		
	}
	
	
}
