package com.zhouzhou;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Example01 {
	private static void createAndShowGUI() {
		//����������JFrame��������
		JFrame frame=new JFrame("JFrameTest");
		//���ùرմ���ʱ��Ĭ�ϲ���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ô��ڳߴ�
		frame.setSize(450,350);
		//չʾJFrame��������
		frame.setVisible(true);
	}
	public static void main (String[] args) {
		//ʹ��SwingUtilities���������createAndShowGUI()������ʾGUI����		
		SwingUtilities.invokeLater(Example01::createAndShowGUI);
	}

}
