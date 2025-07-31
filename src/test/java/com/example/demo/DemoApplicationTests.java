package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DemoApplicationTests {

    @Test
    void testHomeEndpoint() {
        HelloController controller = new HelloController();
        String result = controller.home();
        assertEquals("Hello from Jenkins CI/CD pipeline!", result);
    }
}
