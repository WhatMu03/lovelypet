package com.mumu.lp.vo;

import java.util.HashMap;

public class R extends HashMap<String, Object> {
    public R(){
        this.put((String)"code", 0);
    }
    public static R error(int code, String msg){
        R r = new R();
        r.put("code", code);
        r.put("message", msg);
        return r;
    }

    public static R ok(String msg){
        R r = new R();
        r.put("message", msg);
        return r;
    }

    public static R ok(){
        return new R();
    }

    public R put(String key, Object value){
        super.put(key, value);
        return this;
    }
}
