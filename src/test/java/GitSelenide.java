import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitSelenide {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
    @Test
    void testSoftAssertionsPageJUnit5Code() {
        open("/selenide/selenide");

        $("#wiki-tab").click();

        $("#wiki-pages-box button").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $(".markdown-body").$(byText("3. Using JUnit5 extend test class:")).sibling(0)
                .shouldHave(text(
                        "@ExtendWith({SoftAssertsExtension.class})\n" +
                                "class Tests {\n" +
                                "    @Test\n" +
                                "    void test() {\n" +
                                "        Configuration.assertionMode = SOFT;\n" +
                                "        open(\"page.html\");\n" +
                                "        $(\"#first\").should(visible).click();\n" +
                                "        $(\"#second\").should(visible).click();\n" +
                                "    }\n" +
                                "}\n"
                ));
    }
}