public class projetoLivro {
    public static void main(String[] args){
        pessoa[] p = new pessoa[2];
        livro[] l = new livro[2];

        p[0] = new pessoa("paulo","homem",16);
        p[1] = new pessoa("livia","mulher",17);

        l[0] = new livro("como ser igual ao tommas shelby","p welton",105,p[0]);
        l[1] = new livro("como evoluir","evilyn",10,p[1]);
        l[0].avancarPag();
        l[0].folhear(67);
        System.out.println(l[0].detalhes());

    }
}
