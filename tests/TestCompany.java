//Author: Alexa Nelson
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCompany {
    
    @Test
    void testGetName() {
        Company company = new Company("Starbucks");
        String name = company.getName();
        Assertions.assertEquals("Starbucks", name);
    }

    @Test
    void testMultipleGetName() {
        Company company1 = new Company("Candyland");
        Company company2 = new Company("Pier 500");
        Company company3 = new Company("Barnes & Nobel");

        String name1 = company1.getName();
        String name2 = company2.getName();
        String name3 = company3.getName();

        Assertions.assertEquals("Candyland", name1);
        Assertions.assertEquals("Pier 500", name2);
        Assertions.assertEquals("Barnes & Nobel", name3);
    }
}
