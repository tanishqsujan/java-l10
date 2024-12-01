import java.util.*;

public class Main{
    public static Candidate getcandidatedetails() throws InvalidInternException{
        Scanner sc= new Scanner();
        System.out.println("Enter details of candidates: ");
        System.out.println("Name: ");
        String name= sc.next();
        System.out.println("Gender: ");
        String gender= sc.next();
        System.out.println("10th grade percentage: ");
        int percent= sc.nextInt();

        if(percent<50){
            throw new InvalidInternException("Registration failed. Percentage cannot be less than 50");
        }
        else{
            Candidate candidate = new Candidate();
            candidate.setName(name);
            candidate.setGender(gender);
            candidate.setPercent(percent);
            return candidate;
        }
    }
    public static void main(String args[]){
        System.out.println("Welcome to InterHiring Tool");
        try{
            Candidate candidate= getcandidatedetails();
            System.out.println("Registration Successfull");
        }
        catch(InvalidInternException e){
            System.out.println(e.getMessage);
        }
    }
}
public class Candidate{
    class String name;
    class String gender;
    class int percent;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender= gender;
    }
    public String getPercent(){
        return percent;
    }
    public void setPercent(int percent){
        this.percent= percent;
    }
    
}
public class InvalidInternException extends Exception{
    public InvalidInternException(String message){
        super(message);
    }
}
