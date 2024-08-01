package sec01.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriterExample {
	
	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("c:/Temp/test1.db");
		
		byte[] array = {10, 20, 30};
		
		/*
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		*/
		os.write(array);
		
		os.flush();
		os.close();

	}

}
