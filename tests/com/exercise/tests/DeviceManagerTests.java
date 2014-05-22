package com.exercise.tests;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.exercise.devices.DeviceManager;
import com.exercise.events.LCDEvent;
import com.exercise.events.PrinterEvent;


public class DeviceManagerTests {

	private final static String PRINTER_TEST = "Printer is working!";
	private final static String PRINTER_TOTAL_TEST = "123";
	private final static String LCD_TEST = "LCD is working";
	
	private DeviceManager manager;
	private ByteArrayOutputStream out; 
	
	@Before
	public void setup() {
		out = new ByteArrayOutputStream();
		manager = new DeviceManager();
		System.setOut(new PrintStream(out));
	}
	
	@Test
	public void PrinterEventTest() {
		PrinterEvent printerEvent = new PrinterEvent(PRINTER_TEST, PRINTER_TOTAL_TEST);
		assertEquals(printerEvent.getData(), PRINTER_TEST);
		assertEquals(printerEvent.getTotal(), PRINTER_TOTAL_TEST);
		
		manager.handleEvent(printerEvent);
		assertEquals(PRINTER_TEST + PRINTER_TOTAL_TEST + "\n", out.toString());
		
	}
	
	@Test
	public void LCDEventTest() {
		LCDEvent lcdEvent = new LCDEvent(LCD_TEST);
		assertEquals(lcdEvent.getData(), LCD_TEST);
		
		manager.handleEvent(lcdEvent);
		assertEquals(LCD_TEST + "\n", out.toString());
	}
	
	@After
	public void clean() {
		System.setOut(null);
	}
}
