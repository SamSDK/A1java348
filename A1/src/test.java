package src;

import java.util.*;
import java.util.stream.*;
import java.io.*;

public class test {
    public static void main(String[]args){
        BufferedReader inputStream = null;

        try
        {
            Object[] objects = new Object[10];
            inputStream = new BufferedReader(new FileReader("Objects.txt"));
            String line;
            boolean value = true;
            while(valid) {
                line = inputStream.readLine();
                if(line == null){
                    break;
                }
                if(line.length() == 0){
                    continue;
                }
            String[] words = line.split(",");
            if(words[0].equalsIgnoreCase("Rectangle")){
                Rectangle temp = new Rectangle(Integer.parseInt(words[1]), Integer.parseInt(words[2]));
                objects.add(temp);
            }
            if(words[0].equalsIgnoreCase("Circle")){
                Circle temp = new Circle(Integer.parseInt(words[1]));
                objects.add(temp);
            } 
            
            
        }
		Rectangle rec = new Rectangle(10, 20);
		System.out.println(rec.toString());
        Circle cir = new Circle(1);
		System.out.println(cir.toString());

        Arrays.sort(/*input array name here*/,Comparator.comparing(<? extends Shape>::ShapeArea())
		Stream<Object> stream= Arrays.stream(/*put array name here*/);
        stream.forEach(str -> System.out.print(str + " "));

	}
}