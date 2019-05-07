package com.mycompany.a1;


import com.codename1.testing.AbstractTest;
import com.codename1.testing.TestUtils;

public class PlayerShipTurnMissileLauncherTest extends AbstractTest {


/**
 *
 * 
 */
    public boolean runTest() throws Exception {
         PlayerShip tester = new PlayerShip();
         tester.turnMissileLauncher();
         TestUtils.assertBool(tester.getMissileLauncherDir()==15, "the direction is" + tester.getMissileLauncherDir() + "when it should be 15");
         return true;
     }
    
    
}
