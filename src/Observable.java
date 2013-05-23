
public interface Observable {

    public void addObservator(Observator o);        
       
    public void removeObservator(Observator o);         
      
    public void notifObservators(); 
}
