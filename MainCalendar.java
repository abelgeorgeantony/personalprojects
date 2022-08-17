import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class MainCalendar implements ActionListener{
	JFrame Frame;
	JTable DateTable;
	JTextField YearText;
	JScrollPane Scroll;
	JPanel Panel;
	JLabel Entertheyear,Year,Month;
	BasicArrowButton LeftArrowButton, RightArrowButton;
	JButton Submit;
	DefaultTableModel model;
	String YearString="0",Currentmonth;
	String[][] date;
	int[][] dateint;
	boolean Leap=false;
	int StartdayNum,YearInt;
	
	
	String[] weekNames = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
	
	MainCalendar()
	{
		
		Frame = new JFrame();
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setTitle("Calendar");
		Frame.setSize(800, 800);
		Frame.setVisible(true);
		Frame.setLocation(200, 10);
		
		date = new String[][]{
			{"","","","","","",""},
			{"","","","","","",""},
			{"","","","","","",""},
			{"","","","","","",""},
			{"","","","","","",""},
			{"","","","","","",""},
		};
		
		Font font1 = new Font("Serif", Font.CENTER_BASELINE, 20);
		Font font2 = new Font("Serif", Font.CENTER_BASELINE, 22);
		Font font3 = new Font("Serif", Font.CENTER_BASELINE, 50);
		
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER );
		
        LeftArrowButton = new BasicArrowButton(BasicArrowButton.WEST, null, null, Color.BLACK, null);
        LeftArrowButton.setBounds(270, 112, 50, 50);
        LeftArrowButton.addActionListener(this);
        
        RightArrowButton = new BasicArrowButton(BasicArrowButton.EAST, null, null, Color.BLACK, null);
        RightArrowButton.setBounds(470, 112, 50, 50);
        RightArrowButton.addActionListener(this);
		
        Submit =new JButton("SUBMIT");
        Submit.setBounds(50, 70, 100, 30);
        Submit.setBackground(Color.LIGHT_GRAY);
        Submit.addActionListener(this);
        
		DateTable = new JTable();
		DateTable.setRowHeight(66);
		DateTable.setEnabled(false);
		DateTable.setDefaultRenderer(Object.class, centerRenderer);
		DateTable.setFont(font3);
		model = (DefaultTableModel) DateTable.getModel();
		model.setDataVector(date,weekNames);
		
		Scroll = new JScrollPane(DateTable);
		Scroll.setBounds(100, 200, 600, 419);
		
		Entertheyear = new JLabel("Enter Year");
	    Entertheyear.setBounds(48, 11, 110, 30);
	    Entertheyear.setFont(font2);
		
		YearText = new JTextField();
		YearText.setFont(font1);
		YearText.setHorizontalAlignment(JTextField.CENTER);
		YearText.setBounds(50, 37, 100, 30);
	    YearText.setBackground(Color.WHITE);
		YearText.setForeground(Color.BLACK);
		YearText.addActionListener(this);
		
		Year = new JLabel("YEAR");
		Year.setBounds(355, 70, 80, 30);
		Year.setBackground(Color.gray);
		Year.setOpaque(true);
		Year.setHorizontalAlignment(SwingConstants.CENTER);
		Year.setForeground(Color.WHITE);
		Year.setFont(font2);
		
		Month = new JLabel("MONTH");
		Month.setBounds(325, 120, 140, 30);
		Month.setBackground(Color.gray);
		Month.setOpaque(true);
		Month.setHorizontalAlignment(SwingConstants.CENTER);
		Month.setForeground(Color.WHITE);
		Month.setFont(font2);
		
		Panel = new JPanel();
		Panel.setLayout(null);
		Panel.add(Year);
		Panel.add(Month);
		Panel.add(YearText);
		Panel.add(Entertheyear);
		Panel.add(Scroll);
		Panel.add(LeftArrowButton);
		Panel.add(RightArrowButton);
		Panel.add(Submit);
		
		Frame.add(Panel);
		
	}

	public static void main(String[] args)
	{
		new MainCalendar();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==Submit) {
			YearString = YearText.getText();
			YearInt = Integer.parseInt(YearString);
			StartdayNum=startdaycalc(YearInt);
			date=MonthDays31(StartdayNum);
			Year.setText(YearInt+"");
			model.setDataVector(date, weekNames);
			Month.setText("JANUARY");
			YearText.setText("");
		}
        if(e.getSource()==RightArrowButton) {
           
			Currentmonth=Month.getText();
			
			if(Currentmonth=="JANUARY") {
				Leap=leapyearcheck(YearInt);
				StartdayNum=startdayconvofrom31(StartdayNum);
				if(Leap==true) {
					date=MonthDays29(StartdayNum);
					model.setDataVector(date, weekNames);
					Month.setText("FEBRUARY");
				}
				else if(Leap==false) {
					date=MonthDays28(StartdayNum);
					model.setDataVector(date, weekNames);
					Month.setText("FEBRUARY");
				}
			}
			else if(Currentmonth=="FEBRUARY") {
				Leap=leapyearcheck(YearInt);
				if(Leap==true) {
					StartdayNum=startdayconvofrom29(StartdayNum);
				}
				else if(Leap==false) {
					StartdayNum=startdayconvofrom28(StartdayNum);
				}
				date=MonthDays31(StartdayNum);
				model.setDataVector(date, weekNames);
				Month.setText("MARCH");
			}
			else if(Currentmonth=="MARCH") {
				StartdayNum=startdayconvofrom31(StartdayNum);
				date=MonthDays30(StartdayNum);
				model.setDataVector(date, weekNames);
				Month.setText("APRIL");
			}
			else if(Currentmonth=="APRIL") {
				StartdayNum=startdayconvofrom30(StartdayNum);
				date=MonthDays31(StartdayNum);
				model.setDataVector(date, weekNames);
				Month.setText("MAY");
			}
			else if(Currentmonth=="MAY") {
				StartdayNum=startdayconvofrom31(StartdayNum);
				date=MonthDays30(StartdayNum);
				model.setDataVector(date, weekNames);
				Month.setText("JUNE");
			}
			else if(Currentmonth=="JUNE") {
				StartdayNum=startdayconvofrom30(StartdayNum);
				date=MonthDays31(StartdayNum);
				model.setDataVector(date, weekNames);
				Month.setText("JULY");
			}
			else if(Currentmonth=="JULY") {
				StartdayNum=startdayconvofrom31(StartdayNum);
				date=MonthDays31(StartdayNum);
				model.setDataVector(date, weekNames);
				Month.setText("AUGUST");
			}
			else if(Currentmonth=="AUGUST") {
				StartdayNum=startdayconvofrom31(StartdayNum);
				date=MonthDays30(StartdayNum);
				model.setDataVector(date, weekNames);
				Month.setText("SEPTEMBER");
			}
			else if(Currentmonth=="SEPTEMBER") {
				StartdayNum=startdayconvofrom30(StartdayNum);
				date=MonthDays31(StartdayNum);
				model.setDataVector(date, weekNames);
				Month.setText("OCTOBER");
			}
			else if(Currentmonth=="OCTOBER") {
				StartdayNum=startdayconvofrom31(StartdayNum);
				date=MonthDays30(StartdayNum);
				model.setDataVector(date, weekNames);
				Month.setText("NOVEMBER");
			}
			else if(Currentmonth=="NOVEMBER") {
				StartdayNum=startdayconvofrom30(StartdayNum);
				date=MonthDays31(StartdayNum);
				model.setDataVector(date, weekNames);
				Month.setText("DECEMBER");
			}
			else if(Currentmonth=="DECEMBER") {
				StartdayNum=startdayconvofrom31(StartdayNum);
				date=MonthDays31(StartdayNum);
				model.setDataVector(date, weekNames);
				YearInt=YearInt+1;
				Year.setText(YearInt+"");
				Month.setText("JANUARY");
			}
			
		}
		
		if(e.getSource()==LeftArrowButton) {
			Currentmonth=Month.getText();
			
			if(Currentmonth=="JANUARY") {
				StartdayNum=startdayconvoto31(StartdayNum);
				date=MonthDays31(StartdayNum);
				model.setDataVector(date, weekNames);
				YearInt=YearInt-1;
				Year.setText(YearInt+"");
				Month.setText("DECEMBER");
			}
			else if(Currentmonth=="DECEMBER") {
				StartdayNum=startdayconvoto30(StartdayNum);
				date=MonthDays30(StartdayNum);
				model.setDataVector(date, weekNames);
				Year.setText(YearInt+"");
				Month.setText("NOVEMBER");
			}
			else if(Currentmonth=="NOVEMBER") {
				StartdayNum=startdayconvoto31(StartdayNum);
				date=MonthDays31(StartdayNum);
				model.setDataVector(date, weekNames);
				Year.setText(YearInt+"");
				Month.setText("OCTOBER");
			}
			else if(Currentmonth=="OCTOBER") {
				StartdayNum=startdayconvoto30(StartdayNum);
				date=MonthDays30(StartdayNum);
				model.setDataVector(date, weekNames);
				Year.setText(YearInt+"");
				Month.setText("SEPTEMBER");
			}
			else if(Currentmonth=="SEPTEMBER") {
				StartdayNum=startdayconvoto31(StartdayNum);
				date=MonthDays31(StartdayNum);
				model.setDataVector(date, weekNames);
				Year.setText(YearInt+"");
				Month.setText("AUGUST");
			}
			else if(Currentmonth=="AUGUST") {
				StartdayNum=startdayconvoto31(StartdayNum);
				date=MonthDays31(StartdayNum);
				model.setDataVector(date, weekNames);
				Year.setText(YearInt+"");
				Month.setText("JULY");
			}
			else if(Currentmonth=="JULY") {
				StartdayNum=startdayconvoto30(StartdayNum);
				date=MonthDays30(StartdayNum);
				model.setDataVector(date, weekNames);
				Year.setText(YearInt+"");
				Month.setText("JUNE");
			}
			else if(Currentmonth=="JUNE") {
				StartdayNum=startdayconvoto31(StartdayNum);
				date=MonthDays31(StartdayNum);
				model.setDataVector(date, weekNames);
				Year.setText(YearInt+"");
				Month.setText("MAY");
			}
			else if(Currentmonth=="MAY") {
				StartdayNum=startdayconvoto30(StartdayNum);
				date=MonthDays30(StartdayNum);
				model.setDataVector(date, weekNames);
				Year.setText(YearInt+"");
				Month.setText("APRIL");
			}
			else if(Currentmonth=="APRIL") {
				StartdayNum=startdayconvoto31(StartdayNum);
				date=MonthDays31(StartdayNum);
				model.setDataVector(date, weekNames);
				Year.setText(YearInt+"");
				Month.setText("MARCH");
			}
			else if(Currentmonth=="MARCH") {
				Leap=leapyearcheck(YearInt);
				
				if(Leap==true) {
					StartdayNum=startdayconvoto29(StartdayNum);
					date=MonthDays29(StartdayNum);
					model.setDataVector(date, weekNames);
					Month.setText("FEBRUARY");
				}
				else if(Leap==false) {
					StartdayNum=startdayconvoto28(StartdayNum);
					date=MonthDays28(StartdayNum);
					model.setDataVector(date, weekNames);
					Month.setText("FEBRUARY");
				}
		   }
		
		   else if(Currentmonth=="FEBRUARY") {
			   StartdayNum=startdayconvoto31(StartdayNum);
				date=MonthDays31(StartdayNum);
				model.setDataVector(date, weekNames);
				Year.setText(YearInt+"");
				Month.setText("JANUARY");
		   }
	  }
	}
	
	
    public int startdayconvofrom31(int startingday) {
		 int StartdayNumber=0;
	if(startingday<4) {
		StartdayNumber=startingday+3;
	}
	else if(startingday==4) {
		StartdayNumber=0;
	}
	else if(startingday==5) {
		StartdayNumber=1;
	}
	else if(startingday==6) {
		StartdayNumber=2;
	}
	return (StartdayNumber);
	 }
	
    public int startdayconvofrom30(int startingday) {
		 int StartdayNumber=0;
	if(startingday<5) {
		StartdayNumber=startingday+2;
	}
	else if(startingday==5) {
		StartdayNumber=0;
	}
	else if(startingday==6) {
		StartdayNumber=1;
	}
	
	return (StartdayNumber);
	 } 
    
    public int startdayconvofrom29(int startingday) {
		 int StartdayNumber=0;
	if(startingday<6) {
		StartdayNumber=startingday+1;
	}
	else if(startingday==6) {
		StartdayNumber=0;
	}

	return (StartdayNumber);
	 } 
    
    public int startdayconvofrom28(int startingday) {
		 int StartdayNumber=startingday;
	return (StartdayNumber);
	 } 
    
    public int startdayconvoto31(int startingday) {
		 int StartdayNumber=0;
	if(startingday>2) {
		StartdayNumber=startingday-3;
	}
	else if(startingday==2) {
		StartdayNumber=6;
	}
	else if(startingday==1) {
		StartdayNumber=5;
	}
	else if(startingday==0) {
		StartdayNumber=4;
	}
	
	return (StartdayNumber);
	 }
	
   public int startdayconvoto30(int startingday) {
		 int StartdayNumber=0;
	if(startingday>1) {
		StartdayNumber=startingday-2;
	}
	else if(startingday==1) {
		StartdayNumber=6;
	}
	else if(startingday==0) {
		StartdayNumber=5;
	}
	
	return (StartdayNumber);
	 } 
   
   public int startdayconvoto29(int startingday) {
		 int StartdayNumber=0;
	if(startingday>0) {
		StartdayNumber=startingday-1;
	}
	else if(startingday==0) {
		StartdayNumber=6;
	}

	return (StartdayNumber);
	 } 
   
   public int startdayconvoto28(int startingday) {
		 int StartdayNumber=startingday;
	return (StartdayNumber);
	 } 
 
    
    
	public int startdaycalc(int Yeear) {
		
		int i,a,s,d,p=0,u=0,k,j,leapdays,normdays;
		int totdays,startday;
		
		for(i=0;i<Yeear;i++) {
			a=i%4;
			s=i%100;
			
			if(s==0) {
				d=i%400;
				  if(d==0) {
					  p++;
				  }
			}
			else if(a==0) {
				u++;
			}
		}
		
		k=u+p;
		j=Yeear-k;
		leapdays=k*366;
		normdays=j*365;
		totdays=leapdays+normdays;
		
		startday=totdays%7;
		
		return (startday);
		
	}
	
	public boolean leapyearcheck(int Yeeaar) {
		boolean leap = false;
		int checkby4,checkby100;
		
		checkby4=(Yeeaar%4);
		checkby100=(Yeeaar%100);
		
		 if (checkby4 == 0) {
	          leap = true;
	           
	            if (checkby100 == 0) {
	                if (Yeeaar % 400 == 0)
	                   leap = true;
	                else
	                   leap = false;
	            }
		   }
	        else 
	            leap = false;
		return leap;
		
	}
	
	public String[][] MonthDays31(int Startingday){
		int j,i,datecount=0;
		for(i=0;i<6;i++) {
			for(j=0;j<7;j++) {
				if(Startingday==0) {
					if(((i==0)&&(j<6))||(datecount>=31)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<32)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				else if(Startingday==6) {
					if(((i==0)&&(j<5))||(datecount>=31)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<32)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==5) {
					if(((i==0)&&(j<4))||(datecount>=31)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<32)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==4) {
					if(((i==0)&&(j<3))||(datecount>=31)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<32)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==3) {
					if(((i==0)&&(j<2))||(datecount>=31)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<32)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==2) {
					if(((i==0)&&(j<1))||(datecount>=31)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<32)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==1) {
					if(datecount>=31) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<32)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
			}
		}
		return date;
	}
	public String[][] MonthDays30(int Startingday){
		int j,i,datecount=0;
		for(i=0;i<6;i++) {
			for(j=0;j<7;j++) {
				if(Startingday==0) {
					if(((i==0)&&(j<6))||(datecount>=30)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<31)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				else if(Startingday==6) {
					if(((i==0)&&(j<5))||(datecount>=30)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<31)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==5) {
					if(((i==0)&&(j<4))||(datecount>=30)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<31)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==4) {
					if(((i==0)&&(j<3))||(datecount>=30)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<31)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==3) {
					if(((i==0)&&(j<2))||(datecount>=30)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<31)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==2) {
					if(((i==0)&&(j<1))||(datecount>=30)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<31)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==1) {
					if(datecount>=30) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<31)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
			}
		}
		return date;
	}
	public String[][] MonthDays29(int Startingday){
		int j,i,datecount=0;
		for(i=0;i<6;i++) {
			for(j=0;j<7;j++) {
				if(Startingday==0) {
					if(((i==0)&&(j<6))||(datecount>=29)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<30)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				else if(Startingday==6) {
					if(((i==0)&&(j<5))||(datecount>=29)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<30)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==5) {
					if(((i==0)&&(j<4))||(datecount>=29)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<30)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==4) {
					if(((i==0)&&(j<3))||(datecount>=29)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<30)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==3) {
					if(((i==0)&&(j<2))||(datecount>=29)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<30)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==2) {
					if(((i==0)&&(j<1))||(datecount>=29)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<30)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==1) {
					if(datecount>=29) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<30)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
			}
		}
		return date;
	}
	public String[][] MonthDays28(int Startingday){
		int j,i,datecount=0;
		for(i=0;i<6;i++) {
			for(j=0;j<7;j++) {
				if(Startingday==0) {
					if(((i==0)&&(j<6))||(datecount>=28)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<29)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				else if(Startingday==6) {
					if(((i==0)&&(j<5))||(datecount>=28)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<29)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==5) {
					if(((i==0)&&(j<4))||(datecount>=28)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<29)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==4) {
					if(((i==0)&&(j<3))||(datecount>=28)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<29)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==3) {
					if(((i==0)&&(j<2))||(datecount>=28)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<29)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==2) {
					if(((i==0)&&(j<1))||(datecount>=28)) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<29)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
				
				else if(Startingday==1) {
					if(datecount>=28) {
						date[i][j] ="";
					}
					else if((i>=0)&&(j>=0)&&(datecount<29)) {
						datecount++;
						date[i][j] = (datecount+"");
					}
				}
			}
		}
		return date;
	}	
}
