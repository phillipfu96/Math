public class ISprime {
    public static void main(String[] args) {
        for(int a =3; a < 120000000; a+=2) {
            boolean isPrime = true;
            for(int i=2; i<= Math.sqrt(a); i++){
                if (a%i == 0){
                    //System.out.println("not prime");
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(a);
            }

        }
    }
}

