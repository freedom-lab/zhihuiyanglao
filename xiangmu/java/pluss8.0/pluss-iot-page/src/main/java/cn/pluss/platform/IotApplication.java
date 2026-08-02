package cn.pluss.platform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@SpringBootApplication
@ServletComponentScan
public class IotApplication extends SpringBootServletInitializer{

    private static final Logger logger = LoggerFactory.getLogger(IotApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(IotApplication.class, args);
        logger.info("IotApplication Service Start Success");
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(IotApplication.class);
    }

    
}
