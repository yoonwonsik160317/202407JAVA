package java0716;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	JButton jb = new JButton("테스트");
	
	public MyFrame() {
		
		Container con = this.getContentPane();
		con.setLayout(null);
		con.add(jb);
		jb.setLocation(200, 300);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 300);
		this.setVisible(true);
		this.setLocation(700, 300);
		this.setTitle("안녕 스윙");
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

}
