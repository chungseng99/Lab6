package clientserver;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import sensor.TemperatureSensor;

public class TemperatureClientRMIApp {

	public static void main(String[] args) {
		
		try {
			
			//get registry
			Registry rmiRegistry = LocateRegistry.getRegistry();
			
			//look up for the remote object
			TemperatureSensor remoteSensorAyerKeroh = (TemperatureSensor) rmiRegistry.lookup("SensorAyerKeroh");
			
			//invoke method from the remote object
			String day = "Monday";
			int currentTemperature = remoteSensorAyerKeroh.getTemperature();
			int currentDayTemperature = remoteSensorAyerKeroh.getTemperature(day);
			double averageTemperature = remoteSensorAyerKeroh.getAverageTemperature();
			
			
			System.out.println("Current temperature in Ayer Keroh is " + currentTemperature + " degree celcius");
			System.out.println("Temperature of " + day + " in Ayer Keroh is " + currentDayTemperature + " degree celcius");
			System.out.println("The average temperature in Ayer Keroh is " + averageTemperature + " degree celcius");
			
		} catch (RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
