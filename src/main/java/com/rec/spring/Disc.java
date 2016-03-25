package com.rec.spring;

import org.springframework.beans.factory.annotation.Value;

public class Disc {

	@Value("${title}")
	private String title;

	public String getTitle() {
		return title;
	}

}
