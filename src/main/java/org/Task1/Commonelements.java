package org.Task1;

import java.util.HashSet;
import java.util.Set;

public class Commonelements {
    /* Write a Java program to find the common elements between two arrays (string values)
    Array1 : [Python, JAVA, PHP, C#, C++, SQL]
    Array2 : [MySQL, SQL, SQLite, Oracle, PostgreSQL, DB2, JAVA]
     */
    public static void main(String[] args) {


        String[] Array1 = new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] Array2 = new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        Set<String> set = new HashSet<>();
          for (int i=0;i<Array1.length;i++){
              for(int j=0;j<Array2.length;j++){
                  if(Array1[i]==Array2[j]){
                      set.add(Array1[i]);
                  }
              }
          }
        for (String i: set) {
            System.out.println(i + " ");
        }
    }
}
