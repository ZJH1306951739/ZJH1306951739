import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Button extends JFrame implements ActionListener{
    public void actionPerformed(ActionEvent e){
    	
        int r,g,b;
        r=(int)(255*(Math.random()));
        g=(int)(255*(Math.random()));
    	b=(int)(255*(Math.random()));
    	
    	
    	
    	this.getContentPane().setBackground(new Color(b,r,g));
    	JButton button=(JButton)e.getSource();
    	button.setBackground(new Color(r,g,b));
    }        	
    private JButton button;//ʵ����JButton
    
    //��ʼ��Button
    public Button(){
    	button =new JButton("����");
    	this.setLayout(new FlowLayout());//���ⰴť���ǣ��������ص�
    	this.add(button);
    	button.addActionListener(this);
    	this.setSize(300,300);
    	this.setLocation(300,300);
    	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    	this.setVisible(true);
    	
    	
    	
    	
    }
    

    
	
	
	
	
	
	
}
