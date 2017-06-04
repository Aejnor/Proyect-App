package com.adolfo.controller;

import com.adolfo.model.*;

import java.util.ArrayList;
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


//    Add methods

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

    //    Add methods
    public void addRifle() {

    }

    public void addAssaultRifle() {

    }

    public void addSniperRifle() {

    }

    public void addSubMachine() {

    }

    //      Delete methods
    public void deleteRifle() {

        int index;
        Scanner input = new Scanner(System.in);

        showRifleList();
        System.out.println("Choose the index weapon you want to delete: ");

        index = input.nextInt();
        rifles.remove(index - 1);

    }

    public void deleteAssaultRifle() {
        int index;
        Scanner input = new Scanner(System.in);

        showAssaultRifleList();
        System.out.println("Choose the index weapon you want to delete: ");

        index = input.nextInt();
        assaultRifles.remove(index - 1);
    }

    public void deleteSniperRifle() {
        int index;
        Scanner input = new Scanner(System.in);

        showSniperRifleList();
        System.out.println("Choose the index weapon you want to delete: ");

        index = input.nextInt();
        sniperRifles.remove(index - 1);
    }

    public void deleteSubMachine() {
        int index;
        Scanner input = new Scanner(System.in);

        showSubMachineList();
        System.out.println("Choose the index weapon you want to delete: ");

        index = input.nextInt();
        subMachineGuns.remove(index - 1);
    }

    //    Show methods
    public void showRifleList() {

        for (int i = 0; i < rifles.size(); i++) {
            System.out.print(i + 1 + "- ");
            System.out.println(rifles);
        }
    }

    public void showAssaultRifleList() {

        for (int i = 0; i < assaultRifles.size(); i++) {
            System.out.print(i + 1 + "- ");
            System.out.println(assaultRifles);
        }
    }

    public void showSniperRifleList() {
        for (int i = 0; i < sniperRifles.size(); i++) {
            System.out.print(i + 1 + "- ");
            System.out.println(sniperRifles);
        }
    }

    public void showSubMachineList() {
        for (int i = 0; i < subMachineGuns.size(); i++) {
            System.out.print(i + 1 + "- ");
            System.out.println(subMachineGuns);
        }
    }

}

