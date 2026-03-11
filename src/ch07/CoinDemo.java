package ch07;

public class CoinDemo {
	public static void main(String[] args) {
		System.out.println("Dime은 " + Coin.DIME + "센트 입니다.");// static 이므로 바로 가져다 쓸 수 있다. 
	}
}

interface Coin {
	int PENNY = 1, NICKEL = 5, DIME = 10, QUARTER = 25; // Method Area 에 저장
}
