import java.math.BigDecimal;

public class Main {


    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        IncomeTaxType incomeTaxType = new IncomeTaxType();
        VATaxType vaTaxType = new VATaxType();
        ProgressiveTaxType progressiveTaxType = new ProgressiveTaxType();

        Bill[] payments = new Bill[] {
                new Bill(new BigDecimal(10054545.4545),incomeTaxType, taxService),
                new Bill(new BigDecimal(2600.345), vaTaxType, taxService),
                new Bill(new BigDecimal(30000343.2322), progressiveTaxType,taxService),
                new Bill(new BigDecimal(50000), progressiveTaxType, taxService)

        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
