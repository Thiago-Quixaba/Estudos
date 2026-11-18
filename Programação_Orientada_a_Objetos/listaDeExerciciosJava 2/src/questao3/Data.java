package questao3;

public class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void imprimirData() {
        System.out.printf("%02d/%02d/%04d\n", this.dia, this.mes, this.ano);
    }
}
