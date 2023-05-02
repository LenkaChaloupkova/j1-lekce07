package cz.czechitas.lekce7;

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
  @Test
  void kdyMaSvatek() {
    Svatky svatky = new Svatky();
    assertEquals(MonthDay.of(5, 18), svatky.kdyMaSvatek("Nataša"));
    assertNull(svatky.kdyMaSvatek("Eva"));
  }

  /**
   * Testuje metodu {@link Svatky#jeVSeznamu(String)}
   */
  @Test
  void jeVSeznamu() {
    //TODO Otestovat, že najde v seznamu existující jméno a nenajde neexistující jméno
    Svatky svatky = new Svatky();
    assertTrue(svatky.jeVSeznamu("Klaudie"));
    assertFalse(svatky.jeVSeznamu("Jonáš"));
  }

  /**
   * Testuje metodu {@link Svatky#getPocetJmen()}
   */
  @Test
  void getPocetJmen() {
    //TODO Otestovat, že vrací počet jmen, která máme v seznamu
    Svatky svatky = new Svatky();
    int skutecnyPocetJmen = svatky.getPocetJmen();
    int ocekavanyPocetJmen = 37;
    assertEquals(ocekavanyPocetJmen,skutecnyPocetJmen);
  }

  /**
   * Testuje metodu {@link Svatky#getSeznamJmen()}
   */
  @Test
  void getSeznamJmen() {
    //TODO Zkontrolovat, že seznam jmen má správný počet položek.
    Svatky svatky = new Svatky();
    int skutecnyPocetJmen = svatky.getSeznamJmen().size();
    int ocekavanyPocetJmen = 37;
    assertEquals(ocekavanyPocetJmen,skutecnyPocetJmen);
  }

  /**
   * Testuje metodu {@link Svatky#pridatSvatek(String, int, int)}
   */
  @Test
  void pridatSvatekDenMesicInt() {
    //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
    Svatky svatky = new Svatky();
    String jmeno = "Simona";

    svatky.pridatSvatek(jmeno, 12, 12);

    assertTrue(svatky.jeVSeznamu(jmeno));
    assertEquals(MonthDay.of(12, 12), svatky.kdyMaSvatek(jmeno));
  }

  /**
   * Testuje metodu {@link Svatky#pridatSvatek(String, int, Month)}
   */
  @Test
  void pridatSvatekDenMesicMonth() {
    //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
    Svatky svatky = new Svatky();
    String jmeno = "Simona";

    svatky.pridatSvatek(jmeno, 12, Month.DECEMBER);

    assertTrue(svatky.jeVSeznamu(jmeno));
    assertEquals(MonthDay.of(Month.DECEMBER, 12), svatky.kdyMaSvatek(jmeno));
  }

  /**
   * Testuje metodu {@link Svatky#pridatSvatek(String, MonthDay)}
   */
  @Test
  void prridatSvatekMonthDay() {
    //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
    Svatky svatky = new Svatky();
    String jmeno = "Simona";

    svatky.pridatSvatek(jmeno, MonthDay.of(12,12));

    assertTrue(svatky.jeVSeznamu(jmeno));
    assertEquals(MonthDay.of(12, 12), svatky.kdyMaSvatek(jmeno));
  }

  /**
   * Testuje metodu {@link Svatky#smazatSvatek(String)}
   */
  @Test
  void smazatSvatek() {
    //TODO Zkontrolovat, že po smazání bude počet svátků odpovídat novému počtu.
    Svatky svatky = new Svatky();
    String jmenoKeSmazano = "Vanesa";

    svatky.smazatSvatek(jmenoKeSmazano);

    assertEquals(36, svatky.getPocetJmen());
    assertFalse(svatky.jeVSeznamu(jmenoKeSmazano));
  }
}