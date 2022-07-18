public class Main{

    public static void main(String[] args ) {

        Teacher teacher1=new Teacher("Mahmut Hoca", "5554445566", "TRH");//TRH tarih'in kısaltmasi
        Teacher teacher2=new Teacher("Graham Bell","5552223322", "FZK");
        Teacher teacher3=new Teacher("Nehir Ellez", "5550001100", "KMY");
        
        Course tarih =new Course("Tarih", "101", "TRH");
        Course fizik =new Course("Fizik", "102", "FZK");
        Course kimya =new Course("Kimya", "101", "KMY");

        tarih.addTeacher(teacher1);
        fizik.addTeacher(teacher2);
        kimya.addTeacher(teacher3);

        Student student1=new Student("inek saban", "123", "4",tarih, fizik, kimya);

      
        student1.miGecti();
        

    }
}