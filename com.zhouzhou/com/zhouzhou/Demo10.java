package com.zhouzhou;

import java.awt.*;
import javax.swing.*;

public class Demo10 extends JFrame {
	private static final long serialVersionUID=10L;
    // �������
    JPanel jp1, jp2;
    JButton jb1, jb2, jb3, jb4, jb5, jb6;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Demo10();
    }

    // ���캯��
    public Demo10() {
        // �������

        jp1 = new JPanel();
        jp2 = new JPanel();

        jb1 = new JButton("����");
        jb2 = new JButton("ƻ��");
        jb3 = new JButton("��֦");
        jb4 = new JButton("����");
        jb5 = new JButton("����");
        jb6 = new JButton("�㽶");

        // ���ò��ֹ�������
        //JPanel����Ĭ����BorderLoyout// ���JPanel
        //JPanel������������������Լ��������
        jp1.add(jb1);
        jp1.add(jb2);
        
        jp2.add(jb3);
        jp2.add(jb4);
        jp2.add(jb5);

        // ��jpanel ����JFrame
        this.add(jp1, BorderLayout.NORTH);
        this.add(jb6, BorderLayout.CENTER);
        this.add(jp2, BorderLayout.SOUTH);

        this.setSize(300, 400);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}