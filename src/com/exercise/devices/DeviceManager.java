package com.exercise.devices;

import com.exercise.events.LCDEvent;
import com.exercise.events.PrinterEvent;

public class DeviceManager implements EventHandler{

	private Printer printer;
	private LCD lcd;
	
	public DeviceManager() {
		printer = new Printer();
		lcd = new LCD();
	}
	
	@Override
	public void handleEvent(PrinterEvent event) {
		printer.handle(event);
	}

	@Override
	public void handleEvent(LCDEvent event) {
		lcd.handle(event);
	}
}
