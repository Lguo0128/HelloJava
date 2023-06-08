package test.BookPractises;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import test.src.TestJunit;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ex06_31Test.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}