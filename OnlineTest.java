import java.awt. *;
import java.awt. event.*;
import javax.swing.*;

class QuestionSeries{
static String info ="Java Online Test Week  \n \nINSTRUCTIONS:\nThere are 25 questions in this test and 10 minutes to complete them all.\nThe finish button is highlighted in blue when you reach the end of the test. \nClicking the finish button will display the results with the correct answers marked in light red.  \n \nThe timecounter  begins when you click on the 'start' button \n \nBest of luck!\n";

static String []question ={"Question 1:\nWhat is the result of attempting to compile and run the following program?\n\npublic class JavaAppclass{\npublic static void main(String args){\n   String myString = \"javaprograms\";\n   System.out.println(myString);\n   }\n}\n",
"Question 2:\nWhat is the result of attempting to compile and run the following program with \n\n>javac JavaApp.java\n>java JavaApp\n\nclass TryFirst{\n   String myString = \"javatest\";\n}\n\nclass JavaApp{\n\npublic static void main(String[] arg){\n System.out.println(new TryFirst().myString);\n}\n}\n",
"Question 3: \nWhat is the result of attempting to compile and run the following program with \n>javac JavaApp.java\n>java JavaApp\n\nclass MyJavaApp{ \n   String myString = \"elephants\"; \npublic static void main(String[] arg){ \n      System.out.println(myString); \n   } \n}\n",
"Question 4:\nWhat is the result?\n\nclass JavaApp{ \n  public static void main(String[] a){ \n    String textstr = \"hello\";\n    for (int i=4; i<5; i++)\n      System.out.println(str); \n  } \n}\n",
"Question 5:\nWhat is the result here?\n\nclass MyJavaApp{ \n  public static void main(String[] a){ \n    int j=0;\n    for (int i=0; i<3; i++) j=j+i;\n      System.out.println(j); \n  } \n}\n",
"Question 6:\nWhat is the result?\n\nclass MyJavaApp{ \n  public static void main(String[] a){ \n    int num1;\n    int num2 = 7;\n    num2= num1 * 2 +3;\n    System.out.println(num2); \n  } \n}\n",
"Question 7:\nWhat is the result?\n\nclass MyJavaApp{ \n  int num1;\n  public static void main(String[] a){ \n    number1=2;\n    int number2 = 7;\n    number2= number1 * 2 +3;\n    System.out.println(number2); \n  } \n}\n",
"Question 8:\nWhat is the result?\n\nclass JavaApp{ \n  static int number1 = 4;\n  public static void main(String[] a){ \n    number1=2;\n    int number2 = 7;\n    number2= number1 * 2 +3;\n    System.out.println(number2); \n  } \n}\n",
"Question 9:\nWhat is the result?\n\nclass JavaApp{ \n  static int number1 = 3;\n  public static void main(String[] arg)\n    int number2 = 7;\n    number2= number2 + number1 * 2 +3;\n    System.out.println(number2); \n  } \n}\n",
"Question 10:\nWhat is the result of compiling and running the following code?\n\nclass JavaApp{ \n  public static void main(String[] a){\n    int x = (int) (Math.random());\n    System.out.println(x); \n  } \n}\n",
"Question 11:\nWhat is the result?\n\nclass Tryclass{ \n  static String text = \"rabbit\";\n  public static void main(String[] a){\n    int num = text.length;\n    System.out.println(num); \n  } \n}\n",
"Question 12:\nWhat would be the result here?\n\nclass Myclass{ \n  public static void main(String[] a){\n    char []rabbit={'a','b','c','d'};\n    int num = rabbit.length;\n    System.out.println(num); \n  } \n}\n",
"Question 13:\nWhat is the result here?\n\nclass JavaApp{ \n  public static void main(String[] a){\n    int number = 10;\n    String mystr = Integer.toBinaryString(number);\n    System.out.println(mystr); \n  } \n}\n",
"Question 14:\nWhat would be the result if we were to run this program with\n>java MyJavaApp hello java world ?\n\nclass MyJavaApp{ \npublic static void main(String[] args){\n    System.out.println(args[1]); \n  } \n}\n",
"Question 15:\nWhat is the result of this program?\n\nclass MyJavaApp{ \n  public static void main(String[] a){\n    double d =1.75;\n    int i = d;\n    System.out.println(i++); \n  } \n}\n",
"Question 16:\nWhat is the result of this program?\n\nclass MyJavaApp{ \n  public static void main(String[] a){\n    int 1stNum = 5;\n    int 2ndNum = 3;\n    double d =1.25 +1stNum/2ndNum;\n    System.out.println(d); \n  } \n}\n",
"Question 17:\nWhat is the result of this program?\n\nclass MyJavaApp{ \n public static void main(String[] arg){\n    int Num1 = 5;\n    int Num2 = 4;\n    double d =1.25 +Num1/Num2;\n    System.out.println(d); \n  } \n}\n",
"Question 18:\nWhat is the result of this program?\n\nclass TryJavaApp{ \n  static float f;\n  public static void main(String[] ar){\n    int Number = 5;\n    f = 1.25;    \n    System.out.println(f*4); \n  } \n}\n",
"Question 19:\nWhat is the result of this program?\n\nclass JavaApp{ \n  static float f;\n  public static void main(String[] ar){\n    int Num = 2;\n    f = (float)1.25 * 2;    \n    System.out.println(f * Num); \n  } \n}\n",
"Question 20:\nWhat is the result of this program?\n\nclass HelloJavaApp{ \n public static void main(String[] ar){\n    byte num = 64;\n    num += num;\n    System.out.println(num); \n  } \n}\n",
"Question 21:\nWhat is the result of this program?\n\nclass JavaApp{ \n  public static void main(String[] a){\n  double d = 1.56789;\n    long num = Math.round(d);\n    System.out.println(num); \n  } \n}\n",
"Question 22:\nWhat is the result of this program?\n\nclass JavaApp{ \n  public static void main(String[] a){\n    double d = 1.56789;\n    int num = (int)Math.round(d * d);\n    System.out.println(num); \n  } \n}\n",
"Question 23:\nWhat is the result of this program?\n\nclass MyJavaApp{\npublic static void main(String[] arg){\n    double doub1 = 1.51;\n    int number1 = (int) (doub1 +0.5);\n    System.out.println(number1); \n    double doub2 = -1.51;\n    int number2 = (int) (doub2 +0.5);\n    System.out.println(number2); \n  } \n}\n",
"Question 24:\nWhat is the result of this program?\n\nclass TryApp{ \npublic static void main(String[] arg){\n    int num = 4;\n    num = (num + 4/2) % num+1;\n    System.out.println(num); \n  } \n}\n",
"Question 25:\nWhat is the result?\n\nclass MyApp{ \n  public static void main(String[] ar){\n    for(int i=0; i<3; i++)\n      for(int j=1; j<3; j++)\n        System.out.print(j+i+\",\"); \n  } \n}\n"
};


static String [][]answers ={{"It will not compile as the main method  String is not an array\n","It will compile but there will be a runtime error if we try to run it with:- \n>java JavaApp\n","The program is fine, but we will need another program to run it and get the output.\n","It will compile and run and output \"java\" to the screen\n"},{"It will not compile as you cannot have 2 java source files on the same page\n"," \nIt will output \"javatest","It will not compile as the String myString is not-static and it is being accessed from a static method\n"," \nIt compiles but there is no output at runtime\n"},{" \nFine - it will output elephants\n","Runtime error MyJavaApp is not public\n","Compiler error myString is a non-static variable being accessed in a static method\n","Compile error in the main() method\n"},{" \nIt will output hello\n","The out put will be  \nhello\nhello\n"," \nNo output the for loop needs a ' ; ' at the end\n"," \nCompilation error for loops have to start with a zero\n"},{" \n3\n"," \n6\n"," \n4\n"," \n2\n"},{" \n17\n"," \n5\n"," \n3\n","It won't compile\n"},{" \n14\n"," \n7\n"," \n17\n"," \nError.\n"},{" \n16\n"," \n14\n"," \n7\n"," \nError\n"},{" \n15\n"," \n23\n"," \n50\n"," \nError\n"},{" \n1\n"," \nYou cannot predict the random result\n"," \n0\n"," \nError\n"},{" \n6\n"," \n5\n"," \n0\n"," \nError\n"},{" \n4\n"," \n3\n"," \n0\n"," \nError\n"},{" \n00001010\n"," \n10\n"," \n1010\n"," \nError\n"},{"hello java world\n"," \nhello\n"," \njava\n"," \nworld\n"},{" \n1.75\n"," \n2\n"," \n3\n"," \nError\n"},{" \n3.25\n"," \n2.25\n"," \n2.2... and a very long number\n"," \nThe code will not compile\n"},{" \n2.5\n"," \n2.25\n"," \n2.2 ... -something and a very long number\n"," \nThe code will not compile\n"},{" \nError float f is not initialised\n"," \noutput: 5\n"," \noutput: 5.0\n"," \nError, this is not a valid way to initialise a float type variable\n"},{" \n4.0\n"," \n5\n"," \n5.0\n"," \nError, it will not compile\n"},{" \n128\n"," \n-128\n"," \n1\n"," \nError, number is out of range\n"},{" \n1\n"," \n2\n"," \n1.0\n"," \nError\n"},{"3. - and to 15 decimal places\n"," \n2\n"," \n3\n"," \nError\n"},{" 2 \n-2\n"," 1\n-2\n"," 2\n-1\n"," 1\n-1\n"},{" \n1\n"," \n3\n"," \n4\n"," \n6\n"},{"1,2,2,3,3,4\n","1,2,3,3,4,6\n","1,2,3,4\n"," \n0,1,1,2,2,3,3,4\n"} };

static int []n = {2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
static String []choice= {"23","2","3","1","1","4","4","3","4","3","4","1","3","3","4","4","2","4","3","2","2","3","3","2","1"};
static int tally = choice.length;
static String testtitle="Online Test";
static int timeLimit =10;
static int passMark = 15;
}

/* OnlineTest class */

public class OnlineTest extends JFrame{
    static String studentname ="";
    static int TOTAL=0;

