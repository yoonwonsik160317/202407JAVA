package anony;

public class Anony {
	void method() {
		
		Person3 person3 = new Person3() {
			@Override
			public void wake() {
			}
			
		};
		
		Person2 person2 = new Person2() {

			@Override
			void wake() {
				super.wake();
			}
			
		};
		
		Person child = new Child();
		
		Person person = new Person() {
			
			@Override
			void wake() {
				super.wake();
			}
		};
		
	}

}
