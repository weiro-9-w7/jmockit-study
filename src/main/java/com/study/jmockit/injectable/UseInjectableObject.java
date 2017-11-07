package com.study.jmockit.injectable;

import com.study.jmockit.mock.SimpleDAO;

public class UseInjectableObject {

    public String fun1(String name) {
        InjectableObject injectableObject = new InjectableObject();
        return injectableObject.fun1(name);
    }
}
