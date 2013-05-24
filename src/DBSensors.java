import java.util.*;

public class DBSensors {
	HashMap<String,Sensor> h;

	public DBSensors()
	{
		h = new HashMap<String,Sensor>();
	}
	
	public void addSensor(String address, Sensor sensor)
	{
		h.put(address, sensor); 

	}
	public Sensor getSensor(String address)
	{
		return h.get(address);
	}
	
	public void removeSensor(String address)
	{
		h.remove(address);
	}

}
