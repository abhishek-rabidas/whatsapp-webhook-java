package dev.facebook.WhatsAppWebhook.Payload;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Entry {
    private int id;
    private Changes[] changes;
}
