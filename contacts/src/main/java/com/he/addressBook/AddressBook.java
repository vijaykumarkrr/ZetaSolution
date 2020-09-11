package com.he.addressBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBook {

	private List<Contact> listContact = new ArrayList<Contact>();
	
    public AddressBook() {
        //TODO
    }

    public void addContact(Contact contact) {
        //TODO
    	List<Contact> names = listContact.stream().filter(s -> s.getName().equals(contact.getName())).collect(Collectors.toList());
    	
    	if(!listContact.contains(contact) && names.size() == 0) {
    		listContact.add(contact);
    	} else {
    		throw new RuntimeException();
    	}
    }

    public void deleteContact(String name) {
        //TODO
		int flag = 0;
		Iterator<Contact> itr = listContact.iterator();
		while (itr.hasNext()) {
			Contact contact = itr.next();
			if (contact.getName().equals(name)) {
				itr.remove();
				flag++;
			}
		}

		if (flag == 0) {
			throw new RuntimeException();
		}
    }

    public void updateContact(String name, Contact contact) {
        //TODO
    	List<Contact> names = listContact.stream().filter(s -> s.getName().equals(contact.getName())).collect(Collectors.toList());
    	
    	if(!listContact.contains(contact) && names.size() == 0 && names.size() >1) {
    		throw new RuntimeException();
    	}

    	int i = 0;
		for (Contact contact2 : listContact) {
			if (contact2.getName().equalsIgnoreCase(name)) {
				i = listContact.indexOf(contact2);
				listContact.set(i, contact);
			}
		}
		
    }

    public List<Contact> searchByName(String name) {
        //TODO
		List<Contact> names = listContact.stream().filter(s -> s.getName().toLowerCase().startsWith(name.toLowerCase()))
				.collect(Collectors.toList());

		if (name.equals("")) {
			return listContact;
		}
		return names;
    }

    public List<Contact> searchByOrganisation(String organisation) {
        //TODO
		List<Contact> listContacts = listContact.stream()
				.filter(s -> s.getOrganisation().toLowerCase().startsWith(organisation.toLowerCase())).collect(Collectors.toList());

		if (organisation.equals(""))
		{
			return listContact;
		}
		return listContacts;
    }

}