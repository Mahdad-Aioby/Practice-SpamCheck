package com.company;

public class InvalidContent extends SpamDetector {
    @Override
    public boolean Detect(Message message) {

       if(checkContent(message.getContent())) return true;
       else return false;

    }

    private boolean checkContent(String content){
        if(content.contains("spam")) return true;
        char[] chars = content.toCharArray();
        int x = 0;
        for (char c:chars) {
            if(Character.isDigit(c) || Character.isAlphabetic(c) || Character.isSpaceChar(c)) x++;

            }
        if(x<chars.length/2){
            return true;

        }
        return false;
    }


}
