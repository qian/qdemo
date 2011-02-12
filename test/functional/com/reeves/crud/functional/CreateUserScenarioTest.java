package com.reeves.crud.functional;

import com.thoughtworks.selenium.*;
import java.util.regex.Pattern;
// Selenium-IDE add the Pattern module because it's sometimes used for
// regex validations. You can remove the module if it's not used in your
// script.

public class CreateUserScenarioTest extends SeleneseTestCase {
  // We create our Selenium test case

        public void setUp() throws Exception {
          setUp("http://localhost:8080/", "*firefox");
               // We instantiate and start the browser
        }

        public void testNew() throws Exception {
             selenium.open("/");
             selenium.waitForPageToLoad("30000");
             assertTrue(selenium.isTextPresent("List Of Users"));
             selenium.click("Add New User");
             selenium.waitForPageToLoad("30000");
             
             // selenium.type("q", "selenium rc");
             // selenium.click("btnG");
             // selenium.waitForPageToLoad("30000");
             // assertTrue(selenium.isTextPresent("Results * for selenium rc"));
             // These are the real test steps
       }
  }
