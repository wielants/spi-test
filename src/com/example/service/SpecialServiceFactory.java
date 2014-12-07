package com.example.service;

import java.util.ServiceLoader;

/**
 * siehe https://docs.oracle.com/javase/7/docs/api/java/util/ServiceLoader.html
 */
public class SpecialServiceFactory {
	
	private static ServiceLoader<SpecialService> specialServicesLoader = ServiceLoader.load(SpecialService.class);
	
	public static SpecialService getSpecialService () {
	     for (SpecialService eachSpecialService : specialServicesLoader) {
	    	 return eachSpecialService;
	     }
	     return null;
	}
}
