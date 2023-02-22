/*7-4. MyTv클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고
대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 getter와 setter메서드를 추가하라*/

class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;



    // (구현)
    public int getChannel() {
        return this.channel;
    }
    public void setChannel(int num) {
        if (channel > MAX_CHANNEL || channel < MIN_CHANNEL) return;
        this.channel = num;
    }

    public int getVolume() {
        return this.volume;
    }
    public void setVolume(int num) {
        if (volume > MAX_VOLUME || volume < MIN_VOLUME) return;

        this.volume = num;
    }

}

class Exercise7_4 {
    public static void main(String args[]) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:" + t.getVolume());
    }
}
//예상결과) CH:10 VOL:20