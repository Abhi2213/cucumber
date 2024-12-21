package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import stepDefinition.AdminPanelLoginPageStep;

public class PropertiesFile {

	static Properties prop=new Properties();

	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
	}

	public static void getProperties() {
		try {
			Properties prop=new Properties();
			
			
			InputStream input=new FileInputStream ("C:/Users/admin/Documents/Eclipse-Workspace/cucumberFinal/src/test/java/config/config.properties");
			prop.load(input);
			String browser=prop.getProperty("browser");
			System.out.println(browser);
			AdminPanelLoginPageStep.browserName=browser;
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

	public static void setProperties() {
		try {
			
			OutputStream output=new FileOutputStream("C:/Users/admin/Documents/Eclipse-Workspace/cucumberFinal/src/test/java/config/config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

}