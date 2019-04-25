package com.mycompany.a1;


import com.codename1.testing.AbstractTest;
import com.codename1.testing.TestUtils;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerShipTest extends AbstractTest {
    
        @Test
    public void test1 () {
    	PlayerShip tester = new PlayerShip ();
    	tester.steerLeft();
    	assertEquals(15,tester.getDirection());
    }

//     public boolean runTest() throws Exception {
//         PlayerShip tester = new PlayerShip();
//         tester.steerLeft();
//         TestUtils.assertBool(tester.getDirection()==15, "the direction should be 15");
//         return true;
//     }
    
}
