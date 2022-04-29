/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.carlossc87.demowebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author carlos.serramito
 */
@Controller
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "hello";
	}

}
