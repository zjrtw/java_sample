package ch05;

class Parent {
    Parent() {
        System.out.println("Parent 생성자");
    }
}

class Child extends Parent {
    Child() {
//        super(); // 부모 생성자 호출
        System.out.println("Child 생성자");
    }
}

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
    }
}