	static {
	try{
	TOTAL = QuestionSeries.tally;		
	studentname = JOptionPane.showInputDialog("Enter your name: ");
	if(studentname.length() < 1) studentname = "Anonymous   ";
	else studentname = studentname.trim() + " ";
	}catch(NullPointerException e){ System.exit(0); }
	}	

    	int seconds, minutes;
    	int quesnum, itemCheck, mark; 
	final String TESTTITLE = QuestionSeries.testtitle;
    	final int TIMELIMIT = QuestionSeries.timeLimit;
    	final int PASS = QuestionSeries.passMark;
    	String []answers = new String[TOTAL];
	JButton []choice_button = new JButton[6];
	JTextArea answerboxes[] = new JTextArea[4];
	JCheckBox []boxes = new JCheckBox[4];
    	JTextPane pane = new JTextPane();
	JLabel student, choose, message, timecounter, testresult;
    	boolean start_test, check_answer, allowRestart, finishtest;
	Northwindow panelNorth = new Northwindow();
	Southwindow panelSouth = new Southwindow();
	Centerwindow panelCenter = new Centerwindow();

/*  OnlineTest Constructor */
	protected OnlineTest(){
        for (int i=0; i<TOTAL; i++) answers[i] ="";
		getContentPane().setLayout(new BorderLayout() );
		getContentPane().add("North", panelNorth);
		getContentPane().add("South", panelSouth);
		getContentPane().add("Center", panelCenter);
		int width = 0, height=0; 
	        if(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth()<799){width=640; 		height=460; }
	        else {width=720; height=540; }
		setSize(width,height);
		Dimension dim = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((dim.width-width)/2, (dim.height-height)/2);
	}
class Northwindow extends JPanel{

