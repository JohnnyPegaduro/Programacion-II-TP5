# TP – Programación II · UML Básico + Relaciones (Java / NetBeans)

Este repositorio contiene:
- ✅ Proyecto **Java (NetBeans, Ant)** con ejemplos de **relaciones 1 a 1** y **dependencias**, listo para ejecutar:
  - `MainTP5` con **menú interactivo**.
  - `Demo01` … `Demo14` con **`main` individual** (se pueden correr por separado).

> **Cátedra:** Programación II 

---

## 🗂️ Estructura del repositorio

```
/
├─ src/                         # Todas las clases en un solo folder (sin paquetes)
│  ├─ MainTP5.java              # Menú para ejecutar todos o seleccionar ejercicios
│  ├─ Demo01.java … Demo14.java # Demos individuales (cada una tiene su propio main)
├─ nbproject/                   # Metadatos de NetBeans (Ant)
├─ build.xml                    # Script de Ant
├─ manifest.mf
└─ docs/                        # Material de apoyo (opcional)
   └─ TP_ProgramacionII_UML_Basico_Caratula.docx  # Documento entregable (opcional)
```

---

## 🔧 Requisitos

- **JDK 17** (recomendado). Ajustable en: `Project Properties > Libraries > Java Platform`.
- **NetBeans 12+** (Java with Ant).

---

## 🚀 Cómo abrir en NetBeans

1. **File > Open Project…**  
2. Seleccionar la carpeta del proyecto (la que contiene `nbproject/`).  
3. Confiar en el proyecto si se solicita (**Trust Project**).  
4. (Opcional) Verificar **Main Class**: `MainTP5` en `Project Properties > Run`.

---

## ▶️ Ejecución

### Opción A — Menú interactivo (recomendada)
- Run el proyecto → en consola ingresar:
  - `*` para ejecutar **todas** las demos.
  - `07` para la demo **7**.
  - `1,3,5-7` para **lista/rangos**.

### Opción B — Propiedad de sistema (VM Options)
- `Project Properties > Run > VM Options` → usar:
  - `-Drun=all`
  - `-Drun=07`
  - `-Drun=1,3,5-7`

### Opción C — Argumentos del programa
- `Project Properties > Run > Arguments` → `all` / `07` / `1,3,5-7`.

### Opción D — Ejecutar una demo puntual
- Abrir `DemoXX.java` y usar **Run File** (`Shift+F6`).

---

## 🧩 ¿Qué cubre cada demo?

- **Demo01**: Composición (Pasaporte ← Foto) + Asociación bidireccional (Pasaporte ↔ Titular)  
- **Demo02**: Agregación (Celular ← Batería) + Asociación bidireccional (Celular ↔ Usuario)  
- **Demo03**: Asociación (Libro → Autor) + Agregación (Libro ← Editorial)  
- **Demo04**: Agregación (Tarjeta ← Banco) + Asociación bidireccional (Tarjeta ↔ Cliente)  
- **Demo05**: Composición (Computadora ← PlacaMadre) + Asociación bidireccional (Computadora ↔ Propietario)  
- **Demo06**: Asociación unidireccional + Agregación (Reserva → Cliente/Mesa)  
- **Demo07**: Agregación (Vehiculo ← Motor) + Asociación bidireccional (Vehiculo ↔ Conductor)  
- **Demo08**: Composición (Documento ← FirmaDigital) + Agregación (FirmaDigital ← Usuario)  
- **Demo09**: Asociación unidireccional (Cita → Paciente/Profesional)  
- **Demo10**: Composición (CuentaBancaria ← ClaveSeguridad) + Asociación bidireccional (Cuenta ↔ Titular)  
- **Demo11**: Dependencia de uso (Reproductor usa Cancion)  
- **Demo12**: Dependencia de uso (Calculadora usa Impuesto)  
- **Demo13**: Dependencia de **creación** (GeneradorQR crea CodigoQR)  
- **Demo14**: Dependencia de **creación** (EditorVideo crea Render)  

> En **composición** la parte se **crea adentro** y su vida está ligada al todo.  
> En **agregación** la parte se **inyecta** (puede existir por separado).

---

## 🧪 Pruebas rápidas esperadas (consola)

- `MainTP5` imprime un encabezado y luego cada demo con prefijo `-- Ejercicio XX --`.
- Las clases de ejemplo muestran su estado vía `toString()` (ej.: `PC{Dell, PlacaMadre{B560, Intel}}`).

---

## 🆘 Troubleshooting

Si al **Clean and Build** aparece un error tipo *“Must set …”*, asegurate de que en `nbproject/project.properties` estén estas líneas (ya vienen incluidas en este repo):

```properties
# Javadoc (requerido por build-impl.xml en algunos NetBeans/Ant)
dist.javadoc.dir=${dist.dir}/javadoc
# Exclusiones para compilar solo .class (evitar reempaquetar fuentes)
build.classes.excludes=**/*.java,**/*.form
```

**Otros puntos:**  
- Si NetBeans toma un JDK distinto → `Project Properties > Libraries > Java Platform`.  
- Si `Run File` no ejecuta, verificá que `DemoXX.java` contenga `public static void main(String[] args)` (todas lo incluyen).

---

## 📝 Licencia

Este material puede publicarse bajo **MIT** o la licencia que especifique la cátedra.

---

## ✍️ Autor/a

**Alumno/a:** Matias Ariel Deluca  
Cátedra **Programación II** – Prof. **Sofía Raia**
