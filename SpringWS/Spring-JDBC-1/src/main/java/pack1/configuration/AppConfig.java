package pack1.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages= {"pack1.bo","pack1.dao"})
public class AppConfig {
	@Bean
	public JdbcTemplate jt()
	{
		return new JdbcTemplate(ds());
		
	}
    @Bean
    public DataSource ds()
    
    {
    	DriverManagerDataSource ds=new DriverManagerDataSource();
    	ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        ds.setUsername("system");
        ds.setPassword("amit");
        return ds;
    }
}
