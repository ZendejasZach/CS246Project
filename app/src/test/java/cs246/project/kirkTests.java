package cs246.project;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static junit.framework.TestCase.assertEquals;

public class kirkTests {
    // Testing from the reading
    @Test
    public void multiplyByZeroTest(){
        assertTrue(1==1);
        assertTrue(1>0);
        assertTrue(0<1);

        // negative test
        assertTrue(0>1);
    }
}

// class to run tests
class MyTestRunner{
    public static void main(String[] args){

        // create a new result object for the test results
        Result result = JUnitCore.runClasses(kirkTests.class);

        // if result holds a failure, print it
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
    }
}