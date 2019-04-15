/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author fa16-bse-054
 */
public class regex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input anything: ");
        String linex = sc.nextLine();
        String line = " " + linex + " ";

        String pattern = "(int\\s+[A-Za-z_][0-9_]*?\\s*=\\s*[0-9]+\\s*;|^double\\s+[A-Za-z_][0-9_]*?\\s*=\\s*[0-9\\.?]+\\s*;\\s*)|"
                + "(String\\s+[A-Za-z_][0-9_]*?\\s*=\\s*\"[^\"]+\"\\s*;|^char\\s+[A-Za-z]+\\s*=\\s*\'[^']\'\\s*;\\s)|"
                + "([a-zA-Z_][a-zA-Z0-9_]*\\s)|"
                + "(\\+|-|/|\\*|&|\\||=)|"
                + "([0-9]+[W]*\\s*)";

        Pattern r = Pattern.compile(pattern);

        Matcher m = r.matcher(line);

        boolean found = false;

        while (m.find()) {

            if (m.group(1) != null || m.group(2) != null) {
                System.out.print("declaration: ");
                if (m.group(1) != null) {
                    System.out.println(m.group(1));
                } else {
                    System.out.println(m.group(2));
                }
            }

            if (m.group(3) != null) {
                System.out.println("identifier: " + m.group(3));
            }

            if (m.group(4) != null) {
                System.out.println("operator: " + m.group(4));
            }

            if (m.group(5) != null) {
                System.out.println("Digit: " + m.group(5));
            }

            found = true;
        }

        if (found == false) {
            System.out.println("Invalid input!");
        }

    }

}
