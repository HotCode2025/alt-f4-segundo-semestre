# alt-f4
Repositorio del equipo ALT + F4

## Integrantes del grupo

- Francisco José Martín
- Rodrigo Haro
- Lucia Perez Suarez
- Andrea Vargas
- Bruno García
- Joel Francisco Martín
- Gustavo Javier Figueroa
- Gabriel Jauregui
- Luz Santoni

## Paso a paso para clonar el repositorio y trabajar con Git

1. **Clonar el repositorio:**
	```bash
	git clone https://github.com/HotCode2025/alt-f4-segundo-semestre.git
	cd alt-f4-segundo-semestre
	```

2. **Crear y cambiar a tu propia rama:**
	```bash
	git checkout -b nombre-de-tu-rama
	```
	Ejemplo: `git checkout -b francisco`

3. **Antes de realizar cambios, actualizar el repositorio local:**
	Es recomendable ejecutar:
	```bash
	git pull origin main
	```
	Así tendrás la última versión del proyecto y evitas conflictos.

4. **Realizar cambios y guardar archivos:**
	Edita los archivos necesarios y guarda los cambios.

5. **Agregar los cambios al área de staging:**
	```bash
	git add .
	```

6. **Realizar un commit de tus cambios:**
	```bash
	git commit -m "Descripción de los cambios"
	```

7. **Subir tu rama al repositorio remoto:**
	```bash
	git push origin nombre-de-tu-rama
	```

8. **Crear un Pull Request para fusionar tu rama con main:**
	Hazlo desde la interfaz de GitHub.

## Comandos esenciales para tener en cuenta

- `git branch` — Ver las ramas existentes
- `git checkout nombre-de-la-rama` — Cambiar de rama
- `git checkout -b nueva-rama` — Crear y cambiar a una nueva rama
- `git add .` — Agregar todos los archivos modificados
- `git commit -m "mensaje"` — Guardar los cambios localmente
- `git push origin nombre-de-la-rama` — Subir los cambios de tu rama a GitHub
- `git pull origin main` — Descargar los últimos cambios del repositorio remoto.

- # Guía de nombres de funciones descriptivas (JavaScript)

> Convención: `camelCase`, verbos en **inglés**, nombres **claros y específicos**.

---

## 1) Manipulación de datos

### `calculateTotalPrice()`
**Significado (ES):** calcular el precio total.  
**Puntos clave:**
- Indica un **cálculo numérico** (no muta datos externos).
- El resultado es **un número** (total).
- Puede aceptar ítems/precios/impuestos (**inputs claros**).
- Verbo + objeto: **calculate + TotalPrice**.
- Escalable para aplicar **descuentos/impuestos**.

---

### `formatUserInput()`
**Significado (ES):** formatear la entrada del usuario.  
**Puntos clave:**
- Normaliza texto (trim, mayúsculas/minúsculas).
- Mejora **consistencia** antes de validar/guardar.
- **No** implica validación semántica, **solo formato**.
- Evita duplicar lógica de limpieza en la app.
- Útil para **UX** y **prevención de errores**.

---

### `validateEmailAddress()`
**Significado (ES):** validar una dirección de correo.  
**Puntos clave:**
- Devuelve **boolean** o detalla errores.
- Puede usar **regex** y reglas RFC simplificadas.
- **No** envía correos ni verifica bandejas reales.
- Se usa antes de **crear/actualizar** un usuario.
- Nombre comunica **intención precisa** (validar).

---

### `convertToCamelCase()`
**Significado (ES):** convertir a camelCase.  
**Puntos clave:**
- Toma `snake_case`, `kebab-case`, frases, etc.
- Asegura **consistencia** en claves/campos.
- Función **pura** (misma entrada ⇒ misma salida).
- Útil al mapear datos de APIs variadas.
- El nombre anticipa el **formato de salida**.

---

### `filterActiveUsers()`
**Significado (ES):** filtrar usuarios activos.  
**Puntos clave:**
- Retorna **subconjunto** según `isActive`.
- **Inmutable**: no cambia la lista original.
- Ideal para **vistas** o reportes.
- Claridad en **criterio** (activo).
- Se entiende que **no** hace side-effects.

---

## 2) Eventos o Interacción

### `handleButtonClick()`
**Significado (ES):** manejar el clic de un botón.  
**Puntos clave:**
- Se ata a un **listener** (`onclick`, `addEventListener`).
- Recibe evento (`event`) y evita comportamientos indeseados.
- Ejecuta **acciones UI** o navega estados.
- No bloquea: puede ser **async** si llama APIs.
- Nombre sugiere **contexto** (botón).

---

### `onFormSubmit()`
**Significado (ES):** al enviar el formulario.  
**Puntos clave:**
- Convención `onX` para **handlers** de eventos.
- Hace **preventDefault()** si gestiona envío manual.
- Suele **validar** y **enviar** datos.
- Puede mostrar **errores/feedback**.
- Centraliza la **lógica de envío**.

