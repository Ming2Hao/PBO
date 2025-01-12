/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.t1_221116962;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ivan Laptop
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        String[] koordjawaban=new String[16];
        String[] namalb=new String[11];
        for (int i = 0; i < 11; i++) {
            namalb[i]="";
        }
        int[] skorlb=new int[11];
        for (int i = 0; i < 11; i++) {
            skorlb[i]=0;
        }
        int masuklb=0;
        boolean bermain=true;
        int counter=0;
        boolean pertama=true;
        String[] wordlist=new String[20];
        char[][] tampil=new char[4][4];
        Scanner scanint=new Scanner(System.in);
        Scanner scanstring=new Scanner(System.in);
        while (bermain==true) {
            System.out.println("##################");
            System.out.println("#====BOOKWORM====#");
            System.out.println("##################");
            System.out.println("# 1. Play        #");
            System.out.println("# 2. Word List   #");
            System.out.println("# 3. Highscore   #");
            System.out.println("# 0. Exit        #");
            System.out.println("##################");
            System.out.println(">>");
            int menu=scanint.nextInt();
            if (menu==1) {
                if(counter==0){
                    System.out.println("Word List is empty");
                }
                else{
                    boolean dead=false;
                    int level=1;
                    int hpp=20;
                    int heal=1;
                    while(dead==false){
                        int counterjawaban=0;
                        boolean nextlvl=false;
                        String jawaban="";
                        int damage=0;
                        int hpe=20;
                        int angkakatapasti = rand.nextInt(counter);
                        while(nextlvl==false){
                            if(pertama==true){
                                for (int i = 0; i < 4; i++) {
                                    for (int j = 0; j < 4; j++) {
                                        tampil[i][j]='*';
                                    }
                                }
                                for (int i = 0; i < wordlist[angkakatapasti].length(); i++) {
                                    boolean terisi=false;
                                    while(terisi==false){
                                        int randx=rand.nextInt(4);
                                        int randy=rand.nextInt(4);
                                        if(tampil[randy][randx]=='*'){
                                            tampil[randy][randx]=wordlist[angkakatapasti].charAt(i);
                                            terisi=true;
                                        }
                                    }
                                }
                                for (int i = 0; i < 4; i++) {
                                    for (int j = 0; j < 4; j++) {
                                        int rendemascii=rand.nextInt(25)+97;
                                        if(tampil[i][j]=='*'){
                                            tampil[i][j]=(char)rendemascii;
                                        }
                                    }  
                                }
                                pertama=false;
                            }
                            System.out.println("#################################");
                            System.out.print("# "+jawaban);
                            for (int i = 0; i < 20-jawaban.length(); i++) {
                                System.out.print(" ");
                            }
                            System.out.print("# DMG: ");
                            System.out.print(damage);
                            if(damage<10){
                                System.out.print("  ");
                            }
                            else if (damage<100) {
                                System.out.print(" ");
                            }
                            else{
                                System.out.print("");
                            }
                            System.out.println("#");
                            System.out.println("#################################");
                            System.out.print("# Player |");
                            for (int i = 0; i < 4; i++) {
                                System.out.print(" ");
                                System.out.print(tampil[0][i]);
                                System.out.print(" ");
                            }
                            System.out.print("| Enemy "+level);
                            if(level<10){
                                System.out.print(" ");   
                            }
                            System.out.println("#");
                            System.out.print("# HP: "+hpp);
                            if(hpp<10){
                                System.out.print(" ");
                            }
                            System.out.print(" |");
                            for (int i = 0; i < 4; i++) {
                                System.out.print(" ");
                                System.out.print(tampil[1][i]);
                                System.out.print(" ");
                            }
                            System.out.print("| HP: "+hpe);
                            if(hpe<10){
                                System.out.print(" ");
                            }
                            System.out.println("  #");
                            System.out.print("# Heal:"+heal+" |");
                            for (int i = 0; i < 4; i++) {
                                System.out.print(" ");
                                System.out.print(tampil[2][i]);
                                System.out.print(" ");
                            }
                            System.out.println("|         #");
                            System.out.print("#        |");
                            for (int i = 0; i < 4; i++) {
                                System.out.print(" ");
                                System.out.print(tampil[3][i]);
                                System.out.print(" ");
                            }
                            System.out.println("|         #");
                            System.out.println("#################################");
                            System.out.println(">>");
                            String koord=scanstring.nextLine();
                            if(koord.equals("attack")){
                                boolean terdaftar=false;
                                for (int i = 0; i < counter; i++) {
                                    if(jawaban.equals(wordlist[i])){
                                        terdaftar=true;
                                    }
                                }
                                if(terdaftar==true){
                                    System.out.println("player attack,enemy take "+damage+" damage");
                                    hpe=hpe-damage;
                                    damage=0;
                                    for (int i = 0; i < counterjawaban; i++) {
                                        int tempx2=Character.getNumericValue(koordjawaban[i].charAt(0));
                                        int tempy2=Character.getNumericValue(koordjawaban[i].charAt(2));
                                        int rendemascii=rand.nextInt(25)+97;
                                        tampil[tempy2][tempx2]=(char)rendemascii;
                                    }
                                    jawaban="";
                                    for (int i = 0; i < counterjawaban; i++) {
                                        koordjawaban[i]="";
                                    }
                                    counterjawaban=0;
                                    int damagee=rand.nextInt(3)+3;
                                    hpp=hpp-damagee;
                                    System.out.println("Enemy attack. Player take "+damagee+" damage.");
                                }
                                else{
                                    System.out.println("kata tidak terdaftar");
                                    damage=0;
                                    jawaban="";
                                    for (int i = 0; i < counterjawaban; i++) {
                                        koordjawaban[i]="";
                                    }
                                    counterjawaban=0;
                                }
                            }
                            else if (koord.equals("clear")) {
                                damage=0;
                                jawaban="";
                                for (int i = 0; i < counterjawaban; i++) {
                                    koordjawaban[i]="";
                                }
                                counterjawaban=0;
                            }
                            else if(koord.equals("heal")){
                                if(heal-1<0){
                                    System.out.println("heal tidak cukup");
                                }
                                else{
                                    heal=heal-1;
                                    hpp=hpp+10;
                                    if(hpp>20){
                                        hpp=20;
                                    }
                                }
                            }
                            else if(koord.equals("cheat")){
                                hpp=20;
                            }
                            else if(koord.equals("scramble")){
                                for (int i = 0; i < 4; i++) {
                                    for (int j = 0; j < 4; j++) {
                                        tampil[i][j]='*';
                                    }
                                }
                                angkakatapasti = rand.nextInt(counter);
                                for (int i = 0; i < wordlist[angkakatapasti].length(); i++) {
                                    boolean terisi=false;
                                    while(terisi==false){
                                        int randx=rand.nextInt(4);
                                        int randy=rand.nextInt(4);
                                        if(tampil[randy][randx]=='*'){
                                            tampil[randy][randx]=wordlist[angkakatapasti].charAt(i);
                                            terisi=true;
                                        }
                                    }
                                }
                                for (int i = 0; i < 4; i++) {
                                    for (int j = 0; j < 4; j++) {
                                        int rendemascii=rand.nextInt(25)+97;
                                        if(tampil[i][j]=='*'){
                                            tampil[i][j]=(char)rendemascii;
                                        }
                                    }  
                                }
                                damage=0;
                                jawaban="";
                                hpp=hpp-2;
                                for (int i = 0; i < counterjawaban; i++) {
                                    koordjawaban[i]="";
                                }
                                counterjawaban=0;
                                System.out.println("Player scrambeled the board");
                            }
                            else if(koord.charAt(1)==','){
                                int koorx=Character.getNumericValue(koord.charAt(0));
                                int koory=Character.getNumericValue(koord.charAt(2));
                                boolean terpilih=false;
                                if(counterjawaban==0){
                                    
                                }
                                else{
                                    for (int i = 0; i < counterjawaban; i++) {
                                        int tempx=Character.getNumericValue(koordjawaban[i].charAt(0));
                                        int tempy=Character.getNumericValue(koordjawaban[i].charAt(2));
                                        if(koorx==tempx&&koory==tempy){
                                            terpilih=true;
                                        }
                                    }
                                }
                                if(terpilih==true){
                                    System.out.println("huruf sudah dipakai");
                                }
                                else if(terpilih==false){
                                    jawaban=jawaban+tampil[koory][koorx];
                                    koordjawaban[counterjawaban]=koord;
                                    counterjawaban=counterjawaban+1;
                                    if(tampil[koory][koorx]=='z'||tampil[koory][koorx]=='x'||tampil[koory][koorx]=='q'){
                                        damage=damage+5;
                                    }
                                    else if(tampil[koory][koorx]=='a'||tampil[koory][koorx]=='i'||tampil[koory][koorx]=='u'||tampil[koory][koorx]=='e'||tampil[koory][koorx]=='0'){
                                        damage=damage+1;
                                    }
                                    else{
                                        damage=damage+2;
                                    }
                                }
                            }
                            else{
                                System.out.println("perintah tidak dikenali");
                            }
                            if(hpp<=0){
                                System.out.println("You died. You got through "+(level-1)+" levels.");
                                if(level-1>masuklb){
                                    System.out.println("You got into the highscore. Please input your name: ");
                                    String tempnama=scanstring.nextLine();
                                    namalb[10]=tempnama;
                                    skorlb[10]=level-1;
                                    for (int i = 0; i < 10; i++){
                                        for (int j = 0; j < 10-i; j++){
                                            if (skorlb[j] < skorlb[j+1]){
                                                int temp = skorlb[j];
                                                String temp2 = namalb[j];
                                                skorlb[j] = skorlb[j+1];
                                                namalb[j] = namalb[j+1];
                                                skorlb[j+1] = temp;
                                                namalb[j+1] = temp2;
                                            }
                                         }
                                    }
                                    masuklb=skorlb[9];
                                }
                                dead=true;
                                nextlvl=true;
                            }
                            else if(hpe<=0){
                                System.out.println("Enemy died. Player move to the next level.");
                                level=level+1;
                                nextlvl=true;
                                heal=heal+1;
                                if(heal>3){
                                    heal=3;
                                }
                            }
                        }
                    }
                }
            }
            else if (menu==2) {
                int menu2=-1;
                while(menu2!=0){  
                    System.out.println("#####################");
                    System.out.println("#   ==Edit Word==   #");
                    System.out.println("#####################");
                    if (counter==0) {
                        System.out.println("# Wordlist is empty #");
                    }
                    else{
                        for (int i = 0; i < counter; i++) {
                            if(i<=9){
                                System.out.print("#   "+(i+1)+". "+wordlist[i]);
                                for (int j = 0; j < 13-wordlist[i].length(); j++) {
                                    System.out.print(" ");
                                }
                                System.out.println("#");
                            }
                            else{
                                System.out.print("#   "+(i+1)+". "+wordlist[i]);
                                for (int j = 0; j < 12-wordlist[i].length(); j++) {
                                    System.out.print(" ");
                                }
                                System.out.println("#");
                            }
                        }
                    }
                    System.out.println("#####################");
                    System.out.println("#  99. Add new word #");
                    System.out.println("#  0. Back          #");
                    System.out.println("#####################");
                    System.out.println(">>");
                    menu2=scanint.nextInt();
                    if (menu2==99) {
                        if(counter>20){
                            System.out.println("Word list sudah penuh");
                        }
                        else{
                            System.out.println("New Word: ");
                            String newword=scanstring.nextLine();
                            newword=newword.toLowerCase();
                            wordlist[counter]=newword;
                            counter=counter+1;
                        }
                    }
                    else if (menu2==0) {

                    }
                    else if (menu2<=20) {
                        int menu3=-1;
                        while (menu3!=0){
                            System.out.println("###################");
                            System.out.println("#  ==Edit Word==  #");
                            System.out.println("###################");
                            System.out.print("#");
                            for (int i = 0; i < (17-wordlist[menu2-1].length())/2; i++) {
                                System.out.print(" ");
                            }
                            System.out.print(wordlist[menu2-1]);
                            for (int i = 0; i < (17-wordlist[menu2-1].length())/2; i++) {
                                System.out.print(" ");
                            }
                            System.out.println("#");
                            System.out.println("###################");
                            System.out.println("#  1. Edit        #");
                            System.out.println("#  2. Delete      #");
                            System.out.println("#  0. Back        #");
                            System.out.println("###################");
                            System.out.println(">>");
                            menu3=scanint.nextInt();
                            if (menu3==1) {
                                System.out.println("new word: ");
                                wordlist[menu2-1]=scanstring.nextLine();
                                System.out.println("berhasil!");
                            }
                            else if(menu3==2){
                                for (int i = menu2-1; i < counter; i++) {
                                    wordlist[i]=wordlist[i+1];
                                }
                                wordlist[counter]="";
                                counter=counter-1;
                                menu3=0;
                                System.out.println("berhasil dihapus");
                            }
                            else if(menu3!=0){
                                System.out.println("pilihan salah");
                            }
                        }
                    }
                    else{
                        System.out.println("pilihan salah");
                    }
                }
            }
            else if (menu==3) {
                boolean bukalb=true;
                while(bukalb==true){
                    System.out.println("######################");
                    System.out.println("#==== High Score ====#");
                    System.out.println("######################");
                    for (int i = 0; i < 10; i++) {
                        if(skorlb[i]==0&&namalb[i].equals("")){

                        }
                        else{
                            System.out.print("# "+(i+1)+". "+namalb[i]);
                            for (int j = 0; j < 10-namalb[i].length(); j++) {
                                System.out.print(" ");
                            }
                            System.out.print("- "+skorlb[i]);
                            if(skorlb[i]<10){
                                System.out.print(" ");
                            }
                            if(i+1<10){
                                System.out.print(" ");
                            }
                            System.out.println(" #");
                        }
                    }
                    System.out.println("######################");
                    System.out.println("# 0. Exit            #");
                    System.out.println("######################");
                    System.out.println(">>");
                    int menu3=scanint.nextInt();
                    if(menu3==0){
                        bukalb=false;
                    }
                }
            }
            else if (menu==0) {
                bermain=false;
            }
            else{
                
            }
        }
    } 
}
