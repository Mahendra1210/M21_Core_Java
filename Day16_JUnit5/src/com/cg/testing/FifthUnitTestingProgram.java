package com.cg.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FifthUnitTestingProgram 
{
	@Test
	@Disabled
	void trueAssumption()
	{
		//assumeTrue says that if your assumption and result both are true then it will execute otherwise not
		assumeTrue(5>1);
		assertEquals(5+2,7);
	}
	
	@Test
	@Disabled
	void falseAssumption()
	{
		assumeFalse(5<1);
		assertEquals(5+2,7);
	}
	
	@Test
	void assumptionThat()
	{
		String str= "Mahendra";
		assumingThat(str.equals("Mahendra"),
				()->assertEquals(2+3,5));
	}

}
