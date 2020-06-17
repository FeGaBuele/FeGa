
import serial
# en COM3 se pone el puerto al que se coencta el arduino a raspberry
ser = serial.Serial('COM3', 9600)
 
print("Lista de comandos: \n 'w' - Avanzar \n 'd' - Girar derecha \n 'a' - Girar derecha \n 's' - Retroceder \n 'p' - Parar \n 'z' - Salir del progama ")
 
print("Introduce un caracter: ")
 
#Guardamos este caracter en una variable
entrada = str(input())
 
while entrada != 'z':
 
   #Enviamos el caracter por serial, codificado en Unicode
   ser.write(entrada.encode())
 
   #Mostramos el caracter enviado por pantalla
   print("He enviado: " + str(entrada))
   print(entrada)
 
   #Y pedimos un nuevo caracter al usuario
   print("Introduce un caracter: ")
   entrada = input()
