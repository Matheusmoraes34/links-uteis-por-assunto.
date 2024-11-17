
  
import java.io.*;
import java.util.ArrayList;

public class ArquivoLinks {

    public static void salvarLinks(ArrayList<LinkUtil> listaLinks) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/links.txt"))) {
            for (LinkUtil link : listaLinks) {
                writer.write(link.titulo + "\n" + link.url + "\n" + link.categoria + "\n");
                writer.write("###\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void carregarLinks(ArrayList<LinkUtil> listaLinks) {
        try (BufferedReader reader = new BufferedReader(new FileReader("data/links.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (!linha.equals("###")) {
                    String titulo = linha;
                    String url = reader.readLine();
                    String categoria = reader.readLine();
                    listaLinks.add(new LinkUtil(titulo, url, categoria));
                    reader.readLine();  // Pular a linha "###"
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado. Criando um novo arquivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

