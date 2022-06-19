PImage pepperoni;
    PImage olive;
    PImage mushroom;
    
void setup() {
    size(600, 600);
    
    pepperoni = loadImage("pepperoni.png");
    olive = loadImage("olive.png");
    mushroom = loadImage("mushroom.png");
}
void draw() {
fill(#efcca2);
ellipse(280, 260, 350, 350);
image(pepperoni,200,200);
image(olive,110,150);
image(mushroom,130,250);
}
