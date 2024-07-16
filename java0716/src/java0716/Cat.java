package java0716;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Cat {
	String breed;
	String color;
	int age = 10;
	
	Cat() {
		System.out.println("Cat()");
	}
	
	
}
