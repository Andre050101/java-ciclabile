import org.lessons.java.Elenco;
public class App {
    public static void main(String[] args) throws Exception {
         // Esempio con costruttore che prende array
         int[] numeri = {10, 20, 30, 40};
         Elenco elenco1 = new Elenco(numeri);
         
         while (elenco1.hasAncoraElementi()) {
             System.out.println(elenco1.getElementoSuccessivo());
         }
         
         // Esempio con costruttore vuoto e aggiunta elementi
         Elenco elenco2 = new Elenco();
         elenco2.addElemento(100);
         elenco2.addElemento(200);
         elenco2.addElemento(300);
         
         while (elenco2.hasAncoraElementi()) {
             System.out.println(elenco2.getElementoSuccessivo());
         }
    }
}
