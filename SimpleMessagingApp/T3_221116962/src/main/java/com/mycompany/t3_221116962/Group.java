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
public class Group {
    private String name;
    private ArrayList<User> member = new ArrayList<User>();
    private ArrayList<String> groupchat = new ArrayList<String>();
    private String code;
    private static int nomerurut=1;

    public void ngeadd(User user){
        member.add(user);
    }
    
    public Group(String name,User user) {
        this.name = name;
        String panjangnama=Integer.toString(name.length());
        String nomerurutstring=Integer.toString(nomerurut);
        if(name.length()<10){
            panjangnama="0"+Integer.toString(name.length());
        }
        else{
            panjangnama=Integer.toString(name.length());
        }
        if(nomerurut<10){
            nomerurutstring="00"+Integer.toString(nomerurut);
        }
        else if(nomerurut<100){
            nomerurutstring="0"+Integer.toString(nomerurut);
        }
        else{
            nomerurutstring=Integer.toString(nomerurut);
        }
        code = name.substring(0,3)+panjangnama+nomerurutstring;
        ngeadd(user);
        nomerurut++;
    }

    public static int getNomerurut() {
        return nomerurut;
    }

    public static void setNomerurut(int nomerurut) {
        Group.nomerurut = nomerurut;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<User> getMember() {
        return member;
    }

    public void setMember(ArrayList<User> member) {
        this.member = member;
    }

    public ArrayList<String> getGroupchat() {
        return groupchat;
    }
    
    public void setGroupchat(ArrayList<String> groupchat) {
        this.groupchat = groupchat;
    }
    
    public void ngechat(String text){
        groupchat.add(text);
    }
    
    
}
