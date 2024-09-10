package driver;

import mvc.command.CommandHandler;

class Aaa {
	void disp() {
		System.out.println("프린트 Aa");
	}
}

public class Ex1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		  Class<?> handlerClass = Class.forName("driver.Aaak");
          Object handlerInstance =  handlerClass.newInstance ();		// TODO Auto-generated method stub
          Aaa aa = (Aaa) handlerInstance;
          aa.disp();

	}

}