---

### `toggleDarkMode()`
**Significado (ES):** alternar el modo oscuro.  
**Puntos clave:**
- Cambia **estado** (dark ↔ light).
- Actualiza **clases/tema** y **persistencia** (localStorage).
- No recibe argumentos (alternar = invertir).
- **Idempotencia por estado**: llamado duplicado revierte.
- Nombre literal, fácil de **descubrir**.

---

### `updateProgressBar()`
**Significado (ES):** actualizar la barra de progreso.  
**Puntos clave:**
- Recibe **progreso** (0–100 o 0–1).
- Sincroniza **UI** con estado de tarea.
- Puede **animar** cambios graduales.
- No calcula progreso, **solo pinta**.
- Se entiende que toca el **DOM**/estado visual.

---

### `initializeApp()`
**Significado (ES):** inicializar la aplicación.  
**Puntos clave:**
- Punto de **arranque** (config, tema, rutas, store).
- Registra **eventos** y carga **recursos** iniciales.
- Llama a `render`/montaje principal.
- Se ejecuta **una vez** (bootstrapping).
- Nombre claro para **entrypoint**.

---

## 3) Operaciones CRUD

### `createNewUser()`
**Significado (ES):** crear un usuario nuevo.  
**Puntos clave:**
- **Crea**: hace POST/insert.
- Recibe **payload** validado (no valida por sí mismo).
- Devuelve el **recurso** creado o `id`.
- Puede manejar **errores 4xx/5xx**.
- Nombre deja claro que **persiste**.

---

### `fetchUserData()`
**Significado (ES):** obtener datos de usuario.  
**Puntos clave:**
- **Lee** datos (GET/select).
- No muta: función **lectura**.
- Acepta **id** o **filtros**.
- Considera **caché**/revalidación.
- Nombre comunica **IO** (network/db).

---

### `updateUserProfile()`
**Significado (ES):** actualizar el perfil de usuario.  
**Puntos clave:**
- **Actualiza** campos (PUT/PATCH).
- Requiere **autorización** y validación.
- Devuelve perfil **actualizado**.
- Maneja **parciales** (PATCH) o totales (PUT).
- Nombre específico: **qué** recurso cambia.

---

### `deleteUserAccount()`
**Significado (ES):** eliminar la cuenta de usuario.  
**Puntos clave:**
- Operación **destructiva** (DELETE).
- Debe pedir **confirmación**.
- Considerar **soft delete** o **GDPR**.
- Revoca **sesiones/tokens**.
- Nombre advierte el **impacto**.

---

## 4) Utilidades

### `generateRandomId()`
**Significado (ES):** generar un ID aleatorio.  
**Puntos clave:**
- No colisiona con alta **probabilidad** (UUID/nanoid).
- **Pura** y **determinística** por semilla (si aplica).
- Útil para **claves**, tests, mock data.
- No garantiza **seguridad criptográfica** salvo que se diga.
- Nombre indica **salida** (ID).

---

### `formatCurrency()`
**Significado (ES):** formatear moneda.  
**Puntos clave:**
- Usa `Intl.NumberFormat` (locale, símbolo).
- No altera el **valor**, solo la **presentación**.
- Considera **decimales** y **redondeo**.
- Evita duplicar lógica de **UI**.
- Nombre describe **output** legible.

---

### `debounceSearch()`
**Significado (ES):** aplicar *debounce* a la búsqueda.  
**Puntos clave:**
- Retrasa ejecución hasta que el usuario **deja de tipear**.
- Reduce **llamadas** a API y mejora **rendimiento**.
- Devuelve una **función envuelta** con temporizador.
- Cancela ejecución si hay **novedad** antes del timeout.
- Nombre comunica **patrón** (debounce) y **contexto** (search).

---

### `sanitizeInput()`
**Significado (ES):** sanitizar la entrada.  
**Puntos clave:**
- Remueve o **escapa** contenido peligroso (XSS).
- Define **lista blanca** de caracteres/HTML.
- Se aplica **antes** de guardar/mostrar.
- Función **seguridad** transversal.
- Nombre enfoca en **protección** de datos.

---

### `checkPermissions()`
**Significado (ES):** comprobar permisos.  
**Puntos clave:**
- Evalúa **roles/claims** del usuario.
- Devuelve boolean o **detalles** de acceso.
- Punto único para **autorización** en UI/lógica.
- Evita duplicar reglas dispersas.
- Nombre indica **verificación previa** a acciones.

---

## Ejemplo breve (de uso de algunos nombres)

```js
function onFormSubmit(event) {
  event.preventDefault();
  const data = formatUserInput(getFormData(event.target));
  if (!validateEmailAddress(data.email)) return showError('Email inválido');
  const user = createNewUser(data);
  if (!user) return showError('No se pudo crear');
  showSuccess(`ID: ${user.id}`);
}



