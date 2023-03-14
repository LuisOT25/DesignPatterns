import java.util.Scanner;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        Scanner entry = new Scanner(System.in);

        Boolean repetir=true;


        do {
            System.out.println("Introduce un numero: ");
            int num = entry.nextInt();
            System.out.println("State change: "+num);
            subject.setState(num);
            System.out.println("Quieres cambiar otro numero?  1=Y   0=N");
            num = entry.nextInt();
            if (num==1){
                repetir = true;
            }else {
                repetir = false;
            }


        }while (repetir==true);

        System.out.println("Fin del programa");



    }
}
