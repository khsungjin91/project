package test.inter;

import com.ibatis.sqlmap.client.SqlMapClient;

public interface IbatisAware {
	
	public void setIbatis(SqlMapClient sqlMap);

}
