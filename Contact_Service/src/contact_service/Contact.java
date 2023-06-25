/**
 * @author Teddy Wyatt
 *
 */
package contact_service;

/**
 * The Contact class represents a contact object with various properties.
 * It enforces specific requirements for the contact ID, first name, last name,
 * phone number, and address.
 */
public class Contact {
    // Declare instance variables
    private final String contactId;  // Contact ID (immutable)
    private String firstName;        // First name
    private String lastName;         // Last name
    private String phone;            // Phone number
    private String address;          // Address

    // Constructor: Creates a new Contact object with the provided details
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        // Validate the provided contact details
        validateContactId(contactId);
        validateName(firstName, "First name");
        validateName(lastName, "Last name");
        validatePhone(phone);
        validateAddress(address);

        // Assign the validated values to the instance variables
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Getter: Returns the contact ID
    public String getContactId() {
        return contactId;
    }

    // Getter: Returns the first name
    public String getFirstName() {
        return firstName;
    }

    // Setter: Sets the first name after validating it
    public void setFirstName(String firstName) {
        validateName(firstName, "First name");
        this.firstName = firstName;
    }

    // Getter: Returns the last name
    public String getLastName() {
        return lastName;
    }

    // Setter: Sets the last name after validating it
    public void setLastName(String lastName) {
        validateName(lastName, "Last name");
        this.lastName = lastName;
    }

    // Getter: Returns the phone number
    public String getPhone() {
        return phone;
    }

    // Setter: Sets the phone number after validating it
    public void setPhone(String phone) {
        validatePhone(phone);
        this.phone = phone;
    }

    // Getter: Returns the address
    public String getAddress() {
        return address;
    }

    // Setter: Sets the address after validating it
    public void setAddress(String address) {
        validateAddress(address);
        this.address = address;
    }

    // Private method: Validates the contact ID
    private void validateContactId(String contactId) {
        // Check if contact ID is null, empty, or exceeds 10 characters
        if (contactId == null || contactId.isEmpty() || contactId.length() > 10) {
            throw new IllegalArgumentException("Contact ID must not be blank and should be at most 10 characters long.");
        }
    }

    // Private method: Validates a name field
    private void validateName(String name, String fieldName) {
        // Check if the name is null, empty, or exceeds 10 characters
        if (name == null || name.isEmpty() || name.length() > 10) {
            throw new IllegalArgumentException(fieldName + " must not be blank and should be at most 10 characters long.");
        }
    }

    // Private method: Validates a phone number
    private void validatePhone(String phone) {
        // Check if the phone number is null, empty, not 10 digits long, or contains non-digit characters
        if (phone == null || phone.isEmpty() || phone.length() != 10 || !phone.matches("\\d+")) {
            throw new IllegalArgumentException("Phone number must not be blank, should be exactly 10 digits, and contain only digits.");
        }
    }

    // Private method: Validates an address
    private void validateAddress(String address) {
        // Check if the address is null, empty, or exceeds 30 characters
        if (address == null || address.isEmpty() || address.length() > 30) {
            throw new IllegalArgumentException("Address must not be blank and should be at most 30 characters long.");
        }
    }
}

