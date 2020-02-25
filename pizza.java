public class pizza {

    private int nr;
    private String pizzaNavn;
    private String topping;

    public int getnr() {
        return nr;
    }

    public pizza(int nr, String pizzaNavn, String topping) {
        this.pizzaNavn = pizzaNavn;
        this.nr = nr;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return nr + " " + pizzaNavn + " med " + topping;
    }

}