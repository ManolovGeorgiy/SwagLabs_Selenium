package e2e;


import e2e.pages.*;
import e2e.util.DataProviders;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class UserCanWorkWithProductsTest extends TestBase {
    LoginPage loginPage;
    ProductsPage productsPage;
    ProductsInfoPage productsInfoPage;
    YourCartInfoPage yourCartInfoPage;

    AddCheckoutYourInformationPage addCheckoutYourInformationPage;
    CheckoutOverviewPage checkoutOverviewPage;
    CheckoutCompletePage checkoutCompletePage;

    @Epic(value = "User can work with products ")
    @Feature(value = "User")
    @Description(value = " Contact info created ")
    @Severity(SeverityLevel.CRITICAL)
    @AllureId("1")
    @Test(dataProvider = "loginData",dataProviderClass = DataProviders.class)
    public void userCanWorkWithContactTest(String email, String password) {

        String firstName = "Georgiy";
        String lastName = "Manolov";
        String postCode = "13581";

        // login as user " войти как пользователь "
        loginPage=new LoginPage(app.driver);
        loginPage.waitForLoading();
        loginPage.login(email,password);

        productsPage = new ProductsPage(app.driver);
        productsPage.waitForOpen();
        productsPage.setAddProducts();

        productsInfoPage = new ProductsInfoPage(app.driver);
        productsInfoPage.waitForOpen();
        productsInfoPage.clickAddToCartButton();
        productsInfoPage.clickContainerButton();

        yourCartInfoPage = new YourCartInfoPage(app.driver);
        yourCartInfoPage.waitForOpen();
        yourCartInfoPage.clickCheckoutButton();

        addCheckoutYourInformationPage =new AddCheckoutYourInformationPage(app.driver);
        addCheckoutYourInformationPage.setFirstName(firstName);
        addCheckoutYourInformationPage.setLastNameInput(lastName);
        addCheckoutYourInformationPage.setPostCodeInput(postCode);
        addCheckoutYourInformationPage.clickContinueButton();

        checkoutOverviewPage = new CheckoutOverviewPage(app.driver);
        checkoutOverviewPage.clickFinishButton();

        checkoutCompletePage = new CheckoutCompletePage(app.driver);
        checkoutCompletePage.clickBackButton();

    }
}
