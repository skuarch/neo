import org.junit.*;

import static net.sourceforge.jwebunit.junit.JWebUnit.*;

public class ExampleWebTestCase {

    @Before
    public void prepare() {
        setBaseUrl("http://localhost:8080/neo");
    }

    @Test
    public void testLogin() {
        beginAt("/");
        //clickLink("login.jsp");
        assertTitleEquals("sispro neo");
        setTextField("username", "test");
        setTextField("password", "test123");
        submit();
        assertTitleEquals("Welcome, test!");
    }
}
		