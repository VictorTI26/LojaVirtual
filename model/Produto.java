package model;

public class Produto {

	
    private String nome;
    private double preco;
    private String categoria;
    private double avaliacao;
    private String modelo;
    private String marca;
    private String cor;
    private int quantidadeEstoque;
    private String descricao;
    private String foto;
    private int limiteCompra;

    public Produto(String nomeProduto, double preco2, int quantidade) {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome inv�lido.");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("Pre�o inv�lido.");
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria != null && !categoria.isEmpty()) {
            this.categoria = categoria;
        } else {
            throw new IllegalArgumentException("Categoria inv�lida.");
        }
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        if (avaliacao >= 0 && avaliacao <= 5) {
            this.avaliacao = avaliacao;
        } else {
            throw new IllegalArgumentException("Avalia��o inv�lida.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.isEmpty()) {
            this.modelo = modelo;
        } else {
            throw new IllegalArgumentException("Modelo inv�lido.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.isEmpty()) {
            this.marca = marca;
        } else {
            throw new IllegalArgumentException("Marca inv�lida.");
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor != null && !cor.isEmpty()) {
            this.cor = cor;
        } else {
            throw new IllegalArgumentException("Cor inv�lida.");
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            throw new IllegalArgumentException("Quantidade de estoque inv�lida.");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao != null && !descricao.isEmpty()) {
            this.descricao = descricao;
        } else {
            throw new IllegalArgumentException("Descri��o inv�lida.");
        }
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        if (foto != null && !foto.isEmpty()) {
            this.foto = foto;
        } else {
            throw new IllegalArgumentException("Foto inv�lida.");
        }
    }

    public int getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(int limiteCompra) {
        if (limiteCompra >= 0) {
            this.limiteCompra = limiteCompra;
        } else {
            throw new IllegalArgumentException("Limite de compra inv�lido.");
        }
    }
}
