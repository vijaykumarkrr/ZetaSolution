package com.he.addressBook;

public class PhoneNumber {
    private String label;
    private String phoneNumber;

    public PhoneNumber(String label, String phoneNumber) throws Exception {
        // TODO
		if (label == null || label.isEmpty() || label.length() > 255) {
			throw new RuntimeException();
		} else {
			this.label = label;
		}
		
		if (phoneNumber.matches("[0-9]+") && phoneNumber.length() == 10) {
			this.phoneNumber = phoneNumber;
		} else {
			throw new RuntimeException();
		}
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
