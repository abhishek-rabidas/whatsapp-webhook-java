package dev.facebook.WhatsAppWebhook;


import com.fasterxml.jackson.databind.util.JSONPObject;
import dev.facebook.WhatsAppWebhook.Payload.Request;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Map;

@RestController
public class API {

    public void verify() {

    }

    @PostMapping(path = "/webhook")
    public void webhook(@RequestBody Request request) throws Exception {
        /*StringBuilder builder = new StringBuilder();
        try (BufferedReader in = request.getReader()) {
            char[] buf = new char[4096];
            for (int len; (len = in.read(buf)) > 0; )
                builder.append(buf, 0, len);
        }*/

        System.out.println(request.getEntry()[0].getChanges()[0].getValue().getMessages()[0].getText().getBody());

    }
}
