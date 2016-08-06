public class Person
{
    Person next;
    String name;
    Friend friend;
   
    public Person(String n)
    {
        next = null;
        name = n;
        friend = null;
    }
    
    public void insertFriend(Person pp)
    {
        if(friend == null)
        {
            friend = new Friend(pp);
        }
        else
        {
            Friend f = friend;
            while(f.next!=null)
            {
                f = f.next;
            }
            f.next = new Friend(pp);
        }
    }
    
    public void displayFriends()
    {
        Friend f = friend;
        System.out.println(name+"'s friends are:");
        while(f != null)
        {
            System.out.println(f.p.name);
            f = f.next;
        }
    }
}