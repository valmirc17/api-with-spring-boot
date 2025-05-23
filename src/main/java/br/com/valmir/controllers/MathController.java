package br.com.valmir.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.valmir.SimpleMath;

@RestController
public class MathController {
	
	SimpleMath math = new SimpleMath();
	
	@GetMapping("/sum/{firstNumber}/{secondNumber}")
	public Double sum(
			@PathVariable String firstNumber,
			@PathVariable String secondNumber
			) {
		
		double n1 = Double.parseDouble(firstNumber);
		double n2 = Double.parseDouble(secondNumber);
		
		return math.sum(n1, n2);
	}
	
	@GetMapping("/sub/{n1}/{n2}")
	public Double sub(
			@PathVariable Double n1,
			@PathVariable Double n2
			) {
		
		return math.sub(n1, n2);
	}
	
	@GetMapping("/mult/{n1}/{n2}")
	public Double mult(
			@PathVariable Double n1,
			@PathVariable Double n2
			) {
		
		return math.mult(n1, n2);
	}
	
	@GetMapping("/div/{n1}/{n2}")
	public Double div(
			@PathVariable Double n1,
			@PathVariable Double n2
			) {
		
		return math.div(n1, n2);
	}
}
