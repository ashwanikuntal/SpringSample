package org.mysample.utilities;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJDBCTemplate {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	   
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public DataSource getDataSource() {
		return this.dataSource;
	}

	private void setJdbcTemplateObject() {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public JdbcTemplate getJdbcTemplateObject() {
		setJdbcTemplateObject();
		return jdbcTemplateObject;
	}
}
