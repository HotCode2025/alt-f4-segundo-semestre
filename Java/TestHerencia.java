import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gabriel", 'M', 25, "Tupungato, Mendoza",
                101, new Date(), true);

        cliente1.mostrarInfo();
    }
}
