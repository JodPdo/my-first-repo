import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculateView extends JFrame {
	private JLabel lbInput1 = new JLabel("Input 1 : ");
	private JTextField txInput1 = new JTextField(5);
	private JLabel lbInput2 = new JLabel("Input 2 : ");
	private JTextField txInput2 = new JTextField(5);
	private JButton btAdd = new JButton("Add");
	private JButton btDiff = new JButton("Subtract");
	private JButton btMul = new JButton("Multiply");
	private JLabel lbAnswer = new JLabel("Answer : ");
	private JTextField txAnswer = new JTextField(10);
	
	CalculateView()
	{
		JPanel cPanel = new JPanel();
		cPanel.setLayout(new GridLayout(4,1));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350, 200);
		this.setTitle("Calculate MVC");
		this.setLocationRelativeTo(null);
		
		JPanel rowPanel1 = new JPanel();
		rowPanel1.add(lbInput1);
		rowPanel1.add(txInput1);
		cPanel.add(rowPanel1);
		
		JPanel rowPanel2 = new JPanel();
		rowPanel2.add(lbInput2);
		rowPanel2.add(txInput2);
		cPanel.add(rowPanel2);
		
		JPanel rowPanel3 = new JPanel();
		rowPanel3.add(btAdd);
		rowPanel3.add(btDiff);
		rowPanel3.add(btMul);
		cPanel.add(rowPanel3);
		
		JPanel rowPanel4 = new JPanel();
		rowPanel4.add(lbAnswer);
		rowPanel4.add(txAnswer);
		cPanel.add(rowPanel4);
		this.add(cPanel);
	}
	
	public int getTxInput1()
	{
		return (Integer.parseInt(txInput1.getText()));
	}
	
	public int getTxInput2()
	{
		return (Integer.parseInt(txInput2.getText()));
	}
	
	public void setTxAnswer(int answer)
	{
		txAnswer.setText(Integer.toString(answer));
	}
	
	void MulActionListener(ActionListener actionPerformed)
	{
		btMul.addActionListener(actionPerformed);
	}
	
	void AddActionListener(ActionListener actionPerformed)
	{
		btAdd.addActionListener(actionPerformed);
	}
	
	void DiffActionListener(ActionListener actionPerformed)
	{
		btDiff.addActionListener(actionPerformed);
	}
	
	void showErrorMessage(String errorMessage)
	{
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}



























