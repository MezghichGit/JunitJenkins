package com.sip.ams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sip.ams.util.Calcul;

class TestCalcul {

	@Test
	void testSomme() {
		Calcul c = new Calcul();
		int res = c.somme(10, 20);
		assertEquals(res, 30);
		
	}

}
