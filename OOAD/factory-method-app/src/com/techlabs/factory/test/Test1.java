package com.techlabs.factory.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.techlabs.factory.IAuto;
import com.techlabs.factory.IAutoFactory;

public class Test1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException,
			SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		IAutoFactory factory = injectDependency();

		IAuto auto = factory.make();
		auto.start();
		auto.stop();

	}

	private static IAutoFactory injectDependency() throws ClassNotFoundException, IOException, NoSuchMethodException,
			SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		InputStream read = new FileInputStream("src\\dependency\\factory.properties");
		Properties prop = new Properties();
		prop.load(read);
		System.out.println(prop.getProperty("factory"));
		Method method = Class.forName(prop.getProperty("factory")).getDeclaredMethod("getInstance", null);

		return (IAutoFactory) method.invoke(null, null);

	}

}
