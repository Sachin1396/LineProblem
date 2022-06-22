package LineComparison;

import java.util.Scanner;

public class Linecomparisoncompetation {
  static Double length1=0.0d;
  static Double length2=0.0d;
    public static void main(String[] args)
    {
        System.out.print("enter the first line");
        length1 = linecalculation();
        System.out.print("enter the second line");
        length2 = linecalculation();
        linecomparison();

    }
    public static Double linecalculation()
    {
        System.out.println("Welcome to the line comparison computation");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of x1 and x2");
        float x1 = scanner.nextFloat();
        float x2 = scanner.nextFloat();
        System.out.println("enter the value of y1 and y2");
        float y1 = scanner.nextFloat();
        float y2 = scanner.nextFloat();
        Double length = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("length of the line is "+length);
        return length;
    }
    public static void linecomparison()
    {
        if (length1.equals(length2)){

            System.out.println("Both the line are equal");

        }
        else
            System.out.println("Lines are not equal");
    }


}
