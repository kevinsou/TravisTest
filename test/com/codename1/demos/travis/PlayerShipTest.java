package com.mycompany.a1;


import com.codename1.testing.AbstractTest;
import com.codename1.testing.TestUtils;


public class PlayerShipTest extends AbstractTest {

    public boolean runTest() throws Exception {
        PlayerShip tester = new PlayerShip();
        tester.steerLeft();
        TestUtils.assertBool(1+2==3, "One plus 2 should be 3");
        return true;
    }
    
}
