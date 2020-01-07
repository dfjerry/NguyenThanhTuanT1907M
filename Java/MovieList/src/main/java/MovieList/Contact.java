/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MovieList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Contact {

    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void getContact(String name, String number) {

    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact(String number, String name) {
        this.number = number;
        this.name = name;
    }

    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    public void addContact(String name, String number) {
        contactList.add(new Contact(name, number));
    }

    public void displayContact() {
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println("Name: " + (i + 1) + ":" + contactList.get(i).getName() + " sdt:" + contactList.get(i).getNumber());

        }
    }

    public void updateContact(int index, String name, String number) {
        contactList.set(index, new Contact(number, name));
        System.out.println("Update ");
        System.out.println("Contact " + (index + 1) + " name: " + contactList.get(index).getName() +" sdt: "+ contactList.get(index).getNumber());

    }

    public void remoteContact(int index) {
        contactList.remove(index);
    }

    public Contact findContact(String search) {
        int position = contactList.indexOf(search);
        if (position > 0) {
            System.out.println(position);
            return contactList.get(position);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Contact{" + "contactList=" + contactList + '}';
    }

    public static void main(String[] args) {
        int choose = 0;
        Scanner sc = new Scanner(System.in);
        Contact objContact = new Contact("", "");

        System.out.println("1 - To shutdown");
        System.out.println("2 - Print to contact");
        System.out.println("3 -  add a new contact");
        System.out.println("4 -  update contact");
        System.out.println("5 -  remote contact");
        System.out.println("6 - query if an existing contact exists(search)");
        System.out.println("7 - to print a list of available ");
        while (choose != 1) {
            System.out.println("Availabel actions: ");
            choose = sc.nextInt();
            
            switch (choose) {
                case 1:
                    break;
                case 2:
                    objContact.displayContact();
                    break;
                case 3:
                    System.out.println("Nhap vao ten va sdt:");
                    objContact.addContact(sc.next(), sc.next());
                    break;
                case 4:
                    System.out.println("Nhap contact muon update: ");
                    objContact.updateContact(sc.nextInt(), sc.next(), sc.next());
                    break;
                case 5:
                    System.out.println("Ban muon xoa lien he nao: ");
                    objContact.remoteContact(sc.nextInt());
                    break;
                case 6:
                    System.out.println("Nhap ten lien he ma ban muon tim: ");
                    objContact.findContact(sc.next());
                    break;
                case 7:
                    System.out.println("0 - To shutdown");
                    System.out.println("1 - Print to contact");
                    System.out.println("2 - add a new contact");
                    System.out.println("3 - update contact");
                    System.out.println("4 - remote contact");
                    System.out.println("5 - query if an existing contact exists(search)");
                    System.out.println("6 - to print a list of available ");
                    break;
            }
        }

    }

}
