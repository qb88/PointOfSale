package com.exercise.devices;

import com.exercise.events.LCDEvent;

public class LCD extends Device<LCDEvent> {

	@Override
	void handle(LCDEvent data) {
		System.out.print(data.getData() + "\n");
	}
}
