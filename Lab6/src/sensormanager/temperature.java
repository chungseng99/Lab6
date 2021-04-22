package sensormanager;

import java.util.HashMap;

public class temperature {
	
	//create hash map
	HashMap<String, Integer> weeklytemperature = new HashMap<>();
	
	public temperature() {
		
		
		weeklytemperature.put("Monday", 32);
		weeklytemperature.put("Tuesday", 31);
		weeklytemperature.put("Wednesday", 33);
		weeklytemperature.put("Thursday", 35);
		weeklytemperature.put("Friday", 36);
		weeklytemperature.put("Saturday", 33);
		weeklytemperature.put("Sunday", 33);
				

	}
	
	public int getTemperature(String day) {
				
		return weeklytemperature.get(day);
		
		
	}
	
	public double getAverageTemperature() {
		
		int totalTemperature = 0 ;
		
		for(int value:weeklytemperature.values()) {
						
			totalTemperature += value;
						
		}
		
		double averageTemperature = totalTemperature/7;
		return averageTemperature;
		
	}

}
