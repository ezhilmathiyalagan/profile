package com.java.java5;

public enum Level {
HIGH(1),
MEDIUM(2),
LOW(3);
	final int levelcode;
	private Level(int levelcode) {
		this.levelcode=levelcode;
	}
}
