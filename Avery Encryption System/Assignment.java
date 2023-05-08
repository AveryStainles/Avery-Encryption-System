class Assignment{
    public String[][] setEncryptCube(String[][] arr, String str){
        for (int i = 0; i < 18; i++){
            arr[0][i] = str.substring(i, i+1);
            for (int j = 0; j < 18; j++){
                arr[1][j] = str.substring(j+18, j+19);
            }
            for (int x = 0; x < 18; x++){
                arr[2][x] = str.substring(x+36, x+37);
            }
        }
        return arr;
    }// setEncryptCube(String[][], String) Method

    public String[][] assignFace(String[][] arr, String[][] hold, int interval){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                arr[i][j + interval] = hold[i][j];
            }
        }
        return arr;
    }// assignFace(String[][], String[][], int) Method

    public String[][] rotateFace90(String[][] arr, String[][] hold, int interval){
        interval *= 3;
        hold[0][0] = arr[2][0 + interval];
        hold[0][1] = arr[1][0 + interval];
        hold[0][2] = arr[0][0 + interval];
        hold[1][2] = arr[0][1 + interval];
        hold[2][2] = arr[0][2 + interval];
        hold[2][1] = arr[1][2 + interval];
        hold[2][0] = arr[2][2 + interval];
        hold[1][0] = arr[2][1 + interval];
        hold[1][1] = arr[1][1 + interval];
        assignFace(arr, hold, interval);
        return arr;
    }// rotateFace90(String[][], String[][], int) Method
}// Assignment Class