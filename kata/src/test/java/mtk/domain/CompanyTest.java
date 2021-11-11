package mtk.domain;

import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CompanyTest {

    private Company company;

    @Before
    public void setUp() {
        this.company = new Company("Megadyne, Inc.");
    }

    @After
    public void tearDown() {
        this.company = null;
    }

    @Test
    public void companyRenamed() {
        String proposedName = "Cybertron Unlimited, Ltd.";
        Company aCompany = Mockito.spy(this.company);

        aCompany.setName(proposedName);

        verify(aCompany).setName(proposedName);
        Assert.assertNotNull(aCompany.getName());
    }
}
