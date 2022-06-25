import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @CsvFileSource(resources = {"/data.csv"})
    @ParameterizedTest
    public void shouldCalculate(String user, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void shouldCalculateForRegisteredAndUnderLimit() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 1000_60;
//        boolean registered = true;
//        long expected = 30;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldCalculateForRegisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 1_000_000_60;
//        boolean registered = true;
//        long expected = 500;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldCalculateForNotRegisteredAndUnderLimit() {
//        BonusService service = new BonusService();
//
//        long amount = 1000_60;
//        boolean registered = false;
//        long expected = 10;
//
//        long actual = service.calculate(amount, registered);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldCalculateForNotRegisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        long amount = 1_000_000_60;
//        boolean registered = false;
//        long expected = 500;
//
//        long actual = service.calculate(amount, registered);
//
//        Assertions.assertEquals(expected, actual);
//    }
}
