package com.prodobro;

public interface EmailDAO {

    public Email saveMessage(Email email);

    public Email updateMessage(Email email);

    public void deleteMessage(int emailId);

    public Email getId(int emailId);

}
