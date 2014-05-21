package com.exercise.devices;

import com.exercise.events.LCDEvent;

public class LCD {

	void handle(LCDEvent data) {
		System.out.println(data.getData());
	}

}
