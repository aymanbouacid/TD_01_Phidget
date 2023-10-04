package org.example;

import com.phidget22.ChannelClass;
import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;
import com.phidget22.PhidgetException;

public class Main {
    public static void main(String[] args) throws PhidgetException {
        System.out.println("Hello world!");


        DigitalOutput do0 = new DigitalOutput();
        do0.setChannel(1);
        do0.open(500);


        if (do0.getAttached()) {
            System.out.println(do0.getDeviceName());
            System.out.println(do0.getDeviceSerialNumber());
            System.out.println(do0.getDeviceChannelCount(ChannelClass.DIGITAL_INPUT));
            System.out.println(do0.getDeviceChannelCount(ChannelClass.DIGITAL_OUTPUT));
            System.out.println(do0.getDeviceChannelCount(ChannelClass.VOLTAGE_INPUT));
        }else {
            System.out.println("ERROR ERROR");
            do0.close();
        }

        //gogog


    }
}