import java.util.*;

public class C {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String city, location, view;
        int persons, rooms, children;
        while(true){
            System.out.println("Enter city:");
            city=s.next();
            System.out.println("Enter location:");
            location=s.next();
            System.out.println("Enter view:");
            view=s.next();
            System.out.println("Enter persons:");
            persons=s.nextInt();
            System.out.println("Enter children:");
            children=s.nextInt();
            rooms=(int)Math.ceil(persons/4.0);
            double cost=rooms*2000 + children*500;
            System.out.println("Rooms: "+rooms);
            System.out.println("Cost: "+cost);
            System.out.println("Change location? yes/no");
            if(!s.next().equalsIgnoreCase("yes")) break;
        }
    }
}
