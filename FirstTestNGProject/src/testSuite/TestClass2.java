package testSuite;

import org.testng.annotations.Test;
public class TestClass2 {
   // test case 3
   @Test (priority=2) //Prioritizing the testcase
   public void testCase3() {
      System.out.println("This is testcase 3");
   }
   // test case 4
   @Test (priority=1)
   public void testCase4() {
      System.out.println("This is testcase 4");
   }
}