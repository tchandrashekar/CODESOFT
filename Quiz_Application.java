import java.util.*;

public class Quiz_Application {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println();
        System.out.println(" **** Welcome to the quiz **** ");
        System.out.println();
        
        String Questions[]={"1.Who invented the c language?",
                    "2.who wrote code for this quiz?",
                    "3.how many days are in a year?",
                    "4.What does HTML stand for?",
                    "5.Which company developed the Android operating system?",
                    "6.What is the main purpose of a CPU in a computer?",
                    "7.Which programming language is primarily used for developing iOS apps?",
                    "8.What does \"IoT\" stand for in the context of technology?",
                    "9.Who is the CEO of google?",
                    "10.What is full form of gui?",

                };
        String Options[]={"a) James Gosling","b) Dennis Ritchie","c) Bjarne Stroustrup","d) Guido van Rossum\n",
                    "a) chandu","b) chandra","c) shekar","d) chandrashekar\n",
                    "a) 293","b) 365","c) 343","d) 300\n",
                    "a) Hyperlinks and Text Markup Language","b) Home Tool Markup Language","c) Hyper Text Markup Language","d) Hyper Text Manipulation Language\n",
                    "a) Apple","b) Microsoft","c) Google","d) Samsung\n",
                    "a) To store data","b) To process instructions","c) To manage network connections","d) To provide power\n",
                    "a) Java","b) Swift","c) Python","d) C++ \n",
                    "a) Internet of Tools", "b) Interface of Things" ,"c) Internet of Things","d) Interconnectivity of Technology \n",
                    "a) Tim Cook ","b) Satya Nadella ","c) Sundar Pichai","d) Jeff Bezos \n",
                    "a) Global User Interface","b) Graphical User Interface","c) General User Interface","d) Generated User Interface \n"
                };
        
        int n=Questions.length;
        char answers[]={'b','d','b','c','c','b','b','c','c','b'};
        char user_answers[]=new char[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            System.out.println(Questions[i]);
            for(int j=0;j<4;j++)
            {
                System.out.println(Options[j+i*4]);
            }
           // System.out.println();
            System.out.println("enter your option : ");
            char d=s.next().charAt(0);
            System.out.println();
            user_answers[i]=d;
            if(user_answers[i]==answers[i])
            {
                count++;
            }
        }
        System.out.println("Congratulations You scored : "+count +" / "+n);
        System.out.println();
        System.out.println("Want to check your answers (Yes/no)");
        String choice=s.next();
        System.out.println();
        if(choice.equals("yes"))
        {
            for(int i=0;i<n;i++)
            {
                System.out.println(Questions[i]);
                for(int j=0;j<4;j++)
                {
                    System.out.println(Options[j+i*4]);
                }
                System.out.println("Your option:"+user_answers[i]+" "+"Correct answer is:"+answers[i]);
            }
        }
        else{
            System.out.println("-----Thank you-----");
        }
        


    }
}
