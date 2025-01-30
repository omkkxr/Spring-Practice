package com.ok.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenarator {
	@Autowired
	private LocalDateTime date;

	public WishMessageGenarator() {
		System.out.println("WishMessageGenarator :: 0-param constructor");
	}

	public String wishMessage(String user) {

		int n = date.getHour();
		if (n < 11) {
			return user + " Good Morning";
		} else if (n < 17 && n > 11) {
			return user + " Good Afternoon";
		} else if (n < 22 && n > 17) {
			return user + " Good Evening";
		} else {
			return user + " Good Night";
		}
	}
}
