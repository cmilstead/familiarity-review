package JSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Json2Java {

    public static void main(String[] args) {
        Json2Java obj = new Json2Java();
        obj.run();
    }

    private void run() {
        ObjectMapper mapper = new ObjectMapper();

        try {

            // Convert JSON the string from a file to an Object
            Student student = mapper.readValue(new File("student.json"), Student.class);
            System.out.println(student);

            // Convert the JSON string to Object - year value intentionally skipped.
            String jsonInString = "{\"name\":\"Cameron\",\"age\":28,\"credits\":100,\"skills\":[\"swift\",\"python\"]}";
            Student student1 = mapper.readValue(jsonInString, Student.class);
            System.out.println(student1);

            //Human readable print
            String prettyStudent1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student1);
            System.out.println(prettyStudent1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
