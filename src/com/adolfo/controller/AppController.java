package com.adolfo.controller;

import com.adolfo.model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Created by Adolfo on 03/06/2017.
 */

public class AppController {



//    The declaration of the arrays depending on the type of weapons

    private ArrayList<Gun> rifles;
    private ArrayList<Gun> assaultRifles;
    private ArrayList<Gun> subMachineGuns;
    private ArrayList<Gun> sniperRifles;


    // Initialization constructors



    public AppController() {
        rifles = new ArrayList<>();
        assaultRifles = new ArrayList<>();
        subMachineGuns = new ArrayList<>();
        sniperRifles = new ArrayList<>();
    }




//    Getters

    public ArrayList<Gun> getRifle() {
        return rifles;
    }

    public ArrayList<Gun> getAssaultRifle() {
        return assaultRifles;
    }

    public ArrayList<Gun> getSubMachineGun() {
        return subMachineGuns;
    }

    public ArrayList<Gun> getSniperRifle() {
        return sniperRifles;
    }


//    Setters

    public void addRifle(Gun rifle) {
        this.rifles.add(rifle);
    }
    public void addAssaultRifle(Gun assaultRifle) {
        this.assaultRifles.add(assaultRifle);
    }
    public void addSubMachineGuns(Gun subMachineGun) {
        this.subMachineGuns.add(subMachineGun);
    }
    public void addSniperRifle(Gun sniperRifle) {
        this.sniperRifles.add(sniperRifle);
    }

    //    This ones are the "add methods" of all the type of the guns

    public void addRifle() {
        String name;
        String originplace;
        int ammunitionClip = 0;
        double gauge = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Write the name of the rifle you want to add: ");
        name = input.nextLine();

        System.out.println("Write the origin place of the rifle: ");
        originplace = input.nextLine();

        try {
            System.out.println("Write how many bullets have the rifle in the magazine: ");
            ammunitionClip = input.nextInt();

            System.out.println("What gauge use your rifle ? ");
            gauge = input.nextDouble();
        } catch (InputMismatchException e) {
            messageOfMismatch();
        }

        if (ammunitionClip != 0 && gauge != 0) {
            this.addRifle(new Gun(name, originplace, ammunitionClip, gauge));
        }
    }
    public void addAssaultRifle() {
        String name;
        String originplace;
        int ammunitionClip = 0;
        double gauge = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Write the name of the assault rifle you want to add: ");
        name = input.nextLine();


        System.out.println("Write the origin place of the assault rifle: ");
        originplace = input.nextLine();
        try {
            System.out.println("Write how many bullets have the assault rifle in the magazine: ");
            ammunitionClip = input.nextInt();

            System.out.println("What gauge use your assault rifle ? ");
            gauge = input.nextDouble();
        } catch (InputMismatchException e) {
            messageOfMismatch();
        }
        if (ammunitionClip != 0 && gauge != 0) {
            this.addAssaultRifle(new Gun(name, originplace, ammunitionClip, gauge));
        }
    }
    public void addSniperRifle() {
        String name;
        String originplace;
        int ammunitionClip = 0;
        double gauge = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Write the name of the sniper rifle you want to add: ");
        name = input.nextLine();

        System.out.println("Write the origin place of the sniper rifle: ");
        originplace = input.nextLine();
        try {
            System.out.println("Write how many bullets have the sniper rifle in the magazine: ");
            ammunitionClip = input.nextInt();

            System.out.println("What gauge use your sniper rifle ? ");
            gauge = input.nextDouble();
        } catch (InputMismatchException e) {
            messageOfMismatch();
        }
        if (ammunitionClip != 0 && gauge != 0) {
            this.addSniperRifle(new Gun(name, originplace, ammunitionClip, gauge));
        }
    }
    public void addSubMachine() {
        String name;
        String originplace;
        int ammunitionClip = 0;
        double gauge = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Write the name of the sub-Machine gun you want to add: ");
        name = input.nextLine();

        System.out.println("Write the origin place of the sub-Machine gun: ");
        originplace = input.nextLine();
        try {
            System.out.println("Write how many bullets have the sub-Machine gun in the magazine: ");
            ammunitionClip = input.nextInt();

            System.out.println("What gauge use your sub-Machine gun ? ");
            gauge = input.nextDouble();
        } catch (InputMismatchException e) {
            messageOfMismatch();
        }
        if (ammunitionClip != 0 && gauge != 0) {
            this.addSubMachineGuns(new Gun(name, originplace, ammunitionClip, gauge));
        }
    }

