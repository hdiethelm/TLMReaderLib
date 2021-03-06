package com.monstarmike.tlmreader.datablock;

import com.google.common.primitives.Shorts;

public class AirspeedBlock extends DataBlock {

	/*
	 * Address 0x11: Airspeed
	 * 
	 * 11.00.MSB,LSB,01,F9,00,00,00,00,00,00,00,00,00,00 MSB and LSB are a 16Bit
	 * value, 1 unit is 1 km/h. Displays up to 65535 km/h, maximum alarm value
	 * 563 km/h
	 */

	Short airspeed = null;

	public short get_airspeed() {
		if (this.airspeed == null) {
			this.airspeed = Shorts.fromBytes(this.rawData[6], this.rawData[7]);
		}
		
		return this.airspeed;
	}

	public AirspeedBlock(byte[] rawData) {
		super(rawData);
	}
}
