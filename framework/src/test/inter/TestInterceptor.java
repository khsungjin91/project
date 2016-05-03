package test.inter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.interceptor.Interceptor;


public class TestInterceptor implements Interceptor{

	// 인터셉터가 종료될 때 실행되지만 실지로는 사용을 안한다.
	public void destroy() {
	
		
	}

	//	인터셉터를 처음 동작 시킬때 최초 한번 동작한다.
	public void init() {
		System.out.println("TestInterceptor init ....!!");
		
	}

	// 인터셉터를 동작할때 마다 동작하는 메서드
	public String intercept(ActionInvocation arg0) throws Exception {
							// 목적지 action에 대한 정보

		Object obj = arg0.getAction();
		if(obj instanceof Preparable){
			// 상속이나 인터페이스의 구현이 이루어 지고 있는지 판단 유무  instanceof
			// 반드시 상속 받아야하는 부분에 많이 사용된다.
			System.out.println("구현중");
		}else{
			System.out.println("미구현중");
		}
		
		//invoke 원래의 흐름을 계속하게 해준다.
	
		return arg0.invoke();
	}
	
	

}
