package com.nuist.exc;

public class DropStudents {
    public static String[] utilStudents(){
        String[] students = new String[100];
        for (int i=0;i<100;i++){
            students[i]="student"+(i+1);
        }
        return students;
    }

    public static void dropStudents(String[] students,int n){
        String nn = Integer.toString(n);
        for (int i=0;i<students.length;i++){
            if (students[i].contains(nn)){
                students[i] = null;
                for (int j=i;j<students.length-1;j++){
                    students[j] = students[j+1];
                }
            }
        }
    }

    public static void printStudents(String[] students){
        for (String student : students){
            if (student != null){
                System.out.print(student+' ');
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        String[] students = utilStudents();
        System.out.println("原始数据：");
        printStudents(students);
        dropStudents(students, 8);
        System.out.println("删除数据后：");
        printStudents(students);
    }
}
