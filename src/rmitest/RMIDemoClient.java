package rmitest;

import java.rmi.Naming;

public class RMIDemoClient
{
	public static void main(String[] args) throws Exception 
	{
		if ( args.length == 2 )
		{
			String url = new String("rmi://localhost/RMIDemo");
			RMIDemo rmiDemo = (RMIDemo)Naming.lookup(url);
			double result = rmiDemo.addNumbers( Double.parseDouble(args[0]),
												Double.parseDouble( args[1] ) );
			
			System.out.println("Result is: " + result);
		}
		else
		{
			System.err.println("Usage: RMIDemoClient <x> <y>");
		}
	}
}
