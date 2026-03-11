package ch05;

class Singleton {

    // 1. 자기 자신을 static으로 생성
    private static Singleton instance = new Singleton();

    // 2. 외부에서 new 못하게 막음
    private Singleton() {}

    // 3. 객체를 반환하는 메서드
    public static Singleton getInstance() {
        return instance;
    }
}