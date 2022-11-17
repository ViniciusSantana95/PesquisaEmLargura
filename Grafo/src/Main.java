import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Pessoas Juan = new Pessoas();
        Juan.setNome("Juan");

        Pessoas Maria = new Pessoas();
        Maria.setNome("Maria");

        Pessoas Milena = new Pessoas();
        Milena.setNome("Milena");

        Pessoas Lucia = new Pessoas();
        Lucia.setNome("Lucia");

        Pessoas Andres = new Pessoas();
        Andres.setNome("Andrés");

        Pessoas Yadira = new Pessoas();
        Yadira.setNome("Yadira");

        Pessoas Javier = new Pessoas();
        Javier.setNome("Javier");

        Hashtable<Pessoas,ArrayList<Pessoas>> hashtable = new Hashtable<Pessoas,ArrayList<Pessoas>>();

        ArrayList<Pessoas> contatosJuan = new ArrayList<Pessoas>();

        contatosJuan.add(Maria);
        contatosJuan.add(Milena);
        contatosJuan.add(Lucia);
        hashtable.put(Juan, contatosJuan);

        ArrayList<Pessoas> contatosMilena = new ArrayList<Pessoas>();
        contatosMilena.add(Yadira);
        contatosMilena.add(Juan);
        hashtable.put(Milena, contatosMilena);

        ArrayList<Pessoas> contatosAndres = new ArrayList<Pessoas>();
        contatosAndres.add(Maria);
        hashtable.put(Andres, contatosAndres);

        ArrayList<Pessoas> contatosYadira = new ArrayList<Pessoas>();
        contatosYadira.add(Lucia);
        hashtable.put(Yadira, contatosYadira);

        ArrayList<Pessoas> contatosJavier = new ArrayList<Pessoas>();
        contatosJavier.add(Milena);
        contatosJavier.add(Andres);
        contatosJavier.add(Yadira);
        hashtable.put(Javier, contatosJavier);

        for (Map.Entry<Pessoas, ArrayList<Pessoas>> entidade : hashtable.entrySet()) {
            Pessoas pessoas = entidade.getKey();
            ArrayList<Pessoas> list = entidade.getValue();
            System.out.println((pessoas.getNome() + " ") + list.toString());
            if(list.contains(Maria)){
                System.out.println(pessoas.getNome() + " ENCONTROU MARIA !\n");
            }else{
                System.out.println(pessoas.getNome() + " NÃO ENCONTROU MARIA !\n");
            }
        }


    }
}