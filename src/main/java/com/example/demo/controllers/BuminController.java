package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mockeds.ServiceMockedData;
import com.example.demo.models.TestModel;


@RestController
public class BuminController {

	ServiceMockedData data = new ServiceMockedData();
	
	@CrossOrigin
	@GetMapping("/get-objects")
    public List getObjects() {
        return data.getList();
    }
	@CrossOrigin
	@PutMapping("/update-objects/{id}")
    public String updateObject(@RequestBody TestModel model, @PathVariable int id) {
		data.updateTest(id, model);
        return "Updated";
    }
	@CrossOrigin
	@GetMapping("/")
    public List<TestModel> updateObject() {
		return data.getList();
    }
	@CrossOrigin
	@PostMapping("/new-object")
    public String add(@RequestBody TestModel newModel) {
        data.addTest(newModel);
        return "Added";
    }
	@CrossOrigin
	@DeleteMapping("/delete-object/{id}")
    public String delete(@PathVariable int id) {
        data.removeTest(id);
        return "Deleted";
    }
}