    //      Delete methods for all the type of weapons

    public void deleteRifle() {

        int index;
        Scanner input = new Scanner(System.in);

        showRifleList();
        try {
            System.out.println("Choose the index weapon you want to delete: ");

            index = input.nextInt();
            rifles.remove(index - 1);
        } catch (IndexOutOfBoundsException e) {
            messageOutOfBound();
            deleteRifle();
        }
    }
    public void deleteAssaultRifle() {
        int index;
        Scanner input = new Scanner(System.in);

        showAssaultRifleList();
        System.out.println("Choose the index weapon you want to delete: ");
        try {
            index = input.nextInt();
            assaultRifles.remove(index - 1);
        } catch (IndexOutOfBoundsException e) {
            messageOutOfBound();
            deleteAssaultRifle();
        }
    }
    public void deleteSniperRifle() {
        int index;
        Scanner input = new Scanner(System.in);

        showSniperRifleList();
        System.out.println("Choose the index weapon you want to delete: ");
        try {
            index = input.nextInt();
            sniperRifles.remove(index - 1);
        } catch (IndexOutOfBoundsException e) {
            messageOutOfBound();
            deleteSniperRifle();
        }
    }
    public void deleteSubMachine() {
        int index;
        Scanner input = new Scanner(System.in);

        showSubMachineList();
        System.out.println("Choose the index weapon you want to delete: ");
        try {
            index = input.nextInt();
            subMachineGuns.remove(index - 1);
        } catch (IndexOutOfBoundsException e) {
            messageOutOfBound();
            deleteSubMachine();
        }
    }

    //    Show methods  for the kind of weapons

    public void showRifleList() {
        messageEmptyArray(rifles);

        int index = 1;
//        We go through the list and add an index to the objects listed, exactly the same in the other methods
        for (Gun i : rifles) {
            System.out.print(index + " - ");
            System.out.println(i);
            index++;

        }
    }
    public void showAssaultRifleList() {
        messageEmptyArray(assaultRifles);

        int index = 1;
        for (Gun i : assaultRifles) {
//        We go through the list and add an index to the objects listed, exactly the same in the other methods
            System.out.print(index + " - ");
            System.out.println(i);
            index++;
        }
    }
    public void showSniperRifleList() {
        messageEmptyArray(sniperRifles);

        int index = 1;
        for (Gun i : sniperRifles) {
//        We go through the list and add an index to the objects listed, exactly the same in the other methods
            System.out.print(index + " - ");
            System.out.println(i);
            index++;
        }
    }
    public void showSubMachineList() {
        messageEmptyArray(subMachineGuns);

        int index = 1;
        for (Gun i : subMachineGuns) {
//        We go through the list and add an index to the objects listed, exactly the same in the other methods
            System.out.print(index + " - ");
            System.out.println(i);
            index++;
        }
    }


    // Methods to modify the kind of weapon

