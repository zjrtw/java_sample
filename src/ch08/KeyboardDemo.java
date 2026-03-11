package ch08;

import java.util.Objects;

public class KeyboardDemo {
	public static void main(String[] args) {
		Mouse m1 = new Mouse("Logitech");
		Mouse m2 = new Mouse("Logitech");
		Mouse m3 = m1;
		Keyboard k1 = new Keyboard("Microsoft", "A", 15000);
		Keyboard k2 = new Keyboard("Microsoft", "A", 15000);
//		Keyboard k2 = new Keyboard("Microsoft", "B", 4000);
//		k1 = k2;
		System.out.println(m1.toString());
		System.out.println(m1);
		System.out.println(k1.toString());
		System.out.println(k1);
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(k1.equals(k2));
	}
}
/**
 * 
 */
class Keyboard{
	String name;
	String model;
	int price;
	public Keyboard(String name,String model, int price) {
		this.name = name;
		this.model = model;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			System.out.println("완벽히 동일한 객체입니다.");
			return true;
		}else if (obj instanceof Keyboard k) { 
			System.out.println("제조사가 동일한 모델입니다." + this.hashCode() + " : " + k.hashCode());
			return this.name.equals(k.name);
		}
		System.out.println("다른 객체 이거나 모델이 다릅니다..");
		return false;
	}
	private Keyboard(Builder builder) {
        this.name = builder.name;
        this.model = builder.model;
        this.price = builder.price;
    }

    public static class Builder {
        private String name;
        private String model;
        private int price;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public Keyboard build() {
            return new Keyboard(this);
        }
    }
	@Override
	public int hashCode() {
		// TODO Auto-Ogenerated method stub
		return Objects.hash(name, model, price);
	}
	@Override
	public String toString() {
		return "키보드입니다.";
	}
}

class Mouse{
	String name;
	public Mouse(String name) {
		this.name = name;
	}
}