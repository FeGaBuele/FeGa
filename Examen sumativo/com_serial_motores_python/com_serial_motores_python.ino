
 
const int in1Pin = 7; // Entrada del puente-H
const int in2Pin = 6; // Entrada del puente-H
const int in3Pin = 5; // Entrada del puente-H
const int in4Pin = 4; // Entrada del puente-H
 
int mssg = 0; //variable para guardar el mensaje
  
void setup()
{
   Serial.begin(9600); //inicializamos Serial
   pinMode(in1Pin, OUTPUT); 
   pinMode(in2Pin, OUTPUT);
   pinMode(in3Pin, OUTPUT);
   pinMode(in4Pin, OUTPUT);
}
  
void loop()
{
   if (Serial.available())
   {
      mssg = Serial.read(); //leemos el serial
  
      if(mssg == 'w')
      {
         digitalWrite(in1Pin,LOW);
         digitalWrite(in2Pin,HIGH);
         digitalWrite(in3Pin,LOW);
         digitalWrite(in4Pin,HIGH);
 
      }
      else if(mssg == 's')
      {
         digitalWrite(in1Pin,HIGH);
         digitalWrite(in2Pin,LOW);
         digitalWrite(in3Pin,HIGH);
         digitalWrite(in4Pin,LOW);
      }
      else if(mssg == 'p')
      {
         digitalWrite(in1Pin,LOW);
         digitalWrite(in2Pin,LOW);
         digitalWrite(in3Pin,LOW);
         digitalWrite(in4Pin,LOW);
      }
      else if(mssg == 'd')
      {
         digitalWrite(in1Pin,LOW);
         digitalWrite(in2Pin,HIGH);
         digitalWrite(in3Pin,HIGH);
         digitalWrite(in4Pin,LOW);
      }

      else if(mssg == 'a')
      {
         digitalWrite(in1Pin,HIGH);
         digitalWrite(in2Pin,LOW);
         digitalWrite(in3Pin,LOW);
         digitalWrite(in4Pin,HIGH);
      }
      
   }
}
