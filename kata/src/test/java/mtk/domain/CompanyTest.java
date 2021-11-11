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

    @Test
    public void companyRenamed2() {
        String proposedName = "Cybertron Unlimited, Ltd.";
        Company aCompany = this.company;
        aCompany.setName(proposedName);
        Assert.assertEquals(proposedName, aCompany.getName());
    }

    @Test
    public void companyCreatedAndVerifiedName() {
        String proposedName = "Cybertron Unlimited, Ltd.";
        Company aCompany   = new Company(proposedName);
        Assert.assertEquals(proposedName, aCompany.getName());

    }
}
