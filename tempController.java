public class tempController {

    private tempModel model;
    private tempView view;

    // public tempController(tempModel model, tempView view){
    //     this.model = model;
    //     this.view = view;
    // }
    public tempController(tempModel model, tempView view){
         this.model = model;
         this.view = view;
     }
     

    public void setCelsius(double degCelsius){
        // model.setDegCelsius(degCelsius);
        model.setDegCelsius(degCelsius);
    }

    public void setFarhenheit(double degFarhenheit){
        model.setDegFarhenheit(degFarhenheit);
    }

    public void updateView(){
        view.tempInput(model.getDegCelsius(), model.getDegFarhenheit());
    }

}
