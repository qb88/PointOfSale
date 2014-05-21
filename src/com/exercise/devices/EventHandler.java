package com.exercise.devices;

import com.exercise.events.LCDEvent;
import com.exercise.events.PrinterEvent;

public interface EventHandler {

	public void handleEvent(PrinterEvent event);
	public void handleEvent(LCDEvent event);
}
