class Rotation{
    Assignment assignment;


    public String[][] u(String[][] arr){
        assignment = new Assignment();
        String[][] rotateUp = new String[3][3];
        String[] rotateFront = new String[3];
        String[] rotateRight = new String[3];
        String[] rotateBack = new String[3];
        String[] rotateLeft = new String[3];

        assignment.rotateFace90(arr, rotateUp, 0);

        rotateFront[0] = arr[0][6];
        rotateFront[1] = arr[0][7];
        rotateFront[2] = arr[0][8];

        rotateRight[0] = arr[0][9];
        rotateRight[1] = arr[0][10];
        rotateRight[2] = arr[0][11];

        rotateBack[0] = arr[0][12];
        rotateBack[1] = arr[0][13];
        rotateBack[2] = arr[0][14];

        rotateLeft[0] = arr[0][3];
        rotateLeft[1] = arr[0][4];
        rotateLeft[2] = arr[0][5];

        arr[0][3] = rotateFront[0];
        arr[0][4] = rotateFront[1];
        arr[0][5] = rotateFront[2];

        arr[0][6] = rotateRight[0];
        arr[0][7] = rotateRight[1];
        arr[0][8] = rotateRight[2];

        arr[0][9] = rotateBack[0];
        arr[0][10] = rotateBack[1];
        arr[0][11] = rotateBack[2];

        arr[0][12] = rotateLeft[0];
        arr[0][13] = rotateLeft[1];
        arr[0][14] = rotateLeft[2];

        return arr;
    }// u(String[][]) Method

    public String[][] f(String[][] arr){
        assignment = new Assignment();
        String[] rotateUp = new String[3];
        String[][] rotateFront = new String[3][3];
        String[] rotateRight = new String[3];
        String[] rotateLeft = new String[3];
        String[] rotateDown = new String[3];

        assignment.rotateFace90(arr, rotateFront, 1);

        rotateUp[0] = arr[2][14];
        rotateUp[1] = arr[1][14];
        rotateUp[2] = arr[0][14];

        rotateRight[0] = arr[2][0];
        rotateRight[1] = arr[2][1];
        rotateRight[2] = arr[2][2];

        rotateLeft[0] = arr[0][15];
        rotateLeft[1] = arr[0][16];
        rotateLeft[2] = arr[0][17];

        rotateDown[0] = arr[2][6];
        rotateDown[1] = arr[1][6];
        rotateDown[2] = arr[0][6];
//--------------------------------
        arr[2][0] = rotateUp[0];
        arr[2][1] = rotateUp[1];
        arr[2][2] = rotateUp[2];

        arr[2][6] = rotateRight[2];
        arr[1][6] = rotateRight[1];
        arr[0][6] = rotateRight[0];

        arr[2][14] = rotateLeft[2];
        arr[1][14] = rotateLeft[1];
        arr[0][14] = rotateLeft[0];

        arr[0][15] = rotateDown[0];
        arr[0][16] = rotateDown[1];
        arr[0][17] = rotateDown[2];

        return arr;
    }// f(String[][]) Method

    public String[][] r(String[][] arr){
        assignment = new Assignment();
        String[] rotateUp = new String[3];
        String[] rotateFront = new String[3];
        String[][] rotateRight = new String[3][3];
        String[] rotateBack = new String[3];
        String[] rotateDown = new String[3];

        assignment.rotateFace90(arr, rotateRight, 2);

        rotateUp[0] = arr[0][5];
        rotateUp[1] = arr[1][5];
        rotateUp[2] = arr[2][5];

        rotateFront[0] = arr[0][17];
        rotateFront[1] = arr[1][17];
        rotateFront[2] = arr[2][17];

        rotateDown[0] = arr[2][9];
        rotateDown[1] = arr[1][9];
        rotateDown[2] = arr[0][9];

        rotateBack[0] = arr[2][2];
        rotateBack[1] = arr[1][2];
        rotateBack[2] = arr[0][2];
//----------------------------------
        arr[0][2] = rotateUp[0];
        arr[1][2] = rotateUp[1];
        arr[2][2] = rotateUp[2];
        
        arr[0][5] = rotateFront[0];
        arr[1][5] = rotateFront[1];
        arr[2][5] = rotateFront[2];

        arr[0][17] = rotateDown[0];
        arr[1][17] = rotateDown[1];
        arr[2][17] = rotateDown[2];

        arr[0][9] = rotateBack[0];
        arr[1][9] = rotateBack[1];
        arr[2][9] = rotateBack[2];

        return arr;
    }// r(String[][]) Method