    public Northwindow(){
		setLayout(new GridLayout(2,2));
		setBackground(new Color(230, 230, 255));
		student = new JLabel("\t Welcome : "+studentname+" to the Online Java Test");
		student.setFont(new Font("",Font.BOLD,16) );
		message = new JLabel();
		message.setForeground(Color.blue);
		add(student);
		add(message);
		add(new JLabel("               ") );
		add(new JLabel("               ") );
        setBorder(BorderFactory.createEtchedBorder() );
	}
}


class Southwindow extends JPanel{
	public Southwindow(){
		String []key = {"","start:","next:","finish:","check next:","check previous:"};
			for(int i=0; i<choice_button.length; i++)
                   {
				choice_button[i] = new JButton(key[i]);
				choice_button[i].addActionListener(new ActionHandler() );
				if(i !=0)add(choice_button[i]);
			  }
        setBorder(BorderFactory.createEtchedBorder() );
	}
}


class Centerwindow extends JPanel{

	public Centerwindow(){
		setLayout(new GridLayout(1,2) );
		JScrollPane west = new JScrollPane(pane);       
		pane.setForeground(Color.red);	       
   		pane.setFont(new Font ("Times New Roman",1,16) );
		pane.setText(QuestionSeries.info);
		pane.setEditable(false);
		JPanel east = new JPanel();
		east.setLayout(new BorderLayout() );	
		JPanel northEast = new JPanel();
		northEast.setBackground(new Color(230, 230, 255) ); 
		east.add("North", northEast);
		JPanel westEast = new JPanel();
		westEast.setLayout(new GridLayout(6,1) );
		east.add("West", westEast);
		JPanel centerEast = new JPanel();
		centerEast.setLayout(new GridLayout(6,1) );
		centerEast.setBackground(new Color(255,252,200));
		east.add("Center", centerEast);       
			timecounter = new JLabel("     There are "+TOTAL+" questions in total");
			timecounter.setFont(new Font ("Times New Roman",Font.BOLD,16) );
			timecounter.setForeground(new Color(0,92,22) );
			northEast.add(timecounter);
			westEast.add(new JLabel(" "));
        String []boxs = {" A ", " B ", " C ", " D "};
			for(int i=0; i<boxes.length; i++) { 
				boxes[i] = new JCheckBox(boxs[i]);
				boxes[i].addItemListener(new ItemHandler() );
				westEast.add(boxes[i]);
			}
        westEast.add(new JLabel() );
		choose = new JLabel("    CHOOSE CORRECT ANSWERS");
		choose.setBorder(BorderFactory.createEtchedBorder() );
		centerEast.add(choose);
        JScrollPane panes[] = new JScrollPane[4];
			for(int i=0; i<answerboxes.length; i++){
				answerboxes[i] = new JTextArea();
			    answerboxes[i].setBorder(BorderFactory.createEtchedBorder() );
				answerboxes[i].setEditable(false);
				answerboxes[i].setBackground(Color.white);
				answerboxes[i].setFont(new Font("",0,12) );
	            answerboxes[i].setLineWrap(true);      
                answerboxes[i].setWrapStyleWord(true);
                panes[i] = new JScrollPane(answerboxes[i]);
			    centerEast.add(panes[i]);
			}
		if(TIMELIMIT >0)testresult = new JLabel(studentname+",   You have only : "+TIMELIMIT+" minutes to complete.");   
		else testresult = new JLabel("     There is no time limit for this test");
		testresult.setBorder(BorderFactory.createEtchedBorder() );
		centerEast.add(testresult);
	add(west);
	add(east);
	}
}

/**
**  ActionHandler class to handle all the action events from the buttons. 
**/

class ActionHandler implements ActionListener{

/* actionPerformed method */
	public void actionPerformed(ActionEvent evt){
	  String source = evt.getActionCommand();
		if(source.equals("start:")){
			choice_button[1].setVisible(false);
			start_test=true;
			allowRestart=true;
            if(TIMELIMIT >0)new Timer(); // inner Timer class 
			panelSouth.remove(choice_button[1]); //start
            displayquestion();            
        }
	if(start_test){
		if(source.equals("previous:"))  {            			
			recordanswer();
			quesnum--;
    		if(quesnum ==  -1) quesnum=TOTAL-1;
			checkteststatus();
            displayquestion(); 
		}
		if(source.equals("next:")) {
			recordanswer();
			quesnum++;            
			if(quesnum ==  TOTAL-1) finishtest=true;
			if(quesnum ==  TOTAL) quesnum=0;
            checkteststatus();
            displayquestion(); 
		}
		if(source.equals("finish:")) {
			if (finishtest){
				recordanswer();
				quesnum = 0;

				choice_button[4].setBackground(Color.lightGray);
				timecounter.setForeground(Color.blue);
				timecounter.setFont(new Font ("Arial",0,14) );
				start_test=false; 
				check_answer=true;
				panelSouth.add(choice_button[0]);
				mark_ques();
				displayquestion();
				checkteststatus();
				calculateResult();
			}
			else  JOptionPane.showMessageDialog(null,"Cycle through all questions before pressing finish",
																 "User Message",JOptionPane.INFORMATION_MESSAGE);
		}
	} 

	if (check_answer){
		if(source.equals("check next:")) {
			quesnum++;
			if(quesnum ==  TOTAL) quesnum=0;
			mark_ques();
			displayquestion();
			checkteststatus();
		}
		if(source.equals("check previous:")) {
			quesnum--;
			if(quesnum ==  -1) quesnum=TOTAL-1;
			mark_ques();
			displayquestion();
			checkteststatus();
		}
	}
	validate();        
	}

class Timer extends Thread implements Runnable{
	public Timer(){
		new Thread(this).start();
	}

