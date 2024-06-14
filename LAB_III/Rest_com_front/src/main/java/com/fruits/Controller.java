package com.fruits;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.http.HttpStatus; 
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList; 
import java.util.List; 

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Controller {

	public static void main(String[] args) {
		SpringApplication.run(Controller.class, args);
	}
}

@RestController 
@RequestMapping("/fruits") 
class RestApiDemoController { 
	private List<Fruit> fruits = new ArrayList<>();

	public RestApiDemoController() {
		fruits.addAll(List.of(
			new Fruit("1", "Pumpkin"),
			new Fruit("2","Grape"),
			new Fruit("3","Strawberry"),
			new Fruit("4","Orange")
	));
	}

	@GetMapping
	Iterable<Fruit> getFruit() {
		return fruits;
	}

	@PostMapping("/{id}")
	Fruit postFruit(@RequestBody Fruit fruit) {
		fruits.add(fruit);
		return fruit;
	}

	@PutMapping("/{id}")
	ResponseEntity<Fruit> putFruit(@PathVariable String id,
									@RequestBody Fruit fruit) {
		int fruitIndex = -1;

		for (Fruit f: fruits) {
			if (f.getId().equals(id)) {
				fruitIndex = fruits.indexOf(f);
				fruits.set(fruitIndex, fruit);
			}
		}

		return (fruitIndex == -1) ?
				new ResponseEntity<>(postFruit(fruit), HttpStatus.CREATED) :
				new ResponseEntity<>(fruit, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	void deleteFruit(@PathVariable String id) {
		fruits.removeIf(f -> f.getId().equals(id));
	}
}

