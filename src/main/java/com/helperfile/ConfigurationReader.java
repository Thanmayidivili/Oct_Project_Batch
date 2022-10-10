package com.helperfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties p;
	
	public ConfigurationReader() throws IOException {
		
		File f=new File("C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\aug_project_batch_8am\\"
				+ "src\\main\\java\\com\\helperfile\\configuration.properties");
		
		FileInputStream fis=new FileInputStream(f);
		
		p=new Properties();
		
		p.load(fis); // it will have key & value format
		
		
	}
	
	public static String getUsername() {
		String User = p.getProperty("username");
		
		return User;

	}
	
	public static String getPassword() {
		String Pass = p.getProperty("password");
		return Pass;
	}
	
	
	

}
