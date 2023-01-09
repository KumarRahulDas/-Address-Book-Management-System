package packagecom.bridgelabz.AddressBookManagementSystem;
import static com.bridgelabz.AddressBookManagementSystem.AddressBook.addContact;
import static com.bridgelabz.AddressBookManagementSystem.AddressBook.contactList;

public class AddressBookSystem {
    public static void main(String[] args)
    {
        System.out.println("****** Welcome To The Address Book Program ******");
            addContact();
            System.out.println(contactList);
    }

}
