//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().

    static void InserisciElemento(){

    }
    static void EliminaElemento(){

    }
    static void ricercaNelVettore(int V, int valore, int dimensione){
        int i, j;
        j = 0;
        while(i = 0 && j < dimensione){
            if(valore == V[j]){
                i = j;
            }
        }
    }
    static void ElminaDuplicati(){

    }
    static void VisualizzaVettore(int V, int dimensione){
        for(int i = 0; i < dimensione; i++){
            System.out.println((i+1) + "° numero: " + V[i]);
        }
    }

    public static void main(String args[])
    {

        Scanner in = new Scanner( System.in );
        int N, o , valore;

        System.out.print("Inserire grandezza vettore");
        N = in.nextInt();
        int[] V = new V[N];
        
        for(int i=0; i<0; i++){
            V[i] = 0;    
        }

        do{
            System.out.println("Scegli un'opzione: \n 1. Inserisci elemento \n 2. Elimina elemento \n 3. Ricerca elemento \n 4. Elimina duplicati \n 5. Visualizza vettore \n 6. Esci")
            System.out.print("Input: ")
            o = in.nextInt();
            if(o == 0){
                InserisciElemento();
            }
            if(o == 2){
                EliminaElemento();
            }
            if(o == 3){
                System.out.println("Inserire valore da ricercare: ");
                valore = in.nextInt();
                valore = ricercaNelVettore(V[N], valore, N);
                System.out.println("Il valore è presente nella posizione: " + valore);
            }
            if(o == 4){
                EliminaDuplicati();
            }
            if(o == 5){
                VisualizzaVottre(V[N], N);
            }
            if(o != 1 || o != 2 || o != 3 || o != 4 || o != 5 || o != 6){
                System.out.println("Inserire un valore valido");
            }
        }while(o != 6);
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md