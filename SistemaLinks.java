import java.util.Scanner;
import java.util.ArrayList;

public class SistemaLinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<LinkUtil> listaLinks = new ArrayList<>();
        
        ArquivoLinks.carregarLinks(listaLinks);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Link");
            System.out.println("2. Listar Links");
            System.out.println("3. Excluir Link");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch(opcao) {
                case 1:
                    System.out.println("Título do link: ");
                    String titulo = scanner.nextLine();
                    System.out.println("URL do link: ");
                    String url = scanner.nextLine();
                    System.out.println("Categoria do link: ");
                    String categoria = scanner.nextLine();
                    listaLinks.add(new LinkUtil(titulo, url, categoria));
                    break;

                case 2:
                    for (LinkUtil link : listaLinks) {
                        System.out.println(link);
                    }
                    break;

                case 3:
                    System.out.println("Informe o índice do link a ser excluído:");
                    int indiceExcluir = scanner.nextInt();
                    listaLinks.remove(indiceExcluir - 1);
                    break;

                case 4:
                    ArquivoLinks.salvarLinks(listaLinks);
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 4);
        
        scanner.close();
    }
}
