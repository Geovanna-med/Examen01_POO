public class Jornalero extends Empleado {

    private int horasExtras;

    public Jornalero(String nombre, double numHorasTrabajadas, int horasExtras) {
        super(nombre, numHorasTrabajadas);
        this.horasExtras = horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getHorasExtras() {
        return this.horasExtras;
    }

    public double calcularSalario(int numHorasTrabajadas, double tarifa, int horasExtras) {

        return super.calcularSalario(numHorasTrabajadas + (2 * horasExtras), tarifa);
    }

    @Override
    public String toString() {
        return super.toString() + "\nHoras trabajadas: " + getNumHorasTrabajadas() + "\nHoras Extras: "
                + this.horasExtras;
    }

    public static void main(String[] args) {
        Jornalero jornalero = new Jornalero("Fernanda", 80, 10);
        jornalero.calcularSalario(80, 15, 10);
        System.out.println(jornalero);
    }
}
