public class Builder {
    public static void main(String[] args) {
        CakeBuilder builder = new SpecificCakeBuilder();
        CakeDirector director = new CakeDirector(builder);

        director.constructCake();
        Cake Cake = builder.getResult();

        System.out.println(Cake);
    }
}
// Cake
class Cake {
    private String dough;
    private String filling;
    private String topping;

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "dough='" + dough + '\'' +
                ", filling='" + filling + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}

// builder  interface
interface CakeBuilder {
    void buildDough();
    void buildFilling();
    void buildTopping();
    Cake getResult();
}

// specific builder
class SpecificCakeBuilder implements CakeBuilder {
    private Cake Cake;

    public SpecificCakeBuilder() {
        this.Cake = new Cake();
    }

    @Override
    public void buildDough() {
        Cake.setDough("SomeDough");
    }

    @Override
    public void buildFilling() {
        Cake.setFilling("SomeFilling");
    }

    @Override
    public void buildTopping() {
        Cake.setTopping("SomeTopping");
    }

    @Override
    public Cake getResult() {
        return Cake;
    }
}

// Director
class CakeDirector {
    private CakeBuilder builder;

    public CakeDirector(CakeBuilder builder) {
        this.builder = builder;
    }

    public void constructCake() {
        builder.buildDough();
        builder.buildFilling();
        builder.buildTopping();
    }
}