public class Sum3 {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int c=18;
        int ialt;

        ialt=sum(a,b,c);
        System.out.println("Summen er " +ialt);
    }

    static int sum(int z,int x, int u){
    int result= z+x+u;
    return result;
    }
}
