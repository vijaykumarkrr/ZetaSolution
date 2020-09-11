package com.he.addressBook;

public class Address {

	private String label;
	private String address;
	
	public Address(String label, String address) throws Exception {
		// TODO
		if (label == null || label.isEmpty() || label.length() > 255) {
			throw new RuntimeException();
		} else {
			this.label = label;
		}
		if (address.isEmpty()) {
			throw new RuntimeException();
		} else {
			this.address = address;
		}
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public String getAddress() {
		return this.address;
	}
}
