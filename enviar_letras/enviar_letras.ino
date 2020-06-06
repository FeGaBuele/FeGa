#include <LiquidCrystal.h>

int dato;
int contador;
LiquidCrystal lcd (12,11,5,4,3,2);
void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  lcd.begin(16,2);
  lcd.clear();
  lcd.setCursor(0, 0);
  
}
//LED_BUILTIN
void loop() {
  // put your main code here, to run repeatedly:
  
  //dato=Serial.read();

  //if(dato==1)
  //{
    //Serial.print("hola");
  //}
  if (Serial.available()) // ve si hay dato en el puerto simpre manda -1
  { 
    dato=Serial.read(); 
    lcd.write(dato);
    contador ++;
    if(contador==15)
    {
      lcd.setCursor(0, 1);
    }

    
      
    
    
  }
  

}
