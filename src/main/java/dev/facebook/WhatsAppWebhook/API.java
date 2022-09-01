package dev.facebook.WhatsAppWebhook;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;

@RestController
public class API {

    public void verify() {

    }

    @PostMapping(path = "/webhook")
    public void webhook(HttpServletRequest request) throws Exception {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader in = request.getReader()) {
            char[] buf = new char[4096];
            for (int len; (len = in.read(buf)) > 0; )
                builder.append(buf, 0, len);
        }
        String requestBody = builder.toString();
        System.out.println("Request body: " + requestBody);
    }
}
