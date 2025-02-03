package com.project.extractor.src;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SwiftMessageTypeExtractor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream swiftMessage = SwiftMessageTypeExtractor.class.getResourceAsStream("resources/swift-message.txt");
		String text = new String(swiftMessage.readAllBytes(), StandardCharsets.UTF_8);
		System.out.println(text);
		String value = text.substring(text.indexOf("MT"),text.indexOf("}}\r\n"
				+ "{4:"));
		System.out.println("\n\n Swift Message Type ===> "+value);

	}
	
}
