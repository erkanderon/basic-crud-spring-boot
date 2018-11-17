package com.example.demo.mockeds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.demo.models.TestModel;


public class ServiceMockedData {

	private List<TestModel> tests = new ArrayList<TestModel>();

    private static ServiceMockedData instance = null;
    public static ServiceMockedData getInstance(){
         if(instance == null){
             instance = new ServiceMockedData();
         }
         return instance;
    }
    
    public ServiceMockedData() {
    	this.tests.add(new TestModel(1, "test1", "test status 1", "test description 1"));
    	this.tests.add(new TestModel(2, "test2", "test status 2", "test description 2"));
    	this.tests.add(new TestModel(3, "test3", "test status 3", "test description 3"));
    	this.tests.add(new TestModel(4, "test4", "test status 4", "test description 4"));
    }
    
    public String addTest(TestModel model){
    	this.tests.add(model);
		return "True";	
    }
    public String removeTest(int objectId) {
    	for (Iterator<TestModel> iter = this.tests.listIterator(); iter.hasNext(); ) {
    	    TestModel a = iter.next();
    	    if (a.getId()==objectId) {
    	        iter.remove();
    	    }
    	}
    	return "True";
    }
    public String updateTest(int objectId, TestModel model) {
    	TestModel removeObj = null;
		for (TestModel mod : this.tests) {
			if(mod.getId()==objectId) {removeObj = mod;}
		}
		this.tests.remove(removeObj);
		this.tests.add(model);
    	return "True";
    }
    public List<TestModel> getList(){
    	return tests;
    }
}
