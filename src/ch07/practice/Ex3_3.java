package ch07.practice;

import java.util.Arrays;

/**
 * 가격 순서대로 정렬할 수 있는 Book 클래스와 다음 실행 결과가 나타나도록 테스트 프로그램을 작성하시오. 
 * Book 클래스에는 int 타입의 price 필드가 있으며, 생성자와 필요한 메서드를 포함한다. 
 * 또 테스트 프로그램은 3개의 Book 객체로 구성된 Book 배열을 사용해 가격 순서대로(오름차순) 정렬한 후 출력한다.
 * 힌트 : 배열 books를 정렬하려면 ? Arrays.sort(books)를 호출
 */

class Book implements Comparable {
	int price;

	public Book(int price) { 
		this.price = price;
	}

	@Override
	public int compareTo(Object o) { 
		if(o instanceof Book b) {
			return this.price - b.price; 
		}
		return -999999;
	} 
    @Override
    public String toString() {
        return "Book [price =%d]".formatted(price);
    }
}
public class Ex3_3 {
	public static void main(String[] args) {
		Book[] books = {new Book(15000), new Book(50000), new Book(20000)};
		
		System.out.println("정렬 전 > " + Arrays.toString(books));
		Arrays.sort(books);
		System.out.println("정렬 후 > " + Arrays.toString(books));
//		for (Book book : books) {
//			System.out.println(book);
//		}
	}
}

