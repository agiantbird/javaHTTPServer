package com.agiantbird.httpserver.config;

public class ConfigurationManager {
    // singleton, because we only ever need one configuration manager
    private static ConfigurationManager myConfigurationManager;
    private static Configuration myCurrentConfiguration;

    private ConfigurationManager() {

    }

    public static ConfigurationManager getInstance() {
        if(myConfigurationManager == null) {
            myConfigurationManager = new ConfigurationManager();
        }
        return myConfigurationManager;
    }

    /**
     * Used to load a configuration file by the path provided
     */
    public void loadConfigurationFile(String filePath) {

    }

    /**
     * returns the current loaded configuration
     */
    public void getCurrentConfiguration() {

    }
}
