package com.prodobro;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "email_id")
    private Integer emailId;

    @Column (name = "recepient")
    private String receiver;

    @Column (name = "sender")
    private String sender;

    @Column (name = "subject")
    private String title;

    @Column (name = "message_body")
    private String message_body;

    @Column (name = "attachment_id")
    private int attachment_id;

    @Column (name = "created_date")
    private Date created_date;

    @Column (name = "created_by_id")
    private int created_by_id;

    @Column (name = "status_id")
    private int status_id;

    @Column (name = "send_date")
    private Date send_date;


    public Integer getEmailId() {
        return emailId;
    }

    public void setEmailId(Integer emailId) {
        this.emailId = emailId;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage_body() {
        return message_body;
    }

    public void setMessage_body(String message_body) {
        this.message_body = message_body;
    }

    public int getAttachment_id() {
        return attachment_id;
    }

    public void setAttachment_id(int attachment_id) {
        this.attachment_id = attachment_id;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public int getCreated_by_id() {
        return created_by_id;
    }

    public void setCreated_by_id(int created_by_id) {
        this.created_by_id = created_by_id;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public Date getSend_date() {
        return send_date;
    }

    public void setSend_date(Date send_date) {
        this.send_date = send_date;
    }
}
