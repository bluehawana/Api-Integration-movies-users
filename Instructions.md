# Överlämnings dokument

## Steg 1

- [ ] Kopiera förra veckans `code_only`-projekt till detta projekt.
- [ ] Byt tema från `Book` till `Movie`.
- [ ] Byt ut alla `Book`-referenser till `Movie` (enklast är att skapa nya klasser, modeller, dto och kontrollers).

Modellen kan se ut så här:

- [ ] Skapa en ny modell `Movie` med följande attribut:
    - [ ] `id` (Long)
    - [ ] `title` (String)
    - [ ] `director` (String)
    - [ ] `genre` (String)
    - [ ] `releaseYear` (int)
    - [ ] `rating` (double)

## Steg 2

- [ ] Skriv tester till de nya klasserna.
- [ ] Kan vi verifiera att Swagger fungerar som de ska med testerna?
    - [ ] Eller behöver vi tex använda Python?

## Steg 3 - Assignment (start på paketering)

- [ ] Kopiera code_only till en ny mapp som du döper till `assignment`.
- [ ] Starta testerna och se att de fungerar.
- [ ] Ersätt kod i funktioner med t.ex.:
    ```java
    private static String Something(String more) {
        // TODO: Implement function
        return null;
    }
    ```
- [ ] Verifiera i alla steg att testerna kan köras och att de failar (Alla kommer inte faila då vi även testar
  modeller).

## Steg 4 - Tests (`tests_code`)

- [ ] Flytta testerna till `tests_code`
- [ ] Kopiera över de filer som behövs:
    - [ ] `.mvn`
    - [ ] `mvnm`
    - [ ] `mvnm.cmd`
    - [ ] `pom.xml`

## Steg 5 - Kopiera över från föregående projekt

- [ ] Kopiera följande från roten:
    - [ ] `.gitlab-ci.yml` och uppdatera variabeln `PREFIX` till det `Ix` den ska ha.
- [ ] `documentation` mappen från föregående `assignment`.
- [ ] `tests_doc` mappen.
- [ ] `tests_pipeline` mappen.
    - [ ] Öppna python projektet `tests_pipeline` i PyCharm och:
        - [ ] Kopiera över filen `.gitlab-ci.yml`, ersätt den gamla.
        - [ ] Kör filen `print_hashes.py` som kommer printa den nya hashen till konsolen.
    - [ ] Uppdatera hashen i `test.py`, uppdatera variabeln `expected_checksum`.

## Steg 6 - Kopiera från rooten av detta projekt

- [ ] [`README.md`](README.md)
- [ ] [`requrements.md`](requirements.md)

## Klart för att testa mot GitLab
