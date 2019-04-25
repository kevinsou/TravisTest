package com.mycompany.a1;


import com.codename1.testing.AbstractTest;
import com.codename1.testing.TestUtils;


public class PlayerShipTest extends AbstractTest {

    public boolean runTest() throws Exception {
        PlayerShip tester = new PlayerShip();
        tester.steerLeft();
        TestUtils.assertBool(tester.getDirection()==10, "the direction should be 15");
        return true;
    }
    
}
