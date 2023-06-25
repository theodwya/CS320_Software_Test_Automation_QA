/**
 * @author Teddy Wyatt
 *
 */
package contact_service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {
    // Helper method to create a dummy contact for testing
	private Contact createDummyContact() {
	    String contactId = "1234567890";
	    String firstName = "John";
	    String lastName = "Doe";
	    String phone = "1234567890";
	    String address = "123 Main St";
	
	    return new Contact(contactId, firstName, lastName, phone, address);
	}

	// Test case to verify the Contact constructor
    @Test
    public void testContactConstructor() {
        // Create test input values
        String contactId = "1234567890";
        String firstName = "John";
        String lastName = "Doe";
        String phone = "1234567890";
        String address = "123 Main St";

        // Create a Contact object using the constructor
        Contact contact = new Contact(contactId, firstName, lastName, phone, address);

        // Verify that the Contact object has the expected values
        Assertions.assertEquals(contactId, contact.getContactId());
        Assertions.assertEquals(firstName, contact.getFirstName());
        Assertions.assertEquals(lastName, contact.getLastName());
        Assertions.assertEquals(phone, contact.getPhone());
        Assertions.assertEquals(address, contact.getAddress());
    }

    // Test case to verify the handling of invalid contact IDs
	@Test
	public void testInvalidContactId() {
	    // Verify that an IllegalArgumentException is thrown when contactId is null
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        String nullContactId = null;
	        String firstName = "John";
	        String lastName = "Doe";
	        String phone = "1234567890";
	        String address = "123 Main St";
	
	        new Contact(nullContactId, firstName, lastName, phone, address);
	    });
	
	    // Verify that an IllegalArgumentException is thrown when contactId is longer than 10 characters
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        String longContactId = "123456789012";
	        String firstName = "John";
	        String lastName = "Doe";
	        String phone = "1234567890";
	        String address = "123 Main St";
	
	        new Contact(longContactId, firstName, lastName, phone, address);
	    });
	}

	// Test case to verify the setFirstName method
    @Test
    public void testSetFirstName() {
        // Create a dummy Contact for testing
        Contact contact = createDummyContact();

        // Set a new first name
        String newFirstName = "Jane";
        contact.setFirstName(newFirstName);

        // Verify that the first name is updated correctly
        Assertions.assertEquals(newFirstName, contact.getFirstName());
    }

    // Test case to verify the handling of invalid first names
	@Test
	public void testInvalidFirstName() {
	    // Verify that an IllegalArgumentException is thrown when firstName is null
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        String contactId = "1234567890";
	        String nullFirstName = null;
	        String lastName = "Doe";
	        String phone = "1234567890";
	        String address = "123 Main St";
	
	        new Contact(contactId, nullFirstName, lastName, phone, address);
	    });
	
	    // Verify that an IllegalArgumentException is thrown when firstName is longer than ten characters
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        String contactId = "1234567890";
	        String longFirstName = "LongerThanTenCharacters";
	        String lastName = "Doe";
	        String phone = "1234567890";
	        String address = "123 Main St";
	
	        new Contact(contactId, longFirstName, lastName, phone, address);
	    });
	}

	// Test case to verify the setLastName method
    @Test
    public void testSetLastName() {
        // Create a dummy Contact for testing
        Contact contact = createDummyContact();

        // Set a new last name
        String newLastName = "Smith";
        contact.setLastName(newLastName);

        // Verify that the last name is updated correctly
        Assertions.assertEquals(newLastName, contact.getLastName());
    }

    // Test case to verify the handling of invalid last names
	@Test
	public void testInvalidLastName() {
	    // Verify that an IllegalArgumentException is thrown when lastName is null
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        String contactId = "1234567890";
	        String firstName = "John";
	        String nullLastName = null;
	        String phone = "1234567890";
	        String address = "123 Main St";
	
	        new Contact(contactId, firstName, nullLastName, phone, address);
	    });
	
	    // Verify that an IllegalArgumentException is thrown when lastName is longer than ten characters
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        String contactId = "1234567890";
	        String firstName = "John";
	        String longLastName = "LongerThanTenCharacters";
	        String phone = "1234567890";
	        String address = "123 Main St";
	
	        new Contact(contactId, firstName, longLastName, phone, address);
	    });
	}

	// Test case to verify the setPhone method
    @Test
    public void testSetPhone() {
        // Create a dummy Contact for testing
        Contact contact = createDummyContact();

        // Set a new phone number
        String newPhone = "9876543210";
        contact.setPhone(newPhone);

        // Verify that the phone number is updated correctly
        Assertions.assertEquals(newPhone, contact.getPhone());
    }

    // Test case to verify the handling of invalid phone numbers
	@Test
	public void testInvalidPhone() {
	    // Verify that an IllegalArgumentException is thrown when phone is null
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        String contactId = "1234567890";
	        String firstName = "John";
	        String lastName = "Doe";
	        String nullPhone = null;
	        String address = "123 Main St";
	
	        new Contact(contactId, firstName, lastName, nullPhone, address);
	    });
	
	    // Verify that an IllegalArgumentException is thrown when phone has less than 10 digits
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        String contactId = "1234567890";
	        String firstName = "John";
	        String lastName = "Doe";
	        String lessThan10Phone = "1234";
	        String address = "123 Main St";
	
	        new Contact(contactId, firstName, lastName, lessThan10Phone, address);
	    });
	
	    // Verify that an IllegalArgumentException is thrown when phone has more than 10 digits
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        String contactId = "1234567890";
	        String firstName = "John";
	        String lastName = "Doe";
	        String longPhone = "123456789012";
	        String address = "123 Main St";
	
	        new Contact(contactId, firstName, lastName, longPhone, address);
	    });
	
	    // Verify that an IllegalArgumentException is thrown when phone contains non-digit characters
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        String contactId = "1234567890";
	        String firstName = "John";
	        String lastName = "Doe";
	        String letterInPhone = "ABC1234567";
	        String address = "123 Main St";
	
	        new Contact(contactId, firstName, lastName, letterInPhone, address);
	    });
	}

	// Test case to verify the setAddress method
    @Test
    public void testSetAddress() {
        // Create a dummy Contact for testing
        Contact contact = createDummyContact();

        // Set a new address
        String newAddress = "456 Elm St";
        contact.setAddress(newAddress);

        // Verify that the address is updated correctly
        Assertions.assertEquals(newAddress, contact.getAddress());
    }

    // Test case to verify the handling of invalid addresses
    @Test
    public void testInvalidAddress() {
        // Verify that an IllegalArgumentException is thrown when address is null
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            String contactId = "1234567890";
            String firstName = "John";
            String lastName = "Doe";
            String phone = "1234567890";
            String nullAddress = null;

            new Contact(contactId, firstName, lastName, phone, nullAddress);
        });

        // Verify that an IllegalArgumentException is thrown when address has more than 30 characters
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            String contactId = "1234567890";
            String firstName = "John";
            String lastName = "Doe";
            String phone = "1234567890";
            String longAddress = "This is way more than thirty characters long, becasue I copying it twice for testing. This is way more than thirty characters long, becasue I copying it twice for testing.";

            new Contact(contactId, firstName, lastName, phone, longAddress);
        });
    }
}

