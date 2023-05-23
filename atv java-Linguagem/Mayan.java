public class Mayan extends Linguagem {
    public Mayan(String nome, double numFalantes) {
      super(nome, numFalantes, "países da america central" , "sujeito-verbo-objeto");
    }

    @Override
        public void getInfo(){
            System.out.println("O " + nome + " é falado por " + numFalantes + " pessoas principalmente na " + regioesFaladas);
            System.out.println("A linguagem segue a ordem das palavras " + ordemDasPalavras);
        }

        
    }  

