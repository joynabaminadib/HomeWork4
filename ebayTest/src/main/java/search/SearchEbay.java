package search;

import base.RootEbay;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SearchEbay extends RootEbay {
    public void searchMenu() {
        typeOnElementNEnterCss("#gh-ac", "books");


        getEelementsByCss("[data-view='mi\\:1686\\|iid\\:1'] [data-track] [role]");
        navigateBack();
        getEelementsByCss("[data-view='mi\\:1686\\|iid\\:2'] [data-track] [role]");
        navigateBack();
        getEelementsByxpath("//ul[@class='x-refine__body']/div[@class='x-refine__left__nav']/li[1]/ul[@class='srp-refine__category__list']/li[@class='srp-refine__category__item']/ul[@class='srp-refine__category__list']//a[@href='https://www.ebay.com/sch/15032/i.html?_from=R40&_nkw=books']/span[.='Cell Phones & Accessories']");
        getEelementsByCss("[data-view='mi\\:1686\\|iid\\:1'] [data-track] [role]");
        getEelementsByCss("#binBtn_btn");
        navigateBack();
        navigateBack();
        navigateBack();
    }
    public void createAccount() {
    getEelementsByxpath("//a[contains(text(),'register')]");
    putElementOnCss("#firstname", "Joynab");
    putElementOnCss("#lastname", "Amin");
    putElementOnCss("#email", "naynaamin@gmail.com");
    putElementOnCss("#PASSWORD", "Abcd-1234");
    getSubmitByXpath("//button[@id='ppaFormSbtBtn']");
    navigateBack();
}
    public void buyProduct() {
    typeOnElementNEnterCss("#gh-ac", "books");
    getEelementsByCss("[data-view='mi\\:1686\\|iid\\:1'] [data-track] [role]");
    getEelementsByCss("#binBtn_btn");
    getEelementsByCss("#sbin-gxo-btn");
    selectElementOnxpath("//input[@id='radio-group-LOGISTIC_SERVICE_ITEM_232990353663-NIL-NIL-420007']");
    selectOnid1("country");
    putElementOnCss("#firstName", "Joynab");
    putElementOnCss("#lastName", "Amin");
    putElementOnCss("#addressLine1", "2703 Fenton Avenue");
    putElementOnCss("#city", "Bronx");
    selectOnid2("stateOrProvince","New York");
    putElementOnCss("#postalCode", "10469");
    putElementOnCss("#email", "naynaamin@gmail.com");
    putElementOnCss("#emailConfirm", "naynaamin@gmail.com");
    putElementOnCss("#phoneNumber", "6468757036");
    getSubmitByXpath("//button[contains(text(),'Done')]");






}
}



