package testNGDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass{
    //There are many annotations like 1.Before class 2.After Class 3.Before Method 4.Test 5.After Method.
    // @Test annotation is the heart of the testNG

    //if some test have priority and some test have non priority ,Non priority will run first
    // by Alphabetically..... A .B.C which Alphabet coming first .

    @BeforeMethod   // before test method
    public void bm(){
        System.out.println("Before Method");
    }

    @Test(priority = 2)// will run six
    public void test1() {
        System.out.println("test1");
    }

    @Test(priority = 1) // will run fifth
    public void test2(){
        System.out.println("test2");
    }

    @Test
    public void test3() { // will run third
        System.out.println("test3");
    }

    @Test
    public void Dtest4(){ //Alphabetically run second
        System.out.println("test4");
    }

    @Test(priority = 3)
    public void test5() { // will run forth
        System.out.println("test5");
    }

    @Test(dependsOnMethods = "test5")//if test5 pass then will run test7 otherwise test
    public void test7(){
        System.out.println("test7");
    }

    @Test(dependsOnMethods = "Test6",alwaysRun = true)//doesn't matter test6 pass or fail but test8 must will run
    public void test8() {
        System.out.println("test8 ");
    }

    @Test
    public void Atest6() { //Alphabetically run first
        System.out.println("test6");
    }



    @AfterMethod    // after test method
    public void am(){
        System.out.println("After Method");
    }
}
