package com.progetto.ingsw.progettotruckscout24.Database;

import com.progetto.ingsw.progettotruckscout24.Model.Prenotazione;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

/**
 * il Pattern Proxy è utile per gestire l'accesso alle prenotazioni in base al tipo di utente (in questo caso io ho Admin o Utente).
 *
 * Responsabilità:
 * - verifico ilo tipo di utente autenticato, Delega le chiamate appropriate a DBConnessione
 * - Fornisce un'interfaccia unificata per l'accesso alle prenotazioni e Gestisce inserimento, lettura e cancellazione prenotazioni
 */

public class ProxyPrenotazione {
    private static ProxyPrenotazione instance = null;
    private final DBConnessione dbConnessione;
    private final Authenticazione authenticazione;

    private ProxyPrenotazione() {
        this.dbConnessione = DBConnessione.getInstance();
        this.authenticazione = Authenticazione.getInstance();
    }

    public static ProxyPrenotazione getInstance() {
        if (instance == null) {
            instance = new ProxyPrenotazione();
        }
        return instance;
    }

    public CompletableFuture<ArrayList<Prenotazione>> getPrenotazioni() {
        if (authenticazione.isAdmin()) {
            return dbConnessione.getPrenotazioniAdmin();
        } else {
            String userEmail = authenticazione.getUser().email();
            return dbConnessione.getPrenotazione(userEmail);
        }
    }

    public void insertPrenotazione(String userEmail, String nomeCamion, int giorno, int mese, int anno) {
        dbConnessione.insertPrenotazioneIntoDB(userEmail, nomeCamion, giorno, mese, anno);
    }

    public void removePrenotazione(String nomeCamion, String idUtente) {
        dbConnessione.removeSelectedPrenotazioniItem(nomeCamion, idUtente);
    }

}
