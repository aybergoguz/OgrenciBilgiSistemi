public class Teacher{
    String name;
    String mobilPhoneNumber;
    String branch; //bolum

    Teacher(String name,String mobilPhoneNumber,String branch){
        this.name=name;
        this.mobilPhoneNumber=mobilPhoneNumber;
        this.branch=branch;

    }

    void print(){
        System.out.println("Adi : "+this.name);
        System.out.println("Telefonu : "+this.mobilPhoneNumber);
        System.out.println("Bolumu : "+ this.branch);
    }
}
