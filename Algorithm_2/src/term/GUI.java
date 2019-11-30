package term;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;



public class GUI extends JFrame {
	
    // 멤버 필드에 ImageIcon 클래스 생성자   
    ImageIcon icon, chair, user, r_cir, b_cir, rect, rect_2, rect_3;
    
    public GUI(String title) {
    	super(title);

	    JFrame frame = new JFrame();
	    frame.setSize(1200,800);
	    frame.setLayout(null);
	    
	    
    	JTextField price = new JTextField(5);
    	//메뉴 가격이 어떻게 되는지
    	JTextField AET = new JTextField(5);
    	//Average Eating Time 평균 식사 시간 입력 field
    	
    	
    	JTextArea result = new JTextArea(7, 20);
    	frame.add(result);
    	result.setBounds(730, 200, 200, 360);
    	
    	
    	ButtonGroup weather = new ButtonGroup();
    	JRadioButton sunny = new JRadioButton("Sunny");
    	JRadioButton rain = new JRadioButton("Rain");
    	weather.add(sunny);
    	weather.add(rain);
    	//라디오버튼 2개를 그룹에 넣기 (그룹 날씨안에 맑음/비)
    	
    	
    	JLabel m_price = new JLabel("Menu price : ");
    	frame.add(m_price);
    	m_price.setBounds(10, 30, 100, 70);
    	frame.add(price);
    	price.setBounds(90, 40, 80, 50);
    	//메뉴 가격
    	
    	
    	JLabel aet = new JLabel("Average Eating Time : ");
    	frame.add(aet);
    	aet.setBounds(200, 30, 280, 70);
    	frame.add(AET);
    	AET.setBounds(330, 40, 80, 50);
    	//평균 식사 시간

    	
    	frame.add(sunny);
    	sunny.setBounds(430, 30, 60, 70);
    	frame.add(rain);
    	rain.setBounds(500, 40, 60, 50);
    	//날씨 이벤트
    	
    	JButton commit = new JButton(new ImageIcon(new ImageIcon(
    			"C:\\Users\\damin\\eclipse-workspace\\Algorithm_2\\src\\term\\transmission.png")
    			.getImage().getScaledInstance(190, 60, Image.SCALE_DEFAULT)));
    	//전송 버튼 이미지로 구성하기
    	
    	commit.setBorderPainted(false);
    	commit.setContentAreaFilled(false);
    	commit.setFocusPainted(false);
    	frame.add(commit);
    	commit.setBounds(570, 35, 190, 60);
    	//전송(Transmission) 버튼
    	
    	//Transmission 버튼을 누르면 시작될 이벤트
    	ActionListener C_listener = new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			if (sunny.isSelected()) {
    				result.append("Sunny Clicked!\n");
    			}//라디오 버튼 sunny 가 눌렸을 경우 발생하는 이벤트
    			else if (rain.isSelected()) {
    				result.append("Rain Clicked!\n");
    			} //라디오 버튼 rainy가 눌렸을 때 발생하는 이벤트
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
    	
    	
	    // 백그라운드 이미지 삽입할 메소드에 이름없는 클래스로 구현
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
    	//시작 버튼 이미지로 구성하기
	    
	    Start.setBorderPainted(false);
	    Start.setContentAreaFilled(false);
	    Start.setFocusPainted(false);
	    Start.setBounds(730, 100, 140, 70);
	    frame.add(Start);
	    
	    //Start 버튼을 누르면 시작될 이벤트
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
    	//순서는 반대로 구성하였음(오른쪽이 1번 의자)
    	
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