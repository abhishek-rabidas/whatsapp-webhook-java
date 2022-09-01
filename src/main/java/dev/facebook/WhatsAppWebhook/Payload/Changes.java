package dev.facebook.WhatsAppWebhook.Payload;

import lombok.Getter;

@Getter
public class Changes {
    private Value value;
    private String field;
}
