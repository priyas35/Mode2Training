package com.javacodegeeks.examples.jaxWsAnnotations.client;

import java.rmi.RemoteException;

import com.javacodegeeks.examples.jaxWsAnnotations.webservice.WSAnnotationWebServiceIProxy;

public class MainApplication {
	
	public static void main(String[] args) {
		WSAnnotationWebServiceIProxy w=new WSAnnotationWebServiceIProxy();
		float res=0;
		try {
			res=w.celsiusToFarhenheit(96);
			System.out.println(res);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
