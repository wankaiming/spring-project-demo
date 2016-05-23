package com.project.demo.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class WebApplication {
    
    private static ServletContext servletContext;
    
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    private static final Properties properties = new Properties();
    
    static {
        InputStream inputStream = WebApplication.class.getResourceAsStream("/siteConfig-base.properties");
        try {
            if (inputStream != null) {
                properties.load(inputStream);
            }
        } catch (IOException ex) {
        }
    }
    
    public static ServletContext getServletContext() {
        return servletContext;
    }

    @Autowired
    public void setServletContext(ServletContext sc) {
        servletContext = sc;
    }
    
    @PostConstruct
    public final void init() {
        for (Entry<Object, Object> propertiesEntry : properties.entrySet()) {
            logger.info(propertiesEntry.getKey()+"----------"+propertiesEntry.getValue());
            servletContext.setAttribute((String)propertiesEntry.getKey(), (String)propertiesEntry.getValue());
        }
    }

}
