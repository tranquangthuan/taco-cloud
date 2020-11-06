package com.thuan.spring.core.domain;

import java.util.List;

import lombok.Data;

@Data
public class Taco {
	private String name;
	private List<String> ingredients;
}
