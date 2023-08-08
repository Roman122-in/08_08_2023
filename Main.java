import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int lgt = str.length();
        ArrayList <Integer> arrayList = new ArrayList<>();
        ArrayList <Integer> arrayList1 = new ArrayList<>();

        for(int i =0; i< lgt; i++){
            arrayList.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }
        System.out.println(arrayList);


        for(int i =10; i>1; i--) {
                arrayList1.add(arrayList.get(i-2)*i);

        }
        System.out.println(arrayList1);

        int summa =0;
        for( int i =0; i<arrayList1.size(); i++){
            summa = summa+arrayList1.get(i);
        }
        System.out.println(summa);

        int cod =11;
        int ost = summa%cod;

        do{
            ost++;
        }
        while (summa%cod!=0);
        System.out.println(ost);
    }

}
