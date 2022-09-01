package dev.facebook.WhatsAppWebhook.Payload;

import lombok.Getter;

@Getter
public class Value {
    private String messagingProduct;
    private Metadata metadata;
    private Contacts[] contacts;
    private Messages[] messages;
}
