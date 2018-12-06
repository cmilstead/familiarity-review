package MVC;

public class Controller {
    private Model model;
    private View view;

    // Model and view are passed from Main.
    public Controller(Model passedModel, View passedView){
        this.model = passedModel;
        this.view = passedView;
    }

    // String passed to method from main. Passes to model.
    public void setName(String name){

        model.setName(name);
    }

    // Int passed to method from main. Passes to model.
    public void setAge(int age){

        model.setAge(age);
    }

    // This method is called from Main. Parameters retrieved from the model are passed to the view.
    public void updateView(){

        view.printPersonDetails(model.getName(), model.getAge());
    }

}
