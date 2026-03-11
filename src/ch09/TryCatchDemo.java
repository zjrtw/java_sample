package ch09;

import java.io.FileInputStream;
import java.io.IOException;

public class TryCatchDemo {
	public static void main_bk(String[] args) {
		FileInputStream fs = null;
		try {
			fs = new FileInputStream("file.txt");
			int data;
			while ((data = fs.read()) != -1) {
				System.out.println((char) data);
			} 
		}catch(IOException e) {
			System.err.println(e.getMessage());
		}finally {
			try {
				if (fs != null)	fs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) { 
		try (FileInputStream fs = new FileInputStream("file.txt")){ 
			int data;
			while ((data = fs.read()) != -1) { // fs.read() : 파일에서 1바이트를 읽어서 int로 반환(0 ~ 255), 반환값 범위, -1 : 파일 끝 (더 이상 읽을 데이터 없음)
				System.out.println((char) data);
			} 
		}catch(IOException e) {
			System.err.println(e.getMessage());
		} 
	} 
}
