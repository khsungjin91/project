package naver.action;

import java.math.BigInteger;
import java.security.SecureRandom;

import javax.servlet.http.HttpSession;


public class LoginAction {
	
	HttpSession session;
	
	// CSRF ������ ���� ���� ��ū ���� �ڵ�
	// ���� ��ū�� ���� ������ ���� ���ǿ� ����Ǿ�� �Ѵ�.

	public String generateState()
	{
	    SecureRandom random = new SecureRandom();
	    return new BigInteger(130, random).toString(32);
	}

	public String getState(){
	// ���� ��ū���� ����� ���� ���ڿ� ����
	String state = generateState();
	// ���� �Ǵ� ������ ���� ������ ���� ��ū�� ����
	session.setAttribute("state", state);
	
	return state;
	}
}
