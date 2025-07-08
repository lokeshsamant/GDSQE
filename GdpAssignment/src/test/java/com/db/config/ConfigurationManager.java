package com.db.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationManager {

	private static Properties properties = new Properties();
	private static final String DEFAULT_CONFIG_FILE = "com/db/config/config.properties";
	private static final String ENV_CONFIG_PATH = "com/db/config/environments/";
	private static String environment;

	static {
		environment = System.getProperty("env");
		if (environment == null || environment.isEmpty()) {
			environment = "test";
		}

		loadProperties(DEFAULT_CONFIG_FILE);

		if (environment != null && !environment.isEmpty()) {
			String envConfigFile = ENV_CONFIG_PATH + environment.toLowerCase() + ".properties";
			loadProperties(envConfigFile);
		}
	}

	private static void loadProperties(String filePath) {
		try (InputStream input = ConfigurationManager.class.getClassLoader().getResourceAsStream(filePath)) {
			if (input == null) {
				System.out.println("Sorry, unable to find " + filePath);
				return;
			}
			properties.load(input);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}

	public static String getProperty(String key, String defaultValue) {
		return properties.getProperty(key, defaultValue);
	}

	public static String getEnvironment() {
		return environment;
	}
}