package com.cxy.csx;

public class BHandler extends Handler {
    @Override
    void handler(Message message) {
        message.setContent(message.getContent().replace("草泥马", "**"));
        this.next(message);
    }
}
