# Plan para corregir la importación de librerías

El problema principal es que, aunque las librerías están definidas en el archivo `libs.versions.toml`, no se han agregado al bloque de `dependencies` en el archivo `app/build.gradle.kts`. Además, hay algunos errores de configuración y tipografía que impiden su correcto funcionamiento.

## Cambios Propuestos

### 1. Corregir `gradle/libs.versions.toml`
- Corregir el error tipográfico `hiltNavegation` a `hiltNavigation`.
- Agregar el plugin de Kotlin Android que falta.
- Asegurar que las versiones sean compatibles (especialmente KSP).

### 2. Actualizar `app/build.gradle.kts`
- Ajustar `compileSdk` y `targetSdk` a versiones estables (API 35).
- Aplicar los plugins de Hilt y KSP.
- Agregar las dependencias de Retrofit, Hilt, Moshi y Coil en el bloque `dependencies`.

### 3. Actualizar el archivo raíz `build.gradle.kts`
- Declarar los nuevos plugins (Hilt, KSP) para que estén disponibles en el proyecto.

## Plan de Verificación

### Pruebas Automatizadas
- Ejecutar `gradle sync` para asegurar que todas las dependencias se resuelven correctamente.
- Ejecutar `./gradlew assembleDebug` para verificar que el proyecto compila.

### Verificación Manual
- Comprobar que el autocompletado de las librerías (Retrofit, Hilt, etc.) funciona en los archivos Kotlin.
