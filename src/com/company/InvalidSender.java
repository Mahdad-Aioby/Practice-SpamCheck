package com.company;

public class InvalidSender extends SpamDetector {
    @Override
    public boolean Detect(Message message) {
        if(checkSender(message.getSenderId())) return true;
        else return false;

    }

    private boolean checkSender(String sender){
        char[] senderId = sender.toCharArray();
        for (char c:senderId) {
           if(Character.isDigit(c))continue;
           else {
               return false;
           }
        }
        return true;
    }
}
