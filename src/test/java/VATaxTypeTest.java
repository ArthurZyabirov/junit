import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class VATaxTypeTest {

    @Test
    public void testCalculateTaxFor() {
        VATaxType vaTaxType = new VATaxType();
        final BigDecimal original = new BigDecimal(100);
        final BigDecimal argument = new BigDecimal(0.18);
        final BigDecimal expected = original.multiply(argument);

        final BigDecimal result = vaTaxType.calculateTaxFor(new BigDecimal(100));
        Assertions.assertArrayEquals(new BigDecimal[]{expected}, new BigDecimal[]{result});
    }
}