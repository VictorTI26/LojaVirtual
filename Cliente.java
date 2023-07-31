
package model;

public class Cliente {

    private String nome;
    private String cpf;
    private String nascimento;
    private String endereco; 
    private String email;
    private String senha;
    private String telefone;
    private double saldo;

    public Cliente(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty() && nome.matches("[a-zA-Z ]+")) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome inválido.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
    	if (cpf != null && cpf.matches("\\d{11}")) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("Cpf inválido, Digite um cpf com 11 numeros");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco != null && !endereco.isEmpty()) {
            this.endereco = endereco;
        } else {
            throw new IllegalArgumentException("Endereço inválido.");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone != null && telefone.matches("\\d{9}")) {
            this.telefone = telefone;
        } else {
            throw new IllegalArgumentException("Telefone inválido.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && isValidEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email inválido.");
        }
    }

    private boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email.matches(regex);
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        if (nascimento.matches("\\d{8}")) {
            this.nascimento = nascimento;
        } else {
            throw new IllegalArgumentException("Data de nascimento inválida.");
        }
    }
 
    public String getSenha() {
		return senha; 	
    }
    public void setSenha(String senha) {
        if (senha.length() >= 8) {
            this.senha = senha;
        } else {
            throw new IllegalArgumentException("A senha deve ter no mínimo 8 caracteres.");
        }
    }

    public boolean verificarSenha(String senhaDigitada) {
        return senha.equals(senhaDigitada);
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo != 0) {
            this.saldo = saldo;
        } else {
            throw new IllegalArgumentException("Saldo inválido. O saldo não pode ser igual a zero.");
        }
    }}

	 
