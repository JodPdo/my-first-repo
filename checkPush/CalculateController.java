import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateController {
	private CalculateModel cModel;
	private CalculateView cView;
	public void setModel(CalculateModel Model)
	{
		this.cModel = Model;
	}
	
	public void setView(CalculateView View)
	{
		this.cView = View;
		this.cView.AddActionListener(new AddListener());
		this.cView.DiffActionListener(new DiffListener());
		this.cView.MulActionListener(new MulListener());
	}
	
	class AddListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int input1 = 0;
			int input2 = 0;
			try 
			{
				input1 = cView.getTxInput1();
				input2 = cView.getTxInput2();
				cModel.addNumber(input1, input2);
				cView.setTxAnswer(cModel.getAddNumber());
			}catch(NumberFormatException ex)
			{
				System.out.println(ex);
				cView.showErrorMessage("Integer Only!");
			}
		}
	}
	
	class DiffListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int input1 = 0;
			int input2 = 0;
			try 
			{
				input1 = cView.getTxInput1();
				input2 = cView.getTxInput2();
				cModel.diffNumber(input1, input2);
				cView.setTxAnswer(cModel.getDiffNumber());
			}catch(NumberFormatException ex)
			{
				System.out.println(ex);
				cView.showErrorMessage("Integer Only!");
			}
		}
	}
	
	class MulListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int input1 = 0;
			int input2 = 0;
			try 
			{
				input1 = cView.getTxInput1();
				input2 = cView.getTxInput2();
				cModel.MulNumber(input1, input2);
				cView.setTxAnswer(cModel.getMulNumber());
			}catch(NumberFormatException ex)
			{
				System.out.println(ex);
				cView.showErrorMessage("Integer Only!");
			}
		}
	}
}
