import java.util.*;

public class Solution {
    
    static class Student {
        String name;
        double grade;

        Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine().trim());
        List<Student> students = new ArrayList<>();
        Set<Double> uniqueScores = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine().trim();
            double grade = Double.parseDouble(scanner.nextLine().trim());
            
            students.add(new Student(name, grade));
            uniqueScores.add(grade);
        }

        List<Double> sortedScores = new ArrayList<>(uniqueScores);
        
        if (sortedScores.size() >= 2) {
            double secondLowest = sortedScores.get(1);

            List<String> names = new ArrayList<>();
            for (Student student : students) {
                if (Double.compare(student.grade, secondLowest) == 0) {
                    names.add(student.name);
                }
            }

            Collections.sort(names);

            for (String name : names) {
                System.out.println(name);
            }
        }
        
        scanner.close();
    }
}