import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhoneDialer implements ActionListener {
	JFrame myFrame;
	JButton ZeroButton;
	JButton OneButton;
	JButton TwoButton;
	JButton ThreeButton;
	JButton FourButton;
	JButton FiveButton;
	JButton SixButton;
	JButton SevenButton;
	JButton EighteButton;
	JButton NineButton;
	JButton DashButton;
	JButton Dial_NumberButton;
	String phone = "";
	

	public static void main(String[] args) {
		new PhoneDialer();

	}

	public PhoneDialer() {
		myFrame = new JFrame();
		
		myFrame.setTitle("Dialer");
		myFrame.setSize(200, 250);
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		JPanel myPanel = (JPanel)myFrame.getContentPane(); 
	    myPanel.setLayout(new BoxLayout(myPanel,BoxLayout.Y_AXIS));
	    myPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	    
	    JPanel topPanel = new JPanel();
	    topPanel.setLayout(new FlowLayout());
	    JLabel myLabel = new JLabel("Enter the number to dial:");
	    topPanel.add(myLabel);
		
	    JPanel keys = new JPanel();
	    keys.setLayout(new GridLayout(4, 3, 5, 5));
	    keys.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	    
	    
		OneButton = new JButton("1");
		keys.add(OneButton);
		OneButton.addActionListener(this);
		TwoButton = new JButton("2");
		keys.add(TwoButton);
		TwoButton.addActionListener(this);
		ThreeButton = new JButton("3");
		keys.add(ThreeButton);
		ThreeButton.addActionListener(this);
		FourButton = new JButton("4");
		keys.add(FourButton);
		FourButton.addActionListener(this);
		FiveButton = new JButton("5");
		keys.add(FiveButton);
		FiveButton.addActionListener(this);
		SixButton = new JButton("6");
		keys.add(SixButton);
		SixButton.addActionListener(this);
		SevenButton = new JButton("7");
		keys.add(SevenButton);
		SevenButton.addActionListener(this);
		EighteButton = new JButton("8");
		keys.add(EighteButton);
		EighteButton.addActionListener(this);
		NineButton = new JButton("9");
		keys.add(NineButton);
		NineButton.addActionListener(this);
		DashButton = new JButton("-");
		keys.add(DashButton);
		DashButton.addActionListener(this);
		ZeroButton = new JButton("0");
		keys.add(ZeroButton);
		ZeroButton.addActionListener(this);
		Dial_NumberButton = new JButton("Dial Number");
		
		Dial_NumberButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		Dial_NumberButton.addActionListener(this);
		myPanel.add(topPanel);
		myPanel.add(keys);
		myPanel.add(Dial_NumberButton);
		
		
		
		myFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object contact = e.getSource();
		if (contact == Dial_NumberButton) {
			JOptionPane.showMessageDialog(myFrame,"Dialing: "+ phone);
			phone = "";
		}
		else if (contact == OneButton) {
			phone += "1";
		}
		else if (contact == TwoButton) {
			phone += "2";
		}
		else if (contact == ThreeButton) {
			phone += "3";
		}
		else if (contact == FourButton) {
			phone += "4";
		}
		else if (contact == FiveButton) {
			phone += "5";
		}
		else if (contact == SixButton) {
			phone += "6";
		}
		else if (contact == SevenButton) {
			phone += "7";
		}
		else if (contact == EighteButton) {
			phone += "8";
		}
		else if (contact == NineButton) {
			phone += "9";
		}
		else if (contact == DashButton) {
			phone += "-";
		}
		else if (contact == ZeroButton) {
			phone += "0";
		}
		
		
	}

}
