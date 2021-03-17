import org.junit.Assert.fail
import org.junit.Before
import org.junit.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.web.reactive.function.client.WebClient

@SpringBootTest
class AdmissionsControllerTests {

    private lateinit var webClient: WebClient

    @Before
    fun setup() {
        webClient = WebClient.builder()
            .baseUrl("localhost:8080")
            .build()
    }

    @Test
    fun `user should be able to enter zoo`() {
        fail("failing on purpose!")
    }

}
