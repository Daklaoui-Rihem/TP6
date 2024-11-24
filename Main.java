package Mathematique;

public class Main {

	public static void main(String[] args) throws NegatifException {
		// TODO Auto-generated method stub
		try 
		{
			double x=Double.parseDouble(args[0]);
			double n=Double.parseDouble(args[1]);
			if(n==0)
			{
				throw new ArithmeticException("Mata9samch 3ala 0");
			}
			if(x<0)
			{
				throw new NegatifException("Mat7otech negative");
			}
			System.out.println(Mathematique.f(n,x));
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Ekteb nwamer");
		}
		catch(NumberFormatException b)
		{
			System.out.println("Yadi nwamer moch 7ourouf");
		}
		catch(ArithmeticException c)
		{
			System.out.println(c.getMessage());
		}
		catch(NegatifException d)
		{
			System.out.println(d.getMessage());
		}
	}

}
