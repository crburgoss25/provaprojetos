public class NotaFiscal
{
    String razaosocial;
    String cnpj;
    String email;
    String dataemissao;
    String servicoprestado;
    int regimetributario;
    int numeronf;
    double valornf;
    int empresaok;

    public NotaFiscal(String razaosocial, String cnpj, String email, String dataemissao, String servicoprestado, int regimetributario, int numeronf, int valornf) {
        this.setRazaosocial(razaosocial);
        this.setCnpj(cnpj);
        this.setEmail(email);
        this.setDataemissao(dataemissao);
        this.setServicoprestado(servicoprestado);
        this.setRegimetributario(regimetributario);
        this.setNumeronf(numeronf);
        this.setValornf(valornf);
    }

    public NotaFiscal() {}
    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public double getValornf() {
        return valornf;
    }

    public void setValornf(double   valornf) {
        this.valornf = valornf;
    }

    public int getNumeronf() {
        return numeronf;
    }

    public void setNumeronf(int numeronf) {
        this.numeronf = numeronf;
    }

    public int getRegimetributario() {
        return regimetributario;
    }

    public void setRegimetributario(int regimetributario) {
        this.regimetributario = regimetributario;
    }

    public String getServicoprestado() {
        return servicoprestado;
    }

    public void setServicoprestado(String servicoprestado) {
        this.servicoprestado = servicoprestado;
    }

    public String getDataemissao() {
        return dataemissao;
    }

    public void setDataemissao(String dataemissao) {
        this.dataemissao = dataemissao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
