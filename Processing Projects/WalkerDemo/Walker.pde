class Walker {

    int x, y;
    int size;
    int speed;
    int cr, cg, cb;
    boolean npc; // Is this a computer

//Constructor
Walker(int tempx, int tempy, boolean tempnpc) {
    x = tempx;
    y = tempy;
    size = 25;
    speed = 25;
    npc = tempnpc; // If true, automate!
    cr = (int) random(0, 255);
    cg = (int) random(0, 255);
    cb = (int) random(0, 255);
}

void display() {
    fill(0);
    // Rect(xpos, ypos, )
    rect(x, y, size, size);
}

// dir var --> 0 = up, 1 = right, 2 = down, 3 = left
void move(int dir) {

    // Computer Movement Randomizer
    if (npc) {
        dir = (int) random(0,3);
    }

    //move up
    if (dir == 0 && y > 0) {
        y = y - speed;
    }

    //move right
    else if (dir == 1 && x < 1500) {
        x = x + speed;
    
    }

    //move down
    else if (dir == 2 && y < 700) {
        y = y + speed;
    }

    //move left
    else if (dir == 3 && x > 0) {
        x = x - speed;
    }
    
}

}