    public void modifyRifle(){
        int index;
        int ammo;
        String name, origincountry;
        double gauge;

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        showRifleList();

        System.out.println("Choose the index weapon you want to edit:");

        index = input2.nextInt();
        if (index > rifles.size()){
            System.out.println("Introduce a valid index.");
            System.out.println("");
            modifyRifle();
        }



        switch (Menu.modifyWeaponMenu()){
            case 1:
                System.out.println("Enter the new name of the weapon: ");
                name = input.nextLine();
                rifles.get(index - 1).setName(name);
                break;
            case 2:
                System.out.println("Enter the new name of the origin country: ");
                origincountry = input.nextLine();
                rifles.get(index - 1).setOriginplace(origincountry);
                break;
            case 3:
                System.out.println("Enter the new amount of ammo you can put into the weapon: ");
                ammo = input.nextInt();
                rifles.get(index - 1).setAmmunitionClip(ammo);
                break;
            case 4:
                System.out.println("Enter the new gauge of your weapon");
                gauge = input.nextDouble();
                rifles.get(index - 1).setGauge(gauge);
                break;
        }
    }
    public void modifyAssaultRifle(){
        int index;
        int ammo;
        String name, origincountry;
        double gauge;


        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        showAssaultRifleList();

        System.out.println("Choose the index weapon you want to edit:");

        index = input2.nextInt();
        if (index > assaultRifles.size()){
            System.out.println("Introduce a valid index.");
            System.out.println("");
            modifyAssaultRifle();
        }



        switch (Menu.modifyWeaponMenu()){
            case 1:
                System.out.println("Enter the new name of the weapon: ");
                name = input.nextLine();
                assaultRifles.get(index - 1).setName(name);
                break;
            case 2:
                System.out.println("Enter the new name of the origin country: ");
                origincountry = input.nextLine();
                assaultRifles.get(index - 1).setOriginplace(origincountry);
                break;
            case 3:
                System.out.println("Enter the new amount of ammo you can put into the weapon: ");
                ammo = input.nextInt();
                assaultRifles.get(index - 1).setAmmunitionClip(ammo);
                break;
            case 4:
                System.out.println("Enter the new gauge of your weapon");
                gauge = input.nextDouble();
                assaultRifles.get(index - 1).setGauge(gauge);
                break;
        }
    }
    public void modifySubMachineGun(){
        int index;
        int ammo;
        String name, origincountry;
        double gauge;

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        showSubMachineList();

        System.out.println("Choose the index weapon you want to edit:");

        index = input2.nextInt();
        if (index > subMachineGuns.size()){
            System.out.println("Introduce a valid index.");
            System.out.println("");
            modifySubMachineGun();
        }



        switch (Menu.modifyWeaponMenu()){
            case 1:
                System.out.println("Enter the new name of the weapon: ");
                name = input.nextLine();
                subMachineGuns.get(index - 1).setName(name);
                break;
            case 2:
                System.out.println("Enter the new name of the origin country: ");
                origincountry = input.nextLine();
                subMachineGuns.get(index - 1).setOriginplace(origincountry);
                break;
            case 3:
                System.out.println("Enter the new amount of ammo you can put into the weapon: ");
                ammo = input.nextInt();
                subMachineGuns.get(index - 1).setAmmunitionClip(ammo);
                break;
            case 4:
                System.out.println("Enter the new gauge of your weapon");
                gauge = input.nextDouble();
                subMachineGuns.get(index - 1).setGauge(gauge);
                break;
        }
    }
    public void modifySniperRifle(){
        int index;
        int ammo;
        String name, origincountry;
        double gauge;

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        showSniperRifleList();

        System.out.println("Choose the index weapon you want to edit:");

        index = input2.nextInt();
        if (index > sniperRifles.size()){
            System.out.println("Introduce a valid index.");
            System.out.println("");
            modifySniperRifle();
        }



        switch (Menu.modifyWeaponMenu()){
            case 1:
                System.out.println("Enter the new name of the weapon: ");
                name = input.nextLine();
                sniperRifles.get(index - 1).setName(name);
                break;
            case 2:
                System.out.println("Enter the new name of the origin country: ");
                origincountry = input.nextLine();
                sniperRifles.get(index - 1).setOriginplace(origincountry);
                break;
            case 3:
                System.out.println("Enter the new amount of ammo you can put into the weapon: ");
                ammo = input.nextInt();
                sniperRifles.get(index - 1).setAmmunitionClip(ammo);
                break;
            case 4:
                System.out.println("Enter the new gauge of your weapon");
                gauge = input.nextDouble();
                sniperRifles.get(index - 1).setGauge(gauge);
                break;
        }
    }

    //    Methods to ordinate the weapon calibers by weapon type

    public void ordinationRiflesByGauge() {
        Collections.sort(rifles, Gun.comparingbygauge.reversed());
        System.out.println("╔════════════════════════╗");
        System.out.println("║ Ordination by gauge ║ ");
        System.out.println("╚════════════════════════╝");

        for (Gun guns : rifles) {
            System.out.println(guns);
        }
    }
    public void ordinationAssaultRiflesByGauge() {
        Collections.sort(assaultRifles, Gun.comparingbygauge.reversed());
        System.out.println("╔════════════════════════╗");
        System.out.println("║ Ordination by gauge ║ ");
        System.out.println("╚════════════════════════╝");

        for (Gun guns : assaultRifles) {
            System.out.println(guns);
        }
    }
    public void ordinationSubMachineByGauge() {
        Collections.sort(subMachineGuns, Gun.comparingbygauge.reversed());
        System.out.println("╔════════════════════════╗");
        System.out.println("║ Ordination by gauge ║ ");
        System.out.println("╚════════════════════════╝");

        for (Gun guns : subMachineGuns) {
            System.out.println(guns);
        }
    }
    public void ordinationSniperRiflesByGauge() {
        Collections.sort(sniperRifles, Gun.comparingbygauge.reversed());
        System.out.println("╔════════════════════════╗");
        System.out.println("║ Ordination by gauge ║ ");
        System.out.println("╚════════════════════════╝");

        for (Gun guns : sniperRifles) {
            System.out.println(guns);
        }
    }


//  Methods to ordinate alphabetically the weapons by their names

