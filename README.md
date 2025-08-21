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


