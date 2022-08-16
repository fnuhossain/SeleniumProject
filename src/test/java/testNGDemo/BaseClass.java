package testNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    // annotation
    @BeforeClass  // will run Before starting test class
    public void bc(){
        System.out.println("Before Class");
    }


    @AfterClass  // will run after completing test class
    public void ac(){
        System.out.println("After Class");

    }
}
