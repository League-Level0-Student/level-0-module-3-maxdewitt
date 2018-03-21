void setup() {
  size(800,800);
  
}

void draw() {
  for (int i = 15; i > 0; i-- ){
    
    if (i % 2 == 0){
      fill(255,0,0);
    }
    else {
      fill(0,0,0);
    }
  ellipse(400, 400, 10 * i , 10 * i);
  
}
}