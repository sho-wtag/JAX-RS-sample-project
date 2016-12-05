package org.dihan.bracits.messenger;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
}
