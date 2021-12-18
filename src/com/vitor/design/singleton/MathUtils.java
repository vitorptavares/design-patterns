package com.vitor.design.singleton;

import java.io.Serializable;

public class MathUtils implements Serializable {

    private static MathUtils instance;

    private MathUtils(){
    }

    public static MathUtils getMethUtils(){
        synchronized (MathUtils.class){
            if(instance==null){
                instance = new MathUtils();
            }
        }
        return instance;
    }

    public Object readResolve(){
        return instance;
    }
}
