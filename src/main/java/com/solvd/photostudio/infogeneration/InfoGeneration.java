package com.solvd.photostudio.infogeneration;


import com.solvd.photostudio.contacts.Contact;
import com.solvd.photostudio.customers.Customer;
import com.solvd.photostudio.employees.Photographer;
import com.solvd.photostudio.equipments.Equipments;
import com.solvd.photostudio.equipments.PhotoCamera;
import com.solvd.photostudio.exceptions.WrongAgeException;
import com.solvd.photostudio.exceptions.WrongPhoneNumberException;
import com.solvd.photostudio.photoShoot.AdditionalServices;
import com.solvd.photostudio.photoShoot.InteriorItems;
import com.solvd.photostudio.photoShoot.Studio;
import com.solvd.photostudio.photoShoot.StudioType;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class InfoGeneration<T> {
    private static final Logger logger = LogManager.getLogger(InfoGeneration.class.getName());

    static public LinkedList<Studio> GenerationStudioInfo() {
        StudioType studioType_1 = new StudioType(1, "black", StudioType.Style.casual);
        StudioType studioType_2 = new StudioType(2, "red", StudioType.Style.light);
        StudioType studioType_3 = new StudioType(1, "green", StudioType.Style.forest);
        StudioType studioType_4 = new StudioType(3, "white", StudioType.Style.wedding);
        LinkedList<StudioType> studioType = new LinkedList<>();
        studioType.add(studioType_1);
        studioType.add(studioType_2);
        studioType.add(studioType_3);
        studioType.add(studioType_4);
        //logger.info("Studio Type: " + studioType);

        InteriorItems interiorItems_1 = new InteriorItems(true, false, true, false);
        InteriorItems interiorItems_2 = new InteriorItems(false, true, true, true);
        InteriorItems interiorItems_3 = new InteriorItems(true, true, true, false);
        InteriorItems interiorItems_4 = new InteriorItems(false, true, true, false);

        LinkedList<InteriorItems> interiorItems = new LinkedList<>();
        interiorItems.add(interiorItems_1);
        interiorItems.add(interiorItems_2);
        interiorItems.add(interiorItems_3);
        interiorItems.add(interiorItems_4);
        //logger.info("Interior Items: " + interiorItems);

        AdditionalServices additionalServices_1 = new AdditionalServices(true, true, false, false, false);
        AdditionalServices additionalServices_2 = new AdditionalServices(false, false, true, false, false);
        AdditionalServices additionalServices_3 = new AdditionalServices(true, true, false, true, true);
        Stack<AdditionalServices> additionalServices = new Stack<>();
        additionalServices.add(additionalServices_1);
        additionalServices.add(additionalServices_2);
        additionalServices.add(additionalServices_3);
        //logger.info("Additional Services: " + additionalServices);

        Studio studio_1 = new Studio(1, studioType.get(1), 50, interiorItems.get(0), additionalServices.get(0));
        Studio studio_2 = new Studio(2, studioType.get(2), 40, interiorItems.get(3), additionalServices.get(1));
        Studio studio_3 = new Studio(3, studioType.get(1), 100, interiorItems.get(0), additionalServices.get(0));
        Studio studio_4 = new Studio(4, studioType.get(0), 250, interiorItems.get(1), additionalServices.get(0));
        Studio studio_5 = new Studio(5, studioType.get(2), 80, interiorItems.get(2), additionalServices.get(1));
        Studio studio_6 = new Studio(6, studioType.get(3), 30, interiorItems.get(2), additionalServices.get(2));
        LinkedList<Studio> studios = new LinkedList<>();
        studios.add(studio_1);
        studios.add(studio_2);
        studios.add(studio_3);
        studios.add(studio_4);
        studios.add(studio_5);
        studios.add(studio_6);
        // logger.info("Studios: " + studios);
        return studios;
    }

    static public LinkedList<Photographer> GenerationPhotographerInfo() {

        PhotoCamera photoCamera = new PhotoCamera("compact", "RAW", "sRGB", "Auto", PhotoCamera.SceneMode.child);
        PhotoCamera photoCamera_1 = new PhotoCamera("bridge ", "L", "sRGB", "Auto", PhotoCamera.SceneMode.flowers);
        PhotoCamera photoCamera_2 = new PhotoCamera("action", "M", "RGB", "Auto", PhotoCamera.SceneMode.portrait);
        PhotoCamera photoCamera_3 = new PhotoCamera("film ", "S1", "sRGB", "Auto", PhotoCamera.SceneMode.sports);
        ArrayList<PhotoCamera> photoCameras = new ArrayList<>();
        photoCameras.add(photoCamera);
        photoCameras.add(photoCamera_1);
        photoCameras.add(photoCamera_2);
        photoCameras.add(photoCamera_3);
        // logger.info( photoCameras);

        Equipments equipment = new Equipments(true, photoCameras.get(0));
        Equipments equipment_1 = new Equipments(false, photoCameras.get(1));
        Equipments equipment_2 = new Equipments(true, photoCameras.get(3));
        Equipments equipment_3 = new Equipments(false, photoCameras.get(2));
        ArrayList<Equipments> equipments = new ArrayList<>();
        equipments.add(equipment);
        equipments.add(equipment_1);
        equipments.add(equipment_2);
        equipments.add(equipment_3);
        // logger.info( equipments);

        Photographer photographer_1 = new Photographer("Nastya", "Serova", "+380987656543", 50, equipments.get(0), 50, 15);
        Photographer photographer_2 = new Photographer("Maria", "Veronova", "+380987656543", 31, equipments.get(3), 30, 5);
        Photographer photographer_3 = new Photographer("Masha", "Deloba", "+380981116543", 55, equipments.get(1), 90, 25);
        Photographer photographer_4 = new Photographer("Sergei", "Bolkun", "+380981656543", 41, equipments.get(2), 80, 10);
        LinkedList<Photographer> photographers = new LinkedList<>();
        photographers.add(photographer_1);
        photographers.add(photographer_2);
        photographers.add(photographer_3);
        photographers.add(photographer_4);
        //logger.info( photographers);
        return photographers;
    }

    static public ArrayList<Contact> GenerationContactInfo() {
        Contact contact_1 = new Contact("Kyiv", "kyivphotostudio@gmail.com", "+380984542332");
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(contact_1);
        //logger.info("Customers: " + customers);
        return contacts;
    }

    static public ArrayList<Customer> GenerationCustomerInfo() {
        Customer customer_1 = new Customer("Ivanna", "Ivanova", "+380984542332", 20, true);
        Customer customer_2 = new Customer("Petro", "Petrov", "+380985251213", 24, false);
        Customer customer_3 = new Customer("Kolya", "Tuvak", "+380984452332", 30, true);
        Customer customer_4 = new Customer("Diana", "Koval", "+380985222213", 21, true);
        Customer customer_5 = new Customer("Nastya", "Myronova", "+380984111332", 26, true);
        Customer customer_6 = new Customer("Marina", "Savchuk", "+380985287613", 23, true);
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customer_1);
        customers.add(customer_2);
        customers.add(customer_3);
        customers.add(customer_4);
        customers.add(customer_5);
        customers.add(customer_6);
        //logger.info("Customers: " + customers);
        return customers;
    }

    static public void Greetings() {

        int number = 0, age = 0, index = 0;
        boolean sameCustomer = false;
        boolean phone = true;
        boolean customerAge = true;
        String phoneNumber = null;
        Customer customer_now;

        Scanner name_ = new Scanner(System.in);
        logger.info("\nHello! Enter your name:");
        String name = name_.next();
        Scanner surname_ = new Scanner(System.in);
        logger.info("\nEnter your surname:");
        String surname = surname_.next();
        final File file = new File("src/main/resources/" + name + "" + surname + ".txt");
        for (int i = 0; i < GenerationCustomerInfo().size(); i++) {
            if (GenerationCustomerInfo().get(i).getName().equals(name) &&
                    GenerationCustomerInfo().get(i).getSurname().equals(surname)) {
                sameCustomer = true;
                index = i;
            }
        }

        if (!sameCustomer) {
            logger.info("\nWe need to add some information about you!");
            do {
                Scanner phoneNumber_ = new Scanner(System.in);
                logger.info("Enter your phone number(format 0987671616):");
                try {
                    phoneNumber = phoneNumber_.next();
                    if (!phoneNumber.matches("[-+]?\\d+") && phoneNumber.length() != 10) {
                        throw new WrongPhoneNumberException();
                    } else {
                        phone = false;
                    }
                } catch (WrongPhoneNumberException ex) {
                    logger.info(ex.getMessage());
                }
            }
            while (phone);
            do {
                Scanner age_ = new Scanner(System.in);
                logger.info("\nEnter your age:");
                try {
                    if (age_.hasNextInt()) {
                        age = age_.nextInt();
                        if (age < 18 || age > 100) {
                            throw new WrongAgeException();
                        } else {
                            customerAge = false;
                        }
                    }
                } catch (WrongAgeException e) {
                    logger.info(e.getMessage());
                }
            }
            while (customerAge);
            customer_now = new Customer(name, surname, phoneNumber, age, false);
            GenerationCustomerInfo().add(customer_now);
        } else {
            customer_now = GenerationCustomerInfo().get(index);
        }
        try {
            do {
                Scanner number_ = new Scanner(System.in);
                logger.info("\n" + customer_now.getName() + " " + customer_now.getSurname() +
                        ", If you want to rent a photographer enter 1, to rent a studio enter 2\n" +
                        "If you want to buy a photo shoot enter 3\n" +
                        "To have a call back enter 4\n" +
                        "To enter notes - 5\n" +
                        "To end enter 0"
                );
                if (number_.hasNextInt()) {
                    number = number_.nextInt();

                    switch (number) {
                        case 1: {
                            FileUtils.writeStringToFile(file, customer_now + "\nRented " + customer_now.rentPhotographer(), "ISO-8859-1");
                            break;
                        }
                        case 2: {
                            FileUtils.writeStringToFile(file, customer_now + "\nRented studio number " + customer_now.rentStudio(), "ISO-8859-1");
                            break;
                        }
                        case 3: {
                            FileUtils.writeStringToFile(file, customer_now + "\n" + customer_now.photoShoot(), "ISO-8859-1");
                            break;
                        }
                        case 4: {
                            customer_now.callBack(customer_now);
                            break;
                        }
                        case 5: {
                            Scanner note_ = new Scanner(System.in);
                            logger.info("\nEnter your note:");
                            String note = note_.nextLine();
                            if (StringUtils.isEmpty(note)) {
                                logger.info("Empty note");
                            } else {
                                logger.info("Your note: " + StringUtils.normalizeSpace(note));
                            }
                            break;
                        }
                        case 0: {
                            logger.info("\nThank you!");
                            Studio.show("We do not work on Wednesdays");
                            break;
                        }
                    }
                } else {
                    number = 1;
                }
            }
            while (number != 0);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
    }
}
