/**
 * @author Cory Howard - clhoward1
 * CIS175 - Spring 2024
 * Apr 25, 2024
 */
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Tank;
import dmacc.repository.TankRepository;

@Controller
public class WebController {
	
	@Autowired
	TankRepository repo;
	
	@GetMapping("/viewAllTanks")
	public String viewAllTanks(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewTank(model);
		}
		
		model.addAttribute("tanks", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputTank")
	public String addNewTank(Model model) {
		Tank t = new Tank();
		
		model.addAttribute("newTank", t);
		return "input";
	}
	
	@PostMapping("/inputTank")
	public String addNewTank(@ModelAttribute Tank t, Model model) {
		repo.save(t);
		return viewAllTanks(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateTank(@PathVariable("id") long id, Model model) {
		Tank t = repo.findById(id).orElse(null);
		model.addAttribute("newTank", t);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseTank(Tank t, Model model) {
		repo.save(t);
		return viewAllTanks(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteTank(@PathVariable("id") long id, Model model) {
		Tank t = repo.findById(id).orElse(null);
		repo.delete(t);
		return viewAllTanks(model);
	}

}
