package org.example.OOP.Materi7.Interfaces;

public interface Phone { //Interface = Public secara default
    //Constant field / attribute
    int MAX_VOLUME = 100; //"final" tidak perlu ditulis.
    int MIN_VOLUME = 0;

    //Abstract method
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}