    public void run() {
		while(start_test){
            try {
               Thread.sleep(1000);
               seconds++;
				if(seconds % 60 == 0 && seconds != 0){
                    seconds -= 60;
                    minutes++;
				}
				timecounter.setText("    Time Counter:  "+minutes+" mins : "+seconds+" secs ");
				if(minutes==TIMELIMIT){
					start_test=false;
					endTest();
                }
		    }
            catch(InterruptedException ex)  { System.out.print(ex); }
		}
    }
}

		public void checkteststatus(){
		if((quesnum ==  TOTAL-1)&&(start_test))choice_button[3].setBackground(Color.green);
		else choice_button[4].setBackground(Color.lightGray);
      	  if(answers[quesnum].length() >0){ 
			for(int i=0; i<answers[quesnum].length(); i++)
			boxes[Integer.parseInt(answers[quesnum].substring(i,i+1) )-1].setSelected			(true);
		}
		else for(int i=0; i<boxes.length; i++)boxes[i].setSelected(false);
		}


	public void displayquestion(){
        int j = quesnum+1;
		pane.setText(QuestionSeries.question[quesnum]);
		if(start_test)message.setText("Question "+j+" out of "+TOTAL);
        for (int i=0; i<4; i++)answerboxes[i].setText(QuestionSeries.answers[quesnum][i]);
		if(start_test){
            String temp="";
			if(QuestionSeries.n[quesnum]==1) temp="<html>&nbsp;&nbsp;&nbsp;Choose only 		<b>ONE</b>  Option</html>";
			else if(QuestionSeries.n[quesnum]==2) temp="<html>&nbsp;&nbsp;Choose <b>TWO		</b> Options</html>";
		else if(QuestionSeries.n[quesnum]==3) temp="<html>&nbsp;&nbsp;Choose <b>THREE</b> 		Options</html>";
            else temp="<html>&nbsp;&nbsp;<b>ALL are true</b> true</html>";
		choose.setText(temp);
		}
		else {
		timecounter.setText("    Your choices are shown in the boxes");
            choose.setText("    Correct answers are marked in light red.");
		}
	}

