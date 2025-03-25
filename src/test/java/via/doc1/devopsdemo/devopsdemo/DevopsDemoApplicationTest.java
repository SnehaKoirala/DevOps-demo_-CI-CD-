package via.doc1.devopsdemo.devopsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

import via.doc1.devopsdemo.DevopsDemoApplication;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DevopsDemoApplicationTest {

    @LocalServerPort
    private int port;

    private final RestTemplate restTemplate = new RestTemplate();

    @Test
    void testApplicationStarts() {
        // Ensure that the application context loads without issues
        DevopsDemoApplication.main(new String[]{}); // Ensure the application starts
    }

    @Test
    void testIndexPage() {
        String response = restTemplate.getForObject("http://localhost:" + port + "/", String.class);
        assertThat(response).contains("<h1>DevOps and Cloud</h1>");
        assertThat(response).contains("<h2>Dockerizing Spring Boot Backend Application.</h2>");
        assertThat(response).contains("With Docker, we can containerize SEP4 back-end and front-end applications.");
    }
}
