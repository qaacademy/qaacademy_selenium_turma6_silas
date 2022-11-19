import java.util.ArrayList;
import java.util.HashMap;

public class ExemplosJava3 {
    public static void main(String[] args) {
       // criandoArray();
        //criandoHashMap();
        tratandoExcecao();
    }
    public static void criandoArray(){
//        String [] nomes = new String[10];
//        nomes[0] = "Silas";
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Silas");
        nomes.add("Leao");
        System.out.println(nomes.get(1));
    }

    public static void criandoHashMap(){
        HashMap<Integer,String>nomes=new HashMap<>();
        nomes.put(10,"Joao");
        nomes.put(20,"Silas");
        System.out.println(nomes.get(10));
    }

    public static void tratandoExcecao(){
        String numero="10xyz";
        try {
            int num = Integer.parseInt(numero);
            System.out.println(num);
        }catch (Exception e){
            throw new RuntimeException("Parse invalido");
        }
    }
}