package 허재호2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lottery extends JFrame implements ActionListener {
	Container cp;
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JButton[] buttonArr = new JButton[6];
	JLabel[] JLarr = new JLabel[2];
	public Lottery() {
		setTitle("Lottery");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp=getContentPane();
		setSize(500, 500);
		//setResizable(false);
		setVisible(true);  
		JLabel intro=new JLabel("       로또 추첨기 ");
		JLabel intro2=new JLabel("                아래 추첨기를 눌러 시작하세요");
		JLabel start=new JLabel("");  
		panel2.add(intro);
		panel2.add(intro2);
        intro.setFont(new Font("ㅇㄹㄴㅁ",Font.ITALIC,50));
        intro2.setFont(new Font("ㅇㄹㄴㅁ",Font.ITALIC,20));
		
        cp.setLayout(new BorderLayout());
		panel2.setLayout(new GridLayout(2,1));
		
		for (int i = 0; i < buttonArr.length; i++) {
			buttonArr[i] = new JButton("");
			panel.add(buttonArr[i]);

		}
		
//		
//		JButton jb= new JButton("dsaf");
//		JButton jb2 = new JButton("adsf");
//		JButton jb3 = new JButton("dsaf");
//		JButton jb4 = new JButton("f");
//	    JButton jb5 = new JButton("d");
//        JButton jb6 = new JButton("s");
   
		JButton lo = new JButton(new ImageIcon("C:\\Users\\학생용\\Desktop\\download.jpg"));
        lo.setToolTipText("누르면 시작합니다");
		lo.setBackground(Color.LIGHT_GRAY);
		lo.addActionListener(this);
	
		this.add(panel, "South");
		
		cp.add(lo,"Center");
		cp.add(panel2,"North");
	   cp.repaint();
	
	}




public static void main(String[]args)
{
new Lottery();

}
@Override
public void actionPerformed(ActionEvent e) {
	long seed = System.currentTimeMillis();
	Random rand = new Random(seed);
	int[] su = new int[6] ;
	for(int i=0;i<=5;i++)
	{
	su[i]=rand. nextInt(45);
	buttonArr[i].setText(su[i] + "");
	}
	
	
}
}
