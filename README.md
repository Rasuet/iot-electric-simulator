# IoT Electric Simulator ⚡

### Descripción
Este proyecto es un simulador de **Smart Metering** desarrollado en **Java y Spring Boot**. Nace de mi perfil híbrido como **Oficial Electricista** 
y **Desarrollador de Software (DAM)**. El objetivo es demostrar cómo aplicar la lógica de ingeniería eléctrica al desarrollo de soluciones de **IoT y Edge Computing**.

### Lógica del Proyecto
A diferencia de otros simuladores, este proyecto utiliza principios físicos reales:
* **Generación de datos**: Simula fluctuaciones de voltaje según la normativa española (230V +/- 7%).
* **Cálculo de Potencia**: Aplica la fórmula $P = V \cdot I \cdot \cos(\phi)$, considerando un factor de potencia de 0.9.
* **Arquitectura**: Basado en una API REST para facilitar la integración con plataformas Cloud o sistemas de monitorización industrial.

### Tecnologías utilizadas
* **Lenguaje**: Java 17+
* **Framework**: Spring Boot 3.x
* **Herramientas**: Maven, Git y github
