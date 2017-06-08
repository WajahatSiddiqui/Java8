package com.wajahat.learn.json.converter.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {

	private static JsonUtil sJsonUtil;
	private ObjectMapper objectMapper;
	

	private JsonUtil() {
		objectMapper = new ObjectMapper();
	}

	public static JsonUtil getInstance() {
		if (sJsonUtil == null) {
			synchronized (JsonUtil.class) {
				if (sJsonUtil == null) sJsonUtil = new JsonUtil();
			}
		}
		return sJsonUtil;
	}
	
	public String toJsonString(Object object) {
		String jsonStr= "";
			try {
				jsonStr = objectMapper.writeValueAsString(object);
			} catch (JsonGenerationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return jsonStr;
	}
	
	public  <T> T toJavaObject(String jsonStr, Class<T> clazz) {
		T result = null;
			try {
				result = objectMapper.readValue(jsonStr, clazz);
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return result;
	}

}
