package NareshIT.JavaTesting;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );

        System.out.println("TEst");
        //This is for pushing from Branch
   
        System.out.println("Update from Branch3");
        System.out.println("From Branch4");
        System.out.println("New Branch7");


        System.out.println("New Branch10");
        System.out.println("New Branch commit 1");
        System.out.println("New Branch commit 2");
  

    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
    	  System.out.println("commit 1 from master");
    	  System.out.println("commit 2 from master");
        return new TestSuite( AppTest.class );
      
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
