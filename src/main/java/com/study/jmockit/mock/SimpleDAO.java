package com.study.jmockit.mock;

public class SimpleDAO {
    public String fun1(String str) {
        return "real: public String fun1(" + str + ")";
    }

    private String fun2(String str) {
        return "real: private String fun2(" + str + ")";
    }

    public String fun3(String str) {
        return "real: public String fun3(" + str + ")";
    }

    public String fun4(String str) {
        return fun2(str);
    }
}
