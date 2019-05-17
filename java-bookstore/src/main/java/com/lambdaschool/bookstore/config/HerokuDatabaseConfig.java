package com.lambdaschool.bookstore.config;//package com.lambdaschool.restaurants.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class HerokuDatabaseConfig
{

//    @Value("${DATABASE_URL}")
//    private String dbUrl;
//
//    @Bean
//    public DataSource dataSource()
//    {
//        String dbUrl = System.getenv("JDBC_DATABASE_URL");
//        HikariConfig config = new HikariConfig();
//        config.setJdbcUrl(dbUrl);
//        return new HikariDataSource(config);
//    }
}