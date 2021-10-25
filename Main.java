public class Main {

    public static void main(String[] args) {

        System.out.println("Administrador 1:");
        Administrador administrador = new Administrador("Geovanna", 80, 11);
        administrador.calcularSalario(80, 15, 11);
        System.out.println(administrador);
        System.out.println("\n");

        System.out.println("Administrador 2: ");
        Administrador administrador2 = new Administrador("Gabriel", 70, 20);
        administrador2.calcularSalario(70, 15, 20);
        System.out.println(administrador2);
        System.out.println("\n");

        System.out.println("Jornalero 1: ");
        ;
        Jornalero jornalero = new Jornalero("Fernanda", 80, 10);
        jornalero.calcularSalario(80, 15, 10);
        System.out.println(jornalero);
        System.out.println("\n");

        System.out.println("Jornalero 2: ");
        Jornalero jornalero2 = new Jornalero("Sofia", 50, 0);
        jornalero2.calcularSalario(50, 15, 0);
        System.out.println(jornalero2);
        System.out.println("\n");

        Empleado[] empleados = new Empleado[10];

        empleados[0] = administrador;
        empleados[1] = administrador2;
        empleados[2] = jornalero;
        empleados[3] = jornalero2;

        double[] SueldosAdmin = new double[10];
        double[] SueldosJornalero = new double[10];
        double[] HorasAdmins = new double[10];
        double[] HorasJornalero = new double[10];

        int noJornalero = 0;
        int noAdmin = 0;

        for (int i = 0; i <= 9; i++) {
            if (empleados[i] instanceof Administrador) {
                Administrador temp = (Administrador) empleados[i];
                SueldosAdmin[noAdmin] = temp.getSalario();
                HorasAdmins[noAdmin] = temp.getNumHorasTrabajadas() + temp.getHorasExtras();
                noAdmin++;
            } else {
                if (empleados[i] instanceof Jornalero) {
                    Jornalero temp = (Jornalero) empleados[i];
                    SueldosJornalero[noJornalero] = temp.getSalario();
                    HorasJornalero[noJornalero] = temp.getNumHorasTrabajadas() + temp.getHorasExtras();
                    noJornalero++;
                }
            }
        }

        double NominaAdmins = 0;
        double NominaJornaleros = 0;
        double NominaTotal = 0;
        double HorasTotalAdmins = 0;
        double HorasTotalJornaleros = 0;

        for (int i = 0; i <= noAdmin; i++) {
            NominaAdmins = NominaAdmins + SueldosAdmin[i];
            NominaTotal = NominaAdmins + SueldosAdmin[i];
            HorasTotalAdmins = HorasTotalAdmins + HorasAdmins[i];
        }

        for (int i = 0; i <= noJornalero; i++) {
            NominaJornaleros = NominaJornaleros + SueldosJornalero[i];
            NominaTotal = NominaTotal + SueldosJornalero[i];
            HorasTotalJornaleros = HorasTotalJornaleros + HorasJornalero[i];
        }

        System.out.println("Nomina de la empresa\n");
        System.out.println("Nomina total a pagar quincenalmente: " + NominaTotal);
        System.out.println("Nomina de Administradores: " + NominaAdmins);
        System.out.println("Nomina de Jornaleros: " + NominaJornaleros);
        System.out.println("Cantidad de Administradores: " + noAdmin);
        System.out.println("Cantidad de Jornaleros: " + noJornalero);
        System.out.println(
                "Horas totales trabajadas por todos los empleados: " + (HorasTotalAdmins + HorasTotalJornaleros));
        System.out.println("Horas totales trabajadas por los Administradores: " + HorasTotalAdmins);
        System.out.println("Horas totales trabajadas por los Jornaleros: " + HorasTotalJornaleros);
    }
}
