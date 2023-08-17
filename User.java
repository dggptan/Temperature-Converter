public class User {
    
    public static void main(String[] args) {

        tempModel temp = new tempModel();
        temp.setDegCelsius(50.0);
        temp.setDegFarhenheit(60.0);

        tempView view = new tempView();
    

        //create a controller obeject and link it to the model and view
        tempController controller = new tempController(temp,view);

        //update the model's data
        controller.setCelsius(0);
        controller.setFarhenheit(0);

        controller.updateView();
    }
}
