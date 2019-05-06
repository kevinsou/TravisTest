package com.mycompany.a1;


import com.codename1.testing.AbstractTest;
import com.codename1.testing.TestUtils;

public class PlayerShipTest extends AbstractTest {


/**
 *
 * 
 */
    public boolean runTest() throws Exception {
         PlayerShip tester = new PlayerShip();
         tester.steerLeft();
         TestUtils.assertBool(tester.getDirection()==15, "the direction should be 15");
         tester.setDirection(359);
         tester.steerLeft();
         TestUtils.assertBool(tester.getDirection()==15, "the direction should be 15");
         return true;
     }
    
    
}
