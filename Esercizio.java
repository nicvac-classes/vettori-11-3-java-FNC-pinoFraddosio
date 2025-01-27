//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().

    static int InserisciElemento(int[] V, int dimensione, int valore, int i){
        int nDimensione;

        int[] W = new int[dimensione + 1];
        for(int j = 0; j < i; j++){
            W[j] = V[j];
        }
        W[i] = valore;
        for(int j = i+1; j <= dimensione; j++){
            W[j] = V[j-1];
        }
        for(int j = 0; j <= dimensione; j++){
            V[j] = W[j];
        }

        nDimensione = dimensione + 1; 
        return nDimensione;
    }
    static int EliminaElemento(int[] V, int dimensione, int i){
        int N;
        int[] W = new int[dimensione - 1];

        for(int j = 0; j <= i; j++){
            W[j] = V[j];
        } 
        for(int j = i+1; j < dimensione - 1; j++){
            W[j] = V[j+1];
        }
        for(int j = 0; j < dimensione - 1; j++){
            V[j] = W[j];
        }

        N = dimensione - 1;
        return N;
    }
    static int ricercaNelVettore(int[] V, int dimensione, int valore){

        int i, j;
        i = -1;
        j = 0;
        while(i == -1 && j < dimensione){
            if(valore == V[j]){
                i = j;
            }
            j++;
        }
        return i;
    }
    static int ElminaDuplicati(int[] V , int dimensione){
        return dimensione -1;
    }
    static void VisualizzaVettore(int[] V, int dimensione){
        for(int i = 0; i < dimensione; i++){
            System.out.println((i+1) + "° numero: " + V[i]);
        }
    }

    //MAIN

    public static void main(String args[])
    {

        Scanner in = new Scanner( System.in );
        int N, o , valore,i;

        System.out.print("Inserire grandezza vettore: ");
        N = in.nextInt();
        int[] V = new int[N*10];
        
        for(i=0; i<N; i++){
            V[i] = 0;    
        }

        do{
            System.out.println("Scegli un'opzione: \n 1. Inserisci elemento \n 2. Elimina elemento \n 3. Ricerca elemento \n 4. Elimina duplicati \n 5. Visualizza vettore \n 6. Esci");
            System.out.print("Input: ");
            o = in.nextInt();
            if(o == 1){
                System.out.print("Inserire il valore da aggiungere: ");
                valore = in.nextInt();
                do{
                    System.out.print("Inserire la posizione in cui si deve inserire il valore: ");
                    i = in.nextInt();
                }while(i<0 || i>=N);
                N = InserisciElemento(V,N,valore,i);
            }
            if(o == 2){
                do{
                    System.out.print("Inserire la posizione dell'elemento da eliminare: ");
                    i = in.nextInt();
                }while(i < 0 || i >= N);
                N = EliminaElemento(V, N, i);
            }
            if(o == 3){
                System.out.println("Inserire valore da ricercare: ");
                valore = in.nextInt();
                valore = ricercaNelVettore(V, N, valore);
                if(valore == -1){
                    System.out.println("Il valore non è presente nel vettore");
                }else{
                    System.out.println("Il valore è presente nella posizione: " + valore);
                }
                
            }
            if(o == 4){
                N = ElminaDuplicati(V,N);
            }
            if(o == 5){
                VisualizzaVettore(V,N);
            }
            if(o != 1 && o != 2 && o != 3 && o != 4 && o != 5 && o != 6){
                System.out.println("Inserire un valore valido");
            }
        }while(o != 6);
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md