/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jayoda Kulatunga
 */
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker{
    private ArrayList<Integer> grades;
    
    //Constructor
    public StudentGradeTracker(){
        grades = new ArrayList<>();
    }
    
    public void addGrade(int grade){
        grades.add(grade);
    }
    
    public double calculateAverage(){
        int sum = 0;
        for(int grade : grades){
            sum += grade;
        }
        return (double)sum / grades.size();
    }
    
    public int findHighestGrade(){
        int highest = Integer.MIN_VALUE;
        for(int grade : grades){
            if(grade > highest){
                highest = grade;
            }
        }
        return highest;
    }
    
    public int findLowestGrade(){
        int lowest = Integer.MAX_VALUE;
        for(int grade : grades){
            if(grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }
    
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            StudentGradeTracker tracker = new StudentGradeTracker();
            
            System.out.println("Enter the number of grades: ");
            int numGrades = scanner.nextInt();
            
            for(int i = 0; i < numGrades; i++){
                System.out.println("Enter grade " + (i + 1) + ": ");
                int grade = scanner.nextInt();
                tracker.addGrade(grade);
            }
            
            System.out.println("Average Grade: " + tracker.calculateAverage());
            System.out.println("Highest Grade: " + tracker.findHighestGrade());
            System.out.println("Lowest Grade: " + tracker.findLowestGrade());
        }
    }
}
