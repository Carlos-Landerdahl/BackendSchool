import model.Contato;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       List<Contato> contatos = new ArrayList<>();

       Contato c1 = new Contato("Carlos", "Carlos@hotmail.com", "213912389");
       Contato c2 = new Contato("Bruno", "Bruno@hotmail.com", "12312423");
       Contato c3 = new Contato("Chaves", "Chaves@hotmail.com", "12313454");

       contatos.add(c1);
       contatos.add(c2);
       contatos.add(c3);

        FileOutputStream fos = new FileOutputStream("Files.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);

        String result = contatos.stream()
                .map(contato -> contato.toString() + "\n").collect(Collectors.joining()).trim();

        os.writeObject(result);


     //  FileInputStream fis = new FileInputStream("File.txt");
     //  ObjectInputStream ois = new ObjectInputStream(fis);

     //  List<Contato> contatoList = (List<Contato>)ois.readObject();

     //  for (Contato contato : contatoList) {
     //      System.out.println("Nome: " + contato.getNome() +
     //              ", Idade: " + contato.getEmail()+
     //              ", telefone: " + contato.getTelefone());
     //  }
    }
}