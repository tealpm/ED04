package cuentas;

/**
 * Prueba la clase CCuenta
 * @author sintetica
 * @see CCuenta
 * @author Paula MR solo refactorizó 3 cosas y añadió javadoc
 * @version 1.0
  */
public class Main {

    /**
     * Inicializa un objeto de la clase CCuenta
     * @param args Array con los argumentos de línea de comandos cuando se ejecuta el programa
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, 2300);
    }

    /**
     * Comprueba las operaciones de retirar e ingresar
     * @param cuenta1 Instancia sobre la que realizar las operaciones
     * @param cantidad Cifra para retirar
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
