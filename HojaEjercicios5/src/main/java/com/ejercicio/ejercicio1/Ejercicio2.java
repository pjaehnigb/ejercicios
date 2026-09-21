

import java.util.ArrayList;

class Empleado {

    String nombre;
    String departamento;
    double salario;

    public Empleado(String nombre, String departamento, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public void mostrarEmpleado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: Q" + salario);
        System.out.println("----------------------");
    }
}

public class Ejercicio2 {

    public static ArrayList<Empleado> buscarEmpleados(
            ArrayList<Empleado> empleados,
            String departamento) {

        ArrayList<Empleado> resultado = new ArrayList<>();

        for (Empleado empleado : empleados) {

            if (empleado.departamento.equalsIgnoreCase(departamento)
                    && empleado.salario > 5000) {

                resultado.add(empleado);
            }
        }

        return resultado;
    }

    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new Empleado("Ana", "Sistemas", 6500));
        empleados.add(new Empleado("Carlos", "Ventas", 4500));
        empleados.add(new Empleado("Maria", "Sistemas", 7000));
        empleados.add(new Empleado("Pedro", "Ventas", 6000));
        empleados.add(new Empleado("Luis", "Sistemas", 4000));

        ArrayList<Empleado> resultado =
                buscarEmpleados(empleados, "Sistemas");

        System.out.println("EMPLEADOS DE SISTEMAS CON SALARIO MAYOR A Q5,000:");

        for (Empleado empleado : resultado) {
            empleado.mostrarEmpleado();
        }
    }
}