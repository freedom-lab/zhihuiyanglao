package cn.pluss.platform;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.sql.DataSource;

@EnableSwagger2
@SpringBootApplication
@ServletComponentScan
//开启事务
@EnableTransactionManagement
@MapperScan("cn.pluss.platform.mapper.**")
public class ApiApplication {

    private static final Logger logger = LoggerFactory.getLogger(ApiApplication.class);

    // 其中 dataSource 框架会自动为我们注入(单数据源)
    @Bean
    public PlatformTransactionManager txManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
        logger.info("Api Service Start Success");

    }
}
