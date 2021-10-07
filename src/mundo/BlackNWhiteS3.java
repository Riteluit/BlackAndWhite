package mundo;

import sss.Logic;

public class BlackNWhiteS3 extends Logic {

    //Atributos
    int pos;
    String pieza[];

    //Constructores
    public BlackNWhiteS3() {
        pieza = new String[7];
    }

    public BlackNWhiteS3(String fichas[]) {
        pieza = new String[7];
        pieza[0] = fichas[0];
        pieza[1] = fichas[1];
        pieza[2] = fichas[2];
        pieza[3] = fichas[3];
        pieza[4] = fichas[4];
        pieza[5] = fichas[5];
        pieza[6] = fichas[6];
        setPos();
    }

    //Metodos getter & setter 
    public String[] getPieza() {
        return pieza;
    }

    public void setFichas(String[] pieza) {
        this.pieza = pieza;
    }

    //Metodos privados
    private void setPos(int pos) {
        this.pos = pos;
    }

    private void setPos() {
        for (int i = 0; i < 7; i++) {
            if (pieza[i] == "-") {
                pos = i;
            }
        }
    }

    public int getPos() {
        return pos;
    }

    //Metodos de utilidades
    /*
    public void ver() {
        System.out.println("\n");
        for (int i = 0; i < 7; i++) {
            System.out.print("[" + this.pieza[i] + "]");
        }
        System.out.println("\n");
    }*/
    
    // Metodos de comportamiento  
    public void saltoIzquierda() {
        if (pos > 0) {
            pieza[pos] = pieza[pos - 1];
            pieza[pos - 1] = "-";
            pos--;
        }
    }

    public void saltoDerecha() {
        if (pos < 6) {
            pieza[pos] = pieza[pos + 1];
            pieza[pos + 1] = "-";
            pos++;
        }
    }

    public void doblesaltoIzquierda() {
        if (pos > 1) {
            pieza[pos] = pieza[pos - 2];
            pieza[pos - 2] = "-";
            pos = pos - 2;
        }
    }

    public void doblesaltoDerecha() {
        if (pos < 5) {
            pieza[pos] = pieza[pos + 2];
            pieza[pos + 2] = "-";
            pos = pos + 2;
        }
    }

    @Override
    public void action(int index) {
        switch (index) {
            case 1: {
                saltoIzquierda();
                break;
            }
            case 2: {
                saltoDerecha();
                break;
            }
            case 3: {
                doblesaltoIzquierda();
                break;
            }
            case 4: {
                doblesaltoDerecha();
                break;
            }
        }
    }

    @Override
    public BlackNWhiteS3 cloneObject(Object object) {
        BlackNWhiteS3 obj = (BlackNWhiteS3) object;
        BlackNWhiteS3 objClone;
        
        String Array[] = new String[7];
        String objBlackWhite[] = obj.getPieza();

        objClone = new BlackNWhiteS3();
        objClone.setPos(obj.getPos());

        for(int i = 0; i < 7; i++) {
            Array[i] = objBlackWhite[i];
        }

        objClone.setFichas(Array);
        return objClone;
    }

    @Override
    public String state() {
        String state = "";
        state = state + pieza[0] + pieza[1] + pieza[2];
        state = state + pieza[3];
        state = state + pieza[4] + pieza[5] + pieza[6];
        return state;
    }

}
