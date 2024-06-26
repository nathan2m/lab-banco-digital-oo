package cliente;

import exception.NomeInvalidoException;

public class Cliente {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws NomeInvalidoException {
        if (nome == null || nome.equals("")) throw new NomeInvalidoException();
        this.nome = nome;
    }

}
