package ch04;

public class Atm {
	
	// 매개변수가 없는 기본 생성자는 컴파일러가 자동으로 생성 해 주나 별도로 필드값을 임의의 값으로 초기화 해 주기 위해선 선언 해 줘야 한다. 
	public Atm() {
		location = "오리역";
		managedBy = "연구원";
	}
	
	public String location;
	public String managedBy;
	
	public void identifies(){
		
	}
	
	public void transactions() {
		
	}
}
