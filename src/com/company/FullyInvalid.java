package com.company;

public class FullyInvalid extends SpamDetector {
    @Override
    public boolean Detect(Message message) {
        if (invalidContent(message) && invalidSender(message)) return true;
        else return false;
    }

    private boolean invalidContent(Message message){
        SpamDetector spamDetector = new InvalidContent();
        return spamDetector.Detect(message);
    }

    private boolean invalidSender(Message message){
        SpamDetector spamDetector = new InvalidSender();
        return spamDetector.Detect(message);
    }
}
