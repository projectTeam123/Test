package com.zhouzhou;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Example01 {
	private static void createAndShowGUI() {
		//创建并设置JFrame容器窗口
		JFrame frame=new JFrame("JFrameTest");
		//设置关闭窗口时的默认操作
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置窗口尺寸
		frame.setSize(450,350);
		//展示JFrame容器窗口
		frame.setVisible(true);
	}
	public static void main (String[] args) {
		//使用SwingUtilities工具类调用createAndShowGUI()方法显示GUI程序		
		SwingUtilities.invokeLater(Example01::createAndShowGUI);
	}

}
