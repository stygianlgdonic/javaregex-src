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
public class regex2 {

    public static void main(String args[]) {
        // String to be scanned to find the pattern.
        Scanner sc = new Scanner(System.in);
        System.out.println("Input anything:");
        String line = sc.nextLine();
        
        String pattern = "^String\\s+([A-Za-z_][0-9_]*?\\s*=\\s*\"[^\"]+\")\\s*;|^char\\s+([A-Za-z]+\\s*=\\s*\'[^']\')\\s*;";

        Pattern r = Pattern.compile(pattern);

        Matcher m = r.matcher(line);
            if(m.find()){
                if(m.group(1)!=null)
                    System.out.println(m.group(1));
                else if(m.group(2)!=null)
                    System.out.println(m.group(2));                
            } else {
                System.out.println("Invalid input");
            }
    }

}
