package clientserver;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import sensor.TemperatureSensor;
import sensormanager.TemperatureSensorManager;

public class TemperatureServerRMIApp {

	public static void main(String[] args){
		
		try {
			
			//create interface object
			TemperatureSensor sensorAyerKeroh = new TemperatureSensorManager();
			
			//get registry
			Registry rmiRegistry = LocateRegistry.getRegistry();
			
			//register interface object as remote object
			rmiRegistry.rebind("SensorAyerKeroh", sensorAyerKeroh);
			
			System.out.println("SensorAyerKeroh is successfully registered.");
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
