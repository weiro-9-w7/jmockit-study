package com.study.jmockit.mock;

public class SimpleService {
    public String fun1(String name) {
        SimpleDAO simpleDAO = new SimpleDAO();
        return simpleDAO.fun1(name);
    }
}
