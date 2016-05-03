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
		
		//Map 부분을 읽어 준다.
		sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
		
		list = sqlMap.queryForList("list2");  //검색결과가 여러개인경우  return을 List 로 받을  수 있다.
						//boardSQL의 id
		
		 //dto = (TestDTO)sqlMap.queryForObject("writer","java"); //검색결과가 하나밖에 안나오는 경우
		 									// id , 매게변수 parameterClass가 받는다.
		 
		// sqlMap.insert(arg0);
		// sqlMap.delete(arg0);
		// sqlMap.update(arg0);
		
		
		return SUCCESS;
	}
	
	public List getList(){return list;}
	
	public TestDTO getDto(){return dto;}

}
