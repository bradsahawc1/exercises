class TV {
    boolean status = false;
    int channel = 1;
    int volumeLevel = 1;
    public TV () {}
    public void turnOn () {
        status = true;
    }
    public int setChannel (int c) {
        if (status == true) {
            if (c >= 1 && c <= 120) {
                channel = c;
            }
        }
        return channel;
    }
    public int setVolume (int v) {
        if (status == true) {
            if (v >= 1 && v <= 7) {
                volumeLevel = v;
            }
        }
        return volumeLevel;
    }
    public void channelUp () {
        if (channel < 120) {
            channel++;
        }
    }
    public void channelDown () {
        if (channel > 1) {
            channel--;
        }
    }
    public void volumeUp () {
        if (volumeLevel < 7) {
            volumeLevel++;
        }
    }
    public void volumeDown () {
        if (volumeLevel > 1) {
            volumeLevel--;
        }
    }
    public void turnOff () {
        status = false;
    }
}

public class TVTest {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        tv.volumeUp();
        System.out.println("1.1: " + (tv.volumeLevel == 2));
        tv.channelUp();
        System.out.println("1.2: " + (tv.channel == 2));
    }
}

/** output
 1.1: true
 1.2: true
 */