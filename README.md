# Nachhilfe
Hier kommt der ganze Nachhilfe-Kram rein; sowohl Java-Programme, als auch Arbeitsmaterial.

---
# WICHTIG
Keine privaten Sachen posten! Das Repo ist öffentlich und damit für **jeden** frei einsehbar.

# Infos für die Schüler
## Herunterladen des Repositories
Ihr habt 2 Möglichkeiten: 
1. Ihr ladet das Repository jedes mal neu runter, um den neuesten Stand zu bekommen (**nicht empfohlen**, da umständlich)
2. Ihr installiert [Git](https://git-scm.com/downloads). Mehr dazu im nächsten Abschnitt.

## Git
### Installation
Einfach auf der [Website](https://git-scm.com/downloads) runterladen und installieren. Bitte die Installation mit uns
in der Nachhilfe machen, damit wir euch sagen können, wo ihr überall Haken setzen müsst.
### Verwendung
Ihr werdet die Kommandozeile hierfür brauchen. Das mag für euch auf den ersten Blick unangenehm sein, allerdings wird 
hier alles so genau wie möglich erklärt, um es für euch leicht zu machen.

Euren eigenen Code bitte unbedingt in den Ordner namens `Eigenes` packen. Hier könnt ihr auch so viele Untermodule
erstellen, wie ihr wollt; hauptsache ihr bearbeitet keinen Code, der nicht in diesem Ordner liegt. Der andere Code 
dient euch lediglich als Grundlage zur Orientierung und dazu, was wir in der Nachhilfe gemacht haben.
### Eclipse
#### Kopieren des Workspaces (Git Clone)
Damit das alles funktioniert, müsst ihr den Workspace zwingend erstmal kopieren. Dazu sucht ihr euch einen Ordner auf
eurem PC, den ihr angemessen findet (z.B. da wo eure anderen Projekte liegen, oder in euren Dokumenten).

Öffnet den Ordner wie gewohnt,
[klickt oben in die Leiste](https://www.tenforums.com/attachments/tutorials/231768d1556290902-show-full-path-address-bar-file-explorer-windows-10-a-file_explorer_address_bar-2.jpg) 
und kopiert die Adresse raus `(Strg + C)`. Nun öffnet ihr die Kommandozeile (Windowstaste drücken und `cmd` eingeben)
und schreibt folgenden Befehl rein:
```bash
cd <Pfad, den ihr vorher kopiert habt>
```
wobei ihr `<Pfad, den ihr vorher kopiert habt>` mit dem kopierten Pfad ersetzt, was dann z.B. so aussieht:
```bash
cd C:\Users\Desktop
```

Um nun das Git-Repository hierher zu kopieren ("klonen") gebt ihr folgenden Befehl in die Kommandozeile ein:
```bash
git clone https://github.com/xEmkayx/Nachhilfe
cd Nachhilfe
```

Und fertig ist der Turnschuh.

#### Up to date bleiben
Das was hier beschrieben ist, solltet ihr bestenfalls immer zu Beginn des Nachhilfeunterrichts machen.

Wenn ihr Eclipse startet, könnt ihr euren Workspace auswählen. Normalerweise ist der Pfad eures letzten Workspaces
drinnen. Wählt allerdings auf jeden Fall den aus, der mit diesem Git Repository zusammenhängt (Tipp: der Ordner 
heißt "Nachhilfe") **aber öffnet ihn noch nicht!**

Kopiert den Pfad aus der Zeile raus `(Strg + C)`. Öffnet die Kommandozeile und gebt folgendes ein:
```bash
cd <Pfad zum Ordner des Git Repositories>
```
Anstatt `<Pfad zum Ordner des Git Repositories>`, kopiert ihr den Pfad hier hinein `(Strg + V)`.

Wichtig ist, wie gesagt, dass der Ordner "Nachhilfe" heißt!

Wenn in der Kommandozeile nun so etwas wie
```bash
C:\Users\...\Nachhilfe>
```
steht, seid ihr im richtigen Ordner. Nun gebt ihr folgendes ein:

```bash
git pull
```

und fertig ist der Lachs.

---
### IntelliJ
#### Kopieren des Workspaces (Git Clone)
Hier müsst ihr, wie oben beschrieben, erst einmal das Git Repository klonen. Das geht in IntelliJ allerdings viel 
leichter: Ihr klickt oben auf 

`File > New > Project from Source Control`

und gebt den Link des Repositories ein: https://github.com/xEmkayx/Nachhilfe

#### Up to date bleiben
Das was hier beschrieben ist, solltet ihr bestenfalls immer zu Beginn des Nachhilfeunterrichts machen.

Ganz oben rechts steht `Git:`, gefolgt von ein paar Pfeilen. Ihr drückt den blauen Pfeil, und klickt auf `Ok`, um auf 
das Projekt auf den neuesten Stand zu bringen.

---
# Ordnung (für Kollaborateure)
Bitte die Ordner nach Möglichkeit nach Datum sortieren, damit die Arbeit für jeden leichter nachvollziehbar ist.
Bestenfalls:
```txt
Monat.<Tag als String><Tag im Monat>
```
