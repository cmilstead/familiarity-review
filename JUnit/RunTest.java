// Runs the tests as defined in the TestAssertions class and returns a value indicating success.

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunTest {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestAssertions.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }


}
