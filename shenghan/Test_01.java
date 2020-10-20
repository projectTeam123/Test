package shenghan;
import  javax.swing.*;


/**
 * @author zsh
 * @create 2020-10-21-0:17
 */
public class Test_01 {
    public static void main(String[] args) {
//        创建一个顶级容器
        JFrame jf = new JFrame("测试窗口");   //创建窗口
        jf.setSize(250,250);   //设置窗口大小
        jf.setLocationRelativeTo(null);   //把窗口位置设置到屏幕中心
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   //当点击窗口的关闭按钮时，程序会退出

        //创建中间容器(面板容器)
        JPanel panel = new JPanel();   //创建面板容器，使用默认的布局管理器

        //创建一个基本组件（按钮），并且将它添加到面板容器中。
        JButton btn = new JButton("测试按钮");
        panel.add(btn);

        // 4. 把 面板容器 作为窗口的内容面板 设置到窗口
        jf.setContentPane(panel);

        // 5. 显示窗口，前面创建的信息都在内存中，通过 jf.setVisible(true) 把内存中的窗口显示在屏幕上。
        jf.setVisible(true);

    }
}
