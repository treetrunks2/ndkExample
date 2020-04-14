package com.treetrunks.jnimodule;

public class JNIClass {
    static {
        System.loadLibrary("str_module");
    }

    //native 함수
    public native String getNumString(String str, int num);

    //native 코드에서 호출하는 콜백함수
    private String callback(String str, int num) {
        return str + " : " + num;
    }
}
