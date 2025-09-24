import java.util.HashMap;
import java.util.Map;

class PhoneBook {
    private Map<String, String> contacts = new HashMap<>();

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        System.out.println("Contacts before removal: " + phoneBook.getContacts());

        // Try to remove Bob with correct number
        boolean removed = phoneBook.removeContact("Bob", "555-2222");
        System.out.println("Removed Bob: " + removed);

        System.out.println("Contacts after removal: " + phoneBook.getContacts());
    }

    public PhoneBook() {
        contacts.put("Alice", "555-1111");
        contacts.put("Bob", "555-2222");
    }

    /**
     * TO-DO: Remove the contact only if the name and number match.
     \*
     * @param name The name of the contact to remove.
     * @param number The phone number that must match for the removal to happen.
     * @return true if the contact was removed, false otherwise.
     */
    public boolean removeContact(String name, String number) {
        return contacts.remove(name, number);
    }

    public Map<String, String> getContacts() {
        return contacts;
    }
}