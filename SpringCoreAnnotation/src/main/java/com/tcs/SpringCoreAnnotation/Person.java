package com.tcs.SpringCoreAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("db.properties")
public class Person {

	private Integer pid;
	private String name;
	private Double salary;

	public Integer getPid() {
		return pid;
	}
    
	@Value("${pid}")
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}
    
	@Value("${name}")
	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}
    
	@Value("${salary}")
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", salary=" + salary + "]";
	}

}
