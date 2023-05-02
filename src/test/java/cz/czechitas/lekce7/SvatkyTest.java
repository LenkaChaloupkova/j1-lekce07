package cz.czechitas.lekce7;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Filip Jirsák
 */
class SvatkyTest {

  /**
   * Testuje metodu {@link Svatky#kdyMaSvatek(String)}
   */
  @Test // značka, kterou chceme k metodě přidat, aby se vše hezky přidávalo do knihoven
  void kdyMaSvatek() { //SPATNE - TUTO CAST KOMPLET PROHODIT S UKOLEM POD TIMTO
    Svatky svatky = new Svatky(); //konstruktor/instance - pridavat si ho k "menicim" metodam (dole)
    assertTrue(svatky.jeVSeznamu("Nataša"));
    assertFalse(svatky.jeVSeznamu("Eva"));
    assertFalse(svatky.jeVSeznamu("neexistujiciJmeno")); // je dobré mít v testu i tuto variantu
  }

  @Test
  void kdyMaSvatek2() { //SPATNE - TUTO CAST KOMPLET PROHODIT S UKOLEM POD TIMTO
    Svatky svatky = new Svatky(); //konstruktor/instance - pridavat si ho k "menicim" metodam (dole)
    assertTrue(svatky.jeVSeznamu("Nataša"));
    assertFalse(svatky.jeVSeznamu("Eva"));
    assertFalse(svatky.jeVSeznamu("neexistujiciJmeno")); // je dobré mít v testu i tuto variantu
  @Test
  void kdyMaSvatek_ProVstupNatasa_VraciValidniVystup() { // POSTUP VLASTIMILA - Arrange/Act/Assert
    //Arrange (Připrav)
    Svatky svatky = new Svatky();
    String jmeno = "Nataša";
    MonthDay ocekavanyVysledek = MonthDay.of(5,18);

    // Act (Vykonej)
    MonthDay skutecnyVysledek = svatky.kdyMaSvatek(jmeno);

    // Assert (Ověř)
    assertEquals(ocekavanyVysledek, skutecnyVysledek);
  }

  @Test
  void kdyMaSvatek_ProVstupEva_VraciNull() { // POSTUP VLASTIMILA - Arrange/Act/Assert
    //Arrange (Připrav)
    Svatky svatky = new Svatky();
    String jmeno = "Eva";
    MonthDay ocekavanyVysledek = null;

    // Act (Vykonej)
    MonthDay skutecnyVysledek = svatky.kdyMaSvatek(jmeno);

    // Assert (Ověř)
    assertEquals(ocekavanyVysledek, skutecnyVysledek);
  /**
   * Testuje metodu {@link Svatky#jeVSeznamu(String)}
   */
  @Test
  void jeVSeznamu() { /*
    Svatky svatky = new Svatky();
    assertEquals(MonthDay.of(5, 18), svatky.kdyMaSvatek("Nataša"));
    assertNull(svatky.kdyMaSvatek("Eva"));
    assertNull(svatky.kdyMaSvatek("neexistujiciJmeno")); // je dobré mít v testu i tuto variantu
    //TODO Otestovat, že najde v seznamu existující jméno a nenajde neexistující jméno
    */

        //Arrange (Připrav)
        Svatky svatky = new Svatky();
        String jmeno = "Eva";
        Boolean ocekavanyVysledek = true;

        // Act (Vykonej)
        Boolean skutecnyVysledek = svatky.jeVSeznamu(jmeno);

        // Assert (Ověř)
        boolean svatky. ?
  }

  /**
   * Testuje metodu {@link Svatky#getPocetJmen()}
   */
  @Test
  void getPocetJmen() {
    //TODO Otestovat, že vrací počet jmen, která máme v seznamu
  }

  /**
   * Testuje metodu {@link Svatky#getSeznamJmen()}
   */
  @Test
  //@Disabled("28.3.2023 nefunguje, zitra to Tomas opravi.") // vlozil behem hodiny Filip jako ukazku
  void getSeznamJmen() {
    //TODO Zkontrolovat, že seznam jmen má správný počet položek.
  }

  /**
   * Testuje metodu {@link Svatky#pridatSvatek(String, int, int)}
   */
  @Test
  void pridatSvatekDenMesicInt() {
    //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
  }

  /**
   * Testuje metodu {@link Svatky#pridatSvatek(String, int, Month)}
   */
  @Test
  void pridatSvatekDenMesicMonth() {
    //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
  }

  /**
   * Testuje metodu {@link Svatky#pridatSvatek(String, MonthDay)}
   */
  @Test
  void prridatSvatekMonthDay() {
    //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
  }

  /**
   * Testuje metodu {@link Svatky#smazatSvatek(String)}
   */
  @Test
  void smazatSvatek() {
    //TODO Zkontrolovat, že po smazání bude počet svátků odpovídat novému počtu.
  }
}
