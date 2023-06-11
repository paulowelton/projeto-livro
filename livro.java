public class livro implements publicacao {
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private pessoa leitor;
    private boolean aberto;

    public livro(String titulo, String autor, int totPaginas,pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }
   public String detalhes(){
    return "livro{"+"titulo=" + titulo + ",\n autor=" + autor + ",\ntotPaginas=" + totPaginas + ",\npagAtual=" + pagAtual + ",\n aberto=" + aberto + ",\n leitor=" + leitor.getNome() + '}';
   }

    public String getTitulo() {
      return titulo;
    }
    public void setTitulo(String titulo) {
      this.titulo = titulo;
    }

    public int getTotPaginas() {
      return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
      this.totPaginas = totPaginas;
    }

    public pessoa getLeitor() {
      return leitor;
    }
    public void setLeitor(pessoa leitor) {
      this.leitor = leitor;
    }

    public boolean getAberto() {
      return aberto;
    }
    public void setAberto(boolean aberto) {
      this.aberto = aberto;
    }

    public String getAutor() {
      return this.autor;
    }
    public void setAutor(String autor) {
      this.autor = autor;
    }

    public int getPagAtual() {
      return this.pagAtual;
    }
    public void setPagAtual(int pagAtual) {
      this.pagAtual = pagAtual;
    }
    @Override
    public void abrir(){
       this.aberto = true;
    }
    @Override
    public void fechar(){
       this.aberto = false;
    }
    @Override
    public void folhear(int p){
       this.pagAtual = p;
    }
    @Override
    public void avancarPag(){
      this.pagAtual++;
    }
    @Override
    public void voltarPag(){
       this.pagAtual--;
    }

}
