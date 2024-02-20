package com.main;


import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootRunner {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootRunner.class, args);
		String input = null;
		StringBuffer value = new StringBuffer();
    	value.append(input);
    	value.append("result");
    	System.out.println("--------------------");
    	System.out.println(value);
    	System.out.println("--------------------");

	}

}
