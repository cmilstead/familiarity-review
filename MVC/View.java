package MVC;

public class View {

    // Method called from the controller.
    public static void printPersonDetails(String candyBarName, int deliciousnessLevel){
        System.out.println("Name: " + candyBarName);
        System.out.println("Age: " + deliciousnessLevel);
    }
}
