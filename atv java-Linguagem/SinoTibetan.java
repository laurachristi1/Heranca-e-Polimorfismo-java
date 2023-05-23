public class SinoTibetan extends Linguagem{
    public SinoTibetan(String nome, double numFalantes){
        super(nome, numFalantes, "Asia", "sujeito-objeto-verbo");

        if(this.nome == "Chinês"){
            this.ordemDasPalavras = "sujeito-verbo-objeto";
        }
    }
}

