public class HelloWorldTest { // surefire plugin automatically pics POJO's ending in *Test, *TestCase, methods starting with test*

    public void testHello() {
        System.out.println("TEST - Hello...");
    }

    public void testWorld() {
        System.out.println("TEST - World!");
    }

}