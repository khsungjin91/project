package test.inter;

import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class IbatisInterceptor implements Interceptor{

	private Reader reader = null;
	private SqlMapClient sqlMap = null;
	

	public void init() {		
		try{
			reader = Resources.getResourceAsReader("sqlMapConfig.xml");
			sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
			
			System.out.println("sqlMap 접속완료...");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	
	public String intercept(ActionInvocation arg0) throws Exception {
		
		Object obj = arg0.getAction();
		
		if(obj instanceof IbatisAware){
			IbatisAware ia = (IbatisAware)obj;
			ia.setIbatis(sqlMap);
		}
		
		return arg0.invoke();
	}
	
	
	public void destroy() {	}
	

}
