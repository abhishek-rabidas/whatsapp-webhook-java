package dev.facebook.WhatsAppWebhook;

import dev.facebook.WhatsAppWebhook.Payload.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RestController
public class API {

    @Autowired
    MessageEntityRepository messageEntityRepository;

    @Value("${VERIFY_TOKEN}")
    private String VERIFY_TOKEN;

    @GetMapping("/webhook")
    public ResponseEntity<String> verify(@RequestParam("hub.mode") String mode, @RequestParam("hub.verify_token") String verifyToken,
                                         @RequestParam("hub.challenge") String challenge) {
        if (mode != null && verifyToken != null) {
            if (mode.equals("subscribe") && verifyToken.equals(VERIFY_TOKEN)) {
                System.out.println("Webhook Verified");
                return ResponseEntity.ok(challenge);
            }
        }
        return ResponseEntity.status(403).body(null);
    }

    @PostMapping(path = "/webhook")
    public void webhook(@RequestBody Request request) throws Exception {
        MessageEntity message = new MessageEntity();
        message.setSenderNumber(request.getEntry()[0].getChanges()[0].getValue().getMessages()[0].getFrom());
        message.setMessage(request.getEntry()[0].getChanges()[0].getValue().getMessages()[0].getText().getBody());
        message.setTimestamp(new Date()); //TODO : change to message timing
        messageEntityRepository.save(message);
    }
}
