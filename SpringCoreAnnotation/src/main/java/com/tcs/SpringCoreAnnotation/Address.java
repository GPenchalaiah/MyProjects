package com.tcs.SpringCoreAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("address.properties")
public class Address {

	private Integer aid;
	private String city;

	public Integer getAid() {
		return aid;
	}
    
	@Value("${aid}")
	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getCity() {
		return city;
	}
    
	@Value("${city}")
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + "]";
	}

}
