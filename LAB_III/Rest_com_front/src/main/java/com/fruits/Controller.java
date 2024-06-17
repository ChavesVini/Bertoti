package com.fruits;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.http.HttpStatus; 
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger; 

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
	private AtomicInteger atomic = new AtomicInteger(4);

	public RestApiDemoController() {
		fruits.addAll(List.of(
			new Fruit(1, "Pumpkin"),
			new Fruit(2, "Grape"),
			new Fruit(3, "Strawberry"),
			new Fruit(4,"Orange")
	));
	}

	@GetMapping
	Iterable<Fruit> getFruit() {
		return fruits;
	}

	@PostMapping
	Fruit postFruit(@RequestBody Fruit fruit) {
		fruit.setId(atomic.incrementAndGet()); 
		fruits.add(fruit);
		return fruit;
	}

	@PutMapping("/{id}")
	ResponseEntity<Fruit> putFruit(@PathVariable Integer id,
									@RequestBody Fruit fruit) {
		int fruitIndex = -1;

		for (Fruit f: fruits) {
			if (f.getId().equals(id)) {
				fruitIndex = fruits.indexOf(f);
				fruits.set(fruitIndex, new Fruit(id, fruit.getName()));
			}
		}

		return (fruitIndex == -1) ?
				new ResponseEntity<>(postFruit(fruit), HttpStatus.CREATED) :
				new ResponseEntity<>(fruit, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	void deleteFruit(@PathVariable Integer id) {
		Iterator<Fruit> iterator = fruits.iterator();
		while (iterator.hasNext()) {
			Fruit fruit = iterator.next();
			if (fruit.getId() == id) {
				iterator.remove();
			}
		}
	}
}