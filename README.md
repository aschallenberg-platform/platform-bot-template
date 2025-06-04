# Platform Bot Template

Dies ist ein Template zu Erstellung eines Bots für die Plattform. Benutze es um einen Bot für ein Spiel zu entwickeln.

## Installation
Um dieses Template zu benutzen können Sie es über die Knopf "Code" einfach als ZIP herunterladen oder das Repository clonen. 
Mittels Maven müssen dann alle Abhängigkeiten installiert werden. Navigieren Sie dazu in den Ordner BotTemplate und geben Sie
```
mvn package
```
in die Kommandozeile ein.
Eine Anleitung zur Installation von Maven ist hier zu finden: https://maven.apache.org/install.html
Anschließend kann das Projekt mit einem beliebigen Editor bearbeitet werden. 

### Fehlerbehebung 
Falls es zu Fehlern kommt, versuchen Sie die Projektspezifischen Dependencies manuell zu installieren.
Laden Sie sich zunächst die Communication Library (https://github.com/aschallenberg-platform/platform-communication-library-java) herunter. Führen Sie in dem Ordner der Bibliothek, in dem die pom.xml liegt, folgendes in der Kommandozeile aus:
```
mvn install
```
Wiederholen Sie diesen Schritt dann mit der Bot Library (https://github.com/aschallenberg-platform/platform-bot-library).

Versuchen Sie anschließend erneut das Template zu installieren.

## Anfangen den Bot zu schreiben

Sie benötigen primär drei Dinge um einen Bot zu schreiben: eine main-Methode, eine (Haupt-)Klasse für Ihren Bot und eine
config-Datei. In diesem Template bestehen diese bereits und können einfach angepasst werden

## config-Datei
Die config Datei `config.properties` muss sich in `src/main/resources` befinden. Sie muss folgendes beinhalten:
```
platform.host=<IP-Adresse der Platform zu der Sie sich verbinden möchten>
platform.port=<Port der Plattform zu der Sie sich verbinden möchten>
platform.bot.token=<Der Bot-Token, den Sie von der Bot-Registrierung auf der Plattform bekommen>
```

## (Haupt-)Klasse
Die Hauptklasse des Bots muss von `de.aschallenberg.botclient.bot.Bot` erben. Sie werden in ihr einige
Methoden implementieren müssen. Diese sind die Schnittstelle zur Plattform und zum Spiel was Sie spielen möchten.

## main-Methode
Ihr Programm benötigt eine main-Methode. Sie ist hier in einer eigenen Klasse `Main` angelegt, Sie können sie
aber auch überall anders implementieren. Zunächst muss die Konfigurations-Datei geladen werden. Dies geschieht mit `ConfigLoader.load(args)`. Wichtig ist auch, dass die Hauptklasse registriert wird. Dazu ist die Zeile
`BotRegistry.setBotClass(MeinBot.class)`. **Danach** muss die Library dazu aufgefordert werden, eine WebSocket-
Verbindung zur Plattform aufzubauen. Dies funktioniert mit dem Befehl `WebSocketInitiator.initConnection()`.
Die main- Methode sieht im Template in etwa so aussehen:
```java
public static void main(String[] args) {
  ConfigLoader.load(args);
	BotRegistry.setBotClass(MeinBot.class);
	WebSocketInitiator.initConnection();
}
```

Wenn Sie alle drei Komponenten haben und sie korrekt konfiguriert haben, dann sollte der Bot beim Starten eine WebSocket-
Verbindung zur Plattform aufbauen und sich dort registrieren. Sie sollten dann in der Konsole etwas sehen wie
"Successfully registered". Der Bot ist nun online und Sie können mit ihm theoretisch in Lobbies beitreten und die 
vorgesehenen Spiele spielen. Jedoch wird das zu Fehlern führen, da Sie ihn bis jetzt noch nicht implementiert haben.

## Implementierung
Die vom `Bot` überschriebenen Methoden müssen Sie jetzt implementieren. Je nach Spiel müssen Sie mehr oder weniger Methoden
implementieren. Den Rest können Sie einfach leer lassen. Bitte beachten Sie genau auf die Implementierungsangaben des Spiels.
Ein falscher Typ der gesendet wird, kann im schlimmsten Fall zum Spielabbruch führen.



## Anfangen, den Bot zu schreiben

Sie benötigen primär drei Dinge, um einen Bot zu schreiben: eine `main`-Methode, eine (Haupt-)Klasse für Ihren Bot und eine Konfigurationsdatei. In diesem Template sind diese bereits vorprogrammiert.

## Konfigurationsdatei  
Die Konfigurationsdatei `config.properties` muss sich in `src/main/resources` befinden. Sie muss Folgendes beinhalten:

```
platform.host=<IP-Adresse der Plattform, zu der Sie sich verbinden möchten>
platform.port=<Port der Plattform, zu der Sie sich verbinden möchten>
platform.bot.token=<Der Bot-Token, den Sie von der Bot-Registrierung auf der Plattform erhalten>
```

## (Haupt-)Klasse  
Die Hauptklasse erbt von `de.aschallenberg.botclient.bot.Bot`.  
Sie werden hier einige Methoden implementieren müssen. Diese sind die Schnittstelle zur Plattform und zu dem Spiel, das Sie spielen möchten.

## Main-Methode  
Ihr Programm benötigt eine `main`-Methode. In diesem Template ist sie in einer eigenen Klasse `Main`. Sie können sie jedoch auch an anderer Stelle implementieren. Zunächst muss die Konfigurations-Datei geladen werden. Dies geschieht mit

```java
ConfigLoader.load(args);

```
Wichtig ist auch, dass eine Hauptklasse registiert ist. Das geschieht mit:

```java
BotRegistry.setBotClass(MeinBot.class);
```

**Danach** wird die Library dazu aufgefordert, eine WebSocket-Verbindung zur Plattform aufzubauen. Dies funktioniert mit dem Befehl:

```java
WebSocketInitiator.initConnection();
```

Die `main`-Methode sieht im Template in etwa so aus:

```java
public static void main(String[] args) {
    ConfigLoader.load(args);
    BotRegistry.setBotClass(MeinBot.class);
    WebSocketInitiator.initConnection();
}
```

Wenn Sie alle drei Komponenten haben und diese korrekt konfiguriert sind, sollte der Bot beim Starten eine WebSocket-Verbindung zur Plattform aufbauen und sich dort registrieren. Sie sollten dann in der Konsole etwas sehen wie  
„Successfully registered“. Der Bot ist nun online und Sie können mit ihm theoretisch Lobbies beitreten und die vorgesehenen Spiele spielen.  
Jedoch wird das zu Fehlern führen, da Sie ihn bis jetzt noch nicht implementiert haben.

## Implementierung  
Die vom `Bot` überschriebenen Methoden müssen Sie nun implementieren. Je nach Spiel müssen Sie mehr oder weniger Methoden implementieren. Den Rest können Sie einfach leer lassen.  
Bitte beachten Sie genau die Implementierungsangaben des Spiels. Ein falscher Typ, der gesendet wird, kann im schlimmsten Fall zum Spielabbruch führen.

