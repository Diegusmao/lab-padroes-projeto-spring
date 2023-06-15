package one.digitalinnovation.gof.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class BDConfig {

	private static final String DRIVER_CLASS_NAME = "org.postgresql.Driver";
	private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/postgres";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "Djbg6525";

	@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(DRIVER_CLASS_NAME);
        dataSource.setUrl(DATABASE_URL);
        dataSource.setUsername(USERNAME);
        dataSource.setPassword(PASSWORD);
        return dataSource;
	}
}
