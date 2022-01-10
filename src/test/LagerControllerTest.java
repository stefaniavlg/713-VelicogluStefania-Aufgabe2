package test;

import controller.LagerController;
import model.Produkt;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LagerControllerTest {

    @Test
    public void test_addProdukt(){
        LagerController lagerController = new LagerController();
        lagerController.addProdukt("PC",200,10,500);
        lagerController.addProdukt("Mouse",10,5,49);

        assertEquals(2,lagerController.getProduktList().size());
    }

    @Test
    public void test_removeProdukt(){
        LagerController lagerController = new LagerController();
        lagerController.addProdukt("PC",200,10,500);
        lagerController.addProdukt("Mouse",10,5,49);

        assertEquals(2,lagerController.getProduktList().size());
        lagerController.removeProdukt("PC");
        assertEquals(1,lagerController.getProduktList().size());
        lagerController.removeProdukt("Mouse");
        assertEquals(0,lagerController.getProduktList().size());
    }

    @Test
    public void test_updateProdukt(){
        LagerController lagerController = new LagerController();
        lagerController.addProdukt("PC",200,10,500);
        lagerController.addProdukt("Mouse",10,5,49);

        assertEquals("Mouse",lagerController.getProduktList().get(1).getName());

        lagerController.updateProdukt("Mouse",10,5,49,new Produkt("ceva",1,2,3));
        assertEquals("ceva",lagerController.getProduktList().get(1).getName());
    }

    @Test
    public void test_addLageraktualisierung(){
        LagerController lagerController = new LagerController();
        //lagerController.addLageraktualisierung(12.12.2020);
        //lagerController.addLageraktualisierung(0);

    }
}
