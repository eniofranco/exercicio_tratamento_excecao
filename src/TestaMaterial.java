
public class TestaMaterial{
    
    public static void main (String[] args){
        
        try{
        
            Material m1 = new Material ("Porta",-150);
        
        }catch(QuantidadeInvalidaException ex){
            
            System.out.println(ex.getMessage());
        }
    }
    
}
