package test.inter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.interceptor.Interceptor;


public class TestInterceptor implements Interceptor{

	// ���ͼ��Ͱ� ����� �� ��������� �����δ� ����� ���Ѵ�.
	public void destroy() {
	
		
	}

	//	���ͼ��͸� ó�� ���� ��ų�� ���� �ѹ� �����Ѵ�.
	public void init() {
		System.out.println("TestInterceptor init ....!!");
		
	}

	// ���ͼ��͸� �����Ҷ� ���� �����ϴ� �޼���
	public String intercept(ActionInvocation arg0) throws Exception {
							// ������ action�� ���� ����

		Object obj = arg0.getAction();
		if(obj instanceof Preparable){
			// ����̳� �������̽��� ������ �̷�� ���� �ִ��� �Ǵ� ����  instanceof
			// �ݵ�� ��� �޾ƾ��ϴ� �κп� ���� ���ȴ�.
			System.out.println("������");
		}else{
			System.out.println("�̱�����");
		}
		
		//invoke ������ �帧�� ����ϰ� ���ش�.
	
		return arg0.invoke();
	}
	
	

}
