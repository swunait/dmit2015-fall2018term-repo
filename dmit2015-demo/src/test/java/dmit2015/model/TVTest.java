package dmit2015.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TVTest {

	@Test
	public void testTurnOn() {
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);
		
		assertEquals(30, tv1.channel);
		assertEquals(3, tv1.volumeLevel);
		
		TV tv2 = new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		assertEquals(3, tv2.channel);
		assertEquals(2, tv2.volumeLevel);
	}

}
