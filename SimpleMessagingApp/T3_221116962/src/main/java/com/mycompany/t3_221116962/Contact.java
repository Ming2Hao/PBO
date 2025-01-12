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
public class Contact {
    private User teman=new User();
    private ArrayList<String> chat = new ArrayList<String>();

    public Contact(User user) {
        this.teman=user;
    }

    public User getTeman() {
        return teman;
    }

    public void setTeman(User teman) {
        this.teman = teman;
    }

    public ArrayList<String> getChat() {
        return chat;
    }

    public void setChat(ArrayList<String> chat) {
        this.chat = chat;
    }
    
    public void ngechat(String text){
        chat.add(text);
    }
}
