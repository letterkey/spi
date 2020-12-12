package com.ymy.spi.test;

import com.ymy.spi.SpiService;

import java.util.Iterator;
import java.util.ServiceLoader;

public class TestSpi {
    public static void main(String[] args) throws Exception{
        ServiceLoader<SpiService> loadedParsers = ServiceLoader.load(SpiService.class);
        Iterator<SpiService> iterator = loadedParsers.iterator();
        while (iterator.hasNext()){
            SpiService spiService = iterator.next();
            spiService.sayHello("muyanggege");
        }
    }
}
