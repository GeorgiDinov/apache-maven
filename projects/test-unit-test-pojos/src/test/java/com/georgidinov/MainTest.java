package com.georgidinov;


/**
 * Maven will pick class starting with 'Test*', ending in '*Test', '*TestCase' and will execute all methods in
 * it starting with 'test*'
 */
public class MainTest {

    public void testGetHw() {
        Main main = new Main();
        String hw = main.getHw();
        assert("Hello World".equals(hw));
    }

}
