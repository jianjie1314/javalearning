package gihbu;



import java.awt.*;
import java.applet.*;
//import javax.swing.*;

//import java.awt.event.*;

public  class ggyu extends Applet {
	int flag = 0;
	int xPoints[] = { 50, 60, 90, 120, 150 };
	int yPoints[] = { 130, 40, 95, 120, 50 };
	
	Panel jf = new Panel();
	//JMenuBar jmb = new JMenuBar();
	//jf.setSize(800, 800);
	//jf.setVisible(true);
	//Button btn[]=new Button[9];
	Button btn1 = new Button("画线");
	Button btn2 = new Button("画圆");
	Button btn3 = new Button("画矩形");
	Button btn4 = new Button("画多边形");
	Button btn5 = new Button("橡皮擦");
	public void init(){
	//for (int i = 0; i < 5; i++)
	jf.add(btn1);
	jf.add(btn2);
	jf.add(btn3);
	jf.add(btn4);
	jf.add(btn5);
	add(jf);
	jf.setSize(1222, 1222);
	jf.setVisible(true);
	//btn[5].addActionListener(new InnerAct());}
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	new DrawingBoard();
}

	/*int oldx, oldy, newx, newy;
	Graphics g;
	/*public DrawingBoard() {
	   super("DrawingBoard");
	    Container c = getContentPane();
	    c.setLayout(null);
		c.setBackground(Color.white);
		addMouseMotionListener(this);
		setSize(500, 500);
		setVisible(true);
	}

	public void mouseMoved(MouseEvent e) {
		oldx = e.getX();
		oldy = e.getY();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		newx = e.getX();
		newy = e.getY();
		g = getGraphics();
		oldx = newx;
		oldy = newy;
	}*/
	public boolean action(Event e, Object o) {
		if (e.target==btn1)
			flag = 1;
		if (e.target == btn2)
			flag = 2;
		if (e.target == btn3)
			flag = 3;
		if (e.target == btn4)
			flag = 4;
		if (e.target == btn5)
			flag = 5;
		//if (e.target == btn[5])
		//	flag = 6;
		repaint(); // 删除原来的类容
		return true;
	}

	public void paint(Graphics g) {
		Color c = g.getColor();
		switch (flag) {
		case 1:
			g.drawLine(23, 43, 100, 100);
			break;
		case 2:
			g.drawOval(21, 43, 100, 100);
			g.setColor(Color.red);
			g.fillOval(323, 32, 10, 10);
			g.drawOval(50, 50, 100, 100);
			g.setColor(c);
			break;
		case 3:
			g.drawRect(23, 34, 40, 30); // 画矩形
			g.fillRect(23, 44, 40, 60);
			g.fillRoundRect(150, 80, 80, 60, 20, 10);
			g.setColor(new Color(225, 125, 100));
			g.fillRoundRect(150, 80, 80, 60, 20, 10);
			g.setColor(c);
			break;
		case 4:
			g.drawPolygon(xPoints, yPoints, 5); // 根据数组指定的点画多边形
			break;
		case 5:
			g.drawOval(12, 23, 100, 100);
			g.setColor(Color.white);
			g.fillOval(10, 12, 10, 10);
			g.drawOval(50, 50, 100, 100);
			g.setColor(c);
			break;

		}
	}

/*	class InnerAct implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method
	 * stub //MenuTest mt=new MenuTest(); test a=new test(); a.MenuTest(); }
	 */

}
