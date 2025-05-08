# 🎟️ Sistema de Emisión de Credenciales para Eventos

### Estudiante
- David Caceres – Patrones de Diseño
#
Este proyecto implementa un sistema de emisión de credenciales personalizadas para asistentes a un evento, utilizando los patrones de diseño **Prototype** y **Singleton**.
## 🚀 Cómo ejecutar
1. Clonar el repositorio:

```bash
git clone https://github.com/usuario/repositorio.git
cd repositorio
```
## 🧬 Patrones de Diseño – Aplicación

### 🧬 Patrón Prototype

El patrón **Prototype** se aplica en la clase `CredencialEvento`, que hereda de la clase `Credencial` y permite clonar credenciales base para generar nuevas instancias con distintos datos.

- La clase implementa el método `clonar()` que realiza una **copia profunda (deep copy)**.
- Esto permite duplicar una plantilla de credencial sin crear una nueva manualmente.

#### 🔁 Ejemplo de uso:

```java
Credencial base = new CredencialEvento();
base.setDatos("Plantilla", "Invitado", "12345678-9");

Credencial clon = base.clonar();
clon.setDatos("Tulio", "Expositor", "11222333-4");
```
### 🔒 Patrón Singleton
El patrón Singleton se implementa en la clase CredencialManager, que almacena y gestiona todas las credenciales del evento.

Contiene una instancia privada estática de sí misma.
El constructor es privado para evitar instancias externas.
Se accede globalmente mediante getInstancia().

🔁 Ejemplo de uso:


```java
CredencialManager gestor = CredencialManager.getInstancia();
gestor.agregarCredencial(clon);
gestor.mostrarCredenciales();
```

## 🖥️ Menú por consola
```java
1. Generar una Credencial
2. Ver Credenciales generadas
0. Salir
```
## 📊 Diagrama de Clases (UML)
![image](https://github.com/user-attachments/assets/ac7e4217-dc09-4782-84f9-47753ab5e126)
## 📸 Captura del sistema funcionando
![image](https://github.com/user-attachments/assets/2f57a9af-7c9f-4568-9658-733aa8296b73)

![image](https://github.com/user-attachments/assets/442d8f0d-cb2b-45ca-b1b2-f0fe60aae540)


