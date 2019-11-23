

public class TestaConversor {
    
    public static void main (String []args){
        
        try{
           
            ConversorDeTemperatura ct1 = new ConversorDeTemperatura();
            ConversorDeTemperatura ct2 = new ConversorDeTemperatura();
               
            ct1.ConverterParaCelsius();
            ct2.ConverterParaFarenheit();
        }
        catch(MenorQueZeroAbsolutoException ex){
            
            System.out.println(ex.getMessage());
            System.out.println(ex.getMessage());
        }finally{
            }
    }
    
}
