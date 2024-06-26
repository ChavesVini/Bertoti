package com.fruits;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.http.HttpStatus; 
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList; 
import java.util.List; 
import java.util.Optional; 
import java.util.UUID;

@SpringBootApplication
public class fruits {

	public static void main(String[] args) {
		SpringApplication.run(fruits.class, args);
	}
}

@RestController 
@RequestMapping("/fruits") 
class RestApiDemoController { 
	private List<fruit> fruits = new ArrayList<>();

	public RestApiDemoController() {
		fruits.addAll(List.of(
			new fruit("Pumpkin"),
			new fruit("Grape"),
			new fruit("Strawberry"),
			new fruit("Orange")
	));
	}

	@GetMapping
	Iterable<fruit> getFruit() {
		return fruits;
	}

	@GetMapping("/{id}")
	Optional<fruit> getFruitById(@PathVariable String id) {
		for (fruit f: fruits) {
			if (f.getId().equals(id)) {
				return Optional.of(f);
			}
		}

		return Optional.empty();
	}

	@PostMapping
	fruit postFruit(@RequestBody fruit fruit) {
		fruits.add(fruit);
		return fruit;
	}

	@PutMapping("/{id}")
	ResponseEntity<fruit> putFruit(@PathVariable String id,
									@RequestBody fruit fruit) {
		int fruitIndex = -1;

		for (fruit f: fruits) {
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

class fruit { 
	private final String id; 
	private String name;

	public fruit(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public fruit(String name) {
		this(UUID.randomUUID().toString(), name);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
