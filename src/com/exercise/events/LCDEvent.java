package com.exercise.events;

public class LCDEvent implements Event {

	private String data;

	public LCDEvent(String data) {
		this.data = data;
	}

	@Override
	public String getData() {
		return data;
	}
}
