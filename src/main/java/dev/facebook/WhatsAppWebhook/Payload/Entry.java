package dev.facebook.WhatsAppWebhook.Payload;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Entry {
    private String id;
    private Changes[] changes;
}
