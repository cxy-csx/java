package com.cxy.csx;

public abstract class Handler {

    private Handler postHandler;

    public void setPostHandler(Handler postHandler) {
        this.postHandler = postHandler;
    }

    abstract  void handler(Message message);

    public final void next(Message message){
        if(postHandler != null){
            this.postHandler.handler(message);
        }
    }

}

