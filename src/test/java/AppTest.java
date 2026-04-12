import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testGetProduct() {
        App app = new App();
        assertEquals("Product: Laptop Price: 50000",
                     app.getProduct("Laptop", 50000));
    }
}