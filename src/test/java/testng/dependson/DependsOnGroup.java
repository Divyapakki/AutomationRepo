package testng.dependson;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {

    @Test(groups = {"smoke"})

    public void verifyFundsTransfer(){

        Assert.assertTrue(false);
        System.out.println("Verify fund Transfer");
    }

    @Test(dependsOnGroups  = {"smoke"})

    public void verifyFundsTransferWithSaving(){
        System.out.println("verifyFundsTransferWithSaving");
    }

    @Test
    public void verifyCashBackOffer(){
        System.out.println("verify CashBack Offer");
    }
}


