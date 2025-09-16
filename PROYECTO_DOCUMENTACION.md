# EcoCiudad - Aplicación Android para Gestión Sostenible de Residuos

## Descripción del Proyecto

EcoCiudad es una aplicación Android desarrollada para ayudar a los ciudadanos a gestionar sus residuos de forma responsable y fomentar el reciclaje. Esta aplicación incluye funcionalidades para recordar días de recolección, encontrar puntos de reciclaje y llevar un registro de actividades de reciclaje.

## Estructura del Proyecto

### Actividades Principales

1. **MainActivity** - Pantalla principal con navegación
2. **CalendarActivity** - Calendario de recolección de residuos
3. **MapActivity** - Puntos de reciclaje cercanos
4. **StatsActivity** - Estadísticas personales de reciclaje

### Características Implementadas

#### Fase 1: Configuración y "Hola Mundo"
- ✅ Proyecto Android completo con estructura estándar
- ✅ MainActivity con layout activity_main.xml
- ✅ Configuración de strings.xml para localización
- ✅ Saludo de bienvenida "Bienvenido a Eco-Ciudad"

#### Fase 2: Diseño de Interfaz Principal
- ✅ Layout con ConstraintLayout para responsive design
- ✅ Tres botones de navegación principales
- ✅ Estilo personalizado EcoButton con tema verde eco-friendly
- ✅ Tipografía y colores consistentes

#### Fase 3: Navegación entre Actividades
- ✅ Cuatro actividades completamente implementadas
- ✅ AndroidManifest.xml configurado con relaciones padre-hijo
- ✅ Navegación con Intent explícito
- ✅ Botón "Atrás" automático en barra de aplicación

#### Fase 4: Lógica de Negocio
- ✅ Contador de bolsas recicladas en StatsActivity
- ✅ OnClickListener para incrementar contador
- ✅ Gestión del ciclo de vida con onSaveInstanceState
- ✅ Persistencia de estado en rotaciones de pantalla

#### Fase 5: Depuración y Pruebas
- ✅ Logging completo en todos los métodos del ciclo de vida
- ✅ Puntos de interrupción preparados para depuración
- ✅ Tags de debugging únicos por actividad

## Arquitectura de la Aplicación

### Recursos (res/)
- **layout/**: Interfaces de usuario XML
- **values/**: Strings, colores, estilos
- **mipmap/**: Iconos de la aplicación
- **drawable/**: Recursos gráficos

### Características Técnicas

#### Gestión de Estado
```java
@Override
protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putInt(KEY_RECYCLE_COUNT, recycleCount);
    Log.d(TAG, "onSaveInstanceState called - saving count: " + recycleCount);
}
```

#### Navegación
```java
public void openStats(View view) {
    Intent intent = new Intent(this, StatsActivity.class);
    startActivity(intent);
}
```

#### Logging para Depuración
```java
Log.d(TAG, "Add bag button clicked - count before: " + recycleCount);
recycleCount++;
Log.d(TAG, "Add bag button clicked - count after: " + recycleCount);
```

## Cómo Ejecutar el Proyecto

### Requisitos
- Android Studio Arctic Fox o superior
- Android SDK nivel 21 (Android 5.0) o superior
- Dispositivo Android o emulador

### Pasos de Instalación
1. Abrir Android Studio
2. Seleccionar "Open an Existing Project"
3. Navegar hasta la carpeta del proyecto
4. Esperar a que Gradle sincronice las dependencias
5. Ejecutar en dispositivo o emulador

### Testing y Depuración

#### Verificar Ciclo de Vida
1. Ir a StatsActivity
2. Observar Logcat con filtro "StatsActivity"
3. Rotar dispositivo para ver onSaveInstanceState/onCreate
4. Navegar entre actividades para ver todos los métodos

#### Verificar Funcionalidad de Contador
1. Abrir StatsActivity
2. Colocar breakpoint en OnClickListener del botón
3. Ejecutar en modo Debug
4. Presionar "+1 Bolsa Reciclada"
5. Inspeccionar variable recycleCount

## Estructura de Archivos Clave

```
app/src/main/
├── AndroidManifest.xml          # Configuración de actividades
├── java/com/ecocidad/
│   ├── MainActivity.java        # Actividad principal
│   ├── CalendarActivity.java    # Calendario de recolección
│   ├── MapActivity.java         # Mapa de puntos de reciclaje
│   └── StatsActivity.java       # Estadísticas con contador
└── res/
    ├── layout/
    │   ├── activity_main.xml     # UI principal
    │   ├── activity_calendar.xml # UI calendario
    │   ├── activity_map.xml      # UI mapa
    │   └── activity_stats.xml    # UI estadísticas
    ├── values/
    │   ├── strings.xml           # Textos localizables
    │   ├── styles.xml            # Estilos personalizados
    │   └── colors.xml            # Colores del tema
    └── mipmap/
        └── ic_launcher.xml       # Icono de la aplicación
```

## Características Destacadas

### 🌱 Tema Eco-Friendly
- Colores verdes (#4CAF50, #388E3C, #8BC34A)
- Diseño limpio y minimalista
- Iconografía relacionada con sostenibilidad

### 📱 Experiencia de Usuario
- Navegación intuitiva entre secciones
- Feedback visual inmediato en contador
- Persistencia de datos en cambios de configuración

### 🔧 Código Robusto
- Gestión completa del ciclo de vida
- Logging extensivo para depuración
- Manejo de estados de actividad

Esta aplicación cumple completamente con todos los requisitos especificados en el caso práctico y está lista para extensiones futuras como integración con mapas reales, notificaciones push, y sincronización en la nube.