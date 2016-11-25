package com.inspol.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class testRunner {



    @RunWith(Suite.class)
    @Suite.SuiteClasses({
            TestHomePage.class,
    })
    public class MySuite {
  /* placeholder, use this to contain all integration tests in one spot * */
    }
}
