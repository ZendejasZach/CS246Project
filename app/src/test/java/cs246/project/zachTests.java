package cs246.project;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class zachTests {
    // Testing from the reading
    @Test
    public void multiplyByZeroTest(){
        assertEquals(0, 0*0);
        assertEquals(0, 0 * 10);
        assertEquals(0, 0*1000);

        // negative test
        assertEquals(0, 1*1000);
    }
}

// class to run tests
//class MyTestRunner{
//    public static void main(String[] args){
//
//        // create a new result object for the test results
//        Result result = JUnitCore.runClasses(zachTests.class);
//
//        // if result holds a failure, print it
//        for (Failure failure : result.getFailures()){
//            System.out.println(failure.toString());
//        }
//    }
//}