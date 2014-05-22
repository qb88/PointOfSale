package com.exercise.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DeviceManagerTests.class, PointOfSaleTests.class })
public class AllTests {
}
