package rmitest;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 
 * @author Derek
 * Defines the actual functions for the RMI.
 */
public class RMIDemoFunct extends UnicastRemoteObject implements RMIDemo 
{	
	/**
	 * Required for a Serializable Object
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Must provide a default constructor...
	 */
	protected RMIDemoFunct() throws RemoteException
	{
		super();
	}
	 
	@Override
	public double addNumbers( double x, double y ) throws RemoteException 
	{
		System.out.println("In RMIDemoServer");
		return x + y;
	}

}
