import base.RootEbay;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import search.SearchEbay;

public class TestEbay extends SearchEbay {
    @Test
    public void test1() {
       searchMenu();
       createAccount();
       buyProduct();
    }

}
