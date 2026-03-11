package ch07;

public class OuterClassDemo {
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InstanceMemberClass instanceClass = outerClass.new InstanceMemberClass();

		//OuterClass.StaticMemberClass staticClass = outerClass.new StaticMemberClass(); //=> 에러발생
		OuterClass.StaticMemberClass staticClass = new OuterClass.StaticMemberClass();

		//OuterClass.PrivateMemberClass privateMemberClass = outerClass.new PrivateMemberClass(); // private 으로 OuterClass 내에서만 사용 가능 
//		outerClass.OuterClass();
	}
}

class OuterClass {
	public OuterClass() {
		PrivateMemberClass privateMemberClass = new PrivateMemberClass();
	}


	static class StaticMemberClass{
		
	}

	class InstanceMemberClass{
		
	} 
	private class PrivateMemberClass{
		
	}
	interface InnerInterface{
		
	}
	void mothod1() {
		class LocalClass{
			
		}
	}

	void mothod2() {
		class LocalClass{
			
		}
	}
}
