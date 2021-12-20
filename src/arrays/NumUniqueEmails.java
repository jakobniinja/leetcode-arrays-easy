package arrays;

import java.util.HashSet;

public class NumUniqueEmails {
    public static int  numUniqueEmails( String[] emails ) {
        HashSet<String> uEmails= new HashSet<>();

        for( String email : emails){
            int splitP= email.indexOf("@");
            String lName = email.substring(0, splitP);
            String dName = email.substring(splitP);


            if(lName.contains("+")){
                int plusP = lName.indexOf("+");
                lName =lName.substring(0, plusP);
            }
            lName = lName.replaceAll("\\.", "");
            String nName =  lName + dName;
            uEmails.add(nName);
        }
        return uEmails.size();
    }

    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
    System.out.print(numUniqueEmails(emails));

    }
}
