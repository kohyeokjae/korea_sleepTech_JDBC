package main.java;

import main.java.manager.MemberManager;

public class Main {
    public static void main(String[] args) {
        MemberManager memberManager = new MemberManager();
        
        try {
            memberManager.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}