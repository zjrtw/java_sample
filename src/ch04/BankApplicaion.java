package ch04;

import java.util.Scanner;

public class BankApplicaion {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String template = """
				-------------------------------------------------
				1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료
				-------------------------------------------------
				선택 > """;
		
		String menu = "";
		int money;
		Account account = null;
		while (true) {
			System.out.println(template);
			menu = in.nextLine();
			if (menu.equals("5")) {
				break;
			}
			switch(menu) {
			case "1" -> {account = createAccount(in, account);}
			case "2" -> accountInquiry();
			case "3" -> depositProcess();
			case "4" -> withdrawProcess();
			default -> System.out.println("메뉴 확인 바랍니다.");
			}
		}
		System.out.println("프로그램 종료");
	}
	
	public static Account createAccount(Scanner in, Account account) {
		in.nextLine();
		System.out.println("계좌 생성 처리 중...");
		account = new Account("234234", "홍길동", 0);
		return account;
	}
	
	public static void accountInquiry() {
		System.out.println("계좌 목록 조회 중...");
	}
	
	public static void depositProcess() {
		System.out.println("예금 처리 중...");
	}
	
	public static void withdrawProcess() {
		System.out.println("출금 처리 중...");
	}
}


class Account{
	// 비즈니스 도메인의 비즈니스 로직, 룰 정의되어 있어야 함. 
	//생성자 // alt + shift + s => Generate Constructor using Fields
	public Account(String accountNo, String accountOwner, int balance) {
		this.accountNo = accountNo;
		this.accountOwner = accountOwner;
		this.balance = balance;
	}

	// 필드
	private String accountNo;
	private String accountOwner;
	private int balance;
	
	// 접근자, 설정자
	// 접근자 : 모든 변수에 대해서 열어 놓고
	// 설정자 : 비즈니스 도메인의 로직에 맞게 조정
	public String getAccountNo() {
		return accountNo;
	}
	public String getAccountOwner() {
		return accountOwner;
	}
	public int getBalance() {
		return balance;
	}
	
	// 메서드 (입금, 출금, 조회)
	public void deposit(int money) {
		long tot = balance + money;
		// TODO 검증 필요
		if ( tot > 20_0000_0000) {// overflow 방지용
			balance = (int) tot;
		}
	}
	
	public void withdraw(int money) {
		if (money <= balance) {
			balance =- money;
		}
	}
		
	public int inquiry() {
		return balance;
	}
}