package com.bridgelabz.oops.inventrymange.model;
//package com.BridgeLabz.OOPS.inventryMange.Model;
//
//import java.io.IOException;
//import org.codehaus.jackson.map.JsonMappingException;
//import org.codehaus.jackson.map.ObjectMapper;
//
//public class JsonUtil {
//
//	private static ObjectMapper mapper;
//	static {
//		mapper = new ObjectMapper();
//
//	}
//
//	
//	// converting java Object to Json object as string
//	public static String convertJavaToJson(Object obj) {
//		String resultJson = "";
//		try {
//			
//			resultJson = mapper.writeValueAsString(obj);
//		} catch (JsonGenerationException e) {
//			System.out.println("Exception ocured while converting java to json" + e.getMessage());
//		} catch (JsonMappingException e) {
//
//			System.out.println("Exception ocured while converting java to json" + e.getMessage());
//		} catch (IOException e) {
//
//			System.out.println("Exception ocured while converting java to json" + e.getMessage());
//			e.printStackTrace();
//		}
//		return resultJson;
//	}
//
//	public static <T> T convertJsonIntoJava(String jsonString, Class<T> cls) {
//		T result = null;
//		try {
//			result = mapper.readValue(jsonString, cls);
//		} catch (JsonParseException e) {
//			System.out.println("Exception is occured during the converting Json to java " + e.getMessage());
//		} catch (JsonMappingException e) {
//			System.out.println("Exception is occured during the converting Json to java " + e.getMessage());
//
//		} catch (IOException e) {
//			System.out.println("Exception is occured during the converting Json to java " + e.getMessage());
//
//		}
//		return result;
//	}
//
//}
