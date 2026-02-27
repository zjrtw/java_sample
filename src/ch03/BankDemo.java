package ch03;

import java.util.Scanner;

public class BankDemo {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고조회 | 4. 종료 ");
			System.out.println("------------------------------------");
			System.out.print("선택 > ");
			String menu = input.nextLine();

			if (menu.equals("4")) {
				break;
			}
			switch (menu) {
			case "1" -> deposit(bank, input);
			case "2" -> withdraw(bank, input);
			case "3" -> getBalance(bank);
			}

		}
		System.out.println("프로그램 종료");
	}

	public static void deposit(Bank bank, Scanner input) {
		System.out.printf("예금액 > ");
		int amt = Integer.parseInt(input.nextLine());
		if (amt < 0) {
			System.out.println("0이상의 값을 입력하여 주시기 바랍니다. ");
			return;
		}
		bank.balance = bank.balance + amt;
	}

	public static void withdraw(Bank bank, Scanner input) {
		System.out.printf("출금액 > ");
		int amt = Integer.parseInt(input.nextLine());
		if (amt < 0) {
			System.out.println("0이상의 값을 입력하여 주시기 바랍니다. ");
			return;
		} else if (bank.balance < amt) {
			System.out.println("출금액이 잔액을 초과합니다. ");
			return;
		}
		bank.balance = bank.balance - amt;
	}

	public static void getBalance(Bank bank) {
		System.out.printf("잔고 > %d\n", bank.balance);
	}
}

class Bank {
	int balance = 0;
}
