package MVC;


public class Main {
    public static void main(String[] args) {

        // Model to retrieve info about person.
        Model model = retrievePersonInfo();

        // Assign view to class designated as view. Will be used to write info about the person.
        View view = new View();

        //Controller passes model and view to controller.
        Controller controller = new Controller(model, view);

        // Display what is currently in model. Calls method in view using controller.
        controller.updateView();

        // Update data in model with something else.
        controller.setName("Cameron");
        controller.setAge(27);

        // Display what is in model. (with updated person info)
        controller.updateView();

        // Update data in model with something else.
        controller.setName("Bill");
        controller.setAge(36);

        // Display what is in model. (with updated candy info)
        controller.updateView();

    }

    // Initial model
    private static Model retrievePersonInfo(){
        Model person = new Model();

        // Set initial values to the model
        person.setName("Chester");
        person.setAge(48);

        return person;
    }
}
