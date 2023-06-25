/**
 * @author Teddy Wyatt
 *
 */
package contact_service;

import java.util.HashMap;
import java.util.Map;

/**
 * The ContactService class represents a service for managing contacts.
 */
public class ContactService {
    private final Map<String, Contact> contacts;

    /**
     * Constructs a new ContactService object.
     */
    public ContactService() {
        this.contacts = new HashMap<>();
    }

    /**
     * Adds a contact to the service.
     *
     * @param contact The contact to be added.
     */
    public void addContact(Contact contact) {
        contacts.put(contact.getContactId(), contact);
    }

    /**
     * Deletes a contact from the service based on the contact ID.
     *
     * @param contactId The ID of the contact to be deleted.
     */
    public void deleteContact(String contactId) {
        contacts.remove(contactId);
    }

    /**
     * Updates the first name of a contact based on the contact ID.
     *
     * @param contactId The ID of the contact to be updated.
     * @param firstName The new first name.
     */
    public void updateFirstName(String contactId, String firstName) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setFirstName(firstName);
        }
    }

    /**
     * Updates the last name of a contact based on the contact ID.
     *
     * @param contactId The ID of the contact to be updated.
     * @param lastName The new last name.
     */
    public void updateLastName(String contactId, String lastName) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setLastName(lastName);
        }
    }

    /**
     * Updates the phone number of a contact based on the contact ID.
     *
     * @param contactId The ID of the contact to be updated.
     * @param phone The new phone number.
     */
    public void updatePhone(String contactId, String phone) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setPhone(phone);
        }
    }

    /**
     * Updates the address of a contact based on the contact ID.
     *
     * @param contactId The ID of the contact to be updated.
     * @param address The new address.
     */
    public void updateAddress(String contactId, String address) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setAddress(address);
        }
    }

    /**
     * Retrieves a contact from the service based on the contact ID.
     *
     * @param contactId The ID of the contact to be retrieved.
     * @return The contact object associated with the contact ID, or null if not found.
     */
    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}
