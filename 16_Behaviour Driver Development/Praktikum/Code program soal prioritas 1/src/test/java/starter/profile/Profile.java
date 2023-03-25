package starter.profile;
import net.thucydides.core.annotations.Step;
public class Profile {
    @Step("I am on the Linkdin Dashboard")
    public void onTheDashboard(){
        System.out.println("I am on the Linkdin Dashboard");
    }

    @Step("I click my profile")
    public void clickMyProfile(){
        System.out.println("I click my profile");
    }
    @Step("I can see my profile")
    public void seeMyProfile(){
        System.out.println("I can see my profile");
    }
}
