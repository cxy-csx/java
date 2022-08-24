package com.cxy.csx;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        AHandler aHandler = new AHandler();
        BHandler bHandler = new BHandler();
        Message message = new Message();
        message.setContent("广告, 草泥马, 我是你爸爸");

        aHandler.setPostHandler(bHandler);
        aHandler.handler(message);

        System.out.println(message.getContent());

    }
}
