package dev.facebook.WhatsAppWebhook.Payload;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Changes {
    private Value value;
    private String field;
}
