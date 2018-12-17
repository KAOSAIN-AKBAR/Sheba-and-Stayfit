

package com.natasa.progressviews.utils;

public enum ProgressLineOrientation {
	HORIZONTAL(0), VERTICAL(1);

	int value;

	private ProgressLineOrientation(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