	public void recordanswer(){
		String tmp = "";
		for(int i=0; i<boxes.length; i++) if(boxes[i].isSelected() ) tmp +=i+1;
        answers[quesnum] = tmp;
    }

	public void endTest(){
		message.setText("TIME OVER: please press 'finish'");
        choice_button[2].setEnabled(false); 
        choice_button[3].setEnabled(false); 
        choice_button[4].setEnabled(true); 
	}


	public void mark_ques(){
		for(int i=0; i<answerboxes.length; i++) answerboxes[i].setBackground(Color.white);
		for(int i=0; i<QuestionSeries.choice[quesnum].length(); i++)
			answerboxes[Integer.parseInt(QuestionSeries.choice[quesnum].substring(i,i+1))-1].setBackground(Color.red);
		if(QuestionSeries.choice[quesnum].equals(answers[quesnum])) message.setText("Answer correct, well done!");
		else message.setText("Sorry, you got this one wrong.");
	}


	public void calculateResult(){
		mark=0;
		double temp=0.0;
        java.text.DecimalFormat df = new java.text.DecimalFormat("#0.#");
		for(int i=0; i<TOTAL; i++)if(QuestionSeries.choice[i].equals(answers[i]))mark++;
		temp=(double)mark;
		if(temp/TOTAL*100 >=PASS) testresult.setText("  Well done "+studentname.substring(0,studentname.indexOf(' ') )+", you passed");
		else testresult.setText("  Better luck next time "+studentname.substring(0,studentname.indexOf(' ') ) );
		student.setText(" Final score for "+studentname+":  "+mark+" out of "+TOTAL+":  "+df.format(temp/TOTAL*100)+"%");
		new Resultwindow().show();
	}
}


class Resultwindow extends JFrame{
		Resultwindow() {
      	super( studentname+" results: " +(mark*100/TOTAL >=PASS?"PASS":"FAIL") );
  		Container cont = getContentPane();
		cont.setLayout(new GridLayout(TOTAL/2+3,5,2,5) );
		cont.setBackground(new Color(255,220,255) );
		cont.add(new JLabel("  "+"Marks:    "+mark+"/"+TOTAL+": "+"Percentage:  "+(mark*100/TOTAL)+"%") );
           for(int i=0; i<3; i++)cont.add(new JLabel() );
      	  String temp[] = new String[TOTAL];
			for(int i=0; i<TOTAL; i++){
				if(QuestionSeries.choice[i].equals(answers[i])) temp[i]="correct";
				else temp[i]="wrong";
			}
			for(int i=0; i<TOTAL; i++) cont.add(new JLabel("  Question "+(i+1)+":  "+temp		[i]) );
		pack();
		setLocation(200,200);
	}
}

class ItemHandler implements ItemListener{
	public void itemStateChanged(ItemEvent evt){
	  if(start_test){
		for(int i=0; i<boxes.length; i++) if(boxes[i].isSelected() ) itemCheck++; 
		if(itemCheck > QuestionSeries.n[quesnum]){
			java.awt.Toolkit.getDefaultToolkit().beep();
            if(QuestionSeries.n[quesnum]==1)	JOptionPane.showMessageDialog(null,"<html><font 		size='4' color='00308a'><center>"+
      	"There is only "+QuestionSeries.n[quesnum]+" possible<br> answer to question "+(quesnum+1)+
                    "<html>","User Information Message",JOptionPane.INFORMATION_MESSAGE);
			else JOptionPane.showMessageDialog(null,"<html><font size='4' color='00308a'><center>"+
                    "There are only "+QuestionSeries.n[quesnum]+" possible<br> answers to question "+(quesnum+1)+
                    "<html>","User Information Message",JOptionPane.INFORMATION_MESSAGE);
		}
		itemCheck=0;
	  }	  
	}
}

	public static void main(String [] args){
		OnlineTest frame = new OnlineTest();
		frame.setTitle("    "+QuestionSeries.testtitle);
		frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
		frame.setVisible(true);
    }
}
/*<applet code="OnlineTest" width=500 height=300>
</applet>*/
