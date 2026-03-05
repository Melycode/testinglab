# Reto de Programación: La Batalla por la Tierra Media

¡La Tierra Media está en guerra! En ella lucharán razas leales a **Sauron** contra otras **bondadosas** que no quieren que el mal reine sobre sus tierras.

## Requerimientos del Programa

Crea un programa en **Java** que calcule el resultado de la batalla entre los dos tipos de ejércitos basándose en las siguientes reglas:

### 1. Valoración de Razas
Cada raza tiene asociado un "valor" entre **1 y 5**:

* **Razas Bondadosas:**
    * Pelosos (1)
    * Sureños buenos (2)
    * Enanos (3)
    * Númenóreanos (4)
    * Elfos (5)

* **Razas Malvadas:**
    * Sureños malos (2)
    * Orcos (2)
    * Goblins (2)
    * Huargos (3)
    * Trolls (5)

### 2. Lógica de Cálculo
* El resultado se determina mediante la **suma del valor total** del ejército (valor de la raza multiplicado por el número de integrantes).
* Cada ejército puede estar compuesto por un **número de integrantes variable** de cada raza.

### 3. Posibles Resultados
El programa debe imprimir si:
1.  Gana el **Bien**.
2.  Gana el **Mal**.
3.  Existe un **Empate**.

---

## 💡 Ejemplos de Referencia
* **1 Peloso (1)** pierde contra **1 Orco (2)**.
* **2 Pelosos (2)** empatan contra **1 Orco (2)**.
* **3 Pelosos (3)** ganan a **1 Orco (2)**.
