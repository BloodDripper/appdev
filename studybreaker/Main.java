import java.util.Scanner;

class StudyRecommendation{
    String mood;
// Constructor
    StudyRecommendation(String mood){
        this.mood=mood;
    }
    // Method 
    void recommended(){
        if("tired".equalsIgnoreCase(mood)){
            System.out.println("Recommendation: Take a 15- minutes break, then review easy topics.");
        }
        else if 
            ("focused".equalsIgnoreCase(mood)){
                System.out.println("Recommendation: Study a difficult topice for 45 minutes.");
            }
        else if 
            ("bored".equalsIgnoreCase(mood)){
                System.out.println("Recommendation:Try watching an educational video or quiz youself.");
            }
        else if 
            ("stressed".equalsIgnoreCase(mood)){
                System.out.println("Recommendation: Take deep breaths and study one small topic at a time.");
            }
        else{ System.out.println("Recommendation:Start with a quick 20-minute review.");
            }
    }
}

package appdev.studybreaker;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("++++++++++++++++Study Breaker++++++++++++++++");
            
            System.out.print("Your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + ", welcome to Study Breaker!");
            
       System.out.println(name + ", how are you feeling? Are you feeling tired, focused, bored or stressed?");

            String mood= input.nextLine().trim();
            
            StudyRecommendation student = new StudyRecommendation(mood);
            student.recommend();
        }
    }
}
