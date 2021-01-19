package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import app.*;

class CadenaTest {
    @Test
    @DisplayName("Test 1 del primer metodo: Si es multiplo de 3")
    void testPrimerMetodo1() {
        //fail("Not yet implemented");
       // 1 - preracion del test
       Facebook resultado = new Facebook();
       // 2 - Ejecutar lo que vamos a validar
       String result = resultado.cadena1(6);
       // 3 - Aserciones
       assertEquals( "Face", result, "Face");
    }

    @Test
    @DisplayName("Test 2 del primer metodo: Si es multiplo de 5")
    void testPrimerMetodo2() {
        //fail("Not yet implemented");
       // 1 - preracion del test
       Facebook resultado = new Facebook();
       // 2 - Ejecutar lo que vamos a validar
       String result = resultado.cadena1(10);
       // 3 - Aserciones
       assertEquals( "Book", result, "Book");
    }

    @Test
    @DisplayName("Test 3 del primer metodo: Si es multiplo de 15")
    void testPrimerMetodo3() {
        //fail("Not yet implemented");
       // 1 - preracion del test
       Facebook resultado = new Facebook();
       // 2 - Ejecutar lo que vamos a validar
       String result = resultado.cadena1(30);
       // 3 - Aserciones
       assertEquals( "Facebook", result, "Facebook");
    }

    @Test
    @DisplayName("Test 4 del primer metodo: no es múltiplo de ninguno")
    void testPrimerMetodo4() {
        //fail("Not yet implemented");
       // 1 - preracion del test
       Facebook resultado = new Facebook();
       // 2 - Ejecutar lo que vamos a validar
       String result = resultado.cadena1(37);
       // 3 - Aserciones
       assertEquals( "37", result, "37");
    }
}
