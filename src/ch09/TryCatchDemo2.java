package ch09;

import java.io.IOException;

public class TryCatchDemo2 {
 
	public static void main(String[] args) { 
		Reso r1 = new Reso();
		Reso r2 = new Reso(); 
		try (r1;r2){ 
				r1.open(); 
				r2.open(); 
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}
	} 
}
class Reso implements AutoCloseable{
	void open() {
		System.out.println("자원을 엽니다.");
	}

	@Override
	public void close()   { 
		System.out.println("자원을 반환합니다."); 
	}
}