//Walker Demo
// Intro to keyboard input for movement
Walker Joe, Jane, Sally, Tim, Sandra;

void setup() {
    size(1500, 700);
    Joe = new Walker(width/2, height/2, false);
    Jane = new Walker(width/2 + 30, height/2 - 70, false);

    // NPC or Computer
    Sally = new Walker((int) random(0,width), (int) random(0,height), true);
    Tim = new Walker((int) random(0,width), (int) random(0,height), true);
    Sandra = new Walker((int) random(0,width), (int) random(0,height), true);
}

void draw() {
    background(255);
    Joe.display();
    Jane.display();

    Sally.display();
    Sally.move(0);
    Tim.display();
    Tim.move(0);
    Sandra.display();
    Sandra.move(0);
}

void mousePressed() {

}

void keyPressed() {
    // For arrows, use 'KeyCode' and UP, DOWN, Enter, etc.....
    // For ASCII char's, use 'key' and 'a', 'w', etc.....

    // Joe / Up, Right, Down, Left input
    if(keyCode == UP) {
        Joe.move(0);
    }
    else if(keyCode == RIGHT) {
        Joe.move(1);
    }
    else if(keyCode == DOWN) {
        Joe.move(2);
    }
    else if(keyCode == LEFT) {
        Joe.move(3);
    }

    // Jane WASD input
    if(key == 'w') {
        Jane.move(0);
    }
    else if(key== 'd') {
        Jane.move(1);
    }
    else if(key == 's') {
        Jane.move(2);
    }
    else if(key == 'a') {
        Jane.move(3);
    }

}

