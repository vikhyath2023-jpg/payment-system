import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testDeposit() {
        App bank = new App();
        assertEquals(1500, bank.deposit(1000, 500));
    }

    @Test
    void testWithdraw() {
        App bank = new App();
        assertEquals(700, bank.withdraw(1000, 300));
    }

    @Test
    void testWithdrawInsufficientBalance() {
        App bank = new App();
        assertEquals(1000, bank.withdraw(1000, 1500));
    }

    @Test
    void testCheckBalance() {
        App bank = new App();
        assertEquals(1000, bank.checkBalance(1000));
    }
}