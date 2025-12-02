const int trigPin = 9;
const int echoPin = 10;
const int buzzerPin = 8;

long duration;
int distance;

void setup() {
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);
  pinMode(buzzerPin, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  // Trigger the ultrasonic sensor
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);

  // Read echo and calculate distance
  duration = pulseIn(echoPin, HIGH);
  distance = duration * 0.034 / 2;

  Serial.print("Distance: ");
  Serial.println(distance);

  // Multi-level alerts
  if (distance > 0 && distance <= 50) {
    digitalWrite(buzzerPin, HIGH); // Immediate danger
    delay(100); 
    digitalWrite(buzzerPin, LOW);
    delay(100);
  } else if (distance > 50 && distance <= 150) {
    digitalWrite(buzzerPin, HIGH); // Medium distance warning
    delay(200);
    digitalWrite(buzzerPin, LOW);
    delay(200);
  } else if (distance > 150 && distance <= 300) {
    digitalWrite(buzzerPin, HIGH); // Distant object warning
    delay(400);
    digitalWrite(buzzerPin, LOW);
    delay(400);
  } else {
    digitalWrite(buzzerPin, LOW); // No obstacle nearby
  }
}