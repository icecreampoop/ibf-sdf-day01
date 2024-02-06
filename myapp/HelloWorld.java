package myapp;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Console console = System.console();
        
        String name = console.readLine("What is your name?");

        if (name.length() > 0) {
            System.out.println("Hello " + name + ". Pleased to meet you.");
            System.out.printf("Hello %s. Pleased to meet you.\n", name);
        } else {
            System.err.println("You have not input your name.");
        }

        String hobby = console.readLine("What is your hobby?");
        hobby = hobby.toLowerCase().trim();

        if (hobby.equals("swimming")) {
            System.out.println("The nearest swimming pool is " + "NUS Guild House Swimming Pool");
        } else if (hobby.equals("jogging")) {
            System.out.println("Jogging is a good exercise.");
        }

        String phrase = console.readLine("Type a phrase: ");

        for (int x = 0; x <= phrase.length(); x++) {
            System.out.println(phrase.substring(0,x));
        }

        int counter = 0;

        while (counter <= phrase.length()) {
            System.out.println(phrase.substring(0,counter));
            counter++;
        }

        String[] todo = new String[5];

        for (int x = 0; x < todo.length; x++) {
            String task = console.readLine("Enter task %d: ", x+1);
            todo[x] = task;
        }

        for (String x : todo) {
            System.out.println(x);
        } 

        String argumentInput = "No argument";

        if (args.length > 0) {
            argumentInput = args[0];
        }
        System.out.println(argumentInput);

        List<String> stringList = new ArrayList<>();
        stringList.add("bob");
        stringList.add("bobby");
        stringList.add("bobbest");
        stringList.addAll(Arrays.asList("boberina", "boblisa"));
        
        String inputDataList = "fish,prawns,frog,pork,beef,lamb,chicken,snake";
        Scanner scan1 = new Scanner(inputDataList).useDelimiter(",");
        while (scan1.hasNext()) {
            System.out.println(scan1.next());
        }
        scan1.close();

        String phraseTask = console.readLine("Which day is today and what do you want to do?");
        Scanner scan2 = new Scanner(phraseTask);
        String day = scan2.next();
        String doWhat = scan2.nextLine();

        System.out.println("Today is " + day + " and I would like to" + doWhat);

    }
}