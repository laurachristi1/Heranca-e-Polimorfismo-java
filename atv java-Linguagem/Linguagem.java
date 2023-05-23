public class Linguagem{
    protected String nome;
    protected double numFalantes;
    protected String regioesFaladas;
    protected String ordemDasPalavras;

    public Linguagem(String nome, double numFalantes, String regioesFaladas, String ordemDasPalavras){ //metodo construtor
        this.nome = nome; //o nome da lingua falada
        this.numFalantes = numFalantes; //numero de falantes da lingua
        this.regioesFaladas = regioesFaladas; //as regiões onde a linguagem é falada.
        this.ordemDasPalavras = ordemDasPalavras; //ordem típica das palavras na linguagem.
    }

    public void getInfo(){
        System.out.println("O " + nome + " é falado por " + numFalantes + " pessoas principalmente na " + regioesFaladas);
        System.out.println("A linguagem segue a ordem das palavras " + ordemDasPalavras);
    }

    public static void main(String[]args){ //metodo main
        Linguagem coreano = new Linguagem("Coreano", 79000000 , "Coreia do Sul e Coreia do Norte.", "Sujeito + Objeto + Verbo");
        coreano.getInfo();
        Linguagem maia = new Mayan ("Maia", 800000);
        maia.getInfo();
        Linguagem kiche = new Mayan ("Ki'che'", 1000000);
        kiche.getInfo();
        Linguagem mandarim = new SinoTibetan("Chinês", 91800000);
        mandarim.getInfo();
        Linguagem birmanes = new SinoTibetan("Birmanês'", 32.000000);
        birmanes.getInfo();
    }
}