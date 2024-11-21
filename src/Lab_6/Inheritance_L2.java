package Lab_6;
class University{
    String University_Name= "Daffodil International University";

}
class College extends University{
    String College_Name="Agriculture University College,Mymensingh.";
    void show(){
        System.out.println("University: "+University_Name);
        System.out.println("College: "+College_Name);
    }
}
public class Inheritance_L2 {
    public static void main(String[] args) {
        College c = new College();
        c.show();
    }
}
