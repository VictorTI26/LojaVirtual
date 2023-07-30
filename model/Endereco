package model;

public class Endereco {

    private String codigoPostal;
    private String nomeCidade;
    private String estado;
    private String nomeRua;
    private String numeroCasa;
    private String complemento;
    private String identificador;

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        if (codigoPostal.length() > 3 && codigoPostal.matches("[0-9 -.]*")) {
            this.codigoPostal = codigoPostal;
        }
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        if (nomeCidade.length() > 3 && nomeCidade.matches("[A-Za-z ]*")) {
            this.nomeCidade = nomeCidade;
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado.length() > 3 && estado.matches("[A-Za-z ]*")) {
            this.estado = estado;
        }
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        if (nomeRua.length() > 3 && nomeRua.matches("[A-Za-z 0-9 -]*")) {
            this.nomeRua = nomeRua;
        }
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        if (numeroCasa.length() > 0 && numeroCasa.matches("[0-9 -.]*")) {
            this.numeroCasa = numeroCasa;
        }
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        if (complemento.length() > 0) {
            this.complemento = complemento;
        }
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        if (identificador.length() >= 3) {
            this.identificador = identificador;
        }
    }
}
