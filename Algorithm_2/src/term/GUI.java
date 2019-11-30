package term;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;



public class GUI extends JFrame {
	
    // ��� �ʵ忡 ImageIcon Ŭ���� ������   
    ImageIcon icon, chair, user, r_cir, b_cir, rect, rect_2, rect_3;
    
    public GUI(String title) {
    	super(title);

	    JFrame frame = new JFrame();
	    frame.setSize(1200,800);
	    frame.setLayout(null);
	    
	    
    	JTextField price = new JTextField(5);
    	//�޴� ������ ��� �Ǵ���
    	JTextField AET = new JTextField(5);
    	//Average Eating Time ��� �Ļ� �ð� �Է� field
    	
    	
    	JTextArea result = new JTextArea(7, 20);
    	frame.add(result);
    	result.setBounds(730, 200, 200, 360);
    	
    	
    	ButtonGroup weather = new ButtonGroup();
    	JRadioButton sunny = new JRadioButton("Sunny");
    	JRadioButton rain = new JRadioButton("Rain");
    	weather.add(sunny);
    	weather.add(rain);
    	//������ư 2���� �׷쿡 �ֱ� (�׷� �����ȿ� ����/��)
    	
    	
    	JLabel m_price = new JLabel("Menu price : ");
    	frame.add(m_price);
    	m_price.setBounds(10, 30, 100, 70);
    	frame.add(price);
    	price.setBounds(90, 40, 80, 50);
    	//�޴� ����
    	
    	
    	JLabel aet = new JLabel("Average Eating Time : ");
    	frame.add(aet);
    	aet.setBounds(200, 30, 280, 70);
    	frame.add(AET);
    	AET.setBounds(330, 40, 80, 50);
    	//��� �Ļ� �ð�

    	
    	frame.add(sunny);
    	sunny.setBounds(430, 30, 60, 70);
    	frame.add(rain);
    	rain.setBounds(500, 40, 60, 50);
    	//���� �̺�Ʈ
    	
    	JButton commit = new JButton(new ImageIcon(new ImageIcon(
    			"C:\\Users\\damin\\eclipse-workspace\\Algorithm_2\\src\\term\\transmission.png")
    			.getImage().getScaledInstance(190, 60, Image.SCALE_DEFAULT)));
    	//���� ��ư �̹����� �����ϱ�
    	
    	commit.setBorderPainted(false);
    	commit.setContentAreaFilled(false);
    	commit.setFocusPainted(false);
    	frame.add(commit);
    	commit.setBounds(570, 35, 190, 60);
    	//����(Transmission) ��ư
    	
    	//Transmission ��ư�� ������ ���۵� �̺�Ʈ
    	ActionListener C_listener = new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			if (sunny.isSelected()) {
    				result.append("Sunny Clicked!\n");
    			}//���� ��ư sunny �� ������ ��� �߻��ϴ� �̺�Ʈ
    			else if (rain.isSelected()) {
    				result.append("Rain Clicked!\n");
    			} //���� ��ư rainy�� ������ �� �߻��ϴ� �̺�Ʈ
    			else {
    				
    			}
    			String p_rice = price.getText();
    			String a_time = AET.getText();
    			result.append("price:" + p_rice + "\nTime : " + a_time+"\n");
    			
    			
    			
    		}
    		
    	};
    	commit.addActionListener(C_listener);
    
    	
    	
    	
	    
	    icon = new ImageIcon("C:\\Users\\damin\\eclipse-workspace\\Algorithm_2\\src\\term\\floor.png");
	    r_cir = new ImageIcon(new ImageIcon("C:\\Users\\damin\\eclipse-workspace\\Algorithm_2\\src\\term\\r_cir.png")
    			.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
    	
    	b_cir = new ImageIcon(new ImageIcon("C:\\Users\\damin\\eclipse-workspace\\Algorithm_2\\src\\term\\b_cir.png")
    			.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
    	
    	rect = new ImageIcon(new ImageIcon("C:\\Users\\damin\\eclipse-workspace\\Algorithm_2\\src\\term\\rect.png")
    			.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
    	
    	rect_2 = new ImageIcon(new ImageIcon("C:\\Users\\damin\\eclipse-workspace\\Algorithm_2\\src\\term\\rect_2.png")
    			.getImage().getScaledInstance(380, 50, Image.SCALE_DEFAULT));
    	
    	rect_3 = new ImageIcon(new ImageIcon("C:\\Users\\damin\\eclipse-workspace\\Algorithm_2\\src\\term\\rect_3.png")
    			.getImage().getScaledInstance(50, 380, Image.SCALE_DEFAULT));
    	
    	
	    // ��׶��� �̹��� ������ �޼ҵ忡 �̸����� Ŭ������ ����
	    JLabel imageLabel = new JLabel(icon);
		imageLabel.setBounds(0, 100, 700, 500);

	    
	    JPanel table_1 = new JPanel() {
	        public void paintComponent(Graphics g) {
	            g.drawImage(b_cir.getImage(), 0, 20, null);
	            g.drawImage(b_cir.getImage(), 0, 80, null);
	            
	            g.drawImage(rect.getImage(), 25, 25, null);
	            
	            g.drawImage(b_cir.getImage(), 100, 20, null);
	            g.drawImage(b_cir.getImage(), 100, 80, null);
	        }
	    };
	    table_1.setBounds(50, 150, 200, 300);
	    
	    
	    JPanel table_2 = new JPanel() {
	        public void paintComponent(Graphics g) {
	            g.drawImage(b_cir.getImage(), 0, 20, null);
	            g.drawImage(b_cir.getImage(), 0, 80, null);
	            
	            g.drawImage(rect.getImage(), 25, 25, null);
	            
	            g.drawImage(b_cir.getImage(), 100, 20, null);
	            g.drawImage(b_cir.getImage(), 100, 80, null);
	        }
	    };
	    table_2.setBounds(50, 300, 200, 400);
	    
	    
	    JPanel table_3 = new JPanel() {
	        public void paintComponent(Graphics g) {
	            g.drawImage(b_cir.getImage(), 0, 20, null);
	            g.drawImage(b_cir.getImage(), 0, 80, null);
	            
	            g.drawImage(rect.getImage(), 25, 25, null);
	            
	            g.drawImage(b_cir.getImage(), 100, 20, null);
	            g.drawImage(b_cir.getImage(), 100, 80, null);
	        }
	    };
	    table_3.setBounds(350, 150, 200, 300);
	    
	    JPanel table_4 = new JPanel() {
	        public void paintComponent(Graphics g) {
	            g.drawImage(b_cir.getImage(), 0, 20, null);
	            g.drawImage(b_cir.getImage(), 0, 80, null);
	            
	            g.drawImage(rect.getImage(), 25, 25, null);
	            
	            g.drawImage(b_cir.getImage(), 100, 20, null);
	            g.drawImage(b_cir.getImage(), 100, 80, null);
	        }
	    };
	    table_4.setBounds(350, 300, 200, 400);
	    

	    JPanel table_5 = new JPanel() {
	        public void paintComponent(Graphics g) {
	        	g.drawImage(rect_2.getImage(), 0, 50, null);
	            g.drawImage(b_cir.getImage(), 15, 20, null);
	            g.drawImage(b_cir.getImage(), 95, 20, null);
	            g.drawImage(b_cir.getImage(), 175, 20, null);
	            g.drawImage(b_cir.getImage(), 255, 20, null);
	            g.drawImage(b_cir.getImage(), 335, 20, null);
	        }
	    };
	    table_5.setBounds(30, 500, 600, 700);
	    
	    JPanel table_6 = new JPanel() {
	        public void paintComponent(Graphics g) {
	        	g.drawImage(rect_3.getImage(), 30, 0, null);
	            g.drawImage(b_cir.getImage(), 0, 15, null);
	            g.drawImage(b_cir.getImage(), 0, 95, null);
	            g.drawImage(b_cir.getImage(), 0, 175, null);
	            g.drawImage(b_cir.getImage(), 0, 255, null);
	            g.drawImage(b_cir.getImage(), 0, 335, null);
	        }
	    };
	    table_6.setBounds(620, 100, 700, 380);
	    
	    
	    
	    frame.add(table_1);
	    frame.add(table_2);
	    frame.add(table_3);
	    frame.add(table_4);
	    frame.add(table_5);
	    frame.add(table_6);
	    
	    
	    frame.add(imageLabel);

	    
    	JButton Start = new JButton(new ImageIcon(new ImageIcon(
    			"C:\\Users\\damin\\eclipse-workspace\\Algorithm_2\\src\\term\\start.png")
    			.getImage().getScaledInstance(140, 70, Image.SCALE_DEFAULT)));
    	//���� ��ư �̹����� �����ϱ�
	    
	    Start.setBorderPainted(false);
	    Start.setContentAreaFilled(false);
	    Start.setFocusPainted(false);
	    Start.setBounds(730, 100, 140, 70);
	    frame.add(Start);
	    
	    //Start ��ư�� ������ ���۵� �̺�Ʈ
    	ActionListener listener = new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			result.append("Clicked!\n");
    		}
    		
    	};
    	Start.addActionListener(listener);
    	
	    
	    
    	
    	
    	chair = new ImageIcon(new ImageIcon("C:\\Users\\damin\\eclipse-workspace\\Algorithm_2\\src\\term\\chair.png")
    			.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
    	user = new ImageIcon(new ImageIcon("C:\\Users\\damin\\eclipse-workspace\\Algorithm_2\\src\\term\\user.png")
    			.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
    	
    	
    	JLabel c1 = new JLabel(chair);
    	JLabel c2 = new JLabel(chair);
    	JLabel c3 = new JLabel(chair);
    	JLabel c4 = new JLabel(chair);
    	JLabel c5 = new JLabel(chair);
    	JLabel c6 = new JLabel(chair);
    	JLabel c7 = new JLabel(chair);
    	JLabel c8 = new JLabel(chair);
    	JLabel c9 = new JLabel(chair);
    	JLabel c10 = new JLabel(chair);
    	//������ �ݴ�� �����Ͽ���(�������� 1�� ����)
    	
    	frame.add(c1);
    	c1.setBounds(20, 620, 70, 70);
    	frame.add(c2);
    	c2.setBounds(100, 620, 70, 70);
    	frame.add(c3);
    	c3.setBounds(180, 620, 70, 70);
    	frame.add(c4);
    	c4.setBounds(260, 620, 70, 70);
    	frame.add(c5);
    	c5.setBounds(340, 620, 70, 70);
    	frame.add(c6);
    	c6.setBounds(420, 620, 70, 70);
    	frame.add(c7);
    	c7.setBounds(500, 620, 70, 70);
    	frame.add(c8);
    	c8.setBounds(580, 620, 70, 70);
    	frame.add(c9);
    	c9.setBounds(660, 620, 70, 70);
    	frame.add(c10);
    	c10.setBounds(740, 620, 70, 70);
    	
    	
	    
	    frame.setVisible(true);
	      

	}

	public static void main(String[] args) {
		new GUI("Algorithm");
	}
}