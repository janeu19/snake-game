package game.altamash.snake;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Game_Final_Frame extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 6L;
	JButton exit;
	JLabel over,scoreFinal;
	Font f2;
	Game_Final_Frame()
	{
		setTitle(Game_Intro_Frame.titleValue);
		setSize(400,270);
		f2=new Font("Arial",Font.PLAIN,30);
		over=new JLabel("GAME OVER");
		over.setFont(f2);
		over.setBounds(103,30,200,40);
		scoreFinal=new JLabel("Your Score = "+Game_Screen.score);
		scoreFinal.setFont(f2);
		scoreFinal.setBounds(95,90,220,30);
		exit=new JButton("EXIT");
		exit.setBounds(150,150,100,40);
		exit.addActionListener(this);
		add(exit);
		add(over);
		add(scoreFinal);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==exit)
			System.exit(EXIT_ON_CLOSE);
	}
}