    public void alphabeticOrdinationRiflesByName() {
        Collections.sort(rifles, Gun.comparingByName);
        System.out.println("╔══════════════════════════╗");
        System.out.println("║ Alphabetic ordenation ║ ");
        System.out.println("╚══════════════════════════╝");

        for (Gun guns : rifles) {
            System.out.println(guns);
        }
    }
    public void alphabeticOrdinationSniperRiflesByName() {
        Collections.sort(sniperRifles, Gun.comparingByName);
        System.out.println("╔══════════════════════════╗");
        System.out.println("║ Alphabetic ordenation ║ ");
        System.out.println("╚══════════════════════════╝");

        for (Gun guns : sniperRifles) {
            System.out.println(guns);
        }
    }
    public void alphabeticOrdinationSubMachineByName() {
        Collections.sort(subMachineGuns, Gun.comparingByName);
        System.out.println("╔══════════════════════════╗");
        System.out.println("║ Alphabetic ordenation ║ ");
        System.out.println("╚══════════════════════════╝");

        for (Gun guns : subMachineGuns) {
            System.out.println(guns);
        }
    }
    public void alphabeticOrdinationAssaultRiflesByName() {
        Collections.sort(assaultRifles, Gun.comparingByName);
        System.out.println("╔══════════════════════════╗");
        System.out.println("║ Alphabetic ordenation ║ ");
        System.out.println("╚══════════════════════════╝");

        for (Gun guns : assaultRifles) {
            System.out.println(guns);
        }
    }

//  Methods to ordinate alphabetically the weapons by their origin country

    public void alphabeticOrdinationRiflesByCountry() {
        Collections.sort(rifles, Gun.comparingByCountry);
        System.out.println("╔══════════════════════════╗");
        System.out.println("║ Alphabetic ordenation ║ ");
        System.out.println("║   by origin country   ║ ");
        System.out.println("╚══════════════════════════╝");

        for (Gun guns : rifles) {
            System.out.println(guns);
        }
    }
    public void alphabeticOrdinationSniperRiflesByCountry() {
        Collections.sort(sniperRifles, Gun.comparingByCountry);
        System.out.println("╔══════════════════════════╗");
        System.out.println("║ Alphabetic ordenation ║ ");
        System.out.println("║   by origin country   ║ ");
        System.out.println("╚══════════════════════════╝");

        for (Gun guns : sniperRifles) {
            System.out.println(guns);
        }
    }
    public void alphabeticOrdinationSubMachineByCountry() {
        Collections.sort(subMachineGuns, Gun.comparingByCountry);
        System.out.println("╔══════════════════════════╗");
        System.out.println("║ Alphabetic ordenation ║ ");
        System.out.println("║   by origin country   ║ ");
        System.out.println("╚══════════════════════════╝");

        for (Gun guns : subMachineGuns) {
            System.out.println(guns);
        }
    }
    public void alphabeticOrdinationAssaultRiflesByCountry() {
        Collections.sort(assaultRifles, Gun.comparingByCountry);
        System.out.println("╔══════════════════════════╗");
        System.out.println("║ Alphabetic ordenation ║ ");
        System.out.println("║   by origin country   ║ ");
        System.out.println("╚══════════════════════════╝");

        for (Gun guns : assaultRifles) {
            System.out.println(guns);
        }
    }

//  Methods to ordinate the weapons by their amount of ammo in the magazine

