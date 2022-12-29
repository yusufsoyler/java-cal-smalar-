
class User{
    
    private String name;
    private String country;
    private int age;

    public User(String name, String country, int age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }
   
    public void showInfo(){
        System.out.println("Kullanıcı Adı : "+name);
        System.out.println("Kullanıcı Ülke : "+country);
        System.out.println("Kullanıcı Yaşı : "+age);
    }
}

class PremiumUser extends User{

    private double price;

    public PremiumUser(double price, String name, String country, int age) {
        super(name, country, age);
        this.price = price;
    }
    
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Yıllık ödenen ücret : "+price+"TL");
    }
}

class NormalUser extends User{

    public NormalUser(String name, String country, int age) {
        super(name, country, age);
    }
}

public class polymorphism {
    
    public static void showUserInfo(User user){
        user.showInfo();
    }
    
    public static void main(String[] args) {
        
        User user = new User("Kullanıcı","Türkiye",23);
        User user1 = new PremiumUser(599.99, "Premium User", "England", 22);
        User user2 = new NormalUser("Normal Kullanıcı","Türkiye",21);
        
        System.out.println("--Kullanıcı Bilgileri--");
        showUserInfo(user);
        System.out.println("\n--Premium Kullanıcı Bilgileri--");
        showUserInfo(user1);
        System.out.println("\n--Normal Kullanıcı Bilgileri--");
        showUserInfo(user2);
    } 
}