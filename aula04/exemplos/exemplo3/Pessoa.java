package exemplos.exemplo3;

public class Pessoa {
    // atributos = caractristica, possui, é
    String nome;
    
    // métodos - ação, comportamento
    void apresentar() {
        System.out.println("Olá! Eu sou " + nome);
    }
    
    //construtor
    Pessoa(String nome) {
        this.nome = nome; // this = o próprio objeto
    }

}

