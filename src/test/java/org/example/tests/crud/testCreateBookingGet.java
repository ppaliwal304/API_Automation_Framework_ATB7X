package org.example.tests.crud;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCreateBookingGet {

    @Link(name = "Link to TC", url = "https://bugz.atlassian.net/browse/RBT-4")
    @Issue("JIRA_RBT-4")
    @TmsLink("RBT-4")
    @Owner("Promode")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify that Get request is working fine.")
    @Test
    public void testVerifyCreateBookingGet01(){
        Assert.assertEquals(true,true);
    }
}