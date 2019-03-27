package app;

import clases.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<Persona>();
        //-----------------------------------------------------------------------------
        personas = Arrays.asList(new Persona("agustin", "nicoloso", 41258531, 20),
                new Persona("maxi", "morales", 41258532, 18),
                new Persona("miguel", "fontana", 41258533, 23),
                new Persona("mauri", "goyeneche", 41258534, 20));
        //-----------------------------------------------------------------------------
        System.out.println(String.format("Personas : %s", personas));
        //-----------------------------------------------------------------------------
        System.out.println(String.format("Personas mayores a 21 : %s", personas.stream().filter(persona -> persona.getEdad() >= 21).collect(Collectors.toList())));
        //-----------------------------------------------------------------------------
        System.out.println(String.format("Personas menores a 18 : %s", personas.stream().filter(persona -> persona.getEdad() <= 18).collect(Collectors.toList())));
        //-----------------------------------------------------------------------------
        System.out.println(String.format("Personas mayores a 21 y DNI mayor a 200000000 : %s", personas.stream().filter(persona -> persona.getEdad() >= 21).filter(persona -> persona.getDni() >= 20000000).collect(Collectors.toList())));
    }
}
