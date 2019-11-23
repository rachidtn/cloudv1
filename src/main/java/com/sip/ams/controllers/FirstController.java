package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sip.ams.entities.Animal;

@Controller
public class FirstController {
 @GetMapping("/home")
 //@ResponseBody
 public String home()
 {
 //return "<h1 align=center>Hello Spring Boot</h1>";
	 return "/First/home";
}
 
 @GetMapping("/acceuil")
 public String acceuil(@RequestParam (required=false, defaultValue= "Spring Boot")String framework,
		 @RequestParam (required=false, defaultValue= "1")int version,ModelMap monObj)
 { 
	 //String tab[]= {"Spring","Angular"};
	 String ch="Vous avez choisi : "+ framework;
	 monObj.put("msg",ch);
	 String ch3="la version est  :"+version;
    monObj.put("version",ch3);
	 ArrayList<String> names = new ArrayList<>();
	 
	 names.add("Angular");
	 names.add("Spring");
	 names.add("Formation");
	 monObj.put("names",names);
	 
	 
	 String ecole ="POLYTECH";
	 String formation= "Spring Boot& Angular";
	 monObj.put("ec",ecole);
	 monObj.put("forma",formation);
	// for (int i=0;i<=1;i++)
	// {
	 //monObj.put("tab",tab[i]);
	 //}
	 ArrayList<Animal> animaux = new ArrayList<>();
	 animaux.add(new Animal("chat",2));
	 animaux.add(new Animal("lyon",3));
	 animaux.add(new Animal("oiseau",1));
	 monObj.put("animaux",animaux);

	 
	 return "/First/acceuil";
 }
 
}