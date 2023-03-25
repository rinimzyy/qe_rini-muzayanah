package starter.network;

import net.thucydides.core.annotations.Step;

public class Network {
    @Step("I am on the network page")
    public void onNetworkPage(){
        System.out.println("I am on the network page");
    }

    @Step("I click follow button on people account")
    public void clickFollow(){
        System.out.println("I click follow button on people account");
    }
    @Step("My request is accepted")
    public void acceptRequest(){
        System.out.println("My request is accepted");
    }
    @Step("II can see their activity")
    public void seeActivity(){
        System.out.println("I can see their activity");
    }
}
