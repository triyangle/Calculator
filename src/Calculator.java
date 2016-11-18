/*




 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.border.*;

public class Calculator {

	public static void main(String[] args) {

		EventQueue.invokeLater( new Runnable ( )   // create a GUI thread that displays the Frame
		{
			public void run ( ) {
				JFrame frame = new AppFrame ( );
				frame.setVisible (true); // AppFrame now comes to life
			}
		} );

	}

}

class AppFrame extends JFrame {


	// Frame size might be defined here
	private final int WIDTH = 500 ;
	private final int HEIGHT = 300 ;

	private JTextField resultField = new JTextField(20);

	private JButton plusButton = new JButton("+");
	private JButton minusButton = new JButton("-");
	private JButton timesButton = new JButton("*");
	private JButton divideButton = new JButton("/");


	private JButton zeroButton = new JButton("0");
	private JButton oneButton = new JButton("1");
	private JButton twoButton = new JButton("2");
	private JButton threeButton = new JButton("3");
	private JButton fourButton = new JButton("4");
	private JButton fiveButton = new JButton("5");
	private JButton sixButton = new JButton("6");
	private JButton sevenButton = new JButton("7");
	private JButton eightButton = new JButton("8");
	private JButton nineButton = new JButton("9");

	public AppFrame() {


		// setting frame attributes ("look and feel")
		setTitle ("Calculator");

		setResizable(false);
		setSize(WIDTH, HEIGHT);
		// positioning the frame in the center of the screen
		setLocationRelativeTo (null);

		// setting frame behavior
		addWindowListener (new WindowAdapter ( )
		{
			public void windowClosing (WindowEvent e) {

				JOptionPane.showMessageDialog(null, "Thanks for using our Calculator application. See you again!", "Exit", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		}
				);


		add(resultField, BorderLayout.NORTH);


	}


}

