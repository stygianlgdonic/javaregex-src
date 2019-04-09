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
 * @author FA16-BSE-054
 */
public class regex3 {

    public static void main(String args[]) {
        // String to be scanned to find the pattern.
        Scanner sc = new Scanner(System.in);
        System.out.println("Input anything:");
        String line = sc.nextLine();
        
        String pattern = "\\+|-|/|\\*";

        Pattern r = Pattern.compile(pattern);

        Matcher m = r.matcher(line);
        
        boolean found = false;
        while(m.find()) {
            System.out.println("Found " + m.group());
            found = true;
        }
        
        if(found == false) {
            System.out.println("No operator found!");
        }
        
    }

}
