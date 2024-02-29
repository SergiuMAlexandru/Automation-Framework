package Pages.AlertFrameWindow;

import Logger.LoggerUtility;
import ObjectData.AlertObject;
import Pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertPage extends BasePage {
    public AlertPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(id = "alertButton")
    private WebElement alertaOkButton;

    @FindBy(id = "timerAlertButton")
    private WebElement alertDelayButton;

    @FindBy(id = "confirmButton")
    private WebElement confirmButton;

    @FindBy(id = "promtButton")
    private WebElement promtButton;

    public void interractAlertOK(){

        elementMethods.clickElement(alertaOkButton);
        LoggerUtility.info("The user clicks on alertaOkButton");

        alertMethods.acceptAlert();
        LoggerUtility.info("The user clicks on acceptAlert");

//        alertaOkButton.click();
//        alertMethods.acceptAlert();
//        Alert alertok = driver.switchTo().alert();
//        alertok.accept();
    }

    public void interractAlertDelay(){

        elementMethods.clickElement(alertDelayButton);
        LoggerUtility.info("The user clicks on alertDelayButton");

        alertMethods.acceptAlert();
        LoggerUtility.info("The user clicks on acceptAlert");

//        alertDelayButton.click();
//        alertMethods.acceptAlert();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alertDelay = driver.switchTo().alert();
//        alertDelay.accept();
    }

    public void interractAlertDismiss(){

        elementMethods.clickElement(confirmButton);
        LoggerUtility.info("The user clicks on confirmButton");

        alertMethods.cancelAlert();
        LoggerUtility.info("The user clicks on cancelAlert");

//        confirmButton.click();
//        alertMethods.cancelAlert();
//        Alert alertConfirmation = driver.switchTo().alert();
//        alertConfirmation.dismiss();
    }

    public void interractAlertValue(AlertObject alertObject){

        elementMethods.clickElement(promtButton);
        LoggerUtility.info("The user clicks on promtButton");

        alertMethods.fillAlert(alertObject.getPromptAlertValue());
        LoggerUtility.info("The user fills the PromptAlertValue" + promtButton);

//        promtButton.click();
//        alertObject.getPromptAlertValue();
//        Alert alertPromt = driver.switchTo().alert();  //facem switchul pe alerta
//        alertPromt.sendKeys(value);
//        alertPromt.accept();
    }
}
