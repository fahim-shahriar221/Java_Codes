package Lab_9;

class StringTest{
    void conduct(){
        String s1= "Fahim";
        String s2= " Shahriar";
        String s3= s1.concat(s2);
        System.out.println("(1)"+s3);
    }
    void plusOperator(){
        String s1 = "ID:";
        String s2 = " 002";
        String s3 = s1+s2;
        System.out.println("(2)"+s3);
    }
    void equals(){
        String s1 = "ICE";
        String s2 = "ICE";
        System.out.println("(3)"+s1.equals(s2));
    }
    void equals2(){
        String s1 = "DIU";
        String s2 = "KUET";
        System.out.print("(4)");
        System.out.println(s1==s2);
    }
    void compare(){
        String s1 = "FAHIM";
        String s2 = "FAHIM";
        String s3 = "ICE";
        int s4=s1.compareTo(s2);
        if (s4<0){
            System.out.println("(5)"+s1+" is less than "+s2);
        } else if (s4>0) {
            System.out.println("(5)"+s1+" is greater than "+s2);
        }else {
            System.out.println("(5)"+s1+" is equal to "+s2);
        }
    }
    void findChar(){
        String s1= "FAHIM";
        System.out.println("(6)In String "+s1+" Character at 4 index is : "+s1.charAt(4));
    }
    void findIndex(){
        String s1 = "HelloPMeC";
        System.out.println("(7)In String "+s1+" 'e' at index: "+s1.indexOf('e'));
    }
    void findIndex2(){
        String s1 = "HelloPMeC";
        System.out.println("(8)In String "+s1+" 'e' at index: "+s1.indexOf('e',2)+" when starts from 2");
    }
    void findIndex3(){
        String s1 = "HelloPMeC";
        System.out.println("(9)In Strng "+s1+" 'loP' at index: "+s1.indexOf("loP"));
    }
    void findIndex4(){
        String s1 = "HelloPMeC";
        System.out.println("(10)In Strng "+s1+" 'loP' at index: "+s1.indexOf("loP",5)+" when starts from 5");
    }
    void replace(){
        String s1 = "Hello World";
        String s2 = s1.replace("World","Good people");
        System.out.println("(13)Original String: "+s1+"\tReplaced String: "+s2);
    }
}
public class StringLab {
    public static void main(String[] args) {
        StringTest s = new StringTest();

        s.conduct();
        s.plusOperator();
        s.equals();
        s.equals2();
        s.compare();
        s.findChar();
        s.findIndex();
        s.findIndex2();
        s.findIndex3();
        s.findIndex4();
        s.replace();
    }
}
