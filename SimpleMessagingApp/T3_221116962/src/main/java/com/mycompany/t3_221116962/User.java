/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t3_221116962;

import java.util.ArrayList;

/**
 *
 * @author Ivan Laptop
 */
public class User {
    private String username;
    private String password;
    private String first_name;
    private String Last_name;
    private ArrayList<Contact> contact = new ArrayList<Contact>();
    private ArrayList<String> chatterbaru = new ArrayList<String>();
    private ArrayList<Group> grup = new ArrayList<Group>();
//    private static ArrayList<Chat> chat = new ArrayList<Chat>();

    public ArrayList<Group> getGrup() {
        return grup;
    }

    public void setGrup(ArrayList<Group> grup) {
        this.grup = grup;
    }
    public void addgrup(Group grup){
        
    }

    public ArrayList<String> getChatterbaru() {
        return chatterbaru;
    }

    public void setChatterbaru(ArrayList<String> chatterbaru) {
        this.chatterbaru = chatterbaru;
    }
    public void addChatterbaru(String isi){
        chatterbaru.add(isi);
    }

    public User(String username, String password, String first_name, String last_name) {
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.Last_name = last_name;
        this.Last_name = Last_name;
    }
    
    public User() {
        this.username = null;
        this.password = null;
        this.first_name = null;
        this.Last_name = null;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }

    public ArrayList<Contact> getContact() {
        return contact;
    }

    public void setContact(ArrayList<Contact> contact) {
        this.contact = contact;
    }

//    public static ArrayList<Chat> getChat() {
//        return chat;
//    }
//
//    public static void setChat(ArrayList<Chat> chat) {
//        User.chat = chat;
//    }
//    public void addChat(User user){
//        chat.add(new Chat(this,user));
//        chat.add(new Chat(user,this));
//    }
    public void addContact(User user) {
        contact.add(new Contact(user));
        user.contact.add(new Contact(this));
//        chat.add(new Chat(this,user));
//        chat.add(new Chat(user,this));
    }
//    public void ngechat2(User user){
//        
//    }
}
