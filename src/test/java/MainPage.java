import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
  Главная страница сайта Appleinsider.ru
 */
public class MainPage {
    private final SelenideElement searchButton = $x("//form[@name='search']");
    private final SelenideElement textBoxInput = $x("//input[@name='s']");

    public MainPage(String url){
        Selenide.open(url);
    }

    /**
     * Выполнется поиск на сайте статей и нажимается кнопка Enter
     * @param searchString поисковая строка
     */
    public void search(String searchString){
        searchButton.click();
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
    }

}
