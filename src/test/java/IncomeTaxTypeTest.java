import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTaxTypeTest {

    @Test
    public void calculateTaxFor() {
        IncomeTaxType incomeTaxType = new IncomeTaxType();
        final BigDecimal original = new BigDecimal(10000);
        final BigDecimal argument = new BigDecimal(0.13);
        final BigDecimal expected = original.multiply(argument);

        final BigDecimal result = incomeTaxType.calculateTaxFor(new BigDecimal(10000));
        Assertions.assertArrayEquals(new BigDecimal[]{expected}, new BigDecimal[]{result});
    }
}