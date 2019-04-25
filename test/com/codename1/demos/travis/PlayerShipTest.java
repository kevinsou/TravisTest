/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.demos.travis;

import com.codename1.testing.AbstractTest;
import com.codename1.testing.TestUtils;


/**
 *
 * @author shannah
 */
public class PlayerShipTest extends AbstractTest {

    public boolean runTest() throws Exception {
        PlayerShip tester = new PlayerShip();
		tester.steerLeft();
        TestUtils.assertBool(15, tester.getDirection());
        return true;
    }
    
}
