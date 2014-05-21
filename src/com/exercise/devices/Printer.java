package com.exercise.devices;

import com.exercise.events.PrinterEvent;

public class Printer {

	void handle(PrinterEvent data) {
		System.out.println(data.getData());
		System.out.println(data.getTotal());
	}
}
