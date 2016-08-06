import java.io.*;
public class Main
{
    public static void main()throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the person name(0 to exit):");
        SocialNetwork sn = new SocialNetwork();
        String a = in.readLine(); 
        while(!(a.equals("0")))
        {
            sn.insert(a);
            a = in.readLine();
        }
        sn.display();
        System.out.println("For whom do you want the friends to be entered?");
        a = in.readLine();
        while(!a.equals(0))
        {
            sn.createFriends(a);
            a = in.readLine();
        }
        
        sn.findContacts();
    }
}