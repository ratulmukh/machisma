package com.ratul.machisma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Stream;

public class StreamingUrlFileReader {

	public static void main(String[] args) throws MalformedURLException, IOException {
		read();

	}
	
	private static void read() throws MalformedURLException, IOException {
		try (InputStream is = new URL("https://research.google.com/ava/download/ava_train_v1.0.csv").openConnection().getInputStream();
			     BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			     Stream<String> stream = reader.lines()) {
			    stream.forEach(System.out::println);
			}
	}

}
