/**
 * The Social Network Class.
 * 
 * @author (Abhishek Raj) 
 * @version (1)
 */
import java.io.*;
public class SocialNetwork
{
    Person start;
    public SocialNetwork()
    {
        start = null;
    }
    
    public void insert(String n)
    {
        if(start == null)
        {
            start = new Person(n);
        }
        else
        {
            Person t = start;
            while(t.next != null)
            {
                t = t.next;
            }
            
            t.next = new Person(n);
        }
    }
    
    public void display()
    {
        System.out.println("The registered users are:");
        Person t = start;
        while(t != null)
        {
            System.out.println(t.name);
            t = t.next;
        }
    }
    
    public void createFriends(String n)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Person t = start;
        while(t != null && !(t.name.equals(n)))
        {
            t =t.next;
        }
        
        if( t== null || !(t.name.equals(n)))
        {
            System.out.println("The person with that name does not exist");
        }
        else
        {
            System.out.println("Enter the name of the friend(0 to exit):");
            String a = in.readLine();
            while(!a.equals("0"))
            {
                a = in.readLine();
                Person ft = start;
                while(ft != null && !(ft.name.equals(a)))
                {
                    ft = ft.next;
                }
                if(ft != null && (ft.name.equals(a)))
                {
                    t.insertFriend(ft);
                }
                else
                {
                    System.out.println("Person does not exist");
                }
            }
        }

    }
}