    public String[][] b(String[][] arr){
        assignment = new Assignment();
        String[] rotateUp = new String[3];
        String[] rotateRight = new String[3];
        String[] rotateLeft = new String[3];
        String[][] rotateBack = new String[3][3];
        String[] rotateDown = new String[3];

        assignment.rotateFace90(arr, rotateBack, 3);

        rotateUp[0] = arr[0][8];
        rotateUp[1] = arr[1][8];
        rotateUp[2] = arr[2][8];

        rotateRight[0] = arr[2][17];
        rotateRight[1] = arr[2][16];
        rotateRight[2] = arr[2][15];

        rotateLeft[0] = arr[0][2];
        rotateLeft[1] = arr[0][1];
        rotateLeft[2] = arr[0][0];

        rotateDown[0] = arr[0][12];
        rotateDown[1] = arr[1][12];
        rotateDown[2] = arr[2][12];
//----------------------------------
        arr[0][0] = rotateUp[0];
        arr[0][1] = rotateUp[1];
        arr[0][2] = rotateUp[2];
        
        arr[0][8] = rotateRight[0];
        arr[1][8] = rotateRight[1];
        arr[2][8] = rotateRight[2];

        arr[0][12] = rotateLeft[0];
        arr[1][12] = rotateLeft[1];
        arr[2][12] = rotateLeft[2];

        arr[2][15] = rotateDown[0];
        arr[2][16] = rotateDown[1];
        arr[2][17] = rotateDown[2];

        return arr;
    }// b(String[][]) Method

    public String[][] l(String[][] arr){
        assignment = new Assignment();
        String[] rotateUp = new String[3];
        String[] rotateFront = new String[3];
        String[][] rotateLeft = new String[3][3];
        String[] rotateBack = new String[3];
        String[] rotateDown = new String[3];

        assignment.rotateFace90(arr, rotateLeft, 4);

        rotateUp[0] = arr[2][11];
        rotateUp[1] = arr[1][11];
        rotateUp[2] = arr[0][11];

        rotateFront[0] = arr[0][0];
        rotateFront[1] = arr[1][0];
        rotateFront[2] = arr[2][0];

        rotateBack[0] = arr[2][15];
        rotateBack[1] = arr[1][15];
        rotateBack[2] = arr[0][15];

        rotateDown[0] = arr[0][3];
        rotateDown[1] = arr[1][3];
        rotateDown[2] = arr[2][3];
//----------------------------------
        arr[0][0] = rotateUp[0];
        arr[1][0] = rotateUp[1];
        arr[2][0] = rotateUp[2];
        
        arr[0][3] = rotateFront[0];
        arr[1][3] = rotateFront[1];
        arr[2][3] = rotateFront[2];

        arr[0][11] = rotateBack[0];
        arr[1][11] = rotateBack[1];
        arr[2][11] = rotateBack[2];

        arr[0][15] = rotateDown[0];
        arr[1][15] = rotateDown[1];
        arr[2][15] = rotateDown[2];
        return arr;
    }// l(String[][]) Method

    public String[][] d(String[][] arr){
        assignment = new Assignment();
        String[][] rotateDown = new String[3][3];
        String[] rotateFront = new String[3];
        String[] rotateRight = new String[3];
        String[] rotateBack = new String[3];
        String[] rotateLeft = new String[3];

        assignment.rotateFace90(arr, rotateDown, 5);

        rotateFront[0] = arr[2][12];
        rotateFront[1] = arr[2][13];
        rotateFront[2] = arr[2][14];

        rotateRight[0] = arr[2][3];
        rotateRight[1] = arr[2][4];
        rotateRight[2] = arr[2][5];

        rotateBack[0] = arr[2][6];
        rotateBack[1] = arr[2][7];
        rotateBack[2] = arr[2][8];

        rotateLeft[0] = arr[2][9];
        rotateLeft[1] = arr[2][10];
        rotateLeft[2] = arr[2][11];
//----------------------------------

        arr[2][3] = rotateFront[0];
        arr[2][4] = rotateFront[1];
        arr[2][5] = rotateFront[2];

        arr[2][6] = rotateRight[0];
        arr[2][7] = rotateRight[1];
        arr[2][8] = rotateRight[2];

        arr[2][9] = rotateBack[0];
        arr[2][10] = rotateBack[1];
        arr[2][11] = rotateBack[2];

        arr[2][12] = rotateLeft[0];
        arr[2][13] = rotateLeft[1];
        arr[2][14] = rotateLeft[2];

        return arr;
    }// d(String[][]) Method
}// Rotation Class