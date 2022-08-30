import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Nira implements ActionListener {
	JFrame Frame,Frame2,Frame3;
	JButton red1,red2,red3,blank1,blank2,blank3,blue1,blue2,blue3;
	JButton onevsone,vsbot;
	JTextField Playername1,Playername2;
	String player1,player2;
	String colorlock="Green";
	int red1_x,red1_y,red2_x,red2_y,red3_x,red3_y,blank1_x,blank1_y,blank2_x,blank2_y,blank3_x,blank3_y,blue1_x,blue1_y,blue2_x,blue2_y,blue3_x,blue3_y;
	int nirapositions[][];
	boolean b1 = false,b2 = false,b3 = false;
	boolean redNIRA = false, blueNIRA = false;
	boolean playername = false,botness = false,botmode = false;
	String currentselectedbutton = "null",player="red";
	int templocvalue_x,templocvalue_y,temporarybuttonvalue_x,temporarybuttonvalue_y,temporaryblankvalue_x,temporaryblankvalue_y;
	int reda=0,redb=0,redc=0,bluea=0,blueb=0,bluec=0;
	JButton Startingplayerbutton,Startingbotbutton;
	JLabel moves1,moves2,playerr1,playerr2,linela;
	JButton line1,line2,line3,line4,line5,line6,line7,line8,line9,line10,line11,line12;
	JButton bl1,bl2,bl3,bl4,bl5,bl6,bl7,bl8,bl9,bl10,bl11,bl12,bl13,bl14,bl15;
	JButton blo1,blo2,blo3,blo4,blo5,blo6,blo7,blo8,blo9,blo10,blo11,blo12,blo13,blo14,blo15;
	JButton bloc1,bloc2,bloc3,bloc4,bloc5,bloc6,bloc7,bloc8,bloc9,bloc10,bloc11,bloc12,bloc13,bloc14,bloc15;
	JButton block1,block2,block3,block4,block5,block6,block7,block8,block9,block10,block11,block12,block13,block14,block15;
	
	
	public Nira() {
		Frame = new JFrame();
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setTitle("Nira");
		Frame.setSize(550, 800);
		Frame.setVisible(true);
		Frame.setLayout(null);
		Frame.setLocation(400, 10);
		
		
		onevsone = new JButton("1 v/s 1");
		onevsone.setBounds(215, 300, 100, 50);
		onevsone.setEnabled(false);
		onevsone.setBackground(Color.RED);
		onevsone.addActionListener(this);
		
	
		line1 = new JButton();
		line1.setBounds(103, 120, 95, 10);
		line1.setBackground(Color.BLACK);
		line1.setEnabled(false);
		
		line2 = new JButton();
		line2.setBounds(253, 120, 95, 10);
		line2.setBackground(Color.BLACK);
		line2.setEnabled(false);
		
		line3 = new JButton();
		line3.setBounds(103, 320, 95, 10);
		line3.setBackground(Color.BLACK);
		line3.setEnabled(false);
		
		line4 = new JButton();
		line4.setBounds(253, 320, 95, 10);
		line4.setBackground(Color.BLACK);
		line4.setEnabled(false);
		
		line5 = new JButton();
		line5.setBounds(103, 520, 95, 10);
		line5.setBackground(Color.BLACK);
		line5.setEnabled(false);
		
		line6 = new JButton();
		line6.setBounds(253, 520, 95, 10);
		line6.setBackground(Color.BLACK);
		line6.setEnabled(false);
		
		line7 = new JButton();
		line7.setBounds(70, 153, 10, 145);
		line7.setBackground(Color.BLACK);
		line7.setEnabled(false);
		
		line8 = new JButton();
		line8.setBounds(70, 353, 10, 145);
		line8.setBackground(Color.BLACK);
		line8.setEnabled(false);
		
		line9 = new JButton();
		line9.setBounds(370, 153, 10, 145);
		line9.setBackground(Color.BLACK);
		line9.setEnabled(false);
		
		line10 = new JButton();
		line10.setBounds(370, 353, 10, 145);
		line10.setBackground(Color.BLACK);
		line10.setEnabled(false);
		
		line11 = new JButton();
		line11.setBounds(220, 353, 10, 145);
		line11.setBackground(Color.BLACK);
		line11.setEnabled(false);
		
		line12 = new JButton();
		line12.setBounds(220, 153, 10, 145);
		line12.setBackground(Color.BLACK);
		line12.setEnabled(false);
		
		
		bl1 = new JButton();
		bl1.setBounds(100, 150, 10, 10);
		bl1.setBackground(Color.BLACK);
		bl1.setEnabled(false);
		bl2 = new JButton();
		bl2.setBounds(100, 160, 10, 10);
		bl2.setBackground(Color.BLACK);
		bl2.setEnabled(false);
		bl3 = new JButton();
		bl3.setBounds(110, 170, 10, 10);
		bl3.setBackground(Color.BLACK);
		bl3.setEnabled(false);
		bl4 = new JButton();
		bl4.setBounds(120, 180, 10, 10);
		bl4.setBackground(Color.BLACK);
		bl4.setEnabled(false);
		bl5 = new JButton();
		bl5.setBounds(130, 190, 10, 10);
		bl5.setBackground(Color.BLACK);
		bl5.setEnabled(false);
		bl6 = new JButton();
		bl6.setBounds(130, 200, 10, 10);
		bl6.setBackground(Color.BLACK);
		bl6.setEnabled(false);
		bl7 = new JButton();
		bl7.setBounds(140, 210, 10, 10);
		bl7.setBackground(Color.BLACK);
		bl7.setEnabled(false);
		bl8 = new JButton();
		bl8.setBounds(140, 220, 10, 10);
		bl8.setBackground(Color.BLACK);
		bl8.setEnabled(false);
		bl9 = new JButton();
		bl9.setBounds(150, 230, 10, 10);
		bl9.setBackground(Color.BLACK);
		bl9.setEnabled(false);
		bl10 = new JButton();
		bl10.setBounds(150, 240, 10, 10);
		bl10.setBackground(Color.BLACK);
		bl10.setEnabled(false);
		bl11 = new JButton();
		bl11.setBounds(160, 250, 10, 10);
		bl11.setBackground(Color.BLACK);
		bl11.setEnabled(false);
		bl12 = new JButton();
		bl12.setBounds(170, 260, 10, 10);
		bl12.setBackground(Color.BLACK);
		bl12.setEnabled(false);
		bl13 = new JButton();
		bl13.setBounds(180, 270, 10, 10);
		bl13.setBackground(Color.BLACK);
		bl13.setEnabled(false);
		bl14 = new JButton();
		bl14.setBounds(180, 280, 10, 10);
		bl14.setBackground(Color.BLACK);
		bl14.setEnabled(false);
		bl15 = new JButton();
		bl15.setBounds(190, 290, 10, 10);
		bl15.setBackground(Color.BLACK);
		bl15.setEnabled(false);
		
		blo1 = new JButton();
		blo1.setBounds(250, 350, 10, 10);
		blo1.setBackground(Color.BLACK);
		blo1.setEnabled(false);
		blo2 = new JButton();
		blo2.setBounds(250, 360, 10, 10);
		blo2.setBackground(Color.BLACK);
		blo2.setEnabled(false);
		blo3 = new JButton();
		blo3.setBounds(260, 370, 10, 10);
		blo3.setBackground(Color.BLACK);
		blo3.setEnabled(false);
		blo4 = new JButton();
		blo4.setBounds(270, 380, 10, 10);
		blo4.setBackground(Color.BLACK);
		blo4.setEnabled(false);
		blo5 = new JButton();
		blo5.setBounds(280, 390, 10, 10);
		blo5.setBackground(Color.BLACK);
		blo5.setEnabled(false);
		blo6 = new JButton();
		blo6.setBounds(280, 400, 10, 10);
		blo6.setBackground(Color.BLACK);
		blo6.setEnabled(false);
		blo7 = new JButton();
		blo7.setBounds(290, 410, 10, 10);
		blo7.setBackground(Color.BLACK);
		blo7.setEnabled(false);
		blo8 = new JButton();
		blo8.setBounds(290, 420, 10, 10);
		blo8.setBackground(Color.BLACK);
		blo8.setEnabled(false);
		blo9 = new JButton();
		blo9.setBounds(300, 430, 10, 10);
		blo9.setBackground(Color.BLACK);
		blo9.setEnabled(false);
		blo10 = new JButton();
		blo10.setBounds(300, 440, 10, 10);
		blo10.setBackground(Color.BLACK);
		blo10.setEnabled(false);
		blo11 = new JButton();
		blo11.setBounds(310, 450, 10, 10);
		blo11.setBackground(Color.BLACK);
		blo11.setEnabled(false);
		blo12 = new JButton();
		blo12.setBounds(320, 460, 10, 10);
		blo12.setBackground(Color.BLACK);
		blo12.setEnabled(false);
		blo13 = new JButton();
		blo13.setBounds(330, 470, 10, 10);
		blo13.setBackground(Color.BLACK);
		blo13.setEnabled(false);
		blo14 = new JButton();
		blo14.setBounds(330, 480, 10, 10);
		blo14.setBackground(Color.BLACK);
		blo14.setEnabled(false);
		blo15 = new JButton();
		blo15.setBounds(340, 490, 10, 10);
		blo15.setBackground(Color.BLACK);
		blo15.setEnabled(false);
		
		
		bloc1 = new JButton();
		bloc1.setBounds(340, 150, 10, 10);
		bloc1.setBackground(Color.BLACK);
		bloc1.setEnabled(false);
		bloc2 = new JButton();
		bloc2.setBounds(340, 160, 10, 10);
		bloc2.setBackground(Color.BLACK);
		bloc2.setEnabled(false);
		bloc3 = new JButton();
		bloc3.setBounds(330, 170, 10, 10);
		bloc3.setBackground(Color.BLACK);
		bloc3.setEnabled(false);
		bloc4 = new JButton();
		bloc4.setBounds(320, 180, 10, 10);
		bloc4.setBackground(Color.BLACK);
		bloc4.setEnabled(false);
		bloc5 = new JButton();
		bloc5.setBounds(310, 190, 10, 10);
		bloc5.setBackground(Color.BLACK);
		bloc5.setEnabled(false);
		bloc6 = new JButton();
		bloc6.setBounds(310, 200, 10, 10);
		bloc6.setBackground(Color.BLACK);
		bloc6.setEnabled(false);
		bloc7 = new JButton();
		bloc7.setBounds(300, 210, 10, 10);
		bloc7.setBackground(Color.BLACK);
		bloc7.setEnabled(false);
		bloc8 = new JButton();
		bloc8.setBounds(300, 220, 10, 10);
		bloc8.setBackground(Color.BLACK);
		bloc8.setEnabled(false);
		bloc9 = new JButton();
		bloc9.setBounds(290, 230, 10, 10);
		bloc9.setBackground(Color.BLACK);
		bloc9.setEnabled(false);
		bloc10 = new JButton();
		bloc10.setBounds(290, 240, 10, 10);
		bloc10.setBackground(Color.BLACK);
		bloc10.setEnabled(false);
		bloc11 = new JButton();
		bloc11.setBounds(280, 250, 10, 10);
		bloc11.setBackground(Color.BLACK);
		bloc11.setEnabled(false);
		bloc12 = new JButton();
		bloc12.setBounds(270, 260, 10, 10);
		bloc12.setBackground(Color.BLACK);
		bloc12.setEnabled(false);
		bloc13 = new JButton();
		bloc13.setBounds(260, 270, 10, 10);
		bloc13.setBackground(Color.BLACK);
		bloc13.setEnabled(false);
		bloc14 = new JButton();
		bloc14.setBounds(260, 280, 10, 10);
		bloc14.setBackground(Color.BLACK);
		bloc14.setEnabled(false);
		bloc15 = new JButton();
		bloc15.setBounds(250, 290, 10, 10);
		bloc15.setBackground(Color.BLACK);
		bloc15.setEnabled(false);
		
		block1 = new JButton();
		block1.setBounds(190, 350, 10, 10);
		block1.setBackground(Color.BLACK);
		block1.setEnabled(false);
		block2 = new JButton();
		block2.setBounds(190, 360, 10, 10);
		block2.setBackground(Color.BLACK);
		block2.setEnabled(false);
		block3 = new JButton();
		block3.setBounds(180, 370, 10, 10);
		block3.setBackground(Color.BLACK);
		block3.setEnabled(false);
		block4 = new JButton();
		block4.setBounds(170, 380, 10, 10);
		block4.setBackground(Color.BLACK);
		block4.setEnabled(false);
		block5 = new JButton();
		block5.setBounds(160, 390, 10, 10);
		block5.setBackground(Color.BLACK);
		block5.setEnabled(false);
		block6 = new JButton();
		block6.setBounds(160, 400, 10, 10);
		block6.setBackground(Color.BLACK);
		block6.setEnabled(false);
		block7 = new JButton();
		block7.setBounds(150, 410, 10, 10);
		block7.setBackground(Color.BLACK);
		block7.setEnabled(false);
		block8 = new JButton();
		block8.setBounds(150, 420, 10, 10);
		block8.setBackground(Color.BLACK);
		block8.setEnabled(false);
		block9 = new JButton();
		block9.setBounds(140, 430, 10, 10);
		block9.setBackground(Color.BLACK);
		block9.setEnabled(false);
		block10 = new JButton();
		block10.setBounds(140, 440, 10, 10);
		block10.setBackground(Color.BLACK);
		block10.setEnabled(false);
		block11 = new JButton();
		block11.setBounds(130, 450, 10, 10);
		block11.setBackground(Color.BLACK);
		block11.setEnabled(false);
		block12 = new JButton();
		block12.setBounds(120, 460, 10, 10);
		block12.setBackground(Color.BLACK);
		block12.setEnabled(false);
		block13 = new JButton();
		block13.setBounds(110, 470, 10, 10);
		block13.setBackground(Color.BLACK);
		block13.setEnabled(false);
		block14 = new JButton();
		block14.setBounds(110, 480, 10, 10);
		block14.setBackground(Color.BLACK);
		block14.setEnabled(false);
		block15 = new JButton();
		block15.setBounds(100, 490, 10, 10);
		block15.setBackground(Color.BLACK);
		block15.setEnabled(false);
		
		
		
		
		
		
		red1 = new JButton();
		red1_x = 50;
		red1_y = 100;
		red1.setBounds(red1_x, red1_y, 50, 50);
		red1.setBackground(Color.RED);;
		red1.addActionListener(this);
		
		red2 = new JButton();
		red2_x = 200;
		red2_y = 100;
		red2.setBounds(red2_x, red2_y, 50, 50);
		red2.setBackground(Color.RED);
		red2.addActionListener(this);
		
		red3 = new JButton();
		red3_x = 350;
		red3_y = 100;
		red3.setBounds(red3_x, red3_y, 50, 50);
		red3.setBackground(Color.RED);
		red3.addActionListener(this);
		
		
		blank1 = new JButton();
		blank1.setEnabled(false);
		blank1.setOpaque(false);
		blank1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		blank1_x = 45;
		blank1_y = 295;
		blank1.setBounds(blank1_x, blank1_y, 60, 60);
		blank1.setBackground(Color.lightGray);
		blank1.addActionListener(this);
		
		blank2 = new JButton();
		blank2.setEnabled(false);
		blank2.setOpaque(false);
		blank2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		blank2_x = 195;
		blank2_y = 295;
		blank2.setBounds(blank2_x, blank2_y, 60, 60);
		blank2.setBackground(Color.lightGray);
		blank2.addActionListener(this);
		
		blank3 = new JButton();
		blank3.setEnabled(false);
		blank3.setOpaque(false);
		blank3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		blank3_x = 345;
		blank3_y = 295;
		blank3.setBounds(blank3_x, blank3_y, 60, 60);
		blank3.setBackground(Color.lightGray);
		blank3.addActionListener(this);
		
		
		blue1 = new JButton();
		blue1_x = 50;
		blue1_y = 500;
		blue1.setBounds(blue1_x, blue1_y, 50, 50);
		blue1.setBackground(Color.BLUE);
		blue1.addActionListener(this);
		
		blue2 = new JButton();
		blue2_x = 200;
		blue2_y = 500;
		blue2.setBounds(blue2_x, blue2_y, 50, 50);
		blue2.setBackground(Color.BLUE);
		blue2.addActionListener(this);
		
		blue3 = new JButton();
		blue3_x = 350;
		blue3_y = 500;
		blue3.setBounds(blue3_x, blue3_y, 50, 50);
		blue3.setBackground(Color.BLUE);
		blue3.addActionListener(this);
		
		linela  = new JLabel();
		linela.setBounds(450, 0, 10, 1200);
		linela.setBackground(Color.BLACK);
		linela.setOpaque(true);
		
		playerr1 = new JLabel();
		playerr1.setBounds(500, 100, 110, 30);
		playerr1.setBackground(Color.gray);
		playerr1.setOpaque(true);
		playerr1.setHorizontalAlignment(SwingConstants.CENTER);
		playerr1.setForeground(Color.WHITE);
		
		moves1 = new JLabel("MOVED : 0 , 0 , 0");
		moves1.setBounds(500, 140, 120, 30);
		moves1.setBackground(Color.gray);
		moves1.setOpaque(true);
		moves1.setHorizontalAlignment(SwingConstants.CENTER);
		moves1.setForeground(Color.WHITE);
		
		
		playerr2 = new JLabel();
		playerr2.setBounds(500, 300, 110, 30);
		playerr2.setBackground(Color.gray);
		playerr2.setOpaque(true);
		playerr2.setHorizontalAlignment(SwingConstants.CENTER);
		playerr2.setForeground(Color.WHITE);
		
		moves2 = new JLabel("MOVED : 0 , 0 , 0");
		moves2.setBounds(500, 340, 120, 30);
		moves2.setBackground(Color.gray);
		moves2.setOpaque(true);
		moves2.setHorizontalAlignment(SwingConstants.CENTER);
		moves2.setForeground(Color.WHITE);
		
		
		
		
		Playername1 = new JTextField("BOT");
		Playername1.setHorizontalAlignment(JTextField.CENTER);
		Playername1.setBounds(50, 37, 100, 30);
		Playername1.setBackground(Color.WHITE);
		Playername1.setForeground(Color.BLACK);
		
		JButton redrepr = new JButton();
		redrepr.setBounds(160, 37, 20, 30);
		redrepr.setBackground(Color.RED);
		redrepr.setEnabled(false);
		
	
		Playername2 = new JTextField("Blue player");
		Playername2.setHorizontalAlignment(JTextField.CENTER);
		Playername2.setBounds(50, 77, 100, 30);
		Playername2.setBackground(Color.WHITE);
		Playername2.setForeground(Color.BLACK);
		
		JButton bluerepr = new JButton();
		bluerepr.setBounds(160, 77, 20, 30);
		bluerepr.setBackground(Color.BLUE);
		bluerepr.setEnabled(false);
		
		JLabel Startingbot = new JLabel(" Select if bot starts ");
		Startingbot.setBounds(50, 03, 150, 30);
		Startingbot.setBackground(Color.gray);
		Startingbot.setOpaque(true);
		Startingbot.setHorizontalAlignment(SwingConstants.CENTER);
		Startingbot.setForeground(Color.WHITE);
		
		Startingbotbutton = new JButton();
		Startingbotbutton.setBounds(210, 03, 30, 30);
		Startingbotbutton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		Startingbotbutton.setBackground(Color.white);
		Startingbotbutton.setEnabled(true);
		Startingbotbutton.addActionListener(this);
		
		
		JLabel Startingplayer = new JLabel(" Select Starting Player");
		Startingplayer.setBounds(50, 110, 150, 30);
		Startingplayer.setBackground(Color.gray);
		Startingplayer.setOpaque(true);
		Startingplayer.setHorizontalAlignment(SwingConstants.CENTER);
		Startingplayer.setForeground(Color.WHITE);
		
		Startingplayerbutton = new JButton();
		Startingplayerbutton.setBounds(210, 110, 30, 30);
		Startingplayerbutton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		Startingplayerbutton.setBackground(Color.white);
		Startingplayerbutton.setEnabled(true);
		Startingplayerbutton.addActionListener(this);
		
		
		
		vsbot = new JButton("BOT");
		vsbot.setBounds(215, 400, 100, 50);
		vsbot.setEnabled(true);
		vsbot.setBackground(Color.RED);
		vsbot.addActionListener(this);
		
		
		Frame.add(bluerepr);
		Frame.add(redrepr);
		Frame.add(Startingplayer);
		Frame.add(Startingplayerbutton);
		Frame.add(onevsone);
	    Frame.add(vsbot);
	    Frame.add(Startingbot);
	    Frame.add(Startingbotbutton);
		Frame.add(Playername1);
		Frame.add(Playername2);
		
	}
	
	
	
	public static void main(String[] args)
	{
		new Nira();
	}



	
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == Startingbotbutton) {
			Startingplayerbutton.setBackground(Color.white);
			vsbot.setEnabled(true);
			onevsone.setEnabled(false);
			Playername1.setText("BOT");
			playername = false;
			
			if(botness == false) {
				botness = true;
				Startingbotbutton.setBackground(Color.green);
				player = "red";
			}
			else if(botness == true) {
				botness = false;
				Startingbotbutton.setBackground(Color.white);
				player = "blue";
			}
		}
		
		
		if(e.getSource() == vsbot) {
			Frame3 = new JFrame();
			Frame3.setTitle("Nira");
			Frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			Frame3.setSize(700, 800);
			Frame3.setVisible(true);
			Frame3.setLayout(null);
			Frame3.setLocation(400, 10);
			
			
			botmode = true;
			
			
			Frame3.add(moves1);
			Frame3.add(moves2);
            Frame3.add(linela);
			Frame3.add(red1);
			Frame3.add(red2);
			Frame3.add(red3);
			Frame3.add(blank1);
			Frame3.add(blank2);
			Frame3.add(blank3);
			Frame3.add(blue1);
			Frame3.add(blue2);
			Frame3.add(blue3);
			
			Frame3.add(line1);
			Frame3.add(line2);
			Frame3.add(line3);
			Frame3.add(line4);
			Frame3.add(line5);
			Frame3.add(line6);
		    Frame3.add(line7);
			Frame3.add(line8);
			Frame3.add(line9);
			Frame3.add(line10);
			Frame3.add(line11);
			Frame3.add(line12);
			Frame3.add(bl1);
			Frame3.add(bl2);
			Frame3.add(bl3);
			Frame3.add(bl4);
			Frame3.add(bl5);
			Frame3.add(bl6);
			Frame3.add(bl7);
			Frame3.add(bl8);
			Frame3.add(bl9);
			Frame3.add(bl10);
			Frame3.add(bl11);
			Frame3.add(bl12);
			Frame3.add(bl13);
			Frame3.add(bl14);
			Frame3.add(bl15);
			Frame3.add(blo1);
			Frame3.add(blo2);
			Frame3.add(blo3);
			Frame3.add(blo4);
			Frame3.add(blo5);
			Frame3.add(blo6);
			Frame3.add(blo7);
			Frame3.add(blo8);
			Frame3.add(blo9);
			Frame3.add(blo10);
			Frame3.add(blo11);
			Frame3.add(blo12);
			Frame3.add(blo13);
			Frame3.add(blo14);
			Frame3.add(blo15);
			Frame3.add(bloc1);
			Frame3.add(bloc2);
			Frame3.add(bloc3);
			Frame3.add(bloc4);
			Frame3.add(bloc5);
			Frame3.add(bloc6);
			Frame3.add(bloc7);
			Frame3.add(bloc8);
			Frame3.add(bloc9);
			Frame3.add(bloc10);
			Frame3.add(bloc11);
			Frame3.add(bloc12);
			Frame3.add(bloc13);
			Frame3.add(bloc14);
			Frame3.add(bloc15);
			Frame3.add(block1);
			Frame3.add(block2);
			Frame3.add(block3);
			Frame3.add(block4);
			Frame3.add(block5);
			Frame3.add(block6);
			Frame3.add(block7);
			Frame3.add(block8);
			Frame3.add(block9);
			Frame3.add(block10);
			Frame3.add(block11);
			Frame3.add(block12);
			Frame3.add(block13);
			Frame3.add(block14);
			Frame3.add(block15);
			Frame3.add(playerr1);
			Frame3.add(playerr2);
			
            reset();
			
			player1 = Playername1.getText();
			player2 = Playername2.getText();
			
			if(botness == true) {
				blue1.setEnabled(false);
				blue2.setEnabled(false);
				blue3.setEnabled(false);
				red1.setEnabled(false);
				red2.setEnabled(false);
				red3.setEnabled(false);
				playerr2.setBorder(null);
        		playerr1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
        		player = "red";
        		botbrain();
			}
			if(botness == false) {
				red1.setEnabled(false);
				red2.setEnabled(false);
				red3.setEnabled(false);
				playerr1.setBorder(null);
        		playerr2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
        		player = "blue";
        		
			}
			
			if(player1 == "BOT") {
				playerr1.setText("BOT");
			}
			else {
				playerr1.setText(player1);
			}
			if(player2 == "Blue player") {
				playerr2.setText("Blue Player");
			}
			else {
				playerr2.setText(player2);
			}
			
			blank1.setEnabled(false);
			blank2.setEnabled(false);
			blank3.setEnabled(false);
			
			
			
		}
		
		
		if(e.getSource() == Startingplayerbutton) {
			Startingbotbutton.setBackground(Color.white);
			vsbot.setEnabled(false);
			onevsone.setEnabled(true);
			
			if(playername == false) {
		    Playername1.setText("Red player");
			playername = true;
			botness = false;
			
			}
			
			if(player == "red") {
				player = "blue";
				Startingplayerbutton.setBackground(Color.BLUE);
			}else if(player == "blue") {
				player = "red";
				Startingplayerbutton.setBackground(Color.RED);
			}
			
			
			if(player == "red") {
				blue1.setEnabled(false);
				blue2.setEnabled(false);
				blue3.setEnabled(false);
				red1.setEnabled(true);
				red2.setEnabled(true);
				red3.setEnabled(true);
				
				playerr1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
        		playerr2.setBorder(null);
				
			}else if(player == "blue") {
				blue1.setEnabled(true);
				blue2.setEnabled(true);
				blue3.setEnabled(true);
				red1.setEnabled(false);
				red2.setEnabled(false);
				red3.setEnabled(false);
				
				playerr1.setBorder(null);
        		playerr2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
				
			}
			
			
		}
		
	
		
		
		if(e.getSource()== onevsone) {
			Frame2 = new JFrame();
			Frame2.setTitle("Nira");
			Frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			Frame2.setSize(700, 800);
			Frame2.setVisible(true);
			Frame2.setLayout(null);
			Frame2.setLocation(400, 10);
			
			
			botmode = false;
			
			
			Frame2.add(moves1);
			Frame2.add(moves2);
            Frame2.add(linela);
			Frame2.add(red1);
			Frame2.add(red2);
			Frame2.add(red3);
			Frame2.add(blank1);
			Frame2.add(blank2);
			Frame2.add(blank3);
			Frame2.add(blue1);
			Frame2.add(blue2);
			Frame2.add(blue3);
			
			Frame2.add(line1);
			Frame2.add(line2);
			Frame2.add(line3);
			Frame2.add(line4);
			Frame2.add(line5);
			Frame2.add(line6);
		    Frame2.add(line7);
			Frame2.add(line8);
			Frame2.add(line9);
			Frame2.add(line10);
			Frame2.add(line11);
			Frame2.add(line12);
			Frame2.add(bl1);
			Frame2.add(bl2);
			Frame2.add(bl3);
			Frame2.add(bl4);
			Frame2.add(bl5);
			Frame2.add(bl6);
			Frame2.add(bl7);
			Frame2.add(bl8);
			Frame2.add(bl9);
			Frame2.add(bl10);
			Frame2.add(bl11);
			Frame2.add(bl12);
			Frame2.add(bl13);
			Frame2.add(bl14);
			Frame2.add(bl15);
			Frame2.add(blo1);
			Frame2.add(blo2);
			Frame2.add(blo3);
			Frame2.add(blo4);
			Frame2.add(blo5);
			Frame2.add(blo6);
			Frame2.add(blo7);
			Frame2.add(blo8);
			Frame2.add(blo9);
			Frame2.add(blo10);
			Frame2.add(blo11);
			Frame2.add(blo12);
			Frame2.add(blo13);
			Frame2.add(blo14);
			Frame2.add(blo15);
			Frame2.add(bloc1);
			Frame2.add(bloc2);
			Frame2.add(bloc3);
			Frame2.add(bloc4);
			Frame2.add(bloc5);
			Frame2.add(bloc6);
			Frame2.add(bloc7);
			Frame2.add(bloc8);
			Frame2.add(bloc9);
			Frame2.add(bloc10);
			Frame2.add(bloc11);
			Frame2.add(bloc12);
			Frame2.add(bloc13);
			Frame2.add(bloc14);
			Frame2.add(bloc15);
			Frame2.add(block1);
			Frame2.add(block2);
			Frame2.add(block3);
			Frame2.add(block4);
			Frame2.add(block5);
			Frame2.add(block6);
			Frame2.add(block7);
			Frame2.add(block8);
			Frame2.add(block9);
			Frame2.add(block10);
			Frame2.add(block11);
			Frame2.add(block12);
			Frame2.add(block13);
			Frame2.add(block14);
			Frame2.add(block15);
			Frame2.add(playerr1);
			Frame2.add(playerr2);
			
			reset();
			
			player1 = Playername1.getText();
			player2 = Playername2.getText();
			
			if(player1 == "Red player") {
				playerr1.setText("Red Player");
			}
			else {
				playerr1.setText(player1);
			}
			if(player2 == "Blue player") {
				playerr2.setText("Blue Player");
			}
			else {
				playerr2.setText(player2);
			}
			
			blank1.setEnabled(false);
			blank2.setEnabled(false);
			blank3.setEnabled(false);
		}
		
		if(e.getSource()==red1) {
			currentselectedbutton = "red1";
			whenpressedblankbuttonenabling(red1_x,red1_y);
		}
	//one button
		
		if(e.getSource()==red2) {
			currentselectedbutton = "red2";
			whenpressedblankbuttonenabling(red2_x,red2_y);
		}
		//one button
		
		if(e.getSource()==red3) {
			currentselectedbutton = "red3";
			whenpressedblankbuttonenabling(red3_x,red3_y);
			
		}
		//one button
		
		if(e.getSource()==blue1) {
			currentselectedbutton = "blue1";
			whenpressedblankbuttonenabling(blue1_x,blue1_y);
		}
		
		//onebutton
		
		if(e.getSource()==blue2) {
			currentselectedbutton = "blue2";
			whenpressedblankbuttonenabling(blue2_x,blue2_y);
		}
		
		//onebutton
		
		if(e.getSource()==blue3) {
			currentselectedbutton = "blue3";
			whenpressedblankbuttonenabling(blue3_x,blue3_y);
		}
		
		//onebutton
		
		
        
        if(e.getSource() == blank1) {
        	BlankButtonWorking(blank1);
        } 
        
        
        if(e.getSource() == blank2) {
        	BlankButtonWorking(blank2);
        }
        
        
        if(e.getSource() == blank3) {
        	BlankButtonWorking(blank3);
        }
        
        
	}
		
		public void BlankButtonWorking(JButton Button) {
			blank1.setOpaque(false);
			blank2.setOpaque(false);
			blank3.setOpaque(false);
        	
			if(Button == blank1) {
        	if(currentselectedbutton == "red1") {
        		templocvalue_x = (red1_x - 5);
        		templocvalue_y = (red1_y - 5);
        		red1_x = (blank1_x + 5);
        		red1_y = (blank1_y + 5);
        		blank1_x = templocvalue_x;
        		blank1_y = templocvalue_y;
        		red1.setBounds(red1_x, red1_y, 50, 50);
				blank1.setBounds(blank1_x, blank1_y, 60, 60);
        		reda++;
        	}
        	
        	else if(currentselectedbutton == "red2") {
        		templocvalue_x = (red2_x - 5);
        		templocvalue_y = (red2_y - 5);
        		red2_x = (blank1_x + 5);
        		red2_y = (blank1_y + 5);
        		blank1_x = templocvalue_x;
        		blank1_y = templocvalue_y;
        		red2.setBounds(red2_x, red2_y, 50, 50);
				blank1.setBounds(blank1_x, blank1_y, 60, 60);
        		redb++;
        	}
        	
        	else if(currentselectedbutton == "red3") {
        		templocvalue_x = (red3_x - 5);
        		templocvalue_y = (red3_y - 5);
        		red3_x = (blank1_x + 5);
        		red3_y = (blank1_y + 5);
        		blank1_x = templocvalue_x;
        		blank1_y = templocvalue_y;
        		red3.setBounds(red3_x, red3_y, 50, 50);
				blank1.setBounds(blank1_x, blank1_y, 60, 60);
        		redc++;
        	}
        	
        	else if(currentselectedbutton == "blue1") {
        		templocvalue_x = (blue1_x - 5);
        		templocvalue_y = (blue1_y - 5);
        		blue1_x = (blank1_x + 5);
        		blue1_y = (blank1_y + 5);
        		blank1_x = templocvalue_x;
        		blank1_y = templocvalue_y;
        		blue1.setBounds(blue1_x, blue1_y, 50, 50);
				blank1.setBounds(blank1_x, blank1_y, 60, 60);
        		bluea++;
        	}
        	
        	else if(currentselectedbutton == "blue2") {
        		templocvalue_x = (blue2_x - 5);
        		templocvalue_y = (blue2_y - 5);
        		blue2_x = (blank1_x + 5);
        		blue2_y = (blank1_y + 5);
        		blank1_x = templocvalue_x;
        		blank1_y = templocvalue_y;
        		blue2.setBounds(blue2_x, blue2_y, 50, 50);
				blank1.setBounds(blank1_x, blank1_y, 60, 60);
        		blueb++;
        	}
        	
        	else if(currentselectedbutton == "blue3"){
        		templocvalue_x = (blue3_x - 5);
        		templocvalue_y = (blue3_y - 5);
        		blue3_x = (blank1_x + 5);
        		blue3_y = (blank1_y + 5);
        		blank1_x = templocvalue_x;
        		blank1_y = templocvalue_y;
        		blue3.setBounds(blue3_x, blue3_y, 50, 50);
				blank1.setBounds(blank1_x, blank1_y, 60, 60);
        		bluec++;
        	}
			}
        	
			
			else if(Button == blank2) {
	        	if(currentselectedbutton == "red1") {
	        		templocvalue_x = (red1_x - 5);
	        		templocvalue_y = (red1_y - 5);
	        		red1_x = (blank2_x + 5);
	        		red1_y = (blank2_y + 5);
	        		blank2_x = templocvalue_x;
	        		blank2_y = templocvalue_y;
	        		red1.setBounds(red1_x, red1_y, 50, 50);
					blank2.setBounds(blank2_x, blank2_y, 60, 60);
	        		reda++;
	        	}
	        	
	        	else if(currentselectedbutton == "red2") {
	        		templocvalue_x = (red2_x - 5);
	        		templocvalue_y = (red2_y - 5);
	        		red2_x = (blank2_x + 5);
	        		red2_y = (blank2_y + 5);
	        		blank2_x = templocvalue_x;
	        		blank2_y = templocvalue_y;
	        		red2.setBounds(red2_x, red2_y, 50, 50);
					blank2.setBounds(blank2_x, blank2_y, 60, 60);
	        		redb++;
	        	}
	        	
	        	else if(currentselectedbutton == "red3") {
	        		templocvalue_x = (red3_x - 5);
	        		templocvalue_y = (red3_y - 5);
	        		red3_x = (blank2_x + 5);
	        		red3_y = (blank2_y + 5);
	        		blank2_x = templocvalue_x;
	        		blank2_y = templocvalue_y;
	        		red3.setBounds(red3_x, red3_y, 50, 50);
					blank2.setBounds(blank2_x, blank2_y, 60, 60);
	        		redc++;
	        	}
	        	
	        	else if(currentselectedbutton == "blue1") {
	        		templocvalue_x = (blue1_x - 5);
	        		templocvalue_y = (blue1_y - 5);
	        		blue1_x = (blank2_x + 5);
	        		blue1_y = (blank2_y + 5);
	        		blank2_x = templocvalue_x;
	        		blank2_y = templocvalue_y;
	        		blue1.setBounds(blue1_x, blue1_y, 50, 50);
					blank2.setBounds(blank2_x, blank2_y, 60, 60);
	        		bluea++;
	        	}
	        	
	        	else if(currentselectedbutton == "blue2") {
	        		templocvalue_x = (blue2_x - 5);
	        		templocvalue_y = (blue2_y - 5);
	        		blue2_x = (blank2_x + 5);
	        		blue2_y = (blank2_y + 5);
	        		blank2_x = templocvalue_x;
	        		blank2_y = templocvalue_y;
	        		blue2.setBounds(blue2_x, blue2_y, 50, 50);
					blank2.setBounds(blank2_x, blank2_y, 60, 60);
	        		blueb++;
	        	}
	        	
	        	else if(currentselectedbutton == "blue3"){
	        		templocvalue_x = (blue3_x - 5);
	        		templocvalue_y = (blue3_y - 5);
	        		blue3_x = (blank2_x + 5);
	        		blue3_y = (blank2_y + 5);
	        		blank2_x = templocvalue_x;
	        		blank2_y = templocvalue_y;
	        		blue3.setBounds(blue3_x, blue3_y, 50, 50);
					blank2.setBounds(blank2_x, blank2_y, 60, 60);
	        		bluec++;
	        	}
				}
			
			
			else if(Button == blank3) {
	        	if(currentselectedbutton == "red1") {
	        		templocvalue_x = (red1_x - 5);
	        		templocvalue_y = (red1_y - 5);
	        		red1_x = (blank3_x + 5);
	        		red1_y = (blank3_y + 5);
	        		blank3_x = templocvalue_x;
	        		blank3_y = templocvalue_y;
	        		red1.setBounds(red1_x, red1_y, 50, 50);
					blank3.setBounds(blank3_x, blank3_y, 60, 60);
	        		reda++;
	        	}
	        	
	        	else if(currentselectedbutton == "red2") {
	        		templocvalue_x = (red2_x - 5);
	        		templocvalue_y = (red2_y - 5);
	        		red2_x = (blank3_x + 5);
	        		red2_y = (blank3_y + 5);
	        		blank3_x = templocvalue_x;
	        		blank3_y = templocvalue_y;
	        		red2.setBounds(red2_x, red2_y, 50, 50);
					blank3.setBounds(blank3_x, blank3_y, 60, 60);
	        		redb++;
	        	}
	        	
	        	else if(currentselectedbutton == "red3") {
	        		templocvalue_x = (red3_x - 5);
	        		templocvalue_y = (red3_y - 5);
	        		red3_x = (blank3_x + 5);
	        		red3_y = (blank3_y + 5);
	        		blank3_x = templocvalue_x;
	        		blank3_y = templocvalue_y;
	        		red3.setBounds(red3_x, red3_y, 50, 50);
					blank3.setBounds(blank3_x, blank3_y, 60, 60);
	        		redc++;
	        	}
	        	
	        	else if(currentselectedbutton == "blue1") {
	        		templocvalue_x = (blue1_x - 5);
	        		templocvalue_y = (blue1_y - 5);
	        		blue1_x = (blank3_x + 5);
	        		blue1_y = (blank3_y + 5);
	        		blank3_x = templocvalue_x;
	        		blank3_y = templocvalue_y;
	        		blue1.setBounds(blue1_x, blue1_y, 50, 50);
					blank3.setBounds(blank3_x, blank3_y, 60, 60);
	        		bluea++;
	        	}
	        	
	        	else if(currentselectedbutton == "blue2") {
	        		templocvalue_x = (blue2_x - 5);
	        		templocvalue_y = (blue2_y - 5);
	        		blue2_x = (blank3_x + 5);
	        		blue2_y = (blank3_y + 5);
	        		blank3_x = templocvalue_x;
	        		blank3_y = templocvalue_y;
	        		blue2.setBounds(blue2_x, blue2_y, 50, 50);
					blank3.setBounds(blank3_x, blank3_y, 60, 60);
	        		blueb++;
	        	}
	        	
	        	else if(currentselectedbutton == "blue3"){
	        		templocvalue_x = (blue3_x - 5);
	        		templocvalue_y = (blue3_y - 5);
	        		blue3_x = (blank3_x + 5);
	        		blue3_y = (blank3_y + 5);
	        		blank3_x = templocvalue_x;
	        		blank3_y = templocvalue_y;
	        		blue3.setBounds(blue3_x, blue3_y, 50, 50);
					blank3.setBounds(blank3_x, blank3_y, 60, 60);
	        		bluec++;
	        	}
				}
			
			
			
        	
        		checknira();
        		
        		
        		
        		if(player == "red") {
            		blue1.setEnabled(true);
            		blue2.setEnabled(true);
            		blue3.setEnabled(true);
            		red1.setEnabled(false);
            		red2.setEnabled(false);
            		red3.setEnabled(false);
            		player = "blue";
            		if(colorlock == "Green") {
            		playerr1.setBorder(null);
            		playerr2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
            		}else if(colorlock == "Yellow") {
            			playerr2.setBorder(null);
            			playerr1.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
            		}
            		
            	}else if(player == "blue") {
            		blue1.setEnabled(false);
            		blue2.setEnabled(false);
            		blue3.setEnabled(false);
            		if(botmode == false) {
            		red1.setEnabled(true);
            		red2.setEnabled(true);
            		red3.setEnabled(true);
            		player = "red";
            		if(colorlock == "Green") {
            		playerr1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
            		playerr2.setBorder(null);
            		}else if(colorlock =="Yellow") {
            			playerr2.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
            			playerr1.setBorder(null);
            		}
            		}else if(botmode == true) {
            			
            			botbrain();               		
            		}
            	}
        		
        		
        		
        	
        	
        	moves1.setText("MOVED : "+reda+" , "+redb+" , "+redc);
        	moves2.setText("MOVED : "+bluea+" , "+blueb+" , "+bluec);
        	
        	currentselectedbutton = "null";
        	blank1.setEnabled(false);
        	blank2.setEnabled(false);
        	blank3.setEnabled(false);
        
		}
	
		
		public void whenpressedblankbuttonenabling(int temp_x,int temp_y) {
			
			
				if(temp_x == 50) {
					if(temp_y == 100) {
						if(blank1_x == 45) {
							if(blank1_y == 295) {
								b1 = true;
							}
						}
						if(blank1_x == 195) {
							if(blank1_y == 295) {
								b1 = true;
							}
							
						}
						if(blank1_x == 195) {
							if(blank1_y == 95) {
								b1 = true;
							}
						}
						
						if(blank2_x == 45) {
							if(blank2_y == 295) {
								b2 = true;
							}
						}
						if(blank2_x == 195) {
							if(blank2_y == 295) {
								b2 = true;
							}
						}
						if(blank2_x == 195) {
							if(blank2_y == 95) {
								b2 = true;
							}
						}
						
						if(blank3_x == 45) {
							if(blank3_y == 295) {
								b3 = true;
							}
						}
						if(blank3_x == 195) {
							if(blank3_y == 295) {
								b3 = true;
							}
						}
						if(blank3_x == 195) {
							if(blank3_y == 95) {
								b3 = true;
							}
						}
						
					}
					}
				
				
				if(temp_x == 200) {
					if(temp_y == 100) {
						
						if(blank1_x == 195) {
							if(blank1_y == 295) {
								b1 = true;
							}
						}
						if(blank1_x == 45) {
							if(blank1_y == 95) {
								b1 = true;
							}
						}
						if(blank1_x == 345) {
							if(blank1_y == 95) {
								b1 = true;
							}
						}
						
						if(blank2_x == 195) {
							if(blank2_y == 295) {
								b2 = true;
							}
						}
						if(blank2_x == 45) {
							if(blank2_y == 95) {
								b2 = true;
							}
						}
						if(blank2_x == 345) {
							if(blank2_y == 95) {
								b2 = true;
							}
						}
						
						if(blank3_x == 195) {
							if(blank3_y == 295) {
								b3 = true;
							}
						}
						if(blank3_x == 45) {
							if(blank3_y == 95) {
								b3 = true;
							}
						}
						if(blank3_x == 345) {
							if(blank3_y == 95) {
								b3 = true;
							}
						}
				
					}
				    }
				
				
				if(temp_x == 350) {
					if(temp_y == 100) {
						
						if(blank1_x == 345) {
							if(blank1_y == 295) {
								b1 = true;
							}
						}
						if(blank1_x == 195) {
							if(blank1_y == 295) {
								b1 = true;
							}
						}
						if(blank1_x == 195) {
							if(blank1_y == 95) {
								b1 = true;
							}
						}
						
						if(blank2_x == 345) {
							if(blank2_y == 295) {
								b2 = true;
							}
						}
						if(blank2_x == 195) {
							if(blank2_y == 295) {
								b2 = true;
							}
						}
						if(blank2_x == 195) {
							if(blank2_y == 95) {
								b2 = true;
							}
						}
						
						if(blank3_x == 345) {
							if(blank3_y == 295) {
								b3 = true;
							}
						}
						if(blank3_x == 195) {
							if(blank3_y == 295) {
								b3 = true;
							}
						}
						if(blank3_x == 195) {
							if(blank3_y == 95) {
								b3 = true;
							}
						}
				       
					}
				    }
						
				
			
				if(temp_x == 50) {
					if(temp_y == 300) {
						
						if(blank1_x == 45) {
							if(blank1_y == 95) {
								b1 = true;
							}
						}
						if(blank1_x == 195) {
							if(blank1_y == 295) {
								b1 = true;
							}
						}
						if(blank1_x == 45) {
							if(blank1_y == 495) {
								b1 = true;
							}
						}
						
						if(blank2_x == 45) {
							if(blank2_y == 95) {
								b2 = true;
							}
						}
						if(blank2_x == 195) {
							if(blank2_y == 295) {
								b2 = true;
							}
						}
						if(blank2_x == 45) {
							if(blank2_y == 495) {
								b2 = true;
							}
						}
						
						if(blank3_x == 45) {
							if(blank3_y == 95) {
								b3 = true;
							}
						}
						if(blank3_x == 195) {
							if(blank3_y == 295) {
								b3 = true;
							}
						}
						if(blank3_x == 45) {
							if(blank3_y == 495) {
								b3 = true;
							}
						}
		
						}
				        }
			         
				//ab
				if(temp_x == 200) {
					if(temp_y == 300) {
						b1 = true;
						b2 = true;
						b3 = true;
					}
				}
				//ab
				if(temp_x == 350) {
					if(temp_y == 300) {
						
						if(blank1_x == 345) {
							if(blank1_y == 95) {
								b1 = true;
							}
						}
						if(blank1_x == 195) {
							if(blank1_y == 295) {
								b1 = true;
							}
						}
						if(blank1_x == 345) {
							if(blank1_y == 495) {
								b1 = true;
							}
						}
						
						if(blank2_x == 345) {
							if(blank2_y == 95) {
								b2 = true;
							}
						}
						if(blank2_x == 195) {
							if(blank2_y == 295) {
								b2 = true;
							}
						}
						if(blank2_x == 345) {
							if(blank2_y == 495) {
								b2 = true;
							}
						}
						
						if(blank3_x == 345) {
							if(blank3_y == 95) {
								b3 = true;
							}
						}
						if(blank3_x == 195) {
							if(blank3_y == 295) {
								b3 = true;
							}
						}
						if(blank3_x == 345) {
							if(blank3_y == 495) {
								b3 = true;
							}
						}
				
					    }
				        }
				
				
				
				if(temp_x == 50) {
					if(temp_y == 500) {
						
						if(blank1_x == 45) {
							if(blank1_y == 295) {
								b1 = true;
							}
						}
						if(blank1_x == 195) {
							if(blank1_y == 295) {
								b1 = true;
							}
						}
						if(blank1_x == 195) {
							if(blank1_y == 495) {
								b1 = true;
							}
						}
						
						if(blank2_x == 45) {
							if(blank2_y == 295) {
								b2 = true;
							}
						}
						if(blank2_x == 195) {
							if(blank2_y == 295) {
								b2 = true;
							}
						}
						if(blank2_x == 195) {
							if(blank2_y == 495) {
								b2 = true;
							}
						}
						
						if(blank3_x == 45) {
							if(blank3_y == 295) {
								b3 = true;
							}
						}
						if(blank3_x == 195) {
							if(blank3_y == 295) {
								b3 = true;
							}
						}
						if(blank3_x == 195) {
							if(blank3_y == 495) {
								b3 = true;
							}
						}
						
					    }
				        }
				//ab
				if(temp_x == 200) {
					if(temp_y == 500) {
						
						if(blank1_x == 45) {
							if(blank1_y == 495) {
								b1 = true;
							}
						}
						if(blank1_x == 195) {
							if(blank1_y == 295) {
								b1 = true;
							}
						}
						if(blank1_x == 345) {
							if(blank1_y == 495) {
								b1 = true;
							}
						}
						
						if(blank2_x == 45) {
							if(blank2_y == 495) {
								b2 = true;
							}
						}
						if(blank2_x == 195) {
							if(blank2_y == 295) {
								b2 = true;
							}
						}
						if(blank2_x == 345) {
							if(blank2_y == 495) {
								b2 = true;
							}
						}
						
						if(blank3_x == 45) {
							if(blank3_y == 495) {
								b3 = true;
							}
						}
						if(blank3_x == 195) {
							if(blank3_y == 295) {
								b3 = true;
							}
						}
						if(blank3_x == 345) {
							if(blank3_y == 495) {
								b3 = true;
							}
						}
						
					    }
				        }
				//ab
				if(temp_x == 350) {
					if(temp_y == 500) {
						
						if(blank1_x == 195) {
							if(blank1_y == 495) {
								b1 = true;
							}
						}
						if(blank1_x == 195) {
							if(blank1_y == 295) {
								b1 = true;
							}
						}
						if(blank1_x == 345) {
							if(blank1_y == 295) {
								b1 = true;
							}
						}
						
						if(blank2_x == 195) {
							if(blank2_y == 495) {
								b2 = true;
							}
						}
						if(blank2_x == 195) {
							if(blank2_y == 295) {
								b2 = true;
							}
						}
						if(blank2_x == 345) {
							if(blank2_y == 295) {
								b2 = true;
							}
						}
						
						if(blank3_x == 195) {
							if(blank3_y == 495) {
								b3 = true;
							}
						}
						if(blank3_x == 195) {
							if(blank3_y == 295) {
								b3 = true;
							}
						}
						if(blank3_x == 345) {
							if(blank3_y == 295) {
								b3 = true;
							}
						}
				
					}
				    }	
				
					 if(b1 == true) {
						 blank1.setEnabled(true);
						 blank1.setOpaque(true);
						 blank1.setBackground(Color.lightGray);
					 }
					 else if(b1==false) {
						 blank1.setEnabled(false);
						 blank1.setOpaque(false);
					 }
					 if(b2 == true) {
						 blank2.setEnabled(true);
						 blank2.setOpaque(true);
						 blank2.setBackground(Color.lightGray);
					 }
					 else if(b2==false) {
						 blank2.setEnabled(false);
						 blank2.setOpaque(false);
					 }
					 if(b3 == true) {
						 blank3.setEnabled(true);
						 blank3.setOpaque(true);
						 blank3.setBackground(Color.lightGray);
					 }
					 else if(b3==false) {
						 blank3.setEnabled(false);
						 blank3.setOpaque(false);
					 }
						b1 = false;
						b2 = false;
						b3 = false;
					
						
		}
		
		
	
	public void checknira() {
		if(((reda>0)&&(redb>0))&&(redc>0)) {
			
		if((red1_x == 200)&&(red1_y == 300)) {
				if((red2_x == 50)&&(red2_y == 500)) {
					if((red3_x == 350)&&(red3_y == 100)) {
									redNIRA = true;
					}
				}
				else if((red2_x == 350)&&(red2_y == 100)) {
					if((red3_x == 50)&&(red3_y == 500)) {
								redNIRA = true;
					}
				}
			}
						
		else if(red1_x == red2_x) {
			if(red2_x == red3_x) {
	        	redNIRA = true;	
			}
		}
		
		else if(red1_y == red2_y) {
			if(red2_y == red3_y) {
				redNIRA = true;		
			}
		}
		
		else if((red1_x == 50)&&(red1_y == 100)) {
			if((red2_x == 200)&&(red2_y == 300)) {
				if((red3_x == 350)&&(red3_y == 500)) {
								redNIRA = true;
				}
			}
			else if((red2_x == 350)&&(red2_y == 500)) {
				if((red3_x == 200)&&(red3_y == 300)) {
							redNIRA = true;
				}
			}
		}
		
		else if((red1_x == 200)&&(red1_y == 300)) {
			if((red2_x == 50)&&(red2_y == 100)) {
				if((red3_x == 350)&&(red3_y == 500)) {
								redNIRA = true;
				}
			}
			else if((red2_x == 350)&&(red2_y == 500)) {
				if((red3_x == 50)&&(red3_y == 100)) {
							redNIRA = true;
				}
			}
		}
		
		else if((red1_x == 350)&&(red1_y == 500)) {
			if((red2_x == 50)&&(red2_y == 100)) {
				if((red3_x == 200)&&(red3_y == 300)) {
								redNIRA = true;
				}
			}
			else if((red2_x == 200)&&(red2_y == 300)) {
				if((red3_x == 50)&&(red3_y == 100)) {
							redNIRA = true;
				}
			}
		}
		
		
		else if((red1_x == 50)&&(red1_y == 500)) {
			if((red2_x == 200)&&(red2_y == 300)) {
				if((red3_x == 350)&&(red3_y == 100)) {
								redNIRA = true;
				}
			}
			else if((red2_x == 350)&&(red2_y == 100)) {
				if((red3_x == 200)&&(red3_y == 300)) {
							redNIRA = true;
				}
			}
		}
		
		else if((red1_x == 350)&&(red1_y == 100)) {
			if((red2_x == 200)&&(red2_y == 300)) {
				if((red3_x == 50)&&(red3_y == 500)) {
								redNIRA = true;
				}
			}
			else if((red2_x == 50)&&(red2_y == 500)) {
				if((red3_x == 200)&&(red3_y == 300)) {
							redNIRA = true;
				}
			}
		}
		
	}
		
		
		
	if(((bluea>0)&&(blueb>0))&&(bluec>0)) {
		
		if((blue1_x == 200)&&(blue1_y == 300)) {
			if((blue2_x == 50)&&(blue2_y == 500)) {
				if((blue3_x == 350)&&(blue3_y == 100)) {
					blueNIRA = true;
				}
			}
			else if((blue2_x == 350)&&(blue2_y == 100)) {
				if((blue3_x == 50)&&(blue3_y == 500)) {
					blueNIRA = true;
				}
			}
		}
		
		else if(blue1_x == blue2_x) {
		   if(blue2_x == blue3_x) {
	           blueNIRA = true;	
			}
		}
		
		else if(blue1_y == blue2_y) {
			if(blue2_y == blue3_y) {
	        	blueNIRA = true;	
			}
		}
		
		
		else if((blue1_x == 50)&&(blue1_y == 100)) {
			if((blue2_x == 200)&&(blue2_y == 300)) {
				if((blue3_x == 350)&&(blue3_y == 500)) {
					blueNIRA = true;
				}
			}
			else if((blue2_x == 350)&&(blue2_y == 500)) {
				if((blue3_x == 200)&&(blue3_y == 300)) {
					blueNIRA = true;
				}
			}
		}
		
		else if((blue1_x == 200)&&(blue1_y == 300)) {
			if((blue2_x == 50)&&(blue2_y == 100)) {
				if((blue3_x == 350)&&(blue3_y == 500)) {
					blueNIRA = true;
				}
			}
			else if((blue2_x == 350)&&(blue2_y == 500)) {
				if((blue3_x == 50)&&(blue3_y == 100)) {
					blueNIRA = true;
				}
			}
		}
		
		else if((blue1_x == 350)&&(blue1_y == 500)) {
			if((blue2_x == 50)&&(blue2_y == 100)) {
				if((blue3_x == 200)&&(blue3_y == 300)) {
					blueNIRA = true;
				}
			}
			else if((blue2_x == 200)&&(blue2_y == 300)) {
				if((blue3_x == 50)&&(blue3_y == 100)) {
					blueNIRA = true;
				}
			}
		}
		
		
		
		else if((blue1_x == 50)&&(blue1_y == 500)) {
			if((blue2_x == 200)&&(blue2_y == 300)) {
				if((blue3_x == 350)&&(blue3_y == 100)) {
					blueNIRA = true;
				}
			}
			else if((blue2_x == 350)&&(blue2_y == 100)) {
				if((blue3_x == 200)&&(blue3_y == 300)) {
					blueNIRA = true;
				}
			}
		}
		
		else if((blue1_x == 350)&&(blue1_y == 100)) {
			if((blue2_x == 200)&&(blue2_y == 300)) {
				if((blue3_x == 50)&&(blue3_y == 500)) {
					blueNIRA = true;
				}
			}
			else if((blue2_x == 50)&&(blue2_y == 500)) {
				if((blue3_x == 200)&&(blue3_y == 300)) {
					blueNIRA = true;
				}
			}
		}
		
		
		
	}
		
		if(redNIRA == true) {
    		red1.setEnabled(false);
    		red2.setEnabled(false);
    		red3.setEnabled(false);
    		blue1.setEnabled(false);
    		blue1.setOpaque(false);
    		blue2.setEnabled(false);
    		blue2.setOpaque(false);
    		blue3.setEnabled(false);
    		blue3.setOpaque(false);
    		playerr1.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
    		playerr2.setBorder(null);
    		colorlock = "Yellow";
    		
    	}else if(blueNIRA == true) {
    		red1.setEnabled(false);
    		red1.setOpaque(false);
    		red2.setEnabled(false);
    		red2.setOpaque(false);
    		red3.setEnabled(false);
    		red3.setOpaque(false);
    		blue1.setEnabled(false);
    		blue2.setEnabled(false);
    		blue3.setEnabled(false);
    		playerr1.setBorder(null);
    		playerr2.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
    		colorlock = "Yellow";
    		
    	}
		
		
	}
	
	
	public void reset() {
		redNIRA = false;
		blueNIRA = false;
		reda = 0;
		redb = 0;
		redc = 0;
		bluea = 0;
		blueb = 0;
		bluec = 0;
		moves1.setText("MOVED : "+reda+" , "+redb+" , "+redc);
    	moves2.setText("MOVED : "+bluea+" , "+blueb+" , "+bluec);
    	colorlock = "Green";
		red1_x = 50;
		red1_y = 100;
		red1.setBounds(red1_x, red1_y, 50, 50);
		red2_x = 200;
		red2_y = 100;
		red2.setBounds(red2_x, red2_y, 50, 50);
		red3_x = 350;
		red3_y = 100;
		red3.setBounds(red3_x, red3_y, 50, 50);
		blank1_x = 45;
		blank1_y = 295;
		blank1.setBounds(blank1_x, blank1_y, 60, 60);
		blank2_x = 195;
		blank2_y = 295;
		blank2.setBounds(blank2_x, blank2_y, 60, 60);
		blank3_x = 345;
		blank3_y = 295;
		blank3.setBounds(blank3_x, blank3_y, 60, 60);
		blue1_x = 50;
		blue1_y = 500;
		blue1.setBounds(blue1_x, blue1_y, 50, 50);
		blue2_x = 200;
		blue2_y = 500;
		blue2.setBounds(blue2_x, blue2_y, 50, 50);
		blue3_x = 350;
		blue3_y = 500;
		blue3.setBounds(blue3_x, blue3_y, 50, 50);
		red1.setOpaque(true);
		red2.setOpaque(true);
		red3.setOpaque(true);
		blue1.setOpaque(true);
		blue2.setOpaque(true);
		blue3.setOpaque(true);
	}
	
	
	public void botbrain() {
		player = "red";
		playerr1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
		playerr2.setBorder(null);
		
		if((reda==0)&&(redb==0)&&(redc==0)) {
			if((blank1_x == 45)&&(blank1_y == 295)) {
				currentselectedbutton = "red1";
				BlankButtonWorking(blank1);
			}
			else if((blank1_x == 195)&&(blank1_y == 295)) {
				currentselectedbutton = "red1";
				BlankButtonWorking(blank1);
			}
			else if((blank2_x == 45)&&(blank2_y == 295)) {
				currentselectedbutton = "red1";
				BlankButtonWorking(blank2);
			}
			else if((blank2_x == 195)&&(blank2_y == 295)) {
				currentselectedbutton = "red1";
				BlankButtonWorking(blank2);
			}
			else if((blank3_x == 45)&&(blank3_y == 295)) {
				currentselectedbutton = "red1";
				BlankButtonWorking(blank3);
			}
			else if((blank3_x == 195)&&(blank3_y == 295)) {
				currentselectedbutton = "red1";
				BlankButtonWorking(blank3);
			}
		}
		else if((reda>0)&&(redb==0)&&(redc==0)) {
			if((blank1_x == 345)&&(blank1_y == 295)) {
				currentselectedbutton = "red3";		
				BlankButtonWorking(blank1);
			}
			else if((blank1_x == 195)&&(blank1_y == 295)) {
				currentselectedbutton = "red3";
				BlankButtonWorking(blank1);
			}
			else if((blank2_x == 345)&&(blank2_y == 295)) {
				currentselectedbutton = "red3";
				BlankButtonWorking(blank2);
			}
			else if((blank2_x == 195)&&(blank2_y == 295)) {
				currentselectedbutton = "red3";
				BlankButtonWorking(blank2);
			}
			else if((blank3_x == 345)&&(blank3_y == 295)) {
				currentselectedbutton = "red3";
				BlankButtonWorking(blank3);
			}
			else if((blank3_x == 195)&&(blank3_y == 295)) {
				currentselectedbutton = "red3";
				BlankButtonWorking(blank3);
			}
			else if((red2_x == 200)&&(red2_y == 100)){
				if((blank1_x == 45)&&(blank1_y == 95)) {
					currentselectedbutton = "red2";		
					BlankButtonWorking(blank1);
				}
				else if((blank2_x == 45)&&(blank2_y == 95)) {
					currentselectedbutton = "red2";		
					BlankButtonWorking(blank2);
				}
				else if((blank3_x == 45)&&(blank3_y == 95)) {
					currentselectedbutton = "red2";		
					BlankButtonWorking(blank3);
				}
			}
			else if((red1_x == 50)&&(red1_y == 300)){
				if((blank1_x == 45)&&(blank1_y == 495)) {
					currentselectedbutton = "red1";		
					BlankButtonWorking(blank1);
				}
				else if((blank2_x == 45)&&(blank2_y == 495)) {
					currentselectedbutton = "red1";		
					BlankButtonWorking(blank2);
				}
				else if((blank3_x == 45)&&(blank3_y == 495)) {
					currentselectedbutton = "red1";		
					BlankButtonWorking(blank3);
				}
			}
			
		}
		else if((reda>0)&&(redb==0)&&(redc>0)) {
			if((blank1_x == 345)&&(blank1_y == 95)) {
				currentselectedbutton = "red2";		
				BlankButtonWorking(blank1);
			}
			else if((blank2_x == 345)&&(blank2_y == 95)) {
				currentselectedbutton = "red2";		
				BlankButtonWorking(blank2);
			}
			else if((blank3_x == 345)&&(blank3_y == 95)) {
				currentselectedbutton = "red2";		
				BlankButtonWorking(blank3);
			}
			else if((blank1_x == 195)&&(blank1_y == 295)) {
				currentselectedbutton = "red2";		
				BlankButtonWorking(blank1);
			}
			else if((blank2_x == 195)&&(blank2_y == 295)) {
				currentselectedbutton = "red2";		
				BlankButtonWorking(blank2);
			}
			else if((blank3_x == 195)&&(blank3_y == 295)) {
				currentselectedbutton = "red2";		
				BlankButtonWorking(blank3);
			}
		}
		else if((reda>0)&&(redb>0)&&(redc==0)) {
			if((blank1_x == 345)&&(blank1_y == 295)) {
				currentselectedbutton = "red3";		
				BlankButtonWorking(blank1);
			}
			else if((blank2_x == 345)&&(blank2_y == 295)) {
				currentselectedbutton = "red3";		
				BlankButtonWorking(blank2);
			}
			else if((blank3_x == 345)&&(blank3_y == 295)) {
				currentselectedbutton = "red3";		
				BlankButtonWorking(blank3);
			}
		}
		else if((reda>0)&&(redb>0)&&(redc>0)) {
			if((red1_x == 50)&&(red1_y == 300)){
				if((blank1_x == 45)&&(blank1_y == 495)) {
					currentselectedbutton = "red1";		
					BlankButtonWorking(blank1);
				}
				else if((blank2_x == 45)&&(blank2_y == 495)) {
					currentselectedbutton = "red1";		
					BlankButtonWorking(blank2);
				}
				else if((blank3_x == 45)&&(blank3_y == 495)) {
					currentselectedbutton = "red1";		
					BlankButtonWorking(blank3);
				}
			}
		}
		
	

	}
	
	public boolean isMatchable(JButton needmatching, JButton match1, JButton match2, String checkingorder) {
	int needmatching_x = 0,needmatching_y=0,match1_x=0,match1_y=0,match2_x=0,match2_y=0;	
	if(needmatching == red1) {
		needmatching_x = red1_x;
		needmatching_y = red1_y;
	}
	else if(needmatching == red2) {
		needmatching_x = red2_x;
		needmatching_y = red2_y;
	}
	else if(needmatching == red3) {
		needmatching_x = red3_x;
		needmatching_y = red3_y;
	}
	
	if(match1 == red1) {
		match1_x = red1_x;
		match1_y = red1_y;
	}
	else if(match1 == red2) {
		match1_x = red2_x;
		match1_y = red2_y;
	}
	else if(match1 == red3) {
		match1_x = red3_x;
		match1_y = red3_y;
	}
	
	if(match2 == red1) {
		match2_x = red1_x;
		match2_y = red1_y;
	}
	else if(match2 == red2) {
		match2_x = red2_x;
		match2_y = red2_y;
	}
	else if(match2 == red3) {
		match2_x = red3_x;
		match2_y = red3_y;
	}
	
	
	if(checkingorder =="row") {
		if(match1_y == 100) {
			
			if(match1_x == 50) {
				if(match2_x == 200) {
					if(blank1_y == 95) {
						if((needmatching_y == 300)&&(needmatching_x == 200)) {
							return(true);
						}
						else if((needmatching_y == 300)&&(needmatching_x == 350)) {
							return(true);
						}
					}
					else if(blank2_y == 95) {
						if((needmatching_y == 300)&&(needmatching_x == 200)) {
							return(true);
						}
						else if((needmatching_y == 300)&&(needmatching_x == 350)) {
							return(true);
						}
					}
					else if(blank3_y == 95) {
						if((needmatching_y == 300)&&(needmatching_x == 200)) {
							return(true);
						}
						else if((needmatching_y == 300)&&(needmatching_x == 350)) {
							return(true);
						}
					}
				}
			}
			else if(match1_x == 50) {
				if(match2_x == 350) {
					if(blank1_y == 95) {
						if((needmatching_y == 300)&&(needmatching_x == 200)) {
							return(true);
						}
					}
					else if(blank2_y == 95) {
						if((needmatching_y == 300)&&(needmatching_x == 200)) {
							return(true);
						}
					}
					else if(blank3_y == 95) {
						if((needmatching_y == 300)&&(needmatching_x == 200)) {
							return(true);
						}
					}
				}
			}
			else if(match1_x == 200) {
				if(match2_x == 50) {
					if(blank1_y == 95) {
						if((needmatching_y == 300)&&(needmatching_x == 200)) {
							return(true);
						}
						else if((needmatching_y == 300)&&(needmatching_x == 350)) {
							return(true);
						}
					}
					else if(blank2_y == 95) {
						if((needmatching_y == 300)&&(needmatching_x == 200)) {
							return(true);
						}
						else if((needmatching_y == 300)&&(needmatching_x == 350)) {
							return(true);
						}
					}
					else if(blank3_y == 95) {
						if((needmatching_y == 300)&&(needmatching_x == 200)) {
							return(true);
						}
						else if((needmatching_y == 300)&&(needmatching_x == 350)) {
							return(true);
						}
					}
				}
			}
			else if(match1_x == 200) {
				if(match2_x == 350) {
					if(blank1_y == 95) {
						if((needmatching_y == 300)&&(needmatching_x == 200)) {
							return(true);
						}
						else if((needmatching_y == 300)&&(needmatching_x == 50)) {
							return(true);
						}
					}
					if(blank2_y == 95) {
						if((needmatching_y == 300)&&(needmatching_x == 200)) {
							return(true);
						}
						else if((needmatching_y == 300)&&(needmatching_x == 50)) {
							return(true);
						}
					}
					if(blank3_y == 95) {
						if((needmatching_y == 300)&&(needmatching_x == 200)) {
							return(true);
						}
						else if((needmatching_y == 300)&&(needmatching_x == 50)) {
							return(true);
						}
					}
				}
			}
			else if(match1_x == 350) {
				if(match2_x == 50) {
					if(blank1_y == 95) {
						if((needmatching_y == 300)&&(needmatching_x == 200)) {
							return(true);
						}
					}
					if(blank2_y == 95) {
						if((needmatching_y == 300)&&(needmatching_x == 200)) {
							return(true);
						}
					}
					if(blank3_y == 95) {
						if((needmatching_y == 300)&&(needmatching_x == 200)) {
							return(true);
						}
					}
				}
			}
			else if(match1_x == 350) {
				if(match2_x == 200) {
					if(blank1_y == 95) {
						if((needmatching_y == 300)&&(needmatching_x == 200)) {
							return(true);
						}
						else if((needmatching_y == 300)&&(needmatching_x == 50)) {
							return(true);
						}
					}
					if(blank2_y == 95) {
						if((needmatching_y == 300)&&(needmatching_x == 200)) {
							return(true);
						}
						else if((needmatching_y == 300)&&(needmatching_x == 50)) {
							return(true);
						}
					}
					if(blank3_y == 95) {
						if((needmatching_y == 300)&&(needmatching_x == 200)) {
							return(true);
						}
						else if((needmatching_y == 300)&&(needmatching_x == 50)) {
							return(true);
						}
					}
				}
			}
			
		
		}
	}
	
	return(false);
	}
	
	
	}
