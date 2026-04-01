package Tehtava5.task1;


public class Television {

     int channel;
     boolean on;

    public Television() {
        channel = 1;
        on = false;
    }

    public void pressOnOff() {
        on = !on;
    }

    public boolean isOn() {
        return on;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (on) {
            if (channel > 10)
                this.channel = 1;
            else
                this.channel = channel;
        }
    }
}


