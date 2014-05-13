package teste;

import java.util.ArrayList;

public class Fornecedor {
    
    private String nome;
    private ArrayList<String> telefone;
    private Endereco endereco;
    private ArrayList<Produto> produtos;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public ArrayList<String> getTelefone() {
        return telefone;
    }

    public void setTelefone(ArrayList<String> telefone) {
        this.telefone = telefone;
    }
    
}
