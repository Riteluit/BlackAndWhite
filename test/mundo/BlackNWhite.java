package mundo;

public class BlackNWhite {

    //Atributos
    int pos;
    String fichas[];

    //Contructores
    public BlackNWhite(int pos, String fichas[]) {
        this.pos = pos;
        this.fichas = fichas;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String[] getFichas() {
        return fichas;
    }

    public void setFichas(String[] fichas) {
        this.fichas = fichas;
    }

    //Metodos
    public void saltoIzquierda() {
        if (this.pos > 0) {
            this.fichas[pos] = this.fichas[pos - 1];
            this.fichas[pos - 1] = "-";
            this.pos--;
        }
    }

    public void saltoDerecha() {
        if (this.pos < 6) {
            this.fichas[pos] = this.fichas[pos + 1];
            this.fichas[pos + 1] = "-";
            this.pos++;
        }
    }

    public void doblesaltoIzquierda() {
        if (this.pos > 1) {
            this.fichas[pos] = this.fichas[pos - 2];
            this.fichas[pos - 2] = "-";
            this.pos = this.pos - 2;
        }
    }

    public void doblesaltoDerecha() {
        if (this.pos < 5) {
            this.fichas[pos] = this.fichas[pos + 2];
            this.fichas[pos + 2] = "-";
            this.pos = this.pos + 2;
        }
    }

    public void ver() {
        System.out.println("\n");
        for (int i = 0; i < 7; i++) {
            System.out.print("[" + this.fichas[i] + "]");
        }
        System.out.println("\n");
    }
}