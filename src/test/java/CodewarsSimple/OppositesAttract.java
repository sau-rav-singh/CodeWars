package CodewarsSimple;

public class OppositesAttract {
//Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
    public static void main(String[] args) {
        System.out.println(isLove(2,3));
    }
    public static boolean isLove(final int flower1, final int flower2) {
        return (flower1+flower2)%2!=0;
    }
}
