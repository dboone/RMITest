package rmitest;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 
 * @author Derek
 * Here we defined the interface that the client and server 
 * will have to implement. Thus, we list the prototypes of
 * all functions that will be remotely invoked.
 */
public interface RMIDemo extends Remote 
{
	public double addNumbers( double x, double y ) throws RemoteException;
}
