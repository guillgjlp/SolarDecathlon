import java.util.*;
import java.text.SimpleDateFormat;

public class Sensor implements Observable {

    private ArrayList<Observator> tabObservator;
    private ArrayList<Date> tabDate;
    private ArrayList<Integer> tabTemp;
    private ArrayList<Integer> tabHum;
    private ArrayList<Integer> tabCov;
    private int sizeArrayList;
    private int currentPosition;
          
    public Sensor()        
    {  
    	sizeArrayList=1000;	
    	currentPosition=-1; //Position de la derniere valeur ajoutee
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
    	
    	if(currentPosition>sizeArrayList)
    	{
    		currentPosition=0;
    	}
    	else
    	{
    		currentPosition++;
    	}
    	Date date = new Date();
    	SimpleDateFormat dateLongue = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    	tabTemp.add(currentPosition,temp);
    	tabHum.add(currentPosition,hum);
    	tabCov.add(currentPosition,cov);
    	tabDate.add(currentPosition,date);
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

