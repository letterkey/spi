package com.ymy.spi.b;

import com.ymy.spi.SpiService;

public class SpiServiceImplB implements SpiService {
    public void sayHello(String msg) {
        System.out.println("B+++++++++++"+ msg);
    }
}
