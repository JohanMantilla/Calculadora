# Calculadora con Java y Maven 

Una aplicación de calculadora simple desarrollada en Java con Maven, que incluye operaciones matemáticas básicas y pruebas unitarias completas.

## 📋 Descripción

Este proyecto es una calculadora básica implementada en Java que proporciona operaciones matemáticas fundamentales como suma, resta y división. El proyecto está diseñado para demostrar buenas prácticas de desarrollo, incluyendo pruebas unitarias, manejo de dependencias con Maven y estructura de proyecto estándar.

## 🚀 Características

- **Operaciones matemáticas básicas**:
  - Suma de enteros
  - Resta de enteros
  - División con resultado decimal
- **Gestión de tiempo**: Función de timeout configurable
- **Arquitectura limpia**: Separación clara entre lógica y ejecución
- **Pruebas comprehensivas**: Incluye pruebas unitarias y pruebas parametrizadas

## 🛠️ Tecnologías Utilizadas

- **Java 8+**: Lenguaje de programación principal
- **Maven**: Gestión de dependencias y construcción del proyecto
- **JUnit 4.12**: Framework de pruebas unitarias
- **Mockito 2.23.4**: Framework de mocking para pruebas

## 📁 Estructura del Proyecto

```
sample-calculator-git/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── ec/edu/epn/git/calculator/
│   │           ├── Calculator.java
│   │           └── CalculatorExecute.java
│   └── test/
│       └── java/
│           └── ec/edu/epn/git/calculator/
│               ├── CalculatorTest.java
│               └── CalculatorParametersTest.java
├── target/
├── pom.xml
└── README.md
```

## ⚡ Instalación y Configuración

### Prerrequisitos

- Java JDK 8 o superior
- Maven 3.6 o superior
- Git

### Clonar el repositorio

```bash
git clone <url-del-repositorio>
cd sample-calculator-git
```

### Compilar el proyecto

```bash
mvn clean compile
```

### Ejecutar las pruebas

```bash
mvn test
```

### Generar el archivo JAR

```bash
mvn clean package
```

## 🏃‍♂️ Uso

### Ejecutar la aplicación

```bash
java -cp target/classes ec.edu.epn.git.calculator.CalculatorExecute
```

O utilizando Maven:

```bash
mvn exec:java -Dexec.mainClass="ec.edu.epn.git.calculator.CalculatorExecute"
```

### Uso programático

```java
Calculator calculator = new Calculator();

// Suma
int resultado = calculator.addition(4, 7); // Resultado: 11

// Resta
int diferencia = calculator.subtraction(10, 3); // Resultado: 7

// División
double cociente = calculator.division(8, 2); // Resultado: 4.0

// Timeout (pausa en milisegundos)
calculator.timeout(1000); // Pausa 1 segundo
```

## 🧪 Pruebas

El proyecto incluye dos tipos de pruebas:

### Pruebas Unitarias Básicas (`CalculatorTest.java`)

- Prueba de suma con dos enteros
- Prueba de resta con dos enteros
- Prueba de división por cero (espera `ArithmeticException`)
- Prueba de timeout con límite de tiempo

### Pruebas Parametrizadas (`CalculatorParametersTest.java`)

Ejecuta múltiples casos de prueba para la función de suma con diferentes combinaciones de parámetros:
- (2, 4) → 6
- (1, 8) → 9
- (2, 5) → 7
- (7, 3) → 10
- (22, 4) → 26
- (12, 14) → 26

### Ejecutar pruebas específicas

```bash
# Ejecutar todas las pruebas
mvn test

# Ejecutar solo las pruebas básicas
mvn test -Dtest=CalculatorTest

# Ejecutar solo las pruebas parametrizadas
mvn test -Dtest=CalculatorParametersTest
```

## 📊 Resultados de Pruebas

Los resultados de las pruebas se generan en:
- `target/surefire-reports/` - Reportes detallados en formato XML y TXT

Ejemplo de salida de pruebas exitosas:
```
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
```

## 👥 Equipo de Desarrollo

**Grupo 4 - Escuela Politécnica Nacional:**
- Erick Cabezas
- Johan Mantilla
- Sebastian Moyano
- Christopher Zambrano

## 🤝 Contribuir

1. Haz fork del proyecto
2. Crea una rama para tu feature (`git checkout -b feature/nueva-funcionalidad`)
3. Confirma tus cambios (`git commit -am 'Agrega nueva funcionalidad'`)
4. Sube la rama (`git push origin feature/nueva-funcionalidad`)
5. Abre un Pull Request

## 📝 Historial de Versiones

- **v1.0-SNAPSHOT**: Versión inicial con operaciones básicas y pruebas unitarias

## ⚠️ Notas Importantes

- La función `division()` realiza división entera cuando se utilizan parámetros enteros
- El método `timeout()` utiliza `Thread.sleep()` y puede lanzar `InterruptedException`
- Las pruebas incluyen validación de excepciones y límites de tiempo

## 📄 Licencia

Este proyecto es parte de un ejercicio académico de la Escuela Politécnica Nacional.

---

**Escuela Politécnica Nacional** - Proyecto de Calculadora con Git y Maven
