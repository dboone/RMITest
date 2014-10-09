package rmitest;

import java.rmi.Naming;

public class RMIDemoServer
{
	public static void main(String[] args) throws Exception 
	{
		RMIDemoFunct rmiFunctions = new RMIDemoFunct();
		Naming.rebind("RMIDemo", rmiFunctions);
		System.out.println("RMIDemo object bound to the name RMIDemo and is ready for use.");
	}
}
