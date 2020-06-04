package dk.xam;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static dk.xam.starfish.Starfish.validate_url;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class StarfishTest {

    @Test
    public void testURLValidator() {
        
        assertEquals(true,validate_url("https://github.com/user-name/repo-name.git"),"URL Validation test failes");
        assertEquals(true,validate_url("http://github.com/user-name/repo-name.git"),"URL Validation test failes");
        assertEquals(true,validate_url("git@github.com:user-name/repo-name.git"),"URL Validation test failes");

        
    }

}