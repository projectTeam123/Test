package com.zhouzhou;
import java.awt.GridLayout ;
import javax.swing.JFrame ;
import javax.swing.JButton ;

public class GridLayoutDemo01{
	public static void main(String args[]){
		JFrame frame = new JFrame("Welcome To MLDN") ; 
		frame.setLayout(new GridLayout(4,5,4,4)) ;
		JButton but = null ;
		for(int i=0;i<13;i++){
			but = new JButton("��ť-"+ i) ;
			frame.add(but) ;
		}
		frame.pack() ;
		frame.setVisible(true) ;
	}
};