
public class CalculateMain {
	public static void main(String [] args)
	{
		CalculateModel cModel = new CalculateModel();
		CalculateView cView = new CalculateView();
		CalculateController cController = new CalculateController();
		cController .setModel(cModel);
		cController .setView(cView);
		cView.setVisible(true);
	}
}
