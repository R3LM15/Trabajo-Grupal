# Clase 1

## Visual Studio Code
### ATAJOS DE TECLADO
#### CTRL + SHIFT + P 
Abrir la busqueda de comandos
#### CTRL + P
Abrir la busqueda archivos 
#### CTRL + B
Abrir la barra lateral
#### CTRL + D
Usar el multi-cursor
#### SHIFT + ALT + UP
Copiar linea
#### SHIFT + ALT + A
#### SHIFT + K + C  
Insertar comentario
#### CTRL + T
Mostrar Comandos
## PowerShell
### ATAJOS DE TECLADO
/ls ----> Mostrar directorio
/touch "------.---" Crear archivo
/mkdir ----> Crear nuevo directorio
/rm  ----> remover carpetas o directorios

# Clase 2

## Markdown
- Extensiones
- Markdown linting
- Markdown PDF
- Markdown ALL-In-One

### Poner codigo  -> ``
```java
public static void(){
return 0;
}
```
### Url o Imagen
```
[Buscador] (https://google.com)
```
- Ejemplos
[Buscador](https://google.com)

A continuación se muestra un [Link](https://ejemplo.com/ "Título opcional del enlace").

### Tablas
|Columna 1|Columna 2|
|--------|--------|
| A | B |
| C | D |


[Mas codigos](https://www.ionos.es/digitalguide/paginas-web/desarrollo-web/tutorial-de-markdown/).

## Chocolatey
choco install /git/ /help/
Leer guia.

## GIT
```
$ git config user.name
```
```
$ git config user.email
```
```
$ git config --global user.name
```
### Restrear archivos
```
$ git init
```
### Ver el estado de los archivos en el directorio.
```
$ git status
```
### Añadir todos los archivos del directorio
```
$ git add .
```
### Añadir uno a uno
```
$ git add XXXXX
```
### Commit enviar archivos al git
```
$ git commit -m "Iniciando-------"
```
### Entrar en el documento cambiado
```
code Hola.java
```
### Rama - Branch
- Git inyecta los cambios a la master
### Respaldar - Nube GitHub
- Cambiar nombre y crear
```
$ git checkout -b main
o
$ git branch -m main
```
- Ver las ramas --- Extension git lens
```
$ git branch
```
- Subir a la nube.

Boton de Source Control y seleccionar la opcion en GitHub

### Merge
- Unir el contenido de las ramas

### Cambios de la nube
```
$ git pull
```
- Traer los cambios de la nube
### Git clone
- Ver slides
### Git ignore
```
$ touch .gitignore
```
Se añade al archivo creado, para no tomarlo en cuenta.

* .class

* .gitignore

No hace caso a los commits ni push.

### Extra
```
$ git help
```
- Revisar comandos linux en el pdf.

### SSH
- Emparejar Github con SSH

### Otros
- Forzar
```
$ git push -force
```
- Revert
```
$ git reset --hard
```
