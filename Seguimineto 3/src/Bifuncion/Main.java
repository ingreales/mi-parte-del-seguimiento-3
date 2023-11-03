package Bifuncion;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Senior senior = new Senior("juan","java");
        Junior junior = new Junior("jose","2 años");

        BiFunction<Senior,Junior,String> info = (S,J) -> {
            return S.getNombre() +" su especialidad es " + S.getEspecialidad() + " y " + J.getNombre() + " sus años de experencia son " + J.getExperiencia();

        };
        System.out.println(info.apply(senior,junior));
    }
}
