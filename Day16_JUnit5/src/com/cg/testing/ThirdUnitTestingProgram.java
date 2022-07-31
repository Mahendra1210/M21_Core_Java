package com.cg.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThirdUnitTestingProgram 
{
	@DisplayName("Test is Successfully implemented")
	@Test
	void function()
	{
		//System.out.println("To display a name");
	}
	@Test
	@Disabled("Not implemented")
	void function1()
	{
		System.out.println("Fails");
	}

}
