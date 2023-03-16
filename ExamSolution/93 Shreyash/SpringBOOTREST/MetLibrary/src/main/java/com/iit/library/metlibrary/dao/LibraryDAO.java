package com.iit.library.metlibrary.dao;

import java.util.Collection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.iit.library.metlibrary.model.Library;
@Repository
public class LibraryDAO {

	@Autowired
	private DataSource oracleDataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public Collection<Library> getLibrary() {
	 Collection<Library> libs = jdbcTemplate.query("select * from library", new BeanPropertyRowMapper<Library>(Library.class));
	 return libs;
	}
	
public void saveUsingJDBCTemplate(Library lib) {
		
		jdbcTemplate.update("insert into library values(?, ?, ?, ?)", 
					new Object[] {lib.getBookId(), lib.getName(),
							lib.getAuthor(),lib.getPublisher()}
				);
		
	}

}

