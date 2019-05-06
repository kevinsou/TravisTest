package com.mycompany.a1;


import com.codename1.testing.AbstractTest;
import com.codename1.testing.TestUtils;

public class PlayerShipSteerRightTest extends AbstractTest {


/**
 *
 * 
 */
    public boolean runTest() throws Exception {
         PlayerShip tester = new PlayerShip();
         tester.steerRight();
         TestUtils.assertBool(tester.getDirection()==344, "the direction is" + tester.getDirection()+"when it should be 344");
         tester.steerRight();
         TestUtils.assertBool(tester.getDirection()==329, "the direction is" + tester.getDirection()+"when it should be 329");
         return true;
     }
    
    
}
