package com.cxy.csx;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Adapter implements MusicPlayer{

    private QQMusicPlayer qqMusicPlayer;

    public void setQqMusicPlayer(QQMusicPlayer qqMusicPlayer) {
        this.qqMusicPlayer = qqMusicPlayer;
    }

    @Override
    public void player(String fileType, String fileName) {

        Class<? extends QQMusicPlayer> clazz = qqMusicPlayer.getClass();

        try {
            QQMusicPlayer qqMusicPlayer = clazz.newInstance();
            String newStr = "player" + String.valueOf(fileType.charAt(0)).toUpperCase()+ fileType.substring(1);
            Method declaredMethod = clazz.getDeclaredMethod(newStr, String.class);
            declaredMethod.invoke(qqMusicPlayer, fileName);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }


}
