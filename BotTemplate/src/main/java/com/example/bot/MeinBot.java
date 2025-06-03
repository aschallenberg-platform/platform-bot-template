package com.example.bot;

import de.aschallenberg.botclient.bot.Bot;
import de.aschallenberg.communication.dto.BotData;
import de.aschallenberg.communication.messages.Payload;

import java.util.Map;

/**
 * <p>
 *     Deine Hauptklasse muss von Bot erben und einige Methoden des Bots implementieren.
 *     Die Klasse Bot stellt dir direkt einige Funktionen bereit.
 * </p>
 * <p>
 *     Der {@link Bot#jsonObjectMapper} ist ein Jackson ObjectMapper, der dir hilft, aus Objekte im JSON-Format zu
 *     serialisieren und deserialisieren.
 * </p>
 * <p>
 *     {@link Bot#getMyBotData()} gibt dir Informationen über deinen Bot zurück. Diese beinhalten den Namen deines Bots
 *     und den Nutzernamen des Besitzers (also dein Nutzername).
 *     {@link Bot#getGameData()} gibt dir Informationen über das aktuelle Spiel zurück (z.B. Modul und Version).
 * </p>
 * <p>
 *     Es gibt verschiedene Möglichkeiten, Nachrichten zu versenden.
 *     Mit {@link Bot#sendMove(Object)} sendest du eine Spielzug an das Spiel.
 *     {@link Bot#sendGameUpdate(Object)} erlaubt dir, Informationen zum Spiel zu versenden, die kein Spielzug sind.
 *     Mit {@link Bot#sendOtherMessage(Payload)} kannst du andere Nachrichten versenden.
 *     Achte genau auf die Vorgaben, die dir das Spiel auf der Plattform gibt. Verwende
 *     {@link Bot#sendOtherMessage(Payload)} nur, wenn dies explizit gefordert wird.
 * </p>
 * <p>
 *     Außerdem stehen Methoden bereit, die ein Standardverhalten haben und die du überschreiben kannst, um deren
 *     Verhalten zu erweitern oder zu ersetzen.
 *     In {@link Bot#onGameUpdateReceived(Object)} werden Spielupdate-Nachrichten empfangen. Ob du diese Methode
 *     brauchst, entschiedet das Spiel. Wenn das Spiel nichts explizites angibt, brauchst du sie nicht.
 *     {@link Bot#onOtherMessageReceived(Payload)} empfängt alle anderen Nachrichten. Auch die brauchst du nur, wenn
 *     das Spiel es explizit angibt.
 *     Mit {@link Bot#onError(String)} kannst du auf Fehler reagieren. Falls sich dein Bot falsch verhält, bekommt er
 *     einen Error. Standardmäßig wird der Fehler dann in der Konsole ausgegeben und das Bot-Programm wird beendet.
 *     {@link Bot#onGameInterrupt()} wird ausgelöst, wenn das Spiel aus irgendeinem Grund abgebrochen wird.
 *     Standardmäßig wird der Bot dann einfach resettet.
 *     {@link Bot#onBotDisconnected(BotData)} brauchst du, wenn du wissen möchtest, ob ein teilnehmender Bot
 *     disconnected ist. Normalerweise ist das überflüssig.
 *     Wird ein Bot vom Spiel disqualifiziert, wird die Methode {@link Bot#onDisqualify(BotData)} getriggert.
 *     Standardmäßig überprüft die Methode, ob du disqualifiziert wurdest oder nicht und gibt dementsprechend eine
 *     Nachricht in der Konsole aus.
 * </p>
 */
public class MeinBot extends Bot {

	/**
	 * Wenn eine Lobby voll ist und gestartet wird, dann wird diese Methode aufgerufen. Nutze sie, um deinen Bot zu
	 * initiieren. Falls dein Bot mehrere Versionen und Module unterstützt, kannst du dies hier berücksichtigen.
	 */
	@Override
	public void onGameStart() {
		// TODO implement
	}

	/**
	 * Normalerweise wird hier ein Spielzug von dir ausgeführt. Was genau dieses Object ist, welches du übergeben
	 * bekommst und was du zurücksenden musst, steht in dem Spielablauf auf der Plattform.
	 *
	 * @param payload das empfangende Spielzug-Objekt des Spiels.
	 */
	@Override
	public void onMoveReceived(final Object payload) {
		// TODO implement
	}

	/**
	 * Wenn das Spiel regelkonform beendet wurde, erhältst du hier die Scores als Map. Zu jedem teilnehmendem Bot
	 * gibt es einen Integer-Wert, der sagt, wie viele Punkte der Bot erreicht hat. Der Bot mit den meisten Punkten
	 * hat gewonnen.
	 *
	 * @param scores die Scores des Spiels. Als Keys die teilnehmenden Bots und als Value die jeweilige Punktzahl.
	 */
	@Override
	public void onGameFinished(final Map<BotData, Integer> scores) {
		// TODO implement
	}

	/**
	 * Hier musst du Logik implementieren, die deinen Bot zurücksetzt, sodass er wieder in ein neues Spiel starten
	 * kann. Normalerweise passiert dies nur am Ende eines Spiels, kann aber auch passieren, falls Fehler auftreten.
	 */
	@Override
	public void resetBot() {
		// TODO implement
	}
}
