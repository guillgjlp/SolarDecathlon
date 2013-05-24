
public class Main {

		public static void main(String[] args){
			Sensor o = new Sensor();
			o.addValueSensor(0,0,0);
			DBSensors dbSensors = new DBSensors();
			dbSensors.addSensor("192.168.0.2",o);
			dbSensors.getSensor("192.168.0.2").addValueSensor(10,0,0);
			dbSensors.getSensor("192.168.0.2").addValueSensor(11,0,0);
			int i=dbSensors.getSensor("192.168.0.2").getCurrentPosition();
			System.out.println(dbSensors.getSensor("192.168.0.2").getTemp(i));
			System.out.println(dbSensors.getSensor("192.168.0.2").getTemp(i-1));
		}
}