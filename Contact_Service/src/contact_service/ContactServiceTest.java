/**
 * @author Teddy Wyatt
 *
 */
package contact_service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    private ContactService contactService;

    @BeforeEach
    public void setup() {
        contactService = new ContactService();
    }

    @Test
    public void testAddContact() {
        // Create a new contact
        String contactId = "1234567890";
        String firstName = "John";
        String lastName = "Doe";
        String phone = "1234567890";
        String address = "123 Main St";
        Contact contact = new Contact(contactId, firstName, lastName, phone, address);

        // Add the contact to the service
        contactService.addContact(contact);

        // Verify that the contact is added successfully
        Contact retrievedContact = contactService.getContact(contactId);
        Assertions.assertEquals(contact, retrievedContact);
    }

    @Test
    public void testDeleteContact() {
        // Create a new contact and add it to the service
        String contactId = "1234567890";
        String firstName = "John";
        String lastName = "Doe";
        String phone = "1234567890";
        String address = "123 Main St";
        Contact contact = new Contact(contactId, firstName, lastName, phone, address);
        contactService.addContact(contact);

        // Delete the contact from the service
        contactService.deleteContact(contactId);

        // Verify that the contact is deleted successfully
        Contact retrievedContact = contactService.getContact(contactId);
        Assertions.assertNull(retrievedContact);
    }

    @Test
    public void testUpdateFirstName() {
        // Create a new contact and add it to the service
        String contactId = "1234567890";
        String firstName = "John";
        String lastName = "Doe";
        String phone = "1234567890";
        String address = "123 Main St";
        Contact contact = new Contact(contactId, firstName, lastName, phone, address);
        contactService.addContact(contact);

        // Update the first name of the contact
        String newFirstName = "Jane";
        contactService.updateFirstName(contactId, newFirstName);

        // Verify that the first name is updated successfully
        Contact updatedContact = contactService.getContact(contactId);
        Assertions.assertEquals(newFirstName, updatedContact.getFirstName());
    }

    @Test
    public void testUpdateLastName() {
        // Create a new contact and add it to the service
        String contactId = "1234567890";
        String firstName = "John";
        String lastName = "Doe";
        String phone = "1234567890";
        String address = "123 Main St";
        Contact contact = new Contact(contactId, firstName, lastName, phone, address);
        contactService.addContact(contact);

        // Update the last name of the contact
        String newLastName = "Smith";
        contactService.updateLastName(contactId, newLastName);

        // Verify that the last name is updated successfully
        Contact updatedContact = contactService.getContact(contactId);
        Assertions.assertEquals(newLastName, updatedContact.getLastName());
    }

    @Test
    public void testUpdatePhone() {
        // Create a new contact and add it to the service
        String contactId = "1234567890";
        String firstName = "John";
        String lastName = "Doe";
        String phone = "1234567890";
        String address = "123 Main St";
        Contact contact = new Contact(contactId, firstName, lastName, phone, address);
        contactService.addContact(contact);

        // Update the phone number of the contact
        String newPhone = "9876543210";
        contactService.updatePhone(contactId, newPhone);

        // Verify that the phone number is updated successfully
        Contact updatedContact = contactService.getContact(contactId);
        Assertions.assertEquals(newPhone, updatedContact.getPhone());
    }

    @Test
    public void testUpdateAddress() {
        // Create a new contact and add it to the service
        String contactId = "1234567890";
        String firstName = "John";
        String lastName = "Doe";
        String phone = "1234567890";
        String address = "123 Main St";
        Contact contact = new Contact(contactId, firstName, lastName, phone, address);
        contactService.addContact(contact);

        // Update the address of the contact
        String newAddress = "456 Elm St";
        contactService.updateAddress(contactId, newAddress);

        // Verify that the address is updated successfully
        Contact updatedContact = contactService.getContact(contactId);
        Assertions.assertEquals(newAddress, updatedContact.getAddress());
    }

    @Test
    public void testGetContact() {
        // Create a new contact and add it to the service
        String contactId = "1234567890";
        String firstName = "John";
        String lastName = "Doe";
        String phone = "1234567890";
        String address = "123 Main St";
        Contact contact = new Contact(contactId, firstName, lastName, phone, address);
        contactService.addContact(contact);

        // Retrieve the contact from the service
        Contact retrievedContact = contactService.getContact(contactId);

        // Verify that the correct contact is retrieved
        Assertions.assertEquals(contact, retrievedContact);
    }
}