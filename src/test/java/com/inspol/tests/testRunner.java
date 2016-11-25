package com.inspol.tests;


import com.inspol.tests.testPage;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class testRunner {

    @RunWith(Suite.class)
    @Suite.SuiteClasses({
            testPage.class,
            testPage2.class,
            testPage3.class,
            testPage4.class,
            TestHomePage.class,
    })
    public class MySuite {
  /* placeholder, use this to contain all integration tests in one spot * */
    }
}
