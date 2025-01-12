/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.t3_221116962;

import java.util.ArrayList;
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
        Scanner scanint=new Scanner(System.in);
        Scanner scanstring=new Scanner(System.in);
        ArrayList<User> user = new ArrayList<User>();
        boolean berjalan=true;
        while(berjalan==true){
            System.out.println("== LIME ==");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("0. Exit");
            int menu1=scanint.nextInt();
            if(menu1==1){
                System.out.println("Login");
                System.out.println("Username: ");
                String tempusername=scanstring.nextLine();
                System.out.println("Password: ");
                String temppassword=scanstring.nextLine();
                boolean masuk=false;
                int index=-1;
                for (int i = 0; i < user.size(); i++) {
                    if(tempusername.equals(user.get(i).getUsername())&&temppassword.equals(user.get(i).getPassword())){
                        masuk=true;
                        index=i;
                    }
                }
                if(masuk==true){
                    while(masuk==true){
//                        User usersekarang=new User();
//                        usersekarang=user.get(index);
//                        ArrayList<String> chatterbaru = new ArrayList<String>();
                        System.out.println("== welcome, "+user.get(index).getUsername()+" ==");
                        System.out.println("1. List Contact");
                        System.out.println("2. Chat");
                        System.out.println("3. Group");
                        System.out.println("4. Logout");
                        int menu2=scanint.nextInt();
                        if(menu2==1){
                            boolean listcontact=true;
                            while(listcontact==true){
                                System.out.println("Contact");
                                for (int i = 0; i < user.get(index).getContact().size(); i++) {
                                    System.out.println((i+1)+". "+user.get(index).getContact().get(i).getTeman().getFirst_name()+" "+user.get(index).getContact().get(i).getTeman().getLast_name());
                                }
                                System.out.println("99. Add Contact");
                                System.out.println("0. Back");
                                System.out.println(">>");
                                int menu3=scanint.nextInt();
                                if(menu3==99){
                                    boolean sudahada=false;
                                    boolean contactada=false;
                                    int indexcontact=-1;
                                    System.out.println("Masukkan Username: ");
                                    String tempusernamecontact=scanstring.nextLine();
                                    for (int i = 0; i < user.size(); i++) {
                                        if(tempusernamecontact.equals(user.get(i).getUsername())){
                                            contactada=true;
                                            indexcontact=i;
                                        }
                                    }
                                    if(contactada==true){
                                        for (int i = 0; i < user.get(index).getContact().size(); i++) {
                                            if(user.get(index).getContact().get(i).getTeman().getUsername().equals(tempusernamecontact)){
                                                sudahada=true;
                                            }
                                        }
                                        if(sudahada==true){
                                            System.out.println("contact sudah ada");
                                        }
                                        else{
                                            user.get(index).addContact(user.get(indexcontact));
                                        }
                                    }
                                    else{
                                        System.out.println("Username salah");
                                    }
                                }
                                else if(menu3==0){
                                    listcontact=false;
                                }
                                else if(menu3<user.get(index).getContact().size()+1){
                                    boolean ngechat=true;
                                    while(ngechat==true){
                                        System.out.println("Selected contact : ");
                                        System.out.println(user.get(index).getContact().get(menu3-1).getTeman().getFirst_name()+" "+user.get(index).getContact().get(menu3-1).getTeman().getLast_name());
                                        System.out.println("1. Chat");
                                        System.out.println("2. Delete");
                                        System.out.println("3. Back");
                                        System.out.println(">>");
                                        int menu4=scanint.nextInt();
                                        if(menu4==1){
                                            boolean ngechat2=true;
                                            while(ngechat2==true){
                                                int panjang=user.get(index).getContact().get(menu3-1).getTeman().getFirst_name().length()+user.get(index).getContact().get(menu3-1).getTeman().getLast_name().length()+1+10;
                                                for (int i = 0; i < panjang; i++) {
                                                    System.out.print("=");
                                                }
                                                System.out.println("");
                                                System.out.println("Chat with "+user.get(index).getContact().get(menu3-1).getTeman().getFirst_name()+" "+user.get(index).getContact().get(menu3-1).getTeman().getLast_name());
                                                for (int i = 0; i < panjang; i++) {
                                                    System.out.print("=");
                                                }
                                                System.out.println("");
//                                                System.out.println(user.get(index).getContact().get(menu3-1).getChat().size());
                                                for (int i = 0; i < user.get(index).getContact().get(menu3-1).getChat().size(); i++) {
                                                    int temppanjang=user.get(index).getFirst_name().length()+user.get(index).getLast_name().length()+3;
                                                    String namauser2=user.get(index).getFirst_name()+" "+user.get(index).getLast_name()+": ";
                                                    
                                                    boolean sama=true;
//                                                    if(user.get(index).getContact().get(menu3-1).getChat().get(menu3-1).getFrom().equals(user.get(index))){
//                                                        System.out.print("You : ");
//                                                        for (int j = temppanjang; j < user.get(index).getChat().get(menu3-1).getChat().get(i).length(); j++) {
//                                                            System.out.print(user.get(index).getChat().get(menu3-1).getChat().get(i).charAt(j));
//                                                        }
//                                                        System.out.println("");
//                                                    }
//                                                    else{
//                                                        System.out.println(user.get(index).getChat().get(menu3-1).getChat().get(i));
//                                                    }

//                                                    System.out.println(user.get(index).getContact().get(menu3-1).getChat().get(i));
                                                    for (int j = 0; j < temppanjang; j++) {
//                                                        System.out.print(namauser2.charAt(j));
//                                                        System.out.print(user.get(index).getContact().get(menu3-1).getChat().get(i).charAt(j));
                                                        if(user.get(index).getContact().get(menu3-1).getChat().get(i).charAt(j)==namauser2.charAt(j)){
                                                            
                                                        }
                                                        else{
                                                            sama=false;
                                                        }
                                                    }
                                                    if(sama==true){
                                                        System.out.print("You : ");
                                                        for (int j = temppanjang; j < user.get(index).getContact().get(menu3-1).getChat().get(i).length(); j++) {
                                                            System.out.print(user.get(index).getContact().get(menu3-1).getChat().get(i).charAt(j));
                                                        }
                                                        System.out.println("");
                                                    }
                                                    else{
                                                        System.out.println(user.get(index).getContact().get(menu3-1).getChat().get(i));
                                                    }


//                                                    if(usersekarang.getChat().get(menu3-1).getChat().get(i).charAt(0)=='1'){
//                                                        System.out.print("You: ");
//                                                        for (int j = 1; j < usersekarang.getChat().get(menu3-1).getChat().get(i).length(); j++) {
//                                                            System.out.print(usersekarang.getChat().get(menu3-1).getChat().get(i).charAt(j));
//                                                        }
//                                                        System.out.println("");
//                                                    }
//                                                    else if(usersekarang.getChat().get(menu3-1).getChat().get(i).charAt(0)=='2'){
//                                                        System.out.print(usersekarang.getContact().get(menu3-1).getFirst_name()+" "+usersekarang.getContact().get(menu3-1).getLast_name()+": ");
//                                                        for (int j = 1; j < usersekarang.getChat().get(menu3-1).getChat().get(i).length(); j++) {
//                                                            System.out.print(usersekarang.getChat().get(menu3-1).getChat().get(i).charAt(j));
//                                                        }
//                                                        System.out.println("");
//                                                    }
                                                }
                                                for (int i = 0; i < panjang; i++) {
                                                    System.out.print("=");
                                                }
                                                System.out.println("");
                                                System.out.println("0. back");
                                                for (int i = 0; i < panjang; i++) {
                                                    System.out.print("=");
                                                }
                                                System.out.println("");
                                                System.out.println(">>");
                                                String temptext=scanstring.nextLine();
                                                if(temptext.equals("0")){
                                                    ngechat2=false;
                                                }
                                                else{
                                                    user.get(index).getContact().get(menu3-1).ngechat(user.get(index).getFirst_name()+" "+user.get(index).getLast_name()+": "+temptext);
                                                    System.out.println("");
                                                    int ketemu=-1;
                                                    int ketemu2=-1;
                                                    for (int i = 0; i < user.size(); i++) {
                                                        if(user.get(index).getContact().get(menu3-1).getTeman().equals(user.get(i))){
                                                            ketemu=i;
                                                        }
                                                    }
                                                    for (int i = 0; i < user.get(ketemu).getContact().size(); i++) {
                                                        if(user.get(ketemu).getContact().get(i).getTeman().equals(user.get(index))){
                                                            ketemu2=i;
                                                        }
                                                    }
                                                    user.get(ketemu).getContact().get(ketemu2).ngechat(user.get(index).getFirst_name()+" "+user.get(index).getLast_name()+": "+temptext);
                                                    String namateman=user.get(ketemu).getFirst_name()+" "+user.get(ketemu).getLast_name()+" - ";
                                                    String namasaya=user.get(index).getFirst_name()+" "+user.get(index).getLast_name()+" - ";
//                                                    user.get(index).addChatterbaru(menu3-1, user.get(ketemu).getFirst_name());
                                                    for (int i = 0; i < user.get(index).getChatterbaru().size(); i++) {
//                                                        System.out.println("GAPENTING!"+user.get(index).getChatterbaru().get(i).substring(0,namateman.length()));
                                                        if(user.get(index).getChatterbaru().get(i).substring(0,namateman.length()).equals(namateman)){
                                                            user.get(index).getChatterbaru().remove(i);
                                                        }
                                                    }
                                                    for (int i = 0; i < user.get(ketemu).getChatterbaru().size(); i++) {
//                                                        System.out.println("GAPENTING!"+user.get(ketemu).getChatterbaru().get(i).substring(0,namateman.length()));
                                                        if(user.get(ketemu).getChatterbaru().get(i).substring(0,namateman.length()).equals(namasaya)){
                                                            user.get(ketemu).getChatterbaru().remove(i);
                                                        }
                                                    }
                                                    user.get(index).addChatterbaru(user.get(ketemu).getFirst_name()+" "+user.get(ketemu).getLast_name()+" - "+temptext);
                                                    user.get(ketemu).addChatterbaru(user.get(index).getFirst_name()+" "+user.get(index).getLast_name()+" - "+temptext);
                                                }
                                            }
                                        }
                                        else if(menu4==2){
                                            int ketemu=-1;
                                            int ketemu2=-1;
                                            for (int i = 0; i < user.size(); i++) {
                                                if(user.get(index).getContact().get(menu3-1).getTeman().equals(user.get(i))){
                                                    ketemu=i;
                                                }
                                            }
                                            for (int i = 0; i < user.get(ketemu).getContact().size(); i++) {
                                                if(user.get(ketemu).getContact().get(i).getTeman().equals(user.get(index))){
                                                    ketemu2=i;
                                                }
                                            }
                                            user.get(index).getContact().remove(menu3-1);
                                            user.get(ketemu).getContact().remove(ketemu2);
                                        }
                                        else if(menu4==3){
                                            ngechat=false;
                                        }
                                    }
                                }
                                else{
                                    System.out.println("pilihan salah");
                                }
                            }
                        }
                        else if(menu2==2){
                            boolean bukachat=true;
                            while(bukachat==true){
                                for (int i = 0; i < user.get(index).getChatterbaru().size(); i++) {
                                    System.out.println((i+1)+". "+user.get(index).getChatterbaru().get(i));
                                }
                                System.out.println("0. Back");
                                System.out.println(">>");
                                int menu3=scanint.nextInt();
                                if(menu3==0){
                                    bukachat=false;
                                }
                                else if (menu3<user.get(index).getChatterbaru().size()+1){
                                    int ketemu4=-1;
                                    int ketemu3=-1;
                                    for (int i = 0; i < user.size(); i++) {
                                        if(user.get(index).getChatterbaru().get(menu3-1).substring(0,user.get(i).getFirst_name().length()+user.get(i).getLast_name().length()+1).equals(user.get(i).getFirst_name()+" "+user.get(i).getLast_name())){
                                            ketemu4=i;
                                        }
                                    }
                                    for (int i = 0; i < user.get(index).getContact().size(); i++) {
                                        if(user.get(ketemu4).equals(user.get(index).getContact().get(i).getTeman())){
                                            ketemu3=i;
                                        }
                                    }
//                                    System.out.println(ketemu4);
                                    
                                    
                                    
                                    
                                    
                                    
                                    boolean ngechat2=true;
                                            while(ngechat2==true){
                                                int panjang=user.get(index).getContact().get(ketemu3).getTeman().getFirst_name().length()+user.get(index).getContact().get(ketemu3).getTeman().getLast_name().length()+1+10;
                                                for (int i = 0; i < panjang; i++) {
                                                    System.out.print("=");
                                                }
                                                System.out.println("");
                                                System.out.println("Chat with "+user.get(index).getContact().get(ketemu3).getTeman().getFirst_name()+" "+user.get(index).getContact().get(ketemu3).getTeman().getLast_name());
                                                for (int i = 0; i < panjang; i++) {
                                                    System.out.print("=");
                                                }
                                                System.out.println("");
//                                                System.out.println(user.get(index).getContact().get(ketemu3).getChat().size());
                                                for (int i = 0; i < user.get(index).getContact().get(ketemu3).getChat().size(); i++) {
                                                    int temppanjang=user.get(index).getFirst_name().length()+user.get(index).getLast_name().length()+3;
                                                    String namauser2=user.get(index).getFirst_name()+" "+user.get(index).getLast_name()+": ";
                                                    
                                                    boolean sama=true;
//                                                    if(user.get(index).getContact().get(ketemu3).getChat().get(ketemu3).getFrom().equals(user.get(index))){
//                                                        System.out.print("You : ");
//                                                        for (int j = temppanjang; j < user.get(index).getChat().get(ketemu3).getChat().get(i).length(); j++) {
//                                                            System.out.print(user.get(index).getChat().get(ketemu3).getChat().get(i).charAt(j));
//                                                        }
//                                                        System.out.println("");
//                                                    }
//                                                    else{
//                                                        System.out.println(user.get(index).getChat().get(ketemu3).getChat().get(i));
//                                                    }

//                                                    System.out.println(user.get(index).getContact().get(ketemu3).getChat().get(i));
                                                    for (int j = 0; j < temppanjang; j++) {
//                                                        System.out.print(namauser2.charAt(j));
//                                                        System.out.print(user.get(index).getContact().get(ketemu3).getChat().get(i).charAt(j));
                                                        if(user.get(index).getContact().get(ketemu3).getChat().get(i).charAt(j)==namauser2.charAt(j)){
                                                            
                                                        }
                                                        else{
                                                            sama=false;
                                                        }
                                                    }
                                                    if(sama==true){
                                                        System.out.print("You : ");
                                                        for (int j = temppanjang; j < user.get(index).getContact().get(ketemu3).getChat().get(i).length(); j++) {
                                                            System.out.print(user.get(index).getContact().get(ketemu3).getChat().get(i).charAt(j));
                                                        }
                                                        System.out.println("");
                                                    }
                                                    else{
                                                        System.out.println(user.get(index).getContact().get(ketemu3).getChat().get(i));
                                                    }


//                                                    if(usersekarang.getChat().get(ketemu3).getChat().get(i).charAt(0)=='1'){
//                                                        System.out.print("You: ");
//                                                        for (int j = 1; j < usersekarang.getChat().get(ketemu3).getChat().get(i).length(); j++) {
//                                                            System.out.print(usersekarang.getChat().get(ketemu3).getChat().get(i).charAt(j));
//                                                        }
//                                                        System.out.println("");
//                                                    }
//                                                    else if(usersekarang.getChat().get(ketemu3).getChat().get(i).charAt(0)=='2'){
//                                                        System.out.print(usersekarang.getContact().get(ketemu3).getFirst_name()+" "+usersekarang.getContact().get(ketemu3).getLast_name()+": ");
//                                                        for (int j = 1; j < usersekarang.getChat().get(ketemu3).getChat().get(i).length(); j++) {
//                                                            System.out.print(usersekarang.getChat().get(ketemu3).getChat().get(i).charAt(j));
//                                                        }
//                                                        System.out.println("");
//                                                    }
                                                }
                                                for (int i = 0; i < panjang; i++) {
                                                    System.out.print("=");
                                                }
                                                System.out.println("");
                                                System.out.println("0. back");
                                                for (int i = 0; i < panjang; i++) {
                                                    System.out.print("=");
                                                }
                                                System.out.println("");
                                                System.out.println(">>");
                                                String temptext=scanstring.nextLine();
                                                if(temptext.equals("0")){
                                                    ngechat2=false;
                                                }
                                                else{
                                                    user.get(index).getContact().get(ketemu3).ngechat(user.get(index).getFirst_name()+" "+user.get(index).getLast_name()+": "+temptext);
                                                    System.out.println("");
                                                    int ketemu=-1;
                                                    int ketemu2=-1;
                                                    for (int i = 0; i < user.size(); i++) {
                                                        if(user.get(index).getContact().get(ketemu3).getTeman().equals(user.get(i))){
                                                            ketemu=i;
                                                        }
                                                    }
                                                    for (int i = 0; i < user.get(ketemu).getContact().size(); i++) {
                                                        if(user.get(ketemu).getContact().get(i).getTeman().equals(user.get(index))){
                                                            ketemu2=i;
                                                        }
                                                    }
                                                    user.get(ketemu).getContact().get(ketemu2).ngechat(user.get(index).getFirst_name()+" "+user.get(index).getLast_name()+": "+temptext);
                                                    String namateman=user.get(ketemu).getFirst_name()+" "+user.get(ketemu).getLast_name()+" - ";
                                                    String namasaya=user.get(index).getFirst_name()+" "+user.get(index).getLast_name()+" - ";
//                                                    user.get(index).addChatterbaru(ketemu3, user.get(ketemu).getFirst_name());
                                                    for (int i = 0; i < user.get(index).getChatterbaru().size(); i++) {
//                                                        System.out.println("GAPENTING!"+user.get(index).getChatterbaru().get(i).substring(0,namateman.length()));
                                                        if(user.get(index).getChatterbaru().get(i).substring(0,namateman.length()).equals(namateman)){
                                                            user.get(index).getChatterbaru().remove(i);
                                                        }
                                                    }
                                                    for (int i = 0; i < user.get(ketemu).getChatterbaru().size(); i++) {
//                                                        System.out.println("GAPENTING!"+user.get(ketemu).getChatterbaru().get(i).substring(0,namateman.length()));
                                                        if(user.get(ketemu).getChatterbaru().get(i).substring(0,namateman.length()).equals(namasaya)){
                                                            user.get(ketemu).getChatterbaru().remove(i);
                                                        }
                                                    }
                                                    user.get(index).addChatterbaru(user.get(ketemu).getFirst_name()+" "+user.get(ketemu).getLast_name()+" - "+temptext);
                                                    user.get(ketemu).addChatterbaru(user.get(index).getFirst_name()+" "+user.get(index).getLast_name()+" - "+temptext);
                                                }
                                            }
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
//                                    for (int i = 0; i < user.get(index).getChatterbaru().size(); i++) {
//                                        for (int j = 0; j < user.size(); j++) {
//                                            if(user.get(index).getChatterbaru().get(i).equals(user.get(j).getFirst_name()+" "+user.get(j).getFirst_name()))
//                                        }
//                                    }
                                }
                                else{
                                    System.out.println("pilihan salah");
                                }
                            }
                        }
                        else if(menu2==3){
                            boolean menugrup=true;
                            while(menugrup==true){
                                System.out.println("Groups");
                                for (int i = 0; i < user.get(index).getGrup().size(); i++) {
                                    System.out.println((i+1)+". "+user.get(index).getGrup().get(i).getName());
                                }
                                System.out.println("99. Add Group");
                                System.out.println("0. Back");
                                System.out.println(">>");
                                int menu5=scanint.nextInt();
                                if(menu5==99){
                                    boolean jalangrup=true;
                                    while(jalangrup==true){
                                        System.out.println("Add Group");
                                        System.out.println("1. Create group");
                                        System.out.println("2. Join grup");
                                        System.out.println("0. back");
                                        System.out.println(">>");
                                        int menuu=scanint.nextInt();
                                        if(menuu==1){
                                            System.out.println("Name: ");
                                            String tempnamagrup=scanstring.nextLine();
                                            user.get(index).getGrup().add(new Group(tempnamagrup,user.get(index)));
                                        }
                                        else if(menuu==2){
                                            System.out.println("kode group: ");
                                            System.out.println(">>");
                                            String temptempkodegrup=scanstring.nextLine();
                                            for (int i = 0; i < user.size(); i++) {
                                                for (int j = 0; j < user.get(i).getGrup().size(); j++) {
                                                    if(user.get(i).getGrup().get(j).getCode().equals(temptempkodegrup)){
                                                        user.get(index).getGrup().add(user.get(i).getGrup().get(j));
                                                        user.get(i).getGrup().get(j).ngeadd(user.get(index));
                                                        j=user.get(i).getGrup().size()-1;
                                                        i=user.size()-1;
                                                    }
                                                }
                                            }
                                        }
                                        else if(menuu==0){
                                            jalangrup=false;
                                        }
                                    }
                                }
                                else if(menu5==0){
                                    menugrup=false;
                                }
                                else if(menu5<user.get(index).getGrup().size()+1){
                                    boolean menugrup2=true;
                                    while(menugrup2==true){
                                        System.out.println("Group Name: "+user.get(index).getGrup().get(menu5-1).getName());
                                        System.out.println("Group member : "+user.get(index).getGrup().get(menu5-1).getMember().size());
                                        System.out.println("Group Code: "+user.get(index).getGrup().get(menu5-1).getCode());
                                        System.out.println("1. Open messages");
                                        System.out.println("2. Edit name");
                                        System.out.println("3. Add member");
                                        System.out.println("4. Remove member");
                                        System.out.println("0. Back");
                                        System.out.println(">>");
                                        int menu6=scanint.nextInt();
                                        if(menu6==1){
                                            boolean menugrup3=true;
                                            while(menugrup3==true){
                                                
                                                for (int i = 0; i < user.get(index).getGrup().get(menu5-1).getName().length(); i++) {
                                                    System.out.print("=");
                                                }
                                                System.out.println("");
                                                System.out.println(user.get(index).getGrup().get(menu5-1).getName());
                                                for (int i = 0; i < user.get(index).getGrup().get(menu5-1).getName().length(); i++) {
                                                    System.out.print("=");
                                                }
                                                System.out.println("");




                                                for (int i = 0; i < user.get(index).getGrup().get(menu5-1).getGroupchat().size(); i++) {
                                                    int temppanjang=user.get(index).getFirst_name().length()+user.get(index).getLast_name().length()+3;
                                                    String namauser2=user.get(index).getFirst_name()+" "+user.get(index).getLast_name()+": ";

                                                    boolean sama=true;
    //                                                    if(user.get(index).getContact().get(ketemu3).getChat().get(ketemu3).getFrom().equals(user.get(index))){
    //                                                        System.out.print("You : ");
    //                                                        for (int j = temppanjang; j < user.get(index).getChat().get(ketemu3).getChat().get(i).length(); j++) {
    //                                                            System.out.print(user.get(index).getChat().get(ketemu3).getChat().get(i).charAt(j));
    //                                                        }
    //                                                        System.out.println("");
    //                                                    }
    //                                                    else{
    //                                                        System.out.println(user.get(index).getChat().get(ketemu3).getChat().get(i));
    //                                                    }

    //                                                    System.out.println(user.get(index).getContact().get(ketemu3).getChat().get(i));
                                                    for (int j = 0; j < temppanjang; j++) {
    //                                                        System.out.print(namauser2.charAt(j));
    //                                                        System.out.print(user.get(index).getContact().get(ketemu3).getChat().get(i).charAt(j));
                                                        if(user.get(index).getGrup().get(menu5-1).getGroupchat().get(i).charAt(j)==namauser2.charAt(j)){

                                                        }
                                                        else{
                                                            sama=false;
                                                        }
                                                    }
                                                    if(sama==true){
                                                        System.out.print("You : ");
                                                        for (int j = temppanjang; j < user.get(index).getGrup().get(menu5-1).getGroupchat().get(i).length(); j++) {
                                                            System.out.print(user.get(index).getGrup().get(menu5-1).getGroupchat().get(i).charAt(j));
                                                        }
                                                        System.out.println("");
                                                    }
                                                    else{
                                                        System.out.println(user.get(index).getGrup().get(menu5-1).getGroupchat().get(i));
                                                    }
                                                }
                                                for (int i = 0; i < user.get(index).getGrup().get(menu5-1).getName().length(); i++) {
                                                    System.out.print("=");
                                                }
                                                System.out.println("");
                                                System.out.println("0. Back");
                                                for (int i = 0; i < user.get(index).getGrup().get(menu5-1).getName().length(); i++) {
                                                    System.out.print("=");
                                                }
                                                System.out.println("");
                                                System.out.println(">>");
                                                String tempchatgrup=scanstring.nextLine();
                                                if(tempchatgrup.equals("0")){
                                                    menugrup3=false;
                                                }
                                                else{
                                                    user.get(index).getGrup().get(menu5-1).ngechat(user.get(index).getFirst_name()+" "+user.get(index).getLast_name()+": "+tempchatgrup);
//                                                    for (int i = 0; i < user.get(index).getGrup().get(menu5-1).getMember().size(); i++) {
//                                                        int nemu1=-1;
//                                                        int nemu2=-1;
//                                                        for (int j = 0; j < user.get(i).getGrup().size(); j++) {
//                                                            if(user.get(index).getGrup().get(menu5-1).getCode().equals(user.get(i).getGrup().get(j).getCode())){
//                                                                nemu1=i;
//                                                                nemu2=j;
//                                                            }
//                                                        }
//                                                        user.get(nemu1).getGrup().get(nemu2).ngechat(user.get(index).getFirst_name()+" "+user.get(index).getLast_name()+": "+tempchatgrup);
//                                                    }
                                                }
                                            }
                                            
                                            
                                            
                                            
                                            
                                        }
                                        else if(menu6==2){
                                            System.out.println("New Name: ");
                                            String newname=scanstring.nextLine();
                                            user.get(index).getGrup().get(menu5-1).setName(newname);
//                                            for (int i = 0; i < user.get(index).getGrup().get(menu5-1).getMember().size(); i++) {
//                                                int nemu1=-1;
//                                                int nemu2=-1;
//                                                for (int j = 0; j < user.get(i).getGrup().size(); j++) {
//                                                    if(user.get(index).getGrup().get(menu5-1).getCode().equals(user.get(i).getGrup().get(j).getCode())){
//                                                        nemu1=i;
//                                                        nemu2=j;
//                                                    }
//                                                }
//                                                user.get(nemu1).getGrup().get(nemu2).setName(newname);
//                                            }
                                        }
                                        else if(menu6==3){
                                            System.out.println("Masukkan Username: ");
                                            String newmember=scanstring.nextLine();
                                            boolean usernamevalid=false;
                                            boolean usernamesudahada=false;
                                            int userke=-1;
                                            for (int i = 0; i < user.size(); i++) {
                                                if(user.get(i).getUsername().equals(newmember)){
                                                    usernamevalid=true;
                                                    userke=i;
                                                }
                                            }
                                            if(usernamevalid==true){
                                                for (int i = 0; i < user.get(index).getGrup().get(menu5-1).getMember().size(); i++) {
                                                    if(user.get(index).getGrup().get(menu5-1).getMember().get(i).getUsername().equals(newmember)){
                                                        usernamesudahada=true;
                                                    }
                                                }
                                                if(usernamesudahada==false){
//                                                    user.get(index).getGrup().get(menu5-1).ngeadd(user.get(userke));
                                                    user.get(userke).getGrup().add(user.get(index).getGrup().get(menu5-1));
                                                    int grupke2=-1;
                                                    for (int j = 0; j < user.get(userke).getGrup().size(); j++) {
                                                        if(user.get(index).getGrup().get(menu5-1).equals(user.get(userke).getGrup().get(j))){
                                                            grupke2=j;
                                                        }
                                                    }
                                                    user.get(userke).getGrup().get(grupke2).ngeadd(user.get(userke));
//                                                    int temp1=user.get(index).getGrup().get(menu5-1).getMember().size();
//                                                    System.out.println(temp1);
//                                                    for (int i = 0; i < temp1; i++) {
//                                                        int grupke=-1;
//                                                        int temp2=user.get(index).getGrup().get(menu5-1).getMember().get(i).getGrup().size();
//                                                        for (int j = 0; j < temp2; j++) {
//                                                            if(user.get(index).getGrup().get(menu5-1).equals(user.get(index).getGrup().get(menu5-1).getMember().get(i).getGrup().get(j))){
//                                                                grupke=j;
//                                                            }
//                                                        }
//                                                        System.out.println(temp1);
//                                                        user.get(index).getGrup().get(menu5-1).getMember().get(i).getGrup().get(grupke).ngeadd(user.get(userke));
//                                                    }
//                                                    user.get(index).getGrup().get(menu5-1).getMember().add(user.get(userke));
//                                                    int temp1=user.get(index).getGrup().get(menu5-1).getMember().size();
//                                                    for (int i = 0; i < temp1; i++) {
//                                                        int grupke=-1;
//                                                        int temp2=user.get(index).getGrup().get(menu5-1).getMember().get(i).getGrup().size();
//                                                        for (int j = 0; j < temp2; j++) {
//                                                            if(user.get(index).getGrup().get(menu5-1).getMember().get(i).getGrup().get(j).equals(user.get(index).getGrup().get(menu5-1))){
//                                                                grupke=j;
//                                                            }
//                                                        }
////                                                        System.out.println(user.get(index).getGrup().get(menu5-1).getMember().size());
////                                                        System.out.println(grupke);
////                                                        System.out.println(userke);
//                                                        user.get(index).getGrup().get(menu5-1).getMember().get(i).getGrup().get(grupke).ngeadd(user.get(userke));
////                                                        int nemu1=-3;
////                                                        int nemu2=-2;
////                                                        for (int j = 0; j < user.get(index).getGrup().get(menu5-1).getMember().size(); j++) {
////                                                            if(user.get(index).getGrup().get(menu5-1).getCode().equals(user.get(i).getGrup().get(j).getCode())){
////                                                                nemu1=i;
////                                                                nemu2=j;
////                                                            }
////                                                        }
////                                                        System.out.println(user.get(index).getGrup().get(menu5-1).getMember().size());
////                                                        System.out.println(user.get(nemu1).getGrup().get(nemu2).g);
////                                                        user.get(nemu1).getGrup().get(nemu2).ngeadd(user.get(3));
//                                                    }
                                                }
                                                else{
                                                    System.out.println("username sudah ada");
                                                }
                                            }
                                            else{
                                                System.out.println("username tidak valid");
                                            }
                                        }
                                        else if(menu6==4){
                                            boolean menugrup3=true;
                                            while(menugrup3==true){
                                                System.out.println(user.get(index).getGrup().get(menu5-1).getName()+" members");
                                                for (int i = 0; i < user.get(index).getGrup().get(menu5-1).getMember().size(); i++) {
                                                    System.out.println((i+1)+". "+user.get(index).getGrup().get(menu5-1).getMember().get(i).getFirst_name()+" "+user.get(index).getGrup().get(menu5-1).getMember().get(i).getLast_name());
                                                }
                                                System.out.println("0. Back");
                                                System.out.println(">>");
                                                int menu7=scanint.nextInt();
                                                if(menu7==0){
                                                    menugrup3=false;
                                                }
                                                else if(menu7<user.get(index).getGrup().get(menu5-1).getMember().size()+1){
                                                    int grupke2=-1;
                                                    for (int j = 0; j < user.get(index).getGrup().get(menu5-1).getMember().get(menu7-1).getGrup().size(); j++) {
                                                        if(user.get(index).getGrup().get(menu5-1).equals(user.get(index).getGrup().get(menu5-1).getMember().get(menu7-1).getGrup().get(j))){
                                                            grupke2=j;
                                                        }
                                                    }
                                                    user.get(index).getGrup().get(menu5-1).getMember().get(menu7-1).getGrup().remove(grupke2);
                                                    user.get(index).getGrup().get(menu5-1).getMember().remove(menu7-1);
//                                                    for (int i = 0; i < user.get(index).getGrup().get(menu5-1).getMember().size(); i++) {
//                                                        int nemu1=-1;
//                                                        int nemu2=-1;
//                                                        for (int j = 0; j < user.get(i).getGrup().size(); j++) {
//                                                            if(user.get(index).getGrup().get(menu5-1).getCode().equals(user.get(i).getGrup().get(j).getCode())){
//                                                                nemu1=i;
//                                                                nemu2=j;
//                                                            }
//                                                        }
//                                                        user.get(nemu1).getGrup().get(nemu2).getMember().remove(menu7-1);
//                                                    }
//                                                    user.get(index).getGrup().get(menu5-1).getMember().remove(menu7-1);
                                                }
                                                else{
                                                    System.out.println("pilihan salah");
                                                }
                                            }
                                        }
                                        else if(menu6==0){
                                            menugrup2=false;
                                        }
                                    }
                                }
                                else{

                                }
                            }
                        }
                        else if(menu2==4){
                            masuk=false;
                        }
                        else{
                            System.out.println("pilihan salah");
                        }
//                        user.set(index, usersekarang);
                    }
                }
                else{
                    System.out.println("Username/Password salah");
                }
            }
            else if(menu1==2){
                System.out.println("Register");
                System.out.println("Username: ");
                String tempusername=scanstring.nextLine();
                System.out.println("Password: ");
                String temppassword=scanstring.nextLine();
                System.out.println("Confirm Password");
                String tempconfirmpassword=scanstring.nextLine();
                System.out.println("First name: ");
                String tempfirstname=scanstring.nextLine();
                System.out.println("Last name: ");
                String templastname=scanstring.nextLine();
                boolean kembar=false;
                for (int i = 0; i < user.size(); i++) {
                    if(tempusername.equals(user.get(i).getUsername())){
                        kembar=true;
                    }
                }
                if(kembar==true){
                    System.out.println("Username sudah ada");
                }
                else{
                    if(temppassword.equals(tempconfirmpassword)){
                        user.add(new User(tempusername,temppassword,tempfirstname,templastname));
                    }
                    else{
                        System.out.println("password dan confirm password tidak sama");
                    }
                }
            }
            else if(menu1==0){
                
            }
        }
        
    }
    
}
