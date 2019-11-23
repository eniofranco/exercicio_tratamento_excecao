
public class ConversorDeTemperatura {

    public double ConverterParaCelsius()throws MenorQueZeroAbsolutoException{
    
double tempfar = 32;
double converter = (tempfar - 32)/1.8;

if (tempfar < -459.67){
    
    throw new MenorQueZeroAbsolutoException("Erro: Valor menor que zero absoluto");
       
}
    return converter;
   
}

public double ConverterParaFarenheit()throws MenorQueZeroAbsolutoException{
    double tempo = 12;
    double converter = (tempo * 1.8) + 32;

    if (tempo < 273.15){

        throw new MenorQueZeroAbsolutoException("Erro: Valor informado menor que zero absoluto");
}
    return converter;
}
}