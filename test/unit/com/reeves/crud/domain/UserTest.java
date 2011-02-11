package com.reeves.crud.domain;

import com.reeves.crud.domain.User;
import junit.framework.TestCase;

public class UserTest extends TestCase {

    public void test_first_name() throws Exception {
		User user = new User();
		user.setFirstName("John");
		assertEquals("John", user.getFirstName());
    }
}
