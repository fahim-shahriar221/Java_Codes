package Lab_6;
class VirusEffect{
    void symptoms(){
        System.out.println("Symptoms: Fever,Headaches,cough,sneezing");
    }
}
class AlphaVirus extends VirusEffect{

}
class BetaVirus extends VirusEffect{
    public static void main(String[] args) {
        AlphaVirus a = new AlphaVirus();
        BetaVirus b = new BetaVirus();
        System.out.println("Symptoms from AlphaVirus ");
        a.symptoms();
        System.out.println("\nSymptoms from BetaVirus ");
        b.symptoms();
    }
}

