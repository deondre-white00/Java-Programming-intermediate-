package project3;

import java.util.Arrays;
import java.util.List;


public class MethodRefQuestion
{
   public static void main(String[] args)
   {
      List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
      values.stream()
      .forEach(System.out::println);
   }

   public void cubeIt(int i)
   {
      System.out.println(i * i * i);
   }
}