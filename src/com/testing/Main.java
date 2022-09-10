package com.testing;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        int number=123;
        float number2=123.123f;
        double number3=123.123d;
        boolean toggle=false;
        long number4=123l;

        List<Object> dataList = new ArrayList<Object>();

        dataList.add(number);
        dataList.add(number2);
        dataList.add(number3);
        dataList.add(toggle);
        dataList.add(number4);

        for(Object data : dataList){
            System.out.println(data);
        }
    }
}
