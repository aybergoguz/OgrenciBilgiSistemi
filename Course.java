public class Course{
    Teacher teacher; // hafizada teacher adinda bir nesne var ama null degerde en ustte yazilir.
    String name;
    String code;
    String prefix;
    double note;

    Course(String name , String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;
    }

    void addTeacher(Teacher teacher){
            if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            printTeacher();
             } /*teacher sinifindaki tum ozelkkiler en basta tanimladigimiz teacher nesnesine tasindi.*/
            else
                System.out.println("Ogretmen ve Ders bolumleri uyusmuyor.");
    }

    void printTeacher(){
        this.teacher.print();
    }

}