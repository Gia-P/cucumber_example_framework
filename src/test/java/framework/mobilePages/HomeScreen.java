package framework.mobilePages;

import framework.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HomeScreen extends MobileBasePage {
    @AndroidFindBy(id = "org.jw.jwlibrary.mobile:id/tv_coaching_whats_new")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement newInJwApp;

    @AndroidFindBy(id = "org.jw.jwlibrary.mobile:id/btn_coaching_continue")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement continueButton;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView")
    private MobileElement dowloadInfo;

    @AndroidFindBy(className = "android.widget.ImageButton")
    private MobileElement menuButton;

    @AndroidFindBy(id = "org.jw.jwlibrary.mobile:id/design_navigation_view")
    private MobileElement sidebarMenu;

    public String getTextNewInJwApp() {
        return getTextFromElement(newInJwApp);
    }

    public void tapOnContinueButton() {
        tapOn(continueButton);
    }

    public void nextScreen() throws InterruptedException {
        if (isElementDisplayed(newInJwApp)){
            System.out.println(getTextNewInJwApp());
            Thread.sleep(3000);
            tapOnContinueButton();
            System.out.println(getTextFromElement(dowloadInfo));
            tapOnContinueButton();
        }
    }

    public void tapOnMenuButton(){
        tapOn(menuButton);
    }

    public boolean isSidebarMenuDisplayed(){
        return isElementDisplayed(sidebarMenu);
    }
}
