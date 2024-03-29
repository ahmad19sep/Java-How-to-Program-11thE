package Hacker.java;

import java.util.*;
import java.io.*;

public class HashMap {
}


class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
 class Solutio
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

Collections.sort(studentList,new UseOfComparator());
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
class UseOfComparator implements Comparator <Student>{

    @Override
    public int compare(Student student, Student t1) {
        if (student.getCgpa()!=t1.getCgpa())
        return Double.compare(t1.getCgpa(), student.getCgpa());
        else return student.getFname().compareTo(t1.getFname());

        }


}


