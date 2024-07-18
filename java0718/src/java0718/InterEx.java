package java0718;

public class InterEx {

	public static void main(String[] args) {
		ImplC implc = new ImplC();
		
		InterA ia = implc;
		ia.methodA();
		
		InterB ib = implc;
		ib.methodB();
		
		InterC ic = implc;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
