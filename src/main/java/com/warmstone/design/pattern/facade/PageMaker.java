package com.warmstone.design.pattern.facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author pengshun
 * @date 2022-11-10 20:37
 * @description
 */
public class PageMaker {

    private PageMaker() {}

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties properties = Database.getProperties("maildata");
            String username = properties.getProperty(mailaddr);
            HTMLWriter htmlWriter = new HTMLWriter(new FileWriter(filename));
            htmlWriter.title("Welcome to " + username + "'s page!");
            htmlWriter.paragraph("欢迎来到" + username + "的主页!");
            htmlWriter.paragraph("等着你的邮件哦");
            htmlWriter.mailto(mailaddr, username);
            htmlWriter.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
