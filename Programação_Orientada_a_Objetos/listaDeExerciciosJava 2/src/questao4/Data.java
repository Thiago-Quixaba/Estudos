package questao4;

public class Data {
    private int diaValue, mesValue, anoValue;

    public Data(int newDia, int newMes, int newAno) {
        this.diaValue = newDia;
        this.mesValue = newMes;
        this.anoValue = newAno;
    }

    @Override 
    public String toString() {
        return String.format("%02d/%02d/%04d", this.diaValue, this.mesValue, this.anoValue);
    }

    public void setData(int newDia, int newMes, int newAno) {
        this.diaValue = newDia;
        this.mesValue = newMes;
        this.anoValue = newAno;
    }
}
