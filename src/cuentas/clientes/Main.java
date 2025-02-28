/**
 * clase relacionadas con clientes y cuentas bancarias.
 */
package cuentas.clientes;

/**
     * @author José Alberto Torresano
     * @version 1.0
     * @since 28-Feb-2025
     */
public class Main {

    /*
    Tarea de Entornos de Desarrollo
    */
    
    
    public static void main(String[] args) {
        
        
        
        System.out.println("Programa del Banco");
        System.out.println("****************************");
        operativa_cuenta(0);
    }

    /**
     * este metodo crea unas operaciones en una cuenta
     * @version 1.0
     * @param cantidad este parametro no es usado
     * 
     */
    private static void operativa_cuenta(float cantidad) {
        Cuenta cuenta1;
        double saldoActual;

        cuenta1 = new Cuenta("Rafael Nadal Parera","1000-2365-85-1230456789",2500,0);
        
        System.out.println("El saldo actual es:"+ cuenta1.estado() );

        try {
            cuenta1.retirar(2300);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
