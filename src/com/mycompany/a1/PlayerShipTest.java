package com.mycompany.a1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerShipTest extends PlayerShip{

	@Test
	void SteerLeftTest() {
		PlayerShip tester = new PlayerShip();
		tester.steerLeft();
		assertEquals(15,tester.getDirection());
	}

}
