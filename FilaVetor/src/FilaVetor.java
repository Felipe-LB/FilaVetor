class FilaVetor {
    int vet[];
    int tam;
    int n;
    int ini;
    // fim = (ini + n) % tam
    public FilaVetor(int tam) {
        this.tam = tam;
        vet = new  int[tam];
        this.ini = 0;
        this.n = 0;
    }
    public boolean vazia() {
        return n == 0;
    }

    public boolean cheia() {
        return n == tam;
    }

    public void insere(int valor) throws Exception {
        if (cheia()){
            throw new Exception("Fila cheia! ");
        }
        else {
            int fim = (ini + n) % tam;
            vet[fim] = valor;
            n++;
        }
    };

    public int retira() throws Exception{
        if (vazia()){
            throw new Exception("Fila está vazia! ");
        }
        else {
            int valor = vet[ini];
            ini = (ini + 1) % tam;
            if (ini > tam){

            }
            else {

            }
            n--;
            return valor;
        }
    }
    public void libera() {
        ini = 0;
        n = 0;
    }

}
