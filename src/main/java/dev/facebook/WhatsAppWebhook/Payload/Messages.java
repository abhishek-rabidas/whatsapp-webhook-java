package dev.facebook.WhatsAppWebhook.Payload;

import lombok.Getter;

@Getter
public class Messages {
    private String from;
    private String id;
    private String timestamp;
    private Text text;
    private String type;
}
