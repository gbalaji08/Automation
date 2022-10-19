package testSuite;
import org.testng.annotations.Test;
public class TestClass1 {
   // test case 1
   @Test (priority=2)
   public void testCase1() {
      System.out.println("This is testcase 1");
   }
   // test case 2
   @Test (priority=1)
   public void testCase2() {
      System.out.println("This is testcase 2");
   }
}