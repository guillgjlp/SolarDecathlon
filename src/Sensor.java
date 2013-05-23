import java.util.*;
import java.text.SimpleDateFormat;

public class Sensor implements Observable {

    private ArrayList<Observator> tabObservator;
    private ArrayList<Date> tabDate;
    private ArrayList<Integer> tabTemp;
    private ArrayList<Integer> tabHum;
    private ArrayList<Integer> tabCov;
          
    public Sensor()        
    {  

    tabObservator = new ArrayList<Observator>();       
    tabTemp = new ArrayList<Integer>();
    tabHum = new ArrayList<Integer>();
    tabCov = new ArrayList<Integer>();
    tabDate = new ArrayList<Date>();
    
    }          
    
    public void addObservator(Observator o)      
  {               
    	tabObservator.add(o);         
    }                 
     
    public void removeObservator(Observator o)        
    {               
    	tabObservator.remove(o);                   
    }          
 
    public void notifObservators()         
    {                
    	for(int i=0;i<tabObservator.size();i++)            
    	{                       
    		Observator o = tabObservator.get(i);     
    		o.actualise(this);
    	}       
    } 
    public void addValueSensor(int temp, int hum, int cov)
    {
    	Date date = new Date();
    	SimpleDateFormat dateLongue = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    	tabTemp.add(temp);
    	tabHum.add(hum);
    	tabCov.add(cov);
    	tabDate.add(date);
    	//tabDate.add(dateLongue.format(date));
    	System.out.println(dateLongue.format(date)+" "+temp+" "+hum+" "+cov);
    }
    
    public int getCurrentPosition()
    {
    	return tabTemp.size()-1;
    }
    public Date getDate(int i)
    {
    	return tabDate.get(i);
    }
    public int getTemp(int i)
    {
    	return tabTemp.get(i);
    }
    public int getHum(int i)
    {
    	return tabHum.get(i);
    }
    public int getCov(int i)
    {
    	return tabCov.get(i);
    }

}

