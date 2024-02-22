package org.example;

public class Logger implements iLogger{

    @Override
    public void log(String line){
        System.out.println(line);
    }
}
