package starter.Notif;

import net.thucydides.core.annotations.Step;

public class Notif {
    @Step("I am on my Linkdin Dashboard")
    public void onTheDashboard(){
        System.out.println("I am on my Linkdin Dashboard");
    }

    @Step("I click notification button")
    public void clickNotification(){
        System.out.println("I click notification button");
    }
    @Step("I can see my notification")
    public void seeMyNotification(){
        System.out.println("I can see my notification");
    }
}
