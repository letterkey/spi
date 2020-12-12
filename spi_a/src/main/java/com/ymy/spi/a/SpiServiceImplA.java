package com.ymy.spi.a;

import com.ymy.spi.SpiService;

public class SpiServiceImplA implements SpiService {
    public void sayHello(String msg) {
        System.out.println("A----------"+ msg);
    }
}
