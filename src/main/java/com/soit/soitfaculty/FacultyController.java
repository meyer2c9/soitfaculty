package com.soit.soitfaculty;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soit.soitfaculty.model.Faculty;

@Controller
@RequestMapping("/Faculties")

public class FacultyController {

	
	//Upload Faculty Info
	
	private List<Faculty> theFaculties;
	
	@PostConstruct 
	private void loadData( ) {
		//create faculties
		Faculty fac1 = new Faculty (1, "Kelly", "Miller", "Kelly@uc.edu");
		Faculty fac2 = new Faculty (2, "Kelly", "Miller", "Kelly@uc.edu");
		Faculty fac3 = new Faculty (3, "Kelly", "Miller", "Kelly@uc.edu");
		
		
		
		//Create out Lists
		theFaculties = new ArrayList();
		
		theFaculties.add(fac1);
		theFaculties.add(fac2);
		theFaculties.add(fac3);
		
		
		//create our lists 
		
		//add to our list
		
		
		
	}
	
	//Mapping for "/list"
}
