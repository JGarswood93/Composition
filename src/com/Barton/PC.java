package com.Barton;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor; //constructor to add three different objects
        this.motherboard = motherboard;

    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo() {
        //graphics here
        monitor.drawPixelAt(1200,  50, "yellow");
    }


    }
