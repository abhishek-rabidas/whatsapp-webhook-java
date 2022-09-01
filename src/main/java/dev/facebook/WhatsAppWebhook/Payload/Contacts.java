package dev.facebook.WhatsAppWebhook.Payload;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Contacts {
    private Profile profile;
    private String wa_id;
}
