public class tempModel{
    
    private static double degCelsius;
    private static double degFarhenheit;

    public tempModel(){
        this.degCelsius = degCelsius;
        this.degFarhenheit = degFarhenheit;
    }

    public tempModel(double degCelsius, double degFarhenheit){
        this.degCelsius = degCelsius;
        this.degFarhenheit = degFarhenheit;
    }

    public static double getDegCelsius(){
        return degCelsius;
    }

    public static void setDegCelsius(double degCelsius){
       tempModel.degCelsius = degCelsius;
    }
    
    public static double getDegFarhenheit(){
        return degFarhenheit;
    }

    public static void setDegFarhenheit(double DegFarhenheit){
        tempModel.degFarhenheit = degFarhenheit;
    }

    public static double convertToCelsius(){
        degCelsius = (degFarhenheit - 32) *(5/9);
        return degCelsius;
    }

    public static double convertToFarhenheit(){
        degFarhenheit = degCelsius * (9/5) + 32;
        return degFarhenheit;
    }
}