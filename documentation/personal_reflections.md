# Inlämningsrapport

Information
OBS!!! Ändra absolut inte på rubrikerna i denna fil!!!!

## Inledning

### Vad handlar uppgiften om?
Uppgiften handlar om att skapa ett REST API i Java med Spring Boot för att hantera CRUD-operationer (Create, Read, Update, Delete) för 'Movie'-relaterade uppgifter. API:et ska även ha autentisering och dokumenteras med Swagger. Målet är att få praktisk erfarenhet av att utveckla och interagera med ett REST API, följa Clean Code-principer och använda en H2-databas för datalagring.
--- Skriv ovanför och ta inte bort denna raden ---

### Hur uppfattade du uppgiften initialt?
Initialt uppfattade jag uppgiften som en bra möjlighet att tillämpa mina kunskaper inom Java, Spring Boot och REST API-utveckling. Jag såg det som en chans att fördjupa min förståelse för autentisering, databasinteraktioner och dokumentation av API:er med Swagger. Samtidigt insåg jag att det kunde finnas utmaningar med att implementera alla CRUD-operationer och säkerställa att API:et följde Clean Code-principer.
--- Skriv ovanför och ta inte bort denna raden ---

## Planering och genomförande

### Hur planerade du att lösa uppgiften?
För att lösa uppgiften planerade jag att dela upp arbetet i flera steg. Först tänkte jag skapa en grundläggande struktur för applikationen med Spring Boot och definiera modeller och repositories för 'Movie'-uppgifterna. Sedan skulle jag implementera CRUD-operationerna i en service-klass och exponera dem via REST-endpoints. Därefter skulle jag lägga till autentisering och säkerställa att endast autentiserade användare kunde utföra vissa operationer. Slutligen skulle jag dokumentera API:et med Swagger och testa det manuellt med HTTP-anrop.
--- Skriv ovanför och ta inte bort denna raden ---

### Vilka steg tog du för att lösa uppgiften, skiljer sig ditt utförande från tidigare uppgifter?
Skapade en ny Spring Boot-applikation med nödvändiga dependencies.
Definierade modeller för 'Movie' och 'User' samt repositories för databasinteraktion.
Implementerade CRUD-operationerna i en service-klass enligt Clean Code-principer.
Exponerade CRUD-operationerna via REST-endpoints i en controller-klass.
Lade till autentisering med hjälp av Spring Security och JWT-tokens.
Konfigurerade Swagger för att generera API-dokumentation.
Testade API:et manuellt med HTTP-anrop och Swagger.
Refaktorerade och förfinade koden för att följa Clean Code-principer.
Mitt tillvägagångssätt skilde sig något från tidigare uppgifter, då jag den här gången lade mer fokus på att följa Clean Code-principer och använda en service-klass för att separera affärslogiken från controller-lagret. Jag ägnade också mer tid åt att konfigurera autentisering och dokumentera API:et med Swagger.
--- Skriv ovanför och ta inte bort denna raden ---

## Utmaningar och lösningar

### Vilka utmaningar stötte du på under projektet?
En av de största utmaningarna var att implementera autentisering på ett säkert och effektivt sätt. Jag behövde säkerställa att endast autentiserade användare kunde utföra vissa operationer och att lösenord lagrades på ett säkert sätt. En annan utmaning var att följa Clean Code-principerna konsekvent genom hela projektet och hålla koden läsbar och underhållbar.
--- Skriv ovanför och ta inte bort denna raden ---

### Hur löste du dessa utmaningar?
För att lösa utmaningen med autentisering använde jag Spring Security och JWT-tokens. Jag konfigurerade säkerhetsinställningarna för att kräva autentisering för vissa endpoints och implementerade en anpassad UserDetailsService för att hämta användarinformation från databasen. Jag använde också BCrypt för att hasha lösenord innan de lagrades. För att följa Clean Code-principerna refaktorerade jag kontinuerligt koden, extraherade metoder och klasser när det behövdes och såg till att hålla metoderna små och fokuserade.
--- Skriv ovanför och ta inte bort denna raden ---

## Reflektion och utvärdering

### Vad lärde du dig genom att genomföra projektet?
Genom att genomföra det här projektet fick jag en djupare förståelse för hur man skapar ett säkert och väldokumenterat REST API med Spring Boot. Jag lärde mig hur man implementerar CRUD-operationer, hanterar databasinteraktioner med repositories och säkrar API:et med autentisering och auktorisering. Jag fick också praktisk erfarenhet av att följa Clean Code-principer och använda Swagger för att dokumentera API:et. Dessutom förbättrade projektet min förmåga att strukturera och organisera kod på ett effektivt sätt.
--- Skriv ovanför och ta inte bort denna raden ---

### Vilka möjligheter ser du för framtida projekt baserat på denna erfarenhet?
Erfarenheten från detta projekt öppnar upp många möjligheter för framtida utveckling. Jag känner mig nu mer bekväm med att skapa REST API:er med Spring Boot och har en bättre förståelse för hur man hanterar säkerhet och dokumentation. Jag ser potential att tillämpa dessa kunskaper i mer komplexa projekt som involverar integration med externa system eller utveckling av större applikationer. Dessutom har jag fått en djupare uppskattning för vikten av Clean Code och hur det kan bidra till mer underhållbar och skalbar kod. I framtida projekt vill jag fortsätta att tillämpa dessa principer och utforska ytterligare designmönster och arkitekturella stilar för att skapa robusta och effektiva lösningar.
--- Skriv ovanför och ta inte bort denna raden ---
