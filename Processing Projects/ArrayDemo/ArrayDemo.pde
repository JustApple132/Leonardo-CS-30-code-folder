grid g;

void setup() {
    size(1700, 800);
    g = new grid (50, 50);
}

void draw() {
    background(220);
    g.displayGrid();
}

    void mousePressed() {
        g.click(mouseX, mouseY);
    }

void keyPressed() {
    if(key == 'c') {
        g.clear();
    }
    else if (key =='5') {
        g.five();
    }

}

class grid {
    int ROWS, COLS;
    boolean [][] gridarray;

    // Constructor
    grid(int tempr, int tempc) {
        ROWS = tempr;
        COLS = tempc;
        gridarray = new boolean[ROWS][COLS];

    clear();
        for (int y = 0; y < ROWS; y++) {
            for (int x = 0; x < COLS; x++) {
                gridarray[y][x] = false;
            }
        }
    
    }
    void displayGrid() {

        for (int y = 0; y < ROWS; y++) {
            for (int x = 0; x < COLS; x++) {

                // White fill if false
                if (gridarray[y][x] == false) {
                    fill(255);
                }

                // Black fill if false
                else{
                    fill(0);
                }

                int cellWidth = width / COLS;
                int cellHeight = height / ROWS;
                // Starts drawing from top left corner
                rect(x * cellWidth, y * cellHeight, cellWidth, cellHeight);
            }
        }
    }

    void click(int mx, int my) {
        int cellWidth = width / COLS;
        int cellHeight = height / ROWS;

        int x = mx / cellWidth;
        int y = my / cellHeight;

        if (gridarray[y][x] == false) {
            gridarray[y][x] = true; //
        }
        
        else {
            gridarray[y][x] = false; // 
        }
    }

void clear() {
    for (int y = 0; y < ROWS; y++) {
        for (int x = 0; x < COLS; x++) {
            gridarray[y][x] = false;
        }
    }
}

void five() {
    for(int y = 0; y < ROWS; y++) {
        for(int x=0; x < COLS; x++) {
            //
            if(y ==5 || x == 5) {
                gridarray[y][x] = true;
            }
        }
    }

}

}
