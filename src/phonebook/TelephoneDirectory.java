package phonebook;

import java.util.List;

public class TelephoneDirectory {
    public static void main (String[] args) {
        PhoneBook phoneBook = new PhoneBook ();

        phoneBook.addRecord(new Record("John Doe", "1234567890"));
        phoneBook.addRecord(new Record("Jane Doe", "9876543210"));
        phoneBook.addRecord(new Record("John Smith", "4567890123"));

        Record record = phoneBook.findRecord ("John Doe");
        if (record != null) {
            System.out.println ("Phone number for John Doe: " + record.getPhone ());
        } else {
            System.out.println ("Record is not found");
        }
        List<Record> foundRecords = phoneBook.findAllRecords ("John Doe");
        if (foundRecords != null) {
            System.out.println ("Found " + foundRecords.size () + " records for John Doe:");
            for (Record foundRecord : foundRecords) {
                System.out.println ("Phone number: " + foundRecord.getPhone ());
            }
        } else {
            System.out.println ("No records found for John Doe");
        }
    }
}
