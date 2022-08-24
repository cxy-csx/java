package com.cxy.csx;

public class AHandler extends Handler{
    @Override
    void handler(Message message) {
        message.setContent(message.getContent().replace("广告", "**"));
        this.next(message);
    }
}
