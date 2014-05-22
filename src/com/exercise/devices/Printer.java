package com.exercise.devices;

import com.exercise.events.PrinterEvent;

public class Printer extends Device<PrinterEvent> {

	@Override
	void handle(PrinterEvent data) {
		System.out.print(data.getData() + data.getTotal() + "\n");
	}
}
