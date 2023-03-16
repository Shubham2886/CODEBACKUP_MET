package com.iit.library.metlibrary.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iit.library.metlibrary.dao.LibraryDAO;
import com.iit.library.metlibrary.model.Library;

@Service
public class LibraryService {
	@Autowired
	private LibraryDAO libdao;
	
	public Collection<Library> getLibService(){
		return libdao.getLibrary();
	}
	
	public void  postLibService(Library lib) {
		libdao.saveUsingJDBCTemplate(lib);
	}

}
