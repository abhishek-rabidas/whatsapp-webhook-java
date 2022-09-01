package dev.facebook.WhatsAppWebhook;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class MessageEntity extends AbstractPersistable<Long> {
    private String senderNumber;
    private String message;
    private Date timestamp;
}
