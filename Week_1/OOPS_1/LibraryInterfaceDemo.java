interface LibraryUser{
    public void registerAccount();
    public void requestBook();
}
class KidUser implements LibraryUser{
    int age;
    String bookType;
    KidUser(String bookType,int age){
        this.age=age;
        this.bookType=bookType;
    }
    public void registerAccount(){
        if(age>12){
            System.out.println("Sorry,Age must be less than 12 to register as a kid");
            
        }
        else{
            System.out.println("You have successfully registered under a Kids Account");
        }

    

    }
    public void requestBook(){
        if(bookType.equals("Kids")){
            System.out.println(" Book issued successfully,please return the book within 10 days!");

        }
        else{
            System.out.println("Oops,you are allowed to take only kids books");
        }
    }

}
class AdultUser implements LibraryUser{
    int age;
    String bookType;
    AdultUser(String bookType,int age){
        this.age=age;
        this.bookType=bookType;
    }
    public void registerAccount(){
        if(age>12){
            System.out.println("You have successfully registered under an Adult Account");
            
        }
        else{
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }

    

    }
    public void requestBook(){
        if(bookType.equals("Fiction")){
            System.out.println(" Book issued successfully,please return the book within 7 days!");

        }
        else{
            System.out.println("Oops,you are allowed to take only adult Fiction books");
        }
    }


}
public class LibraryInterfaceDemo{
    public static void main(String[] args){
        KidUser kid1=new KidUser("Kids",10);
        KidUser kid2=new KidUser("Fiction",18);
        kid1.registerAccount();
        kid1.requestBook();
        kid2.registerAccount();
        kid2.requestBook();
        AdultUser adult1=new AdultUser("Kids",5);
        AdultUser adult2=new AdultUser("Fiction",23);
        adult1.registerAccount();
        adult1.requestBook();
        adult2.registerAccount();
        adult2.requestBook();



    }
}