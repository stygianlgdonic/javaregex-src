/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author aliik
 */
public class regexlab1 {

    public static void main(String args[]) {
        // String to be scanned to find the pattern.
        Scanner sc = new Scanner(System.in);
        System.out.println("Input anything other than identifier");
        String line = sc.nextLine();

        String pattern = "[^a-zA-Z_][a-zA-Z0-9_]*";

        Pattern r = Pattern.compile(pattern);

        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("not identifier: " + m.group(0));
        } else {
            System.out.println("Invalid input");
        }
    }

}
