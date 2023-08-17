import java.util.*;


public class tempView {
    
    public void tempInput(double degCelsius, double getFarhenheit){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature you want to convert: ");
        sc.nextDouble();
        selectConversion();
    }

    public void selectConversion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 or 2 for conversion you want to do" + 
        "\n 1.Celsius to Farhenheit \n 2.Farhenheit to Celsius");
        
        int result = sc.nextInt();

        if(result == 1){
            System.out.println(tempModel.convertToCelsius());
        }
        else if(result == 2){
            System.out.println(tempModel.convertToFarhenheit());
        }
        System.out.println("Invalid Input");
    }
}
