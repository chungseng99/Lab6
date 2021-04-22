package sensor;

import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * This interface represents temperature sensor
 * @author Siew Chung Seng
 * 
 */

public interface TemperatureSensor extends Remote{
	
	public int getTemperature() throws RemoteException;
	
	public int getTemperature(String day) throws RemoteException;
	
	public double getAverageTemperature () throws RemoteException;
	
	

}
