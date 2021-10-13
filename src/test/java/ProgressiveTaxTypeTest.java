import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProgressiveTaxTypeTest {

    @Test
    public void calculateTaxFor() {
        ProgressiveTaxType progressiveTaxType = new ProgressiveTaxType();
        final BigDecimal original = new BigDecimal(2000);
        final BigDecimal argument = new BigDecimal(0.10);
        final BigDecimal expected = original.multiply(argument);

        final BigDecimal result = progressiveTaxType.calculateTaxFor(new BigDecimal(2000));
        Assertions.assertArrayEquals(new BigDecimal[]{expected}, new BigDecimal[]{result});

    }
}