    public void ordinationRiflesByAmmoInMagazine() {
        Collections.sort(rifles, Gun.comparingByAmmoclip);
        System.out.println("╔═══════════════════════════╗");
        System.out.println("║ Ordenation by quantity ║ ");
        System.out.println("║     in the magazine    ║ ");
        System.out.println("╚═══════════════════════════╝");

        for (Gun gun : rifles) {
            System.out.println(gun);
        }
    }
    public void ordinationSniperRiflesByAmmoInMagazine() {
        Collections.sort(sniperRifles, Gun.comparingByAmmoclip);
        System.out.println("╔═══════════════════════════╗");
        System.out.println("║ Ordenation by quantity ║ ");
        System.out.println("║     in the magazine    ║ ");
        System.out.println("╚═══════════════════════════╝");

        for (Gun gun : sniperRifles) {
            System.out.println(gun);
        }
    }
    public void ordinationSubMachineByAmmoInMagazine() {
        Collections.sort(subMachineGuns, Gun.comparingByAmmoclip);
        System.out.println("╔═══════════════════════════╗");
        System.out.println("║ Ordenation by quantity ║ ");
        System.out.println("║     in the magazine    ║ ");
        System.out.println("╚═══════════════════════════╝");

        for (Gun gun : subMachineGuns) {
            System.out.println(gun);
        }
    }
    public void ordinationAssaultRiflesByAmmoInMagazine() {
        Collections.sort(assaultRifles, Gun.comparingByAmmoclip);
        System.out.println("╔═══════════════════════════╗");
        System.out.println("║ Ordenation by quantity ║ ");
        System.out.println("║     in the magazine    ║ ");
        System.out.println("╚═══════════════════════════╝");

        for (Gun gun : assaultRifles) {
            System.out.println(gun);
        }
    }


    // Save all the weapons

    public void saveWeapons(){
        try {
            ObjectOutputStream assaultRifles = new ObjectOutputStream( new FileOutputStream("data/assaultRifles.dat"));
            assaultRifles.writeObject( this.assaultRifles );
            assaultRifles.close();

            ObjectOutputStream rifles = new ObjectOutputStream( new FileOutputStream("data/rifles.dat"));
            rifles.writeObject( this.rifles );
            rifles.close();

            ObjectOutputStream subMachineGun = new ObjectOutputStream( new FileOutputStream("data/subMachine.dat"));
            subMachineGun.writeObject( this.subMachineGuns );
            subMachineGun.close();

            ObjectOutputStream sniperRifles = new ObjectOutputStream( new FileOutputStream("data/sniperRifles.dat"));
            sniperRifles.writeObject( this.sniperRifles );
            sniperRifles.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load everything
    public void loadGuns(){
        loadAssaultRifles();
        loadRifles();
        loadSniperRifles();
        loadSubMachine();
    }

    // Load the Rifles list
    public void loadRifles() {
        try {
            ObjectInputStream rifles = new ObjectInputStream(new FileInputStream("data/rifles.dat"));
            this.rifles = (ArrayList<Gun>)rifles.readObject();
            rifles.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Load the Sniper Rifles list
    public void loadSniperRifles() {
        try {
            ObjectInputStream sniperRifles = new ObjectInputStream(new FileInputStream("data/sniperrifles.dat"));
            this.sniperRifles = (ArrayList<Gun>)sniperRifles.readObject();
            sniperRifles.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Load the Assault Rifles list
    public void loadAssaultRifles() {
        try {
            ObjectInputStream assaultRifles = new ObjectInputStream(new FileInputStream("data/assaultRifles.dat"));
            this.assaultRifles = (ArrayList<Gun>)assaultRifles.readObject();
            assaultRifles.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Load the Sub-Machine Guns list
    public void loadSubMachine() {
        try {
            ObjectInputStream subMachineGun = new ObjectInputStream(new FileInputStream("data/subMachine.dat"));
            this.subMachineGuns = (ArrayList<Gun>)subMachineGun.readObject();
            subMachineGun.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



    // Helpers methods

//    We will use this method when we want to launch a message for a MismatchException

    private void messageOfMismatch() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║ You have entered an invalid value ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("");
    }

//    This one for the OutOfBound exceptions

    private void messageOutOfBound() {
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ You have left the limit of the list ║");
        System.out.println("╚═════════════════════════════════════════╝");
        System.out.println("");
    }

//    This to launch a message when the array is empty

    private void messageEmptyArray(ArrayList<Gun> list) {
        if (list.isEmpty()) {
            System.out.println("The armory is empty of weapons");
        }
    }


}

