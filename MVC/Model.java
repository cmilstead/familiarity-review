package MVC;

public class Model {
    private String name;
    private int age;

    // This model is used for gets and sets.


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
