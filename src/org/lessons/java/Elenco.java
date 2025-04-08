package org.lessons.java;

public class Elenco {
    private int[] elenco;
    private int indice;
    private int dimensione;

    //Costruttore con array di intero:
    public Elenco(int[] array){
        if(array == null){
            this.elenco = new int[0];
        }
        else{
            this.elenco = new int[array.length];
            System.arraycopy(array, 0, this.elenco, 0, array.length);
        }
        this.indice = 0;
        this.dimensione = this.elenco.length;
    }

    //Costruttore bonus:
    public Elenco(){
        this.elenco = new int[0];
        this.indice = 0;
        this.dimensione = 0;
    }

    //Metodo per ottenere prossimo elemento:
    public int getElementoSuccessivo(){
        if(!hasAncoraElementi()){
            throw new IllegalStateException("Non ci sono più elementi nell'elenco");
        }
        return elenco[indice++];
    }

    //Metodo per verificare se ci sono ancora elementi
    public boolean hasAncoraElementi(){
        return indice < dimensione;
    }

    //Metodo per aggiungere nuovo elemento
    public void addElemento(int nuovoEl){
        if(dimensione >= elenco.length){
           int nuovaDim = (elenco.length == 0) ? 1 : elenco.length * 2;
           int[] nuovoArray = new int[nuovaDim];
           System.arraycopy(elenco, 0, nuovoArray, 0, elenco.length); 
           elenco = nuovoArray;
        }
        elenco[dimensione++] = nuovoEl;
    }

    //Metodo reset iterazione (non richiesto)
    public void reset(){
        indice = 0;
    }

}
 