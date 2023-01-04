package org.example;

public class Main {
    public static void main(String[] args) {
        if(args.length == 1) {
            System.out.println("Please pass an email for " + args[0]);
            System.exit(1);
        }else if(args.length !=2) {
            System.out.println("Please specify a name and email");
            System.exit(1);
        }

        System.out.println(args[0] + " <" + args[1] + ">");
    }
}