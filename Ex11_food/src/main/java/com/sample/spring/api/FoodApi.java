package com.sample.spring.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.spring.api.request.CreateAndEditFoodRequest;

@RestController
public class FoodApi {
	@GetMapping("/foods")
	public String getFoods() {
		return "getFoods";
	}

	@GetMapping("/food/{foodId}")
	public String viewFood(@PathVariable("foodId") Long foodId) {
		return "viewFood" + foodId;
	}

	@PostMapping("/food")
	public String postFood(@RequestBody CreateAndEditFoodRequest request) {
		return "postFood name: " + request.getName() + "postFood address: " + request.getAddress();
	}

	@PutMapping("/food/{foodId}")
	public String editFood(@PathVariable("foodId") Long foodId, @RequestBody CreateAndEditFoodRequest request) {
		return "editFood name: " + request.getName() + "editFood address: " + request.getAddress();
	}

	@DeleteMapping("/food/{foodId}")
	public String deleteFood(@PathVariable("foodId") Long foodId) {
		return "deleteFood" + foodId;
	}

}
