package com.example.bot;

import de.aschallenberg.botclient.bot.Bot;
import de.aschallenberg.botclient.data.BotData;

import java.util.Map;

/*
 * Deine Hauptklasse muss von Bot erben und einige Methoden des Bots implementieren.
 * Die Klasse Bot stellt dir direkt einige Funktionen bereit.
 *
 * Der jsonObjectMapper ist ein Jackson ObjectMapper, der dir hilft, aus Objekte im JSON-Format zu serialisieren und
 * deserialisieren.
 *
 * getMyBotData() gibt dir verschiedene Informationen über deinen Bot.
 *
 * getGameData() gibt dir verschiedene Informationen über das Spiel wie z.B. das Modul und die Version, welche gespielt werden.
 * Außerdem bekommst du dort Informationen über alle Bots, die an dem Spiel teilnehmen.
 */
public class MeinBot extends Bot {
	@Override
	public void onGameStart() {
		/* Wenn eine Lobby voll ist und gestartet wird, dann wird diese Methode aufgerufen. Nutze sie, um deinen Bot zu
		 * initiieren. Falls dein Bot mehrere Versionen und Module unterstützt, kannst du dies hier berücksichtigen.
		 */
	}

	@Override
	public void onMove(final Object o) {
		/*
		 * Normalerweise wird hier ein Spielzug von dir ausgeführt. Was genau dieses Object ist, welches du übergeben
		 * bekommst und was du zurücksenden musst, steht in dem Spielablauf auf der Plattform.
		 */
	}

	@Override
	public void onMessageReceived(final Object o) {
		/*
		 * Hier werden Spieldaten empfangen, die unabhängig von einem Spielzug losgesendet werden (z.B. das
		 * aktualisierte Spielfeld, nachdem und bevor andere Bots am Zug sind).
		 */
	}

	@Override
	public void onGameFinished(final Map<BotData, Integer> map) {
		/*
		 * Wenn das Spiel regelkonform beendet wurde, erhältst du hier die Scores als Map. Zu jedem teilnehmendem Bot
		 * gibt es einen Integer-Wert, der sagt, wie viele Punkte der Bot erreicht hat. Der Bot mit den meisten Punkten
		 * hat gewonnen.
		 */
	}

	@Override
	public void resetBot() {
		/*
		 * Hier musst du Logik implementieren, die deinen Bot zurücksetzt, sodass er wieder in ein neues Spiel starten
		 * kann. Normalerweise passiert dies nur am Ende eines Spiels, kann aber auch passieren, falls Fehler auftreten.
		 */
	}
}
