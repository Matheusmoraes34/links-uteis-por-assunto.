public class LinkUtil {
  String titulo;
  String url;
  String categoria;

  public LinkUtil(String titulo, String url, String categoria) {
      this.titulo = titulo;
      this.url = url;
      this.categoria = categoria;
  }

  @Override
  public String toString() {
      return "Título: " + titulo + "\nURL: " + url + "\nCategoria: " + categoria + "\n";
  }
}
