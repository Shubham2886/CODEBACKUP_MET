package com.iit.library.metlibrary.controller;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iit.library.metlibrary.model.Library;
import com.iit.library.metlibrary.service.LibraryService;

@RestController
@RequestMapping("/library")
public class LibraryController {

	@Autowired
	private LibraryService libserv;

	@GetMapping(value ="books" ,produces = "application/json")
	public ResponseEntity<Collection<Library>> allBooks(){
		Collection<Library> libbooks = libserv.getLibService();
		return new ResponseEntity<Collection<Library>>(libbooks,HttpStatus.OK );
	}
	
	@PostMapping(value = "bookpost" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Library> postBooks(@RequestBody Library lib){
		libserv.postLibService(lib);
		return new ResponseEntity<Library>(lib, HttpStatus.OK);
	}
}
