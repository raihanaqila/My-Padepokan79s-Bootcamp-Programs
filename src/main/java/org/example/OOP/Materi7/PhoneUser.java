package org.example.OOP.Materi7;

import org.example.OOP.Materi7.Interfaces.Phone;

public class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    public void turnOnThePhone() {
        this.phone.powerOn();
    }

    public void turnOffThePhone() {
        this.phone.powerOff();
    }

    public void makePhoneLouder() {
        this.phone.volumeUp();
    }

    public void makePhoneSilent() {
        this.phone.volumeDown();
    }

    //getter & setter (karena Phone phone itu private)
    public Phone getPhone() {
        return this.phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
