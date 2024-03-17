package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Reporter reporter = new Reporter();
        Persister persister = new Persister();
        reporter.report(user);
        persister.save(user);
    }
}