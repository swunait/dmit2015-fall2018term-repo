package dmit2015.model;

public class TV {

	static final int MIN_CHANNEL = 1;
	static final int MAX_CHANNEL = 199;
	static final int MIN_VOLUME_LEVEL = 1;
	static final int MAX_VOLUME_LEVEL = 10;
	
	int channel = 1;		// Default channel is 1
	int volumeLevel = 1;	// Default volume level is 1
	boolean on = false;		// TV is off
	
	public TV() {
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void setChannel(int newChannel) {
		if (on && newChannel >= MIN_CHANNEL && newChannel <= MAX_CHANNEL) {
			channel = newChannel;
		}
	}
	
	public void setVolume(int newVolumeLevel) {
		if (on && newVolumeLevel >= MIN_VOLUME_LEVEL && newVolumeLevel <= MAX_VOLUME_LEVEL) {
			volumeLevel = newVolumeLevel;
		}
	}
	
	public void channelUp() {
		if (on && channel <= MAX_CHANNEL) {
			channel++;
		}
	}
	
	public void channelDown() {
		if (on && channel > MIN_CHANNEL) {
			channel--;
		}
	}
	
	public void volumeUp() {
		if (on && volumeLevel < MAX_VOLUME_LEVEL) {
			volumeLevel++;
		}
	}

	public void volumeDown() {
		if (on && volumeLevel > MIN_VOLUME_LEVEL) {
			volumeLevel--;
		}
	}

}
