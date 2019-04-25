/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.demos.geoviz;

import com.codename1.testing.AbstractTest;
import com.codename1.testing.TestUtils;

/**
 *
 * @author shannah
 */
public class TestOne extends AbstractTest {

    public boolean runTest() throws Exception {
        TestUtils.assertBool(1+2==3, "One plus 2 should be 3");
        return true;
    }
    
}
