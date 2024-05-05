# CLASE 01
*30-04-2024*

## **Comandos básicos en Visual Estudio Code**
Todos los comandos a continuacion son ejecutables en windows:
- **CTRL + SHIFT + P**: Abre la paleta de comandos.
- **CTRL +  P**: Abre el buscador de archivos.
- **CTRL +  B**: Abre y cierra la barra lateral.
- **CTRL +  D**: Activa el multi-cursor.
- **SHIFT + ALT + UP / SHIFT + ALT + DOWN**: Seleccionar toda la linea de codigo.
- **SHIFT + ALT + A**: Comentar varias lineas de codigo.
- **CTRL + K + C**: Comentar una linea de codigo.
- **ALT + ---->**: Retroceder o avanzar.
- **CTRL + T**: Mostrar comandos.
- **CTRL + ESPACIO**: Sugerencias de activacion.
---
<br>

# CLASE 02
*01-05-2024*

## **Markdown**
Es un lenguaje de marcado, su extension es ".md", se usara para anotar los apuntes de la clases y se puede transformar a pdf. 
Tiene varias funcionalidades para resaltar de diversas formas las partes del texto.
![Comandos para cambiar el formato de txt](image.png)


### **Colocar imagenes**
   
    ![Nombre alternativo] (ruta de acceso de la imagen)
    

### **Colocar lineas de codigo**

``` c++
int main (){
    cout << "Esto es un ejemplo"<<endl;
}
```

<br>

## **GIT**
Herramienta con la cual podremos subir nuestros codigos a repositorios en linea, que facilita el compartido de los mismos, a continuacion los comandos mas usados:
### **Identidad del usuario**
```
$ git config --global user.name “pat_mic“
```

```
$ git config --global user.email pat_mic@hotmail.com
```
```
$ git config user.email
```
```
$ git config user.name
```

### **Control de versiones**
```
$ git init
```

```
$ git status
```

```
$ git add .
```


```
$ git add NombreCarpeta/NombreArchivo.ext
```
```
$ git commit -m 'mensaje : initial project version'
```
### **Control de versiones - clonando**
```
$ git clone https://github.com/xxyyy/abc
```

```
$ git clone https://github.com/xxyyy/abc miPropioNombre
Touch (crear archivos)

```
### **Quitar archivos del control**
```
$ echo ”nombreArchivo.ext” >> .gitignore
```

```
$ echo ”*.txt” >> .gitignore
```
### **Ver archivos ignorados**
```
$ cat .gitignore
```

### **Ver archivos ignorados**
```
$ git add -f NombreArchivo.log 
```

### **Crear y clonar**
```
$ git init
```
```
$ git clone /ruta del repositorio
```
---