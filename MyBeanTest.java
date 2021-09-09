package com.deleteme.ejb;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.deleteme.common.MyClass;
import com.deleteme.exception.MyException;

public class MyBeanTest {
	
	@Test public void correctNameIsReturned() throws MyException, IOException {
		assertEquals("this is the value", new MyClass().getSampleString());
	}
}
