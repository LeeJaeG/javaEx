
public class 유저 implements 유저의정보 {
	String name1 = "소방관";
	
	public Fire(){
		name();
		func();
		work();
		
	}
	
	@Override
	public void name() {
		System.out.println(name1);
		
	}
	@Override
	public void func() {
		System.out.println("소화호스를 사용하여");
		
	}
	@Override
	public void work() {
		System.out.println("불을 끕니다");
		
	}

	


}
