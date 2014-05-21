package com.exercise.pos;
import java.util.Scanner;

import com.exercise.devices.DeviceManager;
import com.exercise.events.LCDEvent;
import com.exercise.events.PrinterEvent;

public class PointOfSale {

	private final static String EMPTY = "";
	private final static String EXIT = "exit";
	private final static String EMPTY_DESCRIPTION = "Invalid bar-code";
	
	public static void main(String[] args) {
		Transaction transaction = new Transaction();
		DeviceManager devices = new DeviceManager();
		Scanner scanner = new Scanner(System.in);
		while(true) {		
			String in = scanner.nextLine();
			switch(in) {
			case EMPTY:
				devices.handleEvent(new LCDEvent(EMPTY_DESCRIPTION));
				break;
			case EXIT:
				devices.handleEvent(new PrinterEvent(transaction.getShopping(), String.valueOf(transaction.getTotalCost())));
				devices.handleEvent(new LCDEvent(String.valueOf(transaction.getTotalCost())));
				transaction.finish();
				break;
			default:
				devices.handleEvent(new LCDEvent(transaction.checkProduct(in)));
				break;
			} 
		}
	}
}
