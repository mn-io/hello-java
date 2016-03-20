package day1;

public class HelloArgsTest {

    @org.junit.Test
    public void testMainWithFullName() throws Exception {
        HelloArgs.main("Mario Neises");
    }

    @org.junit.Test
    public void testMainWithSeveralNames() throws Exception {
        HelloArgs.main("Mario", "Neises");
    }

    @org.junit.Test
    public void testMainWithNoName() throws Exception {
        HelloArgs.main();
    }

    @org.junit.Test
    public void testMainWithEmptyName() throws Exception {
        HelloArgs.main("");
    }
}