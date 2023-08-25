public class Exercicio1 {

    public int fatorialRecursivo(int num){
        if (num == 0) {
            return 1;
        }
        return num * fatorialRecursivo(num);
    }
    
}
