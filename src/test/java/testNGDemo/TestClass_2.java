package testNGDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass_2 extends BaseClass{

    //String cars[]={"bmw","audi","maserati","toyota"];
    //String car="bmw"

    @BeforeMethod   // before test method
    public void bm(){
        System.out.println("Before Method");
    }

    @Test(groups="regration")
    public void test1(){
        System.out.println("Test1");
    }

    @Test(groups = {"sanity","unittest","smoketest"})
    public void test2(){
        System.out.println("Test2");
    }

    @Test(groups={"regration","unittest","smoketest"})
    public void test3(){
        System.out.println("Test3");
    }

    @Test(groups = {"sanity","smoketest"})
    public void test4(){
        System.out.println("Test4");
    }

    @Test(groups={"regration","sanity"})
    public void test5(){
        System.out.println("Test5");
    }

    @Test(groups = {"sanity","regration","unittest","smoketest"})
    public void test6(){
        System.out.println("Test6");
    }

    @AfterMethod    // after test method
    public void am(){
        System.out.println("After Method");
    }


}
