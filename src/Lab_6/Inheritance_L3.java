package Lab_6;
class Addition{
    int print(){
        int i, sum =0;
        for(i=100;i<=150;i++){
            sum+=i;
        }
        return sum;
    }
}
class Sum extends Addition {
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println("Result= "+s.print());
    }
}
