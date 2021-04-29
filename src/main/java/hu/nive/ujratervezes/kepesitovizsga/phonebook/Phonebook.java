package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.util.Map;

public class Phonebook {
    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException();
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry: contacts.entrySet()) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(entry.getKey() + ": " + entry.getValue());
        }
    }
}
