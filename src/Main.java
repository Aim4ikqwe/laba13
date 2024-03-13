import javax.naming.Name;

interface Product{
    void ProductName();
    void ProductPrice();
    void ProductRating();
}
interface User{
    void Login();
    void Password();
}
class Cabbage implements Product{
String Name;
int Price;
double Rating;
    Cabbage(String Name, int Price, double Rating){
        this.Name = Name;
        this.Price = Price;
        this.Rating = Rating;
    }
    @Override
    public void ProductName() {
        System.out.println(Name);
    }

    @Override
    public void ProductPrice() {
        System.out.println(Price);
    }

    @Override
    public void ProductRating() {
        System.out.println(Rating);
    }
}
class Cucumber implements Product{
    String Name;
    int Price;
    double Rating;
    Cucumber(String Name, int Price, double Rating){
        this.Name = Name;
        this.Price = Price;
        this.Rating = Rating;
    }
    @Override
    public void ProductName() {
        System.out.println(Name);
    }

    @Override
    public void ProductPrice() {
        System.out.println(Price);
    }

    @Override
    public void ProductRating() {
        System.out.println(Rating);
    }
}
class PineApple implements Product{
    String Name;
    int Price;
    double Rating;
    PineApple(String Name, int Price, double Rating){
        this.Name = Name;
        this.Price = Price;
        this.Rating = Rating;
    }
    @Override
    public void ProductName() {
        System.out.println(Name);
    }

    @Override
    public void ProductPrice() {
        System.out.println(Price);
    }

    @Override
    public void ProductRating() {
        System.out.println(Rating);
    }
}
class Student implements User {
String Login;
String Password;
Student(String Login, String Password){
    this.Login = Login;
    this.Password = Password;
}
    @Override
    public void Login() {
        System.out.println(Login);
    }

    @Override
    public void Password() {
        System.out.println(Password);
    }
}
class Teacher implements User {
    String Login;
    String Password;
    Teacher(String Login, String Password){
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public void Login() {
        System.out.println(Login);
    }

    @Override
    public void Password() {
        System.out.println(Password);
    }
}
class Director implements User {
    String Login;
    String Password;
    Director(String Login, String Password){
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public void Login() {
        System.out.println(Login);
    }

    @Override
    public void Password() {
        System.out.println(Password);
    }
}
class Realise implements User, Product{
    Product product;
    String UserName;
    int Price;
    double Rating;
    String Login;
    String Password;
    String ProductName;
    Realise(String UserName, int Price, double Rating, String Login, String Password, String ProductName){
        this.UserName = UserName;
        this.Price = Price;
        this.Rating = Rating;
        this.Login = Login;
        this.Password = Password;
        this.ProductName = ProductName;
    }
    @Override
    public void ProductName() {
        System.out.println(ProductName);
    }

    @Override
    public void ProductPrice() {
        System.out.println(Price);
    }

    @Override
    public void ProductRating() {
        System.out.println(Rating);
    }

    @Override
    public void Login() {
        System.out.println(Login);
    }

    @Override
    public void Password() {
        System.out.println(Password);
    }
    void display(){
        System.out.println(UserName + " купил " + ProductName );
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Аимчик", "123");
        Realise realise = new Realise("Алексей", 100, 10, "Нубик", "444", "Овощ");
        realise.display();

    }
}