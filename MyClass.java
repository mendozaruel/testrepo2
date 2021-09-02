package com.deleteme.common;

import java.io.IOException;

import com.deleteme.library.ClasspathAccess;

public class MyClass {
	private ClasspathAccess access;
	
	public MyClass() throws IOException {
		access = new ClasspathAccess("/deleteme.properties");
	}
	
	public String getSampleString() {
		return access.getValueFromClasspathFile("criticalvalue");
	}
}
