package starter.logout;

import net.thucydides.core.annotations.Step;

public class Logout {
    @Step("I already login to my account")
    public void alreadyLogin(){
        System.out.println("I already login to my account");
    }
    @Step("I click signout button")
    public void clickSignout(){
        System.out.println("I click signout button");
    }
    @Step("I can logout from my account")
    public void logout(){
        System.out.println("I can logout from my account");
    }
}
