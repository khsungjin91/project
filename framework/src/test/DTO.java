package test;

public class DTO 
{
	
	private String id;
	private String pw;
	
	public void setId(String id) 
	{
		System.out.println("2");
		this.id = id;
	}
	public void setPw(String pw)
	{
		this.pw = pw;
	}
	public String getId() 
	{
		System.out.println("7");
		return id;
	}
	public String getPw() 
	{
		return pw;
	}
	
	
}
