package ch09;

public class UnCheckedDemo {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		int n = 3;
		int m = 0; 
		try {
			// 컴파일러가 체크하지 않고 바이트코드 생성함
			int res = n / m; // java.lang.ArithmeticException : / by zero
			System.out.println(res);
		} catch (ArithmeticException e) {
			System.err.println("0으로 나눌 수 없습니다. " + e.getMessage());
		} 
		
		try {
			unchecked();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("index 범위를 범어났습니다. " + e.getMessage());
		}
		
//		int[] arr = {1,2,3};
//		System.out.println(arr[4]); // ArrayIndexOutOfBoundsException : Index 4 out of bounds for length 3
		// throws ArrayIndexOutOfBoundsException main에 달아도 에러는 뜸. main은 최종 종착지로 main은 try-catch 문으로 처리하는게 좋음 

		int[] array = { 0, 1, 2 };
		try {

		int x = array[3];
		} catch (Exception e) {
			System.out.println("exception 발생!!!");
		}
//		catch (ArrayIndexOutOfBoundsException e) { <-에러 발생
//			System.out.println("원소가 존재하지 않습니다.");
//		}

		System.out.println("종료.");
		
	}
	
	static void unchecked() throws ArrayIndexOutOfBoundsException{
		int[] arr = {1,2,3};
		System.out.println(arr[4]); // ArrayIndexOutOfBoundsException : Index 4 out of bounds for length 3
	}
}


