package com.thehecklers.sburrestdemo;

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
public class SburRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SburRestDemoApplication.class, args);
	}

}

@RestController
@RequestMapping("/fruits")
class RestApiDemoController {
	private List<Fruits> fruits = new ArrayList<>();

	public RestApiDemoController() {
		fruits.addAll(List.of(
				new Fruits("Pumpkin"),
				new Fruits("Grape"),
				new Fruits("Strawberry"),
				new Fruits("Orange")
		));
	}

	@GetMapping
	Iterable<Fruits> getFruit() {
		return fruits;
	}

	@GetMapping("/{id}")
	Optional<Fruits> getFruitById(@PathVariable String id) {
		for (Fruits f: fruits) {
			if (f.getId().equals(id)) {
				return Optional.of(f);
			}
		}

		return Optional.empty();
	}

	@PostMapping
	Fruits postFruit(@RequestBody Fruits fruit) {
		fruits.add(fruit);
		return fruit;
	}

	@PutMapping("/{id}")
	ResponseEntity<Fruits> putFruit(@PathVariable String id,
									 @RequestBody Fruits fruit) {
		int fruitIndex = -1;

		for (Fruits f: fruits) {
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

class Fruits {
	private final String id;
	private String name;

	public Fruits(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Fruits(String name) {
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
