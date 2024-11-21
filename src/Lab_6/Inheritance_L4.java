package Lab_6;
class S{
    int sum (int x, int y){
        return x+y;
    }
}
class M extends S{
    int multiplication(int a,int b){
        return a*b;
    }
}
class SM extends M{
    public static void main(String[] args) {
        SM s = new SM();
        System.out.println("Sum: "+s.sum(7,5));
        System.out.println("Multiplication: "+s.multiplication(25,25));
    }
}