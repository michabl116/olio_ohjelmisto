# Calculator-projekti

Tämä projekti sisältää yksinkertaisen Java-luokan nimeltä `Calculator`, joka toimii MVC-mallin mukaisena mallikomponenttina. Luokka pystyy lisäämään positiivisia kokonaislukuja sisäiseen laskuriin, nollaamaan laskurin sekä palauttamaan nykyisen arvon.

## Lähdekoodi

```java
public class Calculator {

    private int total;

    public Calculator() {
        this.total = 0;
    }

    public void reset() {
        this.total = 0;
    }

    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Vain positiiviset kokonaisluvut ovat sallittuja.");
        }
        this.total += number;
    }

    public int getValue() {
        return this.total;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(10);
        calc.add(20);
        System.out.println("Nykyinen summa: " + calc.getValue());
        calc.reset();
        System.out.println("Nollauksen jälkeen: " + calc.getValue());
    }
}
## Selitys

Tämä projekti sisältää `Calculator`-luokan, joka toimii yksinkertaisena laskurina MVC-mallin mukaisessa arkkitehtuurissa. Luokka pystyy lisäämään positiivisia kokonaislukuja sisäiseen muuttujaan, nollaamaan laskurin sekä palauttamaan nykyisen arvon. Negatiivisen luvun lisääminen aiheuttaa poikkeuksen, jotta laskuriin ei päädy virheellisiä arvoja.

GitHub Copilotia käytettiin luokan toteuttamisessa useilla eri tavoilla. Ensin kirjoitettiin metodien allekirjoitukset, ja Copilot ehdotti automaattisesti metodien runkoja, kuten tarkistuksia negatiivisille luvuille ja laskurin päivittämistä. Lisäksi kommenttien perusteella Copilot osasi tuottaa oikeanlaisia toteutuksia, mikä nopeutti kehitystyötä.

### GitHub Copilotin edut
- Nopeuttaa ohjelmointia tarjoamalla valmiita koodiehdotuksia.
- Vähentää rutiininomaista ja toistuvaa koodin kirjoittamista.
- Auttaa löytämään vaihtoehtoisia ratkaisuja ja rakenteita.
- Sopii hyvin yksinkertaisten metodien luonnosteluun.

### GitHub Copilotin haitat
- Ehdotukset eivät aina ole optimaalisia tai täysin oikein.
- Vaatii kehittäjältä tarkkaa arviointia ja validointia.
- Saattaa johtaa liialliseen riippuvuuteen työkalusta.
- Ei aina ymmärrä projektin laajempaa kontekstia.

### Yhteenveto
GitHub Copilot on hyödyllinen apuväline, joka nopeuttaa kehitystyötä ja vähentää rutiinikoodia. Sitä kannattaa kuitenkin käyttää kriittisesti ja varmistaa aina koodin oikeellisuus. Lopullinen vastuu koodin laadusta on aina kehittäjällä.
