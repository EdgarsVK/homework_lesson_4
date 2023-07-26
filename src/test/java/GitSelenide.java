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

        $(".f6.Link--muted.js-wiki-more-pages-link.btn-link.mx-auto").click();
        $("a[href='/selenide/selenide/wiki/SoftAssertions']").shouldHave(text("SoftAssertions"));

        $("[href='/selenide/selenide/wiki/SoftAssertions']").click();
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