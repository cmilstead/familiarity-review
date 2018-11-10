package JSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Java2Json {

    public static void main(String[] args) {
        Java2Json obj = new Java2Json();
        obj.run();
    }

    private void run() {
        ObjectMapper mapper = new ObjectMapper();

        Student student = createJavaObject();

        try {
            // Convert object to JSON string and save into a file directly
            // Please adjust your path accordingly if the .json file is not found.
            mapper.writeValue(new File("student.json"), student);

            // Convert object to JSON string
            String jsonInString = mapper.writeValueAsString(student);
            System.out.println(jsonInString);

            // Convert object to JSON string and pretty print
            jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
            System.out.println(jsonInString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Student createJavaObject() {

        Student student = new Student();

        student.setName("Cameron");
        student.setAge(33);
        student.setYear("Student");
        student.setCredits(new BigDecimal("0"));

        List<String> skills = new ArrayList<>();
        skills.add("swift");
        skills.add("python");

        student.setSkills(skills);

        return student;

    }

}
