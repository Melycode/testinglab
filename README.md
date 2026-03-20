# Middle-Earth Battle
---
Java project that simulates battles between the forces of good and evil in Middle-Earth. Each race has a strength value between 1 and 5. The total strength is calculated by multiplying that value by the number of members, and the program determines whether kind wins, evil wins, or there is a draw.

--- 
## Class
 
The class `MiddleEarthBattle` was created defining the members of the good and evil armies and their strength values using two `HashMap` instances declared as `Map` to follow the good practice of programming to interfaces.
 
## Races & Strength Values

| Kind Races       | Value | Evil Races     | Value |
|------------------|-------|----------------|-------|
| Pelosos          | 1     | Sureños malos  | 2     |
| Sureños buenos   | 2     | Orcos          | 2     |
| Enanos           | 3     | Goblins        | 2     |
| Númenóreanos     | 4     | Huargos        | 3     |
| Elfos            | 5     | Trolls         | 5     |

---
 
## Core Methods
 
| Method | Description |
|--------|-------------|
| `calculateStrength(Map battle, Map army)` | Calculates total strength by multiplying members by race value. Throws `IllegalArgumentException` for invalid races. |
| `calculateResult(int kindPoints, int evilPoints)` | Compares both scores and returns `"kind wins to"`, `"evil wins to"`, or `"draw"`. |
| `battleForTheMiddleEarth(Map kindBattle, Map evilBattle)` | Orchestrates the full battle, prints and returns the formatted result. |
 
---
 
## Tests
 
6 JUnit 5 tests covering the main scenarios:
 
| Assertion | Scenario |
|-----------|----------|
| `assertEquals` | 4 Númenóreanos have a strength of 16 |
| `assertEquals` | Evil army with more points wins |
| `assertEquals` | 5 Elfos have a strength of 25 |
| `assertTrue` | 3 Enanos draw against 3 Huargos |
| `assertFalse` | 1 Peloso does not beat 2 Sureños malos |
| `assertThrows` | Exception thrown for an invalid race (`"Invalid race"`) |
 
---
 
## Example Battles
 
```
Battle 1: 4 Númenóreanos (16) vs 2 Orcos (4)      → Kind wins
Battle 2: 2 Sureños buenos (4) vs 5 Trolls (25)    → Evil wins
Battle 3: 5 Elfos (25) vs 5 Goblins (10)           → Kind wins
Battle 4: 1 Peloso (1) vs 2 Sureños malos (4)      → Evil wins
Battle 5: 3 Enanos (9) vs 3 Huargos (9)            → Draw
```
 
---
 
## How to Run
 
```bash
git clone https://github.com/Melycode/middle-earth-battle.git
cd middle-earth-battle
```
 
```bash
mvn compile
mvn exec:java -Dexec.mainClass="testinglab.MiddleEarthBattle"
```
 
```bash
mvn test
```
 
> Requires Java 17+ and Maven 3.6+
