package Mathematique;

import java.io.IOException;

public class MainAuth {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		boolean test;
		test=false;
		do
		{
			try 
			{
				Authentification a=new Authentification();
				test=true;
			}
		    catch(WrongLoginException b)
			{
		    	System.out.println(b.getMessage());
		    }
		    catch(WrongInputLength c)
		    {
		    	System.exit(0);
		    }
		    catch(WrongPwdException d) 
		    {
		    	System.out.println(d.getMessage());
		    }
		    catch(IOException e)
		    {
		    	System.exit(0);
		    }
	    }while(test==false);
		
	}
}
