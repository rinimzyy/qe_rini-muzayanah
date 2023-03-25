package starter.post;
import net.thucydides.core.annotations.Step;
public class Post {
    @Step("I am on the post tab")
    public void onPostTab(){
        System.out.println("I am on the post tab");
    }

    @Step("I write something about my activity")
    public void writeMyActivity(){
        System.out.println("I write something about my activity");
    }
    @Step("I click post button")
    public void clickPostButton(){
        System.out.println("I click post button");
    }
    @Step("My network can see my activity")
    public void seeMyActivity(){
        System.out.println("My network can see my activity");
    }
}
