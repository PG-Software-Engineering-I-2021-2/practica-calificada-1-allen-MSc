package app;

import org.junit.Assert;
import org.junit.Test;

public class OliverTest {

    @Test
    public void testOliverEsSingleton(){
        var oliver = Oliver.getInstance();
        Assert.assertEquals(oliver, Oliver.getInstance());
    }

    @Test
    public void testRegistrarLibros(){
        var oliver = Oliver.getInstance();
        oliver.limpiar();

        Autor sommerville = new Autor("Ian Sommerville", "23/02/1951");

        oliver.regitrarLibro("Software Engineering 6th edition", "2007", sommerville, "Software Engineering");
        oliver.regitrarLibro("Software Engineering 7th edition", "2008", sommerville, "Software Engineering");
        oliver.regitrarLibro("Software Engineering 8th edition", "2009", sommerville, "Software Engineering");
        oliver.regitrarLibro("Software Engineering 9th edition", "2010", sommerville, "Software Engineering");

        Assert.assertEquals(4, oliver.getLibros().size());
    }


    @Test
    public void testRegistrarEstudiantes(){
        var oliver = Oliver.getInstance();
        oliver.limpiar();

        oliver.regitrarEstudiante("allen@utec.edu.pe", "969888777", "Software Engineering");
        oliver.regitrarEstudiante("pepito@utec.edu.pe", "969777666", "Computer Science");

        Assert.assertEquals(2, oliver.getEstudiantes().size());
    }

    @Test
    public void testBuscarLibrosPorAutor(){
        var oliver = Oliver.getInstance();
        oliver.limpiar();

        Autor sommerville = new Autor("Ian Sommerville", "23/02/1951");
        oliver.regitrarLibro("Software Engineering 6th edition", "2007", sommerville, "Software Engineering");
        oliver.regitrarLibro("Software Engineering 7th edition", "2008", sommerville, "Software Engineering");

        Autor kim = new Autor("Euiwhan Kim", "23/02/1951");
        oliver.regitrarLibro("Techniques and Environments for Big Data 8th edition", "2010", kim, "Computer Science");
        oliver.regitrarLibro("Techniques and Environments for Big Data 9th edition", "2011", kim, "Computer Science");

        Assert.assertEquals(2, oliver.buscarLibrosPorAutor(sommerville).size());
    }

    @Test
    public void testNotificarOfertasPorCategoría(){
        var oliver = Oliver.getInstance();
        oliver.limpiar();

        Autor kim = new Autor("Euiwhan Kim", "23/02/1951");
        oliver.regitrarLibro("Techniques and Environments for Big Data 8th edition", "2010", kim, "Computer Science");
        oliver.regitrarLibro("Techniques and Environments for Big Data 9th edition", "2011", kim, "Computer Science");

        oliver.regitrarEstudiante("allen@utec.edu.pe", "969888777", "Software Engineering");
        oliver.regitrarEstudiante("pepito@utec.edu.pe", "969777666", "Computer Science");


        Assert.assertEquals(1, oliver.notificarOfertasPorCategoria("Computer Science").size());
        Assert.assertEquals("pepito@utec.edu.pe", oliver.notificarOfertasPorCategoria("Computer Science").get(0).getCorreo());
    }
}