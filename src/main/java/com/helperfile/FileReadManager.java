package com.helperfile;

import java.io.IOException;

public class FileReadManager {
	
	//SDP
	
	//private method
	private FileReadManager() {
		
	}
	
	
	//static method
	public static FileReadManager getInstanceFRM() {
		FileReadManager reader=new FileReadManager();
		return reader;
	}
	
	
	//non static method
	public ConfigurationReader getInstanceCR() throws IOException {
		ConfigurationReader config=new ConfigurationReader();
		return config;

	}
	

}
