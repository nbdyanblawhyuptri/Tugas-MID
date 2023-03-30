//Nadya Nabila Wahyuputri_13020210127
import java.util.Scanner;
public class Rupiah {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int Dollar, Rupiah  ;
            System.out.print("Dollar : ");
            Dollar = input.nextInt();



          Rupiah = (int) (Dollar*0127);
            
            System.out.println("Hasil dari "+ Dollar +" Dollar, Adalah : ");
            System.out.println(Rupiah+" Rupiah ");
        }
    }
    
}