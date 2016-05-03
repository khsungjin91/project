package test.ibatis;

import java.io.Reader;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.opensymphony.xwork2.Action;

public class TestListAction implements Action{

	private Reader reader;
	private SqlMapClient sqlMap;
	private List list;
	private TestDTO dto;
	
	public String execute() throws Exception {
		
		reader = Resources.getResourceAsReader("sqlMapConfig.xml");
		
		//Map �κ��� �о� �ش�.
		sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
		
		list = sqlMap.queryForList("list2");  //�˻������ �������ΰ��  return�� List �� ����  �� �ִ�.
						//boardSQL�� id
		
		 //dto = (TestDTO)sqlMap.queryForObject("writer","java"); //�˻������ �ϳ��ۿ� �ȳ����� ���
		 									// id , �ŰԺ��� parameterClass�� �޴´�.
		 
		// sqlMap.insert(arg0);
		// sqlMap.delete(arg0);
		// sqlMap.update(arg0);
		
		
		return SUCCESS;
	}
	
	public List getList(){return list;}
	
	public TestDTO getDto(){return dto;}

}
