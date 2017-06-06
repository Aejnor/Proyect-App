package com.adolfo.controller;

import com.adolfo.model.*;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
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

    //    Add methods
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
        }catch(InputMismatchException e){
            messageOfMismatch();


        }

        this.addRifle(new Gun(name, originplace, ammunitionClip, gauge));

    }
    public void addAssaultRifle() {
        String name;
        String originplace;
        int ammunitionClip = 0 ;
        double gauge = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Write the name of the assault rifle you want to add: ");
        name = input.nextLine();


            System.out.println("Write the origin place of the assault rifle: ");
            originplace = input.nextLine();
        try{
            System.out.println("Write how many bullets have the assault rifle in the magazine: ");
            ammunitionClip = input.nextInt();

            System.out.println("What gauge use your assault rifle ? ");
            gauge = input.nextDouble();
        }catch(InputMismatchException e){
            messageOfMismatch();
    }

        this.addAssaultRifle(new Gun(name, originplace, ammunitionClip, gauge));
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
    try{
        System.out.println("Write how many bullets have the sniper rifle in the magazine: ");
        ammunitionClip = input.nextInt();

        System.out.println("What gauge use your sniper rifle ? ");
        gauge = input.nextDouble();
    }catch(InputMismatchException e){
        messageOfMismatch();
    }

        this.addSniperRifle(new Gun(name, originplace, ammunitionClip, gauge));
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
    try{
        System.out.println("Write how many bullets have the sub-Machine gun in the magazine: ");
        ammunitionClip = input.nextInt();

        System.out.println("What gauge use your sub-Machine gun ? ");
        gauge = input.nextDouble();
    }catch(InputMismatchException e){
        messageOfMismatch();
    }

        this.addSubMachineGuns(new Gun(name, originplace, ammunitionClip, gauge));
    }

    //      Delete methods
    public void deleteRifle() {

        int index;
        Scanner input = new Scanner(System.in);

        showRifleList();
        try {
            System.out.println("Choose the index weapon you want to delete: ");

            index = input.nextInt();
            rifles.remove(index - 1);
        }catch (IndexOutOfBoundsException e){
            messageOutOfBound();
        }


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
        int index = 1;
        for ( Gun i : rifles) {
            System.out.print(index + " - ");
            System.out.println(i);
            index++;
        }
    }
    public void showAssaultRifleList() {
        int index = 1;
        for ( Gun i : assaultRifles) {
            System.out.print(index + " - ");
            System.out.println(i);
            index++;
        }
    }
    public void showSniperRifleList() {
        int index = 1;
        for ( Gun i : sniperRifles) {
            System.out.print(index + " - ");
            System.out.println(i);
            index++;
        }
    }
    public void showSubMachineList() {
        int index = 1;
        for ( Gun i : subMachineGuns) {
            System.out.print(index + " - ");
            System.out.println(i);
            index++;
        }
    }





    // Methods of messages in the exceptions

    private void messageOfMismatch(){
        System.out.println( "╔════════════════════════════════════════╗");
        System.out.println("║ You have entered an invalid value ║");
        System.out.println( "╚════════════════════════════════════════╝");
        System.out.println("");
    }

    private void messageOutOfBound(){
        System.out.println( "╔═════════════════════════════════════════╗");
        System.out.println("║ You have left the limit of the list ║");
        System.out.println( "╚═════════════════════════════════════════╝");
        System.out.println("");
    }

}

