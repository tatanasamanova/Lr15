public class Main {

    public static void main(String[] args) {
        clothes []clothes={
                new Pants(Size.XXS,"синий",1500),
                new Skirt(Size.S,"розовый",999),
                new Tie(Size.L,"в полосочку",600),
                new TeeShirt(Size.M,"белый",2500),
                new Pants(Size.XS,"фиолетовый",3000),
        };
        for (int i = 0; i< clothes.length; i++) {
            System.out.println(clothes[i].size);
            System.out.println(clothes[i].color);
            System.out.println(clothes[i].cost);
            System.out.println(" ");
        }
    }


}
enum Size {
    XXS(40) {
        @Override
        public String getDescription() {
            return "детский размер";
        }
    },
    XS(38),
    S(36),
    M(34),
    L(32);

    Size(int euroSize) {
        EuroSize = euroSize;
    }

    public String getDescription() {
        return "взрослый размер";
    }

    @Override
    public String toString() {
        return name() + "(" + EuroSize + ") " + getDescription();
    }

    private int EuroSize;
}
interface mensclothing{
    static void dressMens() {
        System.out.println("Одеваем мужчину");
    }
}
interface womensclothing{
    static void dressWomen(){
        System.out.println("Одеваем женщину");
    }
}
abstract class clothes{
    Size size;
    String color;
    int cost;

    public clothes(Size size,String color,int cost){
        this.size=size;
        this.color=color;
        this.cost=cost;
    }
}
class TeeShirt extends clothes implements mensclothing,womensclothing{
    public TeeShirt(Size size, String color,int cost) {
        super(size, color,cost);
    }
}
class Pants extends clothes implements mensclothing,womensclothing {
    public Pants(Size size, String color, int cost) {
        super(size, color, cost);
    }
}
class Skirt extends clothes implements  womensclothing {
    public Skirt(Size size, String color, int cost) {
        super(size, color, cost);
    }
}
class Tie extends clothes implements mensclothing{
    public Tie(Size size, String color,int cost) {
        super(size, color,cost);
    }
}
class Atelier {
    public void dressMens(clothes[] clothes){
        System.out.println("Мужская одежда в наличии: ");
        for (clothes clothes1:clothes){
            if (clothes1 instanceof mensclothing){
                System.out.println(clothes1);
            }
        }
    }
    public void dressWomen(clothes[]clothes){
        System.out.println("Женская одежда в наличии: ");
        for (clothes clothes1 : clothes){
            if (clothes1 instanceof womensclothing){
                System.out.println(clothes1);
            }
        }
    }
}