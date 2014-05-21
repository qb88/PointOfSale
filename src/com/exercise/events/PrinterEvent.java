package com.exercise.events;


public class PrinterEvent implements Event {

	private String data;
	private String total;

	public PrinterEvent(String data, String total) {
		this.data = data;
		this.total = total;
	}
	
	@Override
	public String getData() {
		return data;
	}
	
	public String getTotal() {
		return total;
	}

}
