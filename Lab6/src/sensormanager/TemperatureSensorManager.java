package sensormanager;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import sensor.TemperatureSensor;

public class TemperatureSensorManager extends UnicastRemoteObject implements TemperatureSensor{

	public TemperatureSensorManager() throws RemoteException {
		super();
		
	}

	@Override
	public int getTemperature() throws RemoteException {
		
		return 35;
	}

	@Override
	public int getTemperature(String day) throws RemoteException {
		
		temperature currentTemperature = new temperature();
		return currentTemperature.getTemperature(day);
	}
	
	@Override
	public double getAverageTemperature() throws RemoteException {
		
		temperature averageTemperature = new temperature();
		return averageTemperature.getAverageTemperature();
		
	}

}
