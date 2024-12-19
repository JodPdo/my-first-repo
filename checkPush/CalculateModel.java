
public class CalculateModel {
	public int add;
	public int diff;
	public int Mul;
	
	public void MulNumber(int num1, int num2)
	{
		Mul = num1 * num2;
	}
	public int getMulNumber()
	{
		return Mul;
	}
	public void addNumber(int num1, int num2)
	{
		add = num1 + num2;
	}
	
	public int getAddNumber()
	{
		return add;
	}
	
	public void diffNumber(int num1, int num2)
	{
		diff = num1 - num2;
	}
	
	public int getDiffNumber()
	{
		return diff;
	}
	
}
