import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.APIResponse;
import com.microsoft.playwright.Playwright;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.lang.foreign.PaddingLayout;
import java.util.Objects;

public class gorestPlaywrightTest

{
    @Test
    public void getUsersApiTest() {
        Playwright playwright = Playwright.create();
        APIRequest request = playwright.request();
        APIRequestContext requestContext = request.newContext();
        APIResponse apiResponse = requestContext.get("https://gorest.co.in/public/v2/users");

        int statusCode = apiResponse.status();
        System.out.println("Status Code: " + statusCode);
        Assert.assertEquals(statusCode, 200);

        String statusResponseText = apiResponse.statusText();
        System.out.println(statusResponseText);

        System.out.println(apiResponse.body().toString());


    